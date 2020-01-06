package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWebACLRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken = js.native
  /**
    * A default action for the web ACL, either ALLOW or BLOCK. AWS WAF performs the default action if a request doesn't match the criteria in any of the rules in a web ACL.
    */
  var DefaultAction: js.UndefOr[WafAction] = js.native
  /**
    * An array of updates to make to the WebACL. An array of WebACLUpdate objects that you want to insert into or delete from a WebACL. For more information, see the applicable data types:    WebACLUpdate: Contains Action and ActivatedRule     ActivatedRule: Contains Action, OverrideAction, Priority, RuleId, and Type. ActivatedRule|OverrideAction applies only when updating or adding a RuleGroup to a WebACL. In this case, you do not use ActivatedRule|Action. For all other update requests, ActivatedRule|Action is used instead of ActivatedRule|OverrideAction.     WafAction: Contains Type   
    */
  var Updates: js.UndefOr[WebACLUpdates] = js.native
  /**
    * The WebACLId of the WebACL that you want to update. WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId = js.native
}

object UpdateWebACLRequest {
  @scala.inline
  def apply(
    ChangeToken: ChangeToken,
    WebACLId: ResourceId,
    DefaultAction: WafAction = null,
    Updates: WebACLUpdates = null
  ): UpdateWebACLRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    if (DefaultAction != null) __obj.updateDynamic("DefaultAction")(DefaultAction.asInstanceOf[js.Any])
    if (Updates != null) __obj.updateDynamic("Updates")(Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWebACLRequest]
  }
}

