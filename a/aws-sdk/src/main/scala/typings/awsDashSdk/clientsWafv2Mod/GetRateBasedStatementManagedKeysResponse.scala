package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedStatementManagedKeysResponse extends js.Object {
  /**
    * The keys that are of Internet Protocol version 4 (IPv4). 
    */
  var ManagedKeysIPV4: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.native
  /**
    * The keys that are of Internet Protocol version 6 (IPv6). 
    */
  var ManagedKeysIPV6: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.native
}

object GetRateBasedStatementManagedKeysResponse {
  @scala.inline
  def apply(
    ManagedKeysIPV4: RateBasedStatementManagedKeysIPSet = null,
    ManagedKeysIPV6: RateBasedStatementManagedKeysIPSet = null
  ): GetRateBasedStatementManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (ManagedKeysIPV4 != null) __obj.updateDynamic("ManagedKeysIPV4")(ManagedKeysIPV4.asInstanceOf[js.Any])
    if (ManagedKeysIPV6 != null) __obj.updateDynamic("ManagedKeysIPV6")(ManagedKeysIPV6.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedStatementManagedKeysResponse]
  }
}

