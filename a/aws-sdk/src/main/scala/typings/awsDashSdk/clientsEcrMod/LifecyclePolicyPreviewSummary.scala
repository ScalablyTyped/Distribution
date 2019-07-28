package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecyclePolicyPreviewSummary extends js.Object {
  /**
    * The number of expiring images.
    */
  var expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined
}

object LifecyclePolicyPreviewSummary {
  @scala.inline
  def apply(expiringImageTotalCount: js.UndefOr[ImageCount] = js.undefined): LifecyclePolicyPreviewSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiringImageTotalCount)) __obj.updateDynamic("expiringImageTotalCount")(expiringImageTotalCount)
    __obj.asInstanceOf[LifecyclePolicyPreviewSummary]
  }
}

