package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingRulesResult extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Rule definitions and metadata.
    */
  var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.undefined
}

object GetSamplingRulesResult {
  @scala.inline
  def apply(NextToken: String = null, SamplingRuleRecords: SamplingRuleRecordList = null): GetSamplingRulesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SamplingRuleRecords != null) __obj.updateDynamic("SamplingRuleRecords")(SamplingRuleRecords)
    __obj.asInstanceOf[GetSamplingRulesResult]
  }
}

