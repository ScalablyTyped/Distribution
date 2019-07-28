package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWebACLRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafMod.ChangeToken
  /**
    * The action that you want AWS WAF to take when a request doesn't match the criteria specified in any of the Rule objects that are associated with the WebACL.
    */
  var DefaultAction: WafAction
  /**
    * A friendly name or description for the metrics for this WebACL.The name can contain only alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It can't contain whitespace or metric names reserved for AWS WAF, including "All" and "Default_Action." You can't change MetricName after you create the WebACL.
    */
  var MetricName: typings.awsDashSdk.clientsWafMod.MetricName
  /**
    * A friendly name or description of the WebACL. You can't change Name after you create the WebACL.
    */
  var Name: ResourceName
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateWebACLRequest {
  @scala.inline
  def apply(
    ChangeToken: ChangeToken,
    DefaultAction: WafAction,
    MetricName: MetricName,
    Name: ResourceName,
    Tags: TagList = null
  ): CreateWebACLRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, DefaultAction = DefaultAction, MetricName = MetricName, Name = Name)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateWebACLRequest]
  }
}

