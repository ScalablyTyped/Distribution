package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeographicTransformation extends StObject {
  
  /**
    * Returns the inverse of the geographic transformation calling this method or `null` if the transformation is not invertible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#getInverse)
    */
  def getInverse(): GeographicTransformation = js.native
  
  /**
    * Geographic transformation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps)
    */
  var steps: js.Array[GeographicTransformationStep] = js.native
}
object GeographicTransformation {
  
  @scala.inline
  def apply(getInverse: () => GeographicTransformation, steps: js.Array[GeographicTransformationStep]): GeographicTransformation = {
    val __obj = js.Dynamic.literal(getInverse = js.Any.fromFunction0(getInverse), steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeographicTransformation]
  }
  
  @scala.inline
  implicit class GeographicTransformationMutableBuilder[Self <: GeographicTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInverse(value: () => GeographicTransformation): Self = StObject.set(x, "getInverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSteps(value: js.Array[GeographicTransformationStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: GeographicTransformationStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
