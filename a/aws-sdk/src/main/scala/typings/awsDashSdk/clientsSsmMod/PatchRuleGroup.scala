package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchRuleGroup extends js.Object {
  /**
    * The rules that make up the rule group.
    */
  var PatchRules: PatchRuleList
}

object PatchRuleGroup {
  @scala.inline
  def apply(PatchRules: PatchRuleList): PatchRuleGroup = {
    val __obj = js.Dynamic.literal(PatchRules = PatchRules)
  
    __obj.asInstanceOf[PatchRuleGroup]
  }
}

