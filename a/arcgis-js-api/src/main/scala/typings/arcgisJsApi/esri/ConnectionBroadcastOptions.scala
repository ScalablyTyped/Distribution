package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionBroadcastOptions extends StObject {
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the executions of the remote method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#broadcast)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object ConnectionBroadcastOptions {
  
  inline def apply(): ConnectionBroadcastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionBroadcastOptions]
  }
  
  extension [Self <: ConnectionBroadcastOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
