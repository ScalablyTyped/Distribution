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
  def apply(expiringImageTotalCount: Int | Double = null): LifecyclePolicyPreviewSummary = {
    val __obj = js.Dynamic.literal()
    if (expiringImageTotalCount != null) __obj.updateDynamic("expiringImageTotalCount")(expiringImageTotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecyclePolicyPreviewSummary]
  }
}

