package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the rule set to create. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var RuleSetName: ReceiptRuleSetName = js.native
}

object CreateReceiptRuleSetRequest {
  @scala.inline
  def apply(RuleSetName: ReceiptRuleSetName): CreateReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(RuleSetName = RuleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateReceiptRuleSetRequest]
  }
}

