package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTargetsRequest extends js.Object {
  /**
    * The name of the rule.
    */
  var Rule: RuleName
  /**
    * The targets to update or add to the rule.
    */
  var Targets: TargetList
}

object PutTargetsRequest {
  @scala.inline
  def apply(Rule: RuleName, Targets: TargetList): PutTargetsRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule, Targets = Targets)
  
    __obj.asInstanceOf[PutTargetsRequest]
  }
}

