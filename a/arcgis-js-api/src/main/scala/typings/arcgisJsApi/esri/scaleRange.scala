package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for determining suggested [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) scale ranges for an input layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html)
  */
@js.native
trait scaleRange extends js.Object {
  
  /**
    * Generates a suggested scale range (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  def scaleRange(params: scaleRangeScaleRangeParams): js.Promise[ScaleRangeResult] = js.native
}
object scaleRange {
  
  @scala.inline
  def apply(scaleRange: scaleRangeScaleRangeParams => js.Promise[ScaleRangeResult]): scaleRange = {
    val __obj = js.Dynamic.literal(scaleRange = js.Any.fromFunction1(scaleRange))
    __obj.asInstanceOf[scaleRange]
  }
  
  @scala.inline
  implicit class scaleRangeOps[Self <: scaleRange] (val x: Self) extends AnyVal {
    
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
    def setScaleRange(value: scaleRangeScaleRangeParams => js.Promise[ScaleRangeResult]): Self = this.set("scaleRange", js.Any.fromFunction1(value))
  }
}
