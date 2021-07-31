package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for determining the suggested `minSize` and `maxSize` of a [scale-dependent size visual variable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html#ScaleDependentIcons).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html)
  */
trait sizeRange extends StObject {
  
  /**
    * Generates a suggested size range (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  def sizeRange(params: sizeRangeSizeRangeParams): js.Promise[SizeRangeResult]
}
object sizeRange {
  
  @scala.inline
  def apply(sizeRange: sizeRangeSizeRangeParams => js.Promise[SizeRangeResult]): sizeRange = {
    val __obj = js.Dynamic.literal(sizeRange = js.Any.fromFunction1(sizeRange))
    __obj.asInstanceOf[sizeRange]
  }
  
  @scala.inline
  implicit class sizeRangeMutableBuilder[Self <: sizeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeRange(value: sizeRangeSizeRangeParams => js.Promise[SizeRangeResult]): Self = StObject.set(x, "sizeRange", js.Any.fromFunction1(value))
  }
}
