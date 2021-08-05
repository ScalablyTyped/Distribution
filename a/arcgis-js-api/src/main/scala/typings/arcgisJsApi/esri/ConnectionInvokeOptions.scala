package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInvokeOptions
  extends StObject
     with Object {
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the execution of the remote method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * An array of [Transferable](https://developer.mozilla.org/en-US/docs/Web/API/Transferable) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke)
    */
  var transferList: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object ConnectionInvokeOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ConnectionInvokeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ConnectionInvokeOptions]
  }
  
  extension [Self <: ConnectionInvokeOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTransferList(value: js.Array[js.Any]): Self = StObject.set(x, "transferList", value.asInstanceOf[js.Any])
    
    inline def setTransferListUndefined: Self = StObject.set(x, "transferList", js.undefined)
    
    inline def setTransferListVarargs(value: js.Any*): Self = StObject.set(x, "transferList", js.Array(value :_*))
  }
}
