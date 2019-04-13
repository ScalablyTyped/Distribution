package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingRuleRecord extends js.Object {
  /**
    * When the rule was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * When the rule was last modified.
    */
  var ModifiedAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The sampling rule.
    */
  var SamplingRule: js.UndefOr[SamplingRule] = js.undefined
}

object SamplingRuleRecord {
  @scala.inline
  def apply(CreatedAt: Timestamp = null, ModifiedAt: Timestamp = null, SamplingRule: SamplingRule = null): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (ModifiedAt != null) __obj.updateDynamic("ModifiedAt")(ModifiedAt)
    if (SamplingRule != null) __obj.updateDynamic("SamplingRule")(SamplingRule)
    __obj.asInstanceOf[SamplingRuleRecord]
  }
}

