package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRuleRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var Name: RuleName
}

object DescribeRuleRequest {
  @scala.inline
  def apply(Name: RuleName): DescribeRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DescribeRuleRequest]
  }
}

