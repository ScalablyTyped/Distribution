package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnsRequestAction extends js.Object {
  /**
    * Domain information for the DNS request.
    */
  var Domain: js.UndefOr[String] = js.undefined
}

object DnsRequestAction {
  @scala.inline
  def apply(Domain: String = null): DnsRequestAction = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    __obj.asInstanceOf[DnsRequestAction]
  }
}

