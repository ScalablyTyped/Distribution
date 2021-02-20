package typings.aliApp.anon

import typings.aliApp.aliAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  services :std.Array<{  serviceId :string,   isPrimary :boolean}>} & ali-app.my.ErrMsgResponse */
@js.native
trait servicesArrayserviceIdstr extends StObject {
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String = js.native
  
  var services: js.Array[IsPrimary] = js.native
}
object servicesArrayserviceIdstr {
  
  @scala.inline
  def apply(errMsg: ok | String, services: js.Array[IsPrimary]): servicesArrayserviceIdstr = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[servicesArrayserviceIdstr]
  }
  
  @scala.inline
  implicit class servicesArrayserviceIdstrMutableBuilder[Self <: servicesArrayserviceIdstr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServices(value: js.Array[IsPrimary]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesVarargs(value: IsPrimary*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
