package typings.aliApp

import typings.aliApp.aliAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  services  :std.Array<{  serviceId  :string,   isPrimary  :boolean}>} & ali-app.my.ErrMsgResponse */
trait servicesArrayserviceIdstr extends js.Object {
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
  var services: js.Array[AnonIsPrimary]
}

object servicesArrayserviceIdstr {
  @scala.inline
  def apply(errMsg: ok | String, services: js.Array[AnonIsPrimary]): servicesArrayserviceIdstr = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[servicesArrayserviceIdstr]
  }
}

