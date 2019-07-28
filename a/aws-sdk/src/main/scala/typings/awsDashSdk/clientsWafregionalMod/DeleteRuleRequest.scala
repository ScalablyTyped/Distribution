package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRuleRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
  /**
    * The RuleId of the Rule that you want to delete. RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId
}

object DeleteRuleRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, RuleId: ResourceId): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, RuleId = RuleId)
  
    __obj.asInstanceOf[DeleteRuleRequest]
  }
}

