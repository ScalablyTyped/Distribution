package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedStatementManagedKeysIPSet extends js.Object {
  /**
    * The IP addresses that are currently blocked.
    */
  var Addresses: js.UndefOr[IPAddresses] = js.native
  var IPAddressVersion: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.IPAddressVersion] = js.native
}

object RateBasedStatementManagedKeysIPSet {
  @scala.inline
  def apply(Addresses: IPAddresses = null, IPAddressVersion: IPAddressVersion = null): RateBasedStatementManagedKeysIPSet = {
    val __obj = js.Dynamic.literal()
    if (Addresses != null) __obj.updateDynamic("Addresses")(Addresses.asInstanceOf[js.Any])
    if (IPAddressVersion != null) __obj.updateDynamic("IPAddressVersion")(IPAddressVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateBasedStatementManagedKeysIPSet]
  }
}

