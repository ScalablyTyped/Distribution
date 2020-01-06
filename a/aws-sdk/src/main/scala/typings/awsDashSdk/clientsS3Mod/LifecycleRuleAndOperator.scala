package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleRuleAndOperator extends js.Object {
  /**
    * Prefix identifying one or more objects to which the rule applies.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.native
  /**
    * All of these tags must exist in the object's tag set in order for the rule to apply.
    */
  var Tags: js.UndefOr[TagSet] = js.native
}

object LifecycleRuleAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): LifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRuleAndOperator]
  }
}

