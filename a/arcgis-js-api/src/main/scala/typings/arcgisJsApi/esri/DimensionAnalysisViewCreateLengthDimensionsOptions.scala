package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionAnalysisViewCreateLengthDimensionsOptions extends StObject {
  
  /**
    * Abort signal which can be used to cancel creation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-analysis-DimensionAnalysisView.html#createLengthDimensions)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object DimensionAnalysisViewCreateLengthDimensionsOptions {
  
  inline def apply(): DimensionAnalysisViewCreateLengthDimensionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionAnalysisViewCreateLengthDimensionsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionAnalysisViewCreateLengthDimensionsOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
