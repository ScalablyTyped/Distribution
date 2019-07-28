package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetRulePrioritiesInput extends js.Object {
  /**
    * The rule priorities.
    */
  var RulePriorities: RulePriorityList
}

object SetRulePrioritiesInput {
  @scala.inline
  def apply(RulePriorities: RulePriorityList): SetRulePrioritiesInput = {
    val __obj = js.Dynamic.literal(RulePriorities = RulePriorities)
  
    __obj.asInstanceOf[SetRulePrioritiesInput]
  }
}

