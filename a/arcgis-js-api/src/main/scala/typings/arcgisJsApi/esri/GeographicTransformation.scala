package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeographicTransformation extends js.Object {
  
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
  implicit class GeographicTransformationOps[Self <: GeographicTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetInverse(value: () => GeographicTransformation): Self = this.set("getInverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepsVarargs(value: GeographicTransformationStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[GeographicTransformationStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
}
