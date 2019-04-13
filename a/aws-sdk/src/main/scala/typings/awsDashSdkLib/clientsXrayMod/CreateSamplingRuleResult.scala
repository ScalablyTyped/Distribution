package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSamplingRuleResult extends js.Object {
  /**
    * The saved rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
}

object CreateSamplingRuleResult {
  @scala.inline
  def apply(SamplingRuleRecord: SamplingRuleRecord = null): CreateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord)
    __obj.asInstanceOf[CreateSamplingRuleResult]
  }
}

