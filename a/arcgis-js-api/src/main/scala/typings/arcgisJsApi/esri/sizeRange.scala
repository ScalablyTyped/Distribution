package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for determining the suggested `minSize` and `maxSize` of a [scale-dependent size visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html)
  */
@js.native
trait sizeRange extends js.Object {
  
  /**
    * Generates a suggested size range (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  def sizeRange(params: sizeRangeSizeRangeParams): js.Promise[SizeRangeResult] = js.native
}
object sizeRange {
  
  @scala.inline
  def apply(sizeRange: sizeRangeSizeRangeParams => js.Promise[SizeRangeResult]): sizeRange = {
    val __obj = js.Dynamic.literal(sizeRange = js.Any.fromFunction1(sizeRange))
    __obj.asInstanceOf[sizeRange]
  }
  
  @scala.inline
  implicit class sizeRangeOps[Self <: sizeRange] (val x: Self) extends AnyVal {
    
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
    def setSizeRange(value: sizeRangeSizeRangeParams => js.Promise[SizeRangeResult]): Self = this.set("sizeRange", js.Any.fromFunction1(value))
  }
}
