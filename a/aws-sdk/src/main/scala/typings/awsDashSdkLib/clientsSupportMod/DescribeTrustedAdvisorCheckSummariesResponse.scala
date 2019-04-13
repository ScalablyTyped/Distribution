package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustedAdvisorCheckSummariesResponse extends js.Object {
  /**
    * The summary information for the requested Trusted Advisor checks.
    */
  var summaries: TrustedAdvisorCheckSummaryList
}

object DescribeTrustedAdvisorCheckSummariesResponse {
  @scala.inline
  def apply(summaries: TrustedAdvisorCheckSummaryList): DescribeTrustedAdvisorCheckSummariesResponse = {
    val __obj = js.Dynamic.literal(summaries = summaries)
  
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckSummariesResponse]
  }
}

