package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneReceiptRuleSetRequest extends js.Object {
  /**
    * The name of the rule set to clone.
    */
  var OriginalRuleSetName: ReceiptRuleSetName
  /**
    * The name of the rule set to create. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var RuleSetName: ReceiptRuleSetName
}

object CloneReceiptRuleSetRequest {
  @scala.inline
  def apply(OriginalRuleSetName: ReceiptRuleSetName, RuleSetName: ReceiptRuleSetName): CloneReceiptRuleSetRequest = {
    val __obj = js.Dynamic.literal(OriginalRuleSetName = OriginalRuleSetName, RuleSetName = RuleSetName)
  
    __obj.asInstanceOf[CloneReceiptRuleSetRequest]
  }
}

