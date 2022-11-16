package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDynamicLayerFetchImageOptions extends StObject {
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#fetchImage)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object BaseDynamicLayerFetchImageOptions {
  
  inline def apply(): BaseDynamicLayerFetchImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseDynamicLayerFetchImageOptions]
  }
  
  extension [Self <: BaseDynamicLayerFetchImageOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
