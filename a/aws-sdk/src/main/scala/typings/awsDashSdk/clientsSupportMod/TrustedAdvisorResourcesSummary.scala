package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedAdvisorResourcesSummary extends js.Object {
  /**
    * The number of AWS resources that were flagged (listed) by the Trusted Advisor check.
    */
  var resourcesFlagged: Long
  /**
    * The number of AWS resources ignored by Trusted Advisor because information was unavailable.
    */
  var resourcesIgnored: Long
  /**
    * The number of AWS resources that were analyzed by the Trusted Advisor check.
    */
  var resourcesProcessed: Long
  /**
    * The number of AWS resources ignored by Trusted Advisor because they were marked as suppressed by the user.
    */
  var resourcesSuppressed: Long
}

object TrustedAdvisorResourcesSummary {
  @scala.inline
  def apply(
    resourcesFlagged: Long,
    resourcesIgnored: Long,
    resourcesProcessed: Long,
    resourcesSuppressed: Long
  ): TrustedAdvisorResourcesSummary = {
    val __obj = js.Dynamic.literal(resourcesFlagged = resourcesFlagged, resourcesIgnored = resourcesIgnored, resourcesProcessed = resourcesProcessed, resourcesSuppressed = resourcesSuppressed)
  
    __obj.asInstanceOf[TrustedAdvisorResourcesSummary]
  }
}

