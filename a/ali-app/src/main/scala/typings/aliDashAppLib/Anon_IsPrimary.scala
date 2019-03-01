package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsPrimary extends js.Object {
  /**
  				 * 该服务是否为主服务
  				 */
  var isPrimary: scala.Boolean
  /**
  				 * 蓝牙设备服务的 uuid
  				 */
  var serviceId: java.lang.String
}

object Anon_IsPrimary {
  @scala.inline
  def apply(isPrimary: scala.Boolean, serviceId: java.lang.String): Anon_IsPrimary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isPrimary")(isPrimary)
    __obj.updateDynamic("serviceId")(serviceId)
    __obj.asInstanceOf[Anon_IsPrimary]
  }
}

