package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var Name: RuleName
}

object DisableRuleRequest {
  @scala.inline
  def apply(Name: RuleName): DisableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DisableRuleRequest]
  }
}

