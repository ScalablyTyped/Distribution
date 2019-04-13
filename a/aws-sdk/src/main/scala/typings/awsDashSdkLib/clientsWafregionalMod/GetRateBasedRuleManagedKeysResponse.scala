package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRateBasedRuleManagedKeysResponse extends js.Object {
  /**
    * An array of IP addresses that currently are blocked by the specified RateBasedRule. 
    */
  var ManagedKeys: js.UndefOr[ManagedKeys] = js.undefined
  /**
    * A null value and not currently used.
    */
  var NextMarker: js.UndefOr[NextMarker] = js.undefined
}

object GetRateBasedRuleManagedKeysResponse {
  @scala.inline
  def apply(ManagedKeys: ManagedKeys = null, NextMarker: NextMarker = null): GetRateBasedRuleManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (ManagedKeys != null) __obj.updateDynamic("ManagedKeys")(ManagedKeys)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
  }
}

