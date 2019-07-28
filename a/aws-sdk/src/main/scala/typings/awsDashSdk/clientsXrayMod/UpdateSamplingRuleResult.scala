package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSamplingRuleResult extends js.Object {
  /**
    * The updated rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsDashSdk.clientsXrayMod.SamplingRuleRecord] = js.undefined
}

object UpdateSamplingRuleResult {
  @scala.inline
  def apply(SamplingRuleRecord: SamplingRuleRecord = null): UpdateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord)
    __obj.asInstanceOf[UpdateSamplingRuleResult]
  }
}

