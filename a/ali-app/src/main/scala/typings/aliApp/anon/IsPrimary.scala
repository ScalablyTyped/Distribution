package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsPrimary extends js.Object {
  /**
    * 该服务是否为主服务
    */
  var isPrimary: Boolean
  /**
    * 蓝牙设备服务的 uuid
    */
  var serviceId: String
}

object IsPrimary {
  @scala.inline
  def apply(isPrimary: Boolean, serviceId: String): IsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrimary]
  }
}

