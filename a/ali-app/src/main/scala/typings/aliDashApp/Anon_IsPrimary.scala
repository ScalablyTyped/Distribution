package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsPrimary extends js.Object {
  /**
  				 * 该服务是否为主服务
  				 */
  var isPrimary: Boolean
  /**
  				 * 蓝牙设备服务的 uuid
  				 */
  var serviceId: String
}

object Anon_IsPrimary {
  @scala.inline
  def apply(isPrimary: Boolean, serviceId: String): Anon_IsPrimary = {
    val __obj = js.Dynamic.literal(isPrimary = isPrimary, serviceId = serviceId)
  
    __obj.asInstanceOf[Anon_IsPrimary]
  }
}

