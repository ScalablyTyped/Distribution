package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInvokeOptions extends StObject {
  
  /**
  		 * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the execution of the remote method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * An array of Transferable objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
  		 */
  var transferList: js.UndefOr[js.Array[Any]] = js.undefined
}
object ConnectionInvokeOptions {
  
  inline def apply(): ConnectionInvokeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionInvokeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionInvokeOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTransferList(value: js.Array[Any]): Self = StObject.set(x, "transferList", value.asInstanceOf[js.Any])
    
    inline def setTransferListUndefined: Self = StObject.set(x, "transferList", js.undefined)
    
    inline def setTransferListVarargs(value: Any*): Self = StObject.set(x, "transferList", js.Array(value*))
  }
}
