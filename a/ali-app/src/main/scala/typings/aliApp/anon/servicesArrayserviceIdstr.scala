package typings.aliApp.anon

import typings.aliApp.aliAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  services :std.Array<{  serviceId :string,   isPrimary :boolean}>} & ali-app.my.ErrMsgResponse */
@js.native
trait servicesArrayserviceIdstr extends js.Object {
  
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
  implicit class servicesArrayserviceIdstrOps[Self <: servicesArrayserviceIdstr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrMsg(value: ok | String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesVarargs(value: IsPrimary*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[IsPrimary]): Self = this.set("services", value.asInstanceOf[js.Any])
  }
}
