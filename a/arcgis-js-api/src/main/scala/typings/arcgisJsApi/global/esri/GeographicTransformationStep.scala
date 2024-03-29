package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GeographicTransformationStep")
@js.native
open class GeographicTransformationStep ()
  extends StObject
     with typings.arcgisJsApi.esri.GeographicTransformationStep {
  def this(properties: Any) = this()
  
  /**
  		 * Gets the inverse of the geographic transformation step used to call this method or `null` if the transformation step is not invertible.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#getInverse)
  		 */
  /* CompleteClass */
  override def getInverse(): typings.arcgisJsApi.esri.GeographicTransformationStep = js.native
  
  /**
  		 * Indicates with the geographic transformation is inverted.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#isInverse)
  		 */
  /* CompleteClass */
  var isInverse: Boolean = js.native
  
  /**
  		 * The well-known id (wkid) hat represents a known geographic transformation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkid)
  		 */
  /* CompleteClass */
  var wkid: Double = js.native
  
  /**
  		 * The well-known text (wkt) that represents a known geographic transformation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformationStep.html#wkt)
  		 */
  /* CompleteClass */
  var wkt: String = js.native
}
