package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEntitlementsResponse extends js.Object {
  /**
    * A list of entitlements that have been granted to you from other AWS accounts.
    */
  var Entitlements: js.UndefOr[__listOfListedEntitlement] = js.undefined
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListEntitlementsResponse {
  @scala.inline
  def apply(Entitlements: __listOfListedEntitlement = null, NextToken: __string = null): ListEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListEntitlementsResponse]
  }
}

