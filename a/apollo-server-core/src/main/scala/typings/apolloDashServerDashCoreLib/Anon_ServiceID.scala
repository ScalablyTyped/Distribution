package typings
package apolloDashServerDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ServiceID extends js.Object {
  var serviceID: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ServiceID {
  @scala.inline
  def apply(serviceID: java.lang.String = null): Anon_ServiceID = {
    val __obj = js.Dynamic.literal()
    if (serviceID != null) __obj.updateDynamic("serviceID")(serviceID)
    __obj.asInstanceOf[Anon_ServiceID]
  }
}

