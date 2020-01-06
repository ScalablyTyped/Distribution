package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingTargetsResult extends js.Object {
  /**
    * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
    */
  var LastRuleModification: js.UndefOr[Timestamp] = js.native
  /**
    * Updated rules that the service should use to sample requests.
    */
  var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.native
  /**
    * Information about SamplingStatisticsDocument that X-Ray could not process.
    */
  var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.native
}

object GetSamplingTargetsResult {
  @scala.inline
  def apply(
    LastRuleModification: Timestamp = null,
    SamplingTargetDocuments: SamplingTargetDocumentList = null,
    UnprocessedStatistics: UnprocessedStatisticsList = null
  ): GetSamplingTargetsResult = {
    val __obj = js.Dynamic.literal()
    if (LastRuleModification != null) __obj.updateDynamic("LastRuleModification")(LastRuleModification.asInstanceOf[js.Any])
    if (SamplingTargetDocuments != null) __obj.updateDynamic("SamplingTargetDocuments")(SamplingTargetDocuments.asInstanceOf[js.Any])
    if (UnprocessedStatistics != null) __obj.updateDynamic("UnprocessedStatistics")(UnprocessedStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsResult]
  }
}

