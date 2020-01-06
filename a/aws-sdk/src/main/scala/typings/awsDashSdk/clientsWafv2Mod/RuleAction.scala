package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleAction extends js.Object {
  /**
    * Instructs AWS WAF to allow the web request.
    */
  var Allow: js.UndefOr[AllowAction] = js.native
  /**
    * Instructs AWS WAF to block the web request.
    */
  var Block: js.UndefOr[BlockAction] = js.native
  /**
    * Instructs AWS WAF to count the web request and allow it.
    */
  var Count: js.UndefOr[CountAction] = js.native
}

object RuleAction {
  @scala.inline
  def apply(Allow: AllowAction = null, Block: BlockAction = null, Count: CountAction = null): RuleAction = {
    val __obj = js.Dynamic.literal()
    if (Allow != null) __obj.updateDynamic("Allow")(Allow.asInstanceOf[js.Any])
    if (Block != null) __obj.updateDynamic("Block")(Block.asInstanceOf[js.Any])
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleAction]
  }
}

