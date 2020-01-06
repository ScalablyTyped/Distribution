package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPRange extends js.Object {
  /**
    * Specifies the IP range.
    */
  var CIDRIP: js.UndefOr[String] = js.native
  /**
    * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.native
}

object IPRange {
  @scala.inline
  def apply(CIDRIP: String = null, Status: String = null): IPRange = {
    val __obj = js.Dynamic.literal()
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPRange]
  }
}

