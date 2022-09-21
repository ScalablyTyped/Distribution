package typings.aliApp.my

import typings.aliApp.anon.NetworkAvailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 网络状态 https://docs.alipay.com/mini/api/network-status
trait GetNetworkTypeOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_GetNetworkTypeOptions: js.UndefOr[js.Function1[/* res */ NetworkAvailable, Unit]] = js.undefined
}
object GetNetworkTypeOptions {
  
  inline def apply(): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
  
  extension [Self <: GetNetworkTypeOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ NetworkAvailable => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
