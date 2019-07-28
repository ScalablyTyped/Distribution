package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByoipCidr extends js.Object {
  /**
    * The public IPv4 address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[String] = js.undefined
  /**
    * The description of the address range.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.undefined
  /**
    * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}

object ByoipCidr {
  @scala.inline
  def apply(
    Cidr: String = null,
    Description: String = null,
    State: ByoipCidrState = null,
    StatusMessage: String = null
  ): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    __obj.asInstanceOf[ByoipCidr]
  }
}

