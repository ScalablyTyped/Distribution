package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var Name: RuleName
}

object EnableRuleRequest {
  @scala.inline
  def apply(Name: RuleName): EnableRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[EnableRuleRequest]
  }
}

