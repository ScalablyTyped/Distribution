package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedAdvisorCheckSummary extends js.Object {
  /**
    * Summary information that relates to the category of the check. Cost Optimizing is the only category that is currently supported.
    */
  var categorySpecificSummary: TrustedAdvisorCategorySpecificSummary
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String
  /**
    * Specifies whether the Trusted Advisor check has flagged resources.
    */
  var hasFlaggedResources: js.UndefOr[Boolean] = js.undefined
  var resourcesSummary: TrustedAdvisorResourcesSummary
  /**
    * The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".
    */
  var status: String
  /**
    * The time of the last refresh of the check.
    */
  var timestamp: String
}

object TrustedAdvisorCheckSummary {
  @scala.inline
  def apply(
    categorySpecificSummary: TrustedAdvisorCategorySpecificSummary,
    checkId: String,
    resourcesSummary: TrustedAdvisorResourcesSummary,
    status: String,
    timestamp: String,
    hasFlaggedResources: js.UndefOr[Boolean] = js.undefined
  ): TrustedAdvisorCheckSummary = {
    val __obj = js.Dynamic.literal(categorySpecificSummary = categorySpecificSummary, checkId = checkId, resourcesSummary = resourcesSummary, status = status, timestamp = timestamp)
    if (!js.isUndefined(hasFlaggedResources)) __obj.updateDynamic("hasFlaggedResources")(hasFlaggedResources)
    __obj.asInstanceOf[TrustedAdvisorCheckSummary]
  }
}

