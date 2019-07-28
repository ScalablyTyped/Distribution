package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebACL extends js.Object {
  /**
    * The action to perform if none of the Rules contained in the WebACL match. The action is specified by the WafAction object.
    */
  var DefaultAction: WafAction
  /**
    * A friendly name or description for the metrics for this WebACL. The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the WebACL.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsWafMod.MetricName] = js.undefined
  /**
    * A friendly name or description of the WebACL. You can't change the name of a WebACL after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  /**
    * An array that contains the action for each Rule in a WebACL, the priority of the Rule, and the ID of the Rule.
    */
  var Rules: ActivatedRules
  /**
    * Tha Amazon Resource Name (ARN) of the web ACL.
    */
  var WebACLArn: js.UndefOr[ResourceArn] = js.undefined
  /**
    * A unique identifier for a WebACL. You use WebACLId to get information about a WebACL (see GetWebACL), update a WebACL (see UpdateWebACL), and delete a WebACL from AWS WAF (see DeleteWebACL).  WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId
}

object WebACL {
  @scala.inline
  def apply(
    DefaultAction: WafAction,
    Rules: ActivatedRules,
    WebACLId: ResourceId,
    MetricName: MetricName = null,
    Name: ResourceName = null,
    WebACLArn: ResourceArn = null
  ): WebACL = {
    val __obj = js.Dynamic.literal(DefaultAction = DefaultAction, Rules = Rules, WebACLId = WebACLId)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (WebACLArn != null) __obj.updateDynamic("WebACLArn")(WebACLArn)
    __obj.asInstanceOf[WebACL]
  }
}

