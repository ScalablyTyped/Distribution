package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRuleFilter extends js.Object {
  var And: js.UndefOr[LifecycleRuleAndOperator] = js.native
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.native
  /**
    * This tag must exist in the object's tag set in order for the rule to apply.
    */
  var Tag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Tag] = js.native
}

object LifecycleRuleFilter {
  @scala.inline
  def apply(And: LifecycleRuleAndOperator = null, Prefix: Prefix = null, Tag: Tag = null): LifecycleRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRuleFilter]
  }
}

