package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeographicTransformationStep extends StObject {
  
  /**
    * Gets the inverse of the geographic transformation step used to call this method or `null` if the transformation step is not invertible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#getInverse)
    */
  def getInverse(): GeographicTransformationStep = js.native
  
  /**
    * Indicates with the geographic transformation is inverted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#isInverse)
    */
  var isInverse: Boolean = js.native
  
  /**
    * The well-known id (wkid) hat represents a known geographic transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkid)
    */
  var wkid: Double = js.native
  
  /**
    * The well-known text (wkt) that represents a known geographic transformation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkt)
    */
  var wkt: String = js.native
}
object GeographicTransformationStep {
  
  @scala.inline
  def apply(getInverse: () => GeographicTransformationStep, isInverse: Boolean, wkid: Double, wkt: String): GeographicTransformationStep = {
    val __obj = js.Dynamic.literal(getInverse = js.Any.fromFunction0(getInverse), isInverse = isInverse.asInstanceOf[js.Any], wkid = wkid.asInstanceOf[js.Any], wkt = wkt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicTransformationStep]
  }
  
  @scala.inline
  implicit class GeographicTransformationStepMutableBuilder[Self <: GeographicTransformationStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInverse(value: () => GeographicTransformationStep): Self = StObject.set(x, "getInverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsInverse(value: Boolean): Self = StObject.set(x, "isInverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWkt(value: String): Self = StObject.set(x, "wkt", value.asInstanceOf[js.Any])
  }
}
