package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRuleFilter extends js.Object {
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * This tag must exist in the object's tag set in order for the rule to apply.
    */
  var Tag: js.UndefOr[Tag] = js.undefined
}

object LifecycleRuleFilter {
  @scala.inline
  def apply(And: LifecycleRuleAndOperator = null, Prefix: Prefix = null, Tag: Tag = null): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
}

