package typings.aliApp.anon

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  services :std.Array<{  serviceId :string,   isPrimary :boolean}>} & ali-app.my.ErrMsgResponse */
trait servicesArrayserviceIdstr extends StObject {
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
  
  var services: js.Array[IsPrimary]
}
object servicesArrayserviceIdstr {
  
  inline def apply(errMsg: ok | String, services: js.Array[IsPrimary]): servicesArrayserviceIdstr = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[servicesArrayserviceIdstr]
  }
  
  extension [Self <: servicesArrayserviceIdstr](x: Self) {
    
    inline def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setServices(value: js.Array[IsPrimary]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: IsPrimary*): Self = StObject.set(x, "services", js.Array(value*))
  }
}
