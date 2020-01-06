package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.RuleArn] = js.native
}

object PutRuleResponse {
  @scala.inline
  def apply(RuleArn: RuleArn = null): PutRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (RuleArn != null) __obj.updateDynamic("RuleArn")(RuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRuleResponse]
  }
}

