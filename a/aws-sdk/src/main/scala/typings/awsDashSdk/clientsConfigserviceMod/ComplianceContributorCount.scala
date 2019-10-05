package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceContributorCount extends js.Object {
  /**
    * Indicates whether the maximum count is reached.
    */
  var CapExceeded: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
    */
  var CappedCount: js.UndefOr[Integer] = js.undefined
}

object ComplianceContributorCount {
  @scala.inline
  def apply(CapExceeded: js.UndefOr[scala.Boolean] = js.undefined, CappedCount: Int | Double = null): ComplianceContributorCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CapExceeded)) __obj.updateDynamic("CapExceeded")(CapExceeded)
    if (CappedCount != null) __obj.updateDynamic("CappedCount")(CappedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceContributorCount]
  }
}

