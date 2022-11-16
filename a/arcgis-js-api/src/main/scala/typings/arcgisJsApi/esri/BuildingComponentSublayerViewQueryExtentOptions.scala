package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingComponentSublayerViewQueryExtentOptions extends StObject {
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#queryExtent)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object BuildingComponentSublayerViewQueryExtentOptions {
  
  inline def apply(): BuildingComponentSublayerViewQueryExtentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingComponentSublayerViewQueryExtentOptions]
  }
  
  extension [Self <: BuildingComponentSublayerViewQueryExtentOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
