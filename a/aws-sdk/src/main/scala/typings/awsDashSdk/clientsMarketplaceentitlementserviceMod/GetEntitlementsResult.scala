package typings.awsDashSdk.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEntitlementsResult extends js.Object {
  /**
    * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
    */
  var Entitlements: js.UndefOr[EntitlementList] = js.undefined
  /**
    * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
}

object GetEntitlementsResult {
  @scala.inline
  def apply(Entitlements: EntitlementList = null, NextToken: NonEmptyString = null): GetEntitlementsResult = {
    val __obj = js.Dynamic.literal()
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetEntitlementsResult]
  }
}

