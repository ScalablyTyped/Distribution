package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SublayerQueryFeaturesOptions extends StObject {
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#queryFeatures)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object SublayerQueryFeaturesOptions {
  
  inline def apply(): SublayerQueryFeaturesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SublayerQueryFeaturesOptions]
  }
  
  extension [Self <: SublayerQueryFeaturesOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
