package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorCheckSummary extends js.Object {
  /**
    * Summary information that relates to the category of the check. Cost Optimizing is the only category that is currently supported.
    */
  var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary = js.native
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String = js.native
  /**
    * Specifies whether the Trusted Advisor check has flagged resources.
    */
  var hasFlaggedResources: js.UndefOr[Boolean] = js.native
  var resourcesSummary: TrustedAdvisorResourcesSummary = js.native
  /**
    * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
    */
  var status: String = js.native
  /**
    * The time of the last refresh of the check.
    */
  var timestamp: String = js.native
}

object TrustedAdvisorCheckSummary {
  @scala.inline
  def apply(
    categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
    checkId: String,
    resourcesSummary: TrustedAdvisorResourcesSummary,
    status: String,
    timestamp: String,
    hasFlaggedResources: js.UndefOr[scala.Boolean] = js.undefined
  ): TrustedAdvisorCheckSummary = {
    val __obj = js.Dynamic.literal(categorySpecificSummary = categorySpecificSummary.asInstanceOf[js.Any], checkId = checkId.asInstanceOf[js.Any], resourcesSummary = resourcesSummary.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFlaggedResources)) __obj.updateDynamic("hasFlaggedResources")(hasFlaggedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCheckSummary]
  }
}

