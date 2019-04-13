package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleRuleAndOperator extends js.Object {
  /**
    * 
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * All of these tags must exist in the object's tag set in order for the rule to apply.
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}

object LifecycleRuleAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): LifecycleRuleAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[LifecycleRuleAndOperator]
  }
}

