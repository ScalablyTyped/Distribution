package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPRange extends js.Object {
  /**
    * Specifies the IP range.
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  /**
    * Specifies the status of the IP range. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.undefined
}

object IPRange {
  @scala.inline
  def apply(CIDRIP: String = null, Status: String = null): IPRange = {
    val __obj = js.Dynamic.literal()
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[IPRange]
  }
}

