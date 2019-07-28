package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSamplingRuleResult extends js.Object {
  /**
    * The deleted rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsDashSdk.clientsXrayMod.SamplingRuleRecord] = js.undefined
}

object DeleteSamplingRuleResult {
  @scala.inline
  def apply(SamplingRuleRecord: SamplingRuleRecord = null): DeleteSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord)
    __obj.asInstanceOf[DeleteSamplingRuleResult]
  }
}

