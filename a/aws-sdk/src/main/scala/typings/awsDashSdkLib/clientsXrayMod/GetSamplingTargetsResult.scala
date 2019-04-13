package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingTargetsResult extends js.Object {
  /**
    * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
    */
  var LastRuleModification: js.UndefOr[Timestamp] = js.undefined
  /**
    * Updated rules that the service should use to sample requests.
    */
  var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.undefined
  /**
    * Information about SamplingStatisticsDocument that X-Ray could not process.
    */
  var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.undefined
}

object GetSamplingTargetsResult {
  @scala.inline
  def apply(
    LastRuleModification: Timestamp = null,
    SamplingTargetDocuments: SamplingTargetDocumentList = null,
    UnprocessedStatistics: UnprocessedStatisticsList = null
  ): GetSamplingTargetsResult = {
    val __obj = js.Dynamic.literal()
    if (LastRuleModification != null) __obj.updateDynamic("LastRuleModification")(LastRuleModification)
    if (SamplingTargetDocuments != null) __obj.updateDynamic("SamplingTargetDocuments")(SamplingTargetDocuments)
    if (UnprocessedStatistics != null) __obj.updateDynamic("UnprocessedStatistics")(UnprocessedStatistics)
    __obj.asInstanceOf[GetSamplingTargetsResult]
  }
}

