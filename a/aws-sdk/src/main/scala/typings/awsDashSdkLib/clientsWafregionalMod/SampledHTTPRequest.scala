package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SampledHTTPRequest extends js.Object {
  /**
    * The action for the Rule that the request matched: ALLOW, BLOCK, or COUNT.
    */
  var Action: js.UndefOr[Action] = js.undefined
  /**
    * A complex type that contains detailed information about the request.
    */
  var Request: HTTPRequest
  /**
    * This value is returned if the GetSampledRequests request specifies the ID of a RuleGroup rather than the ID of an individual rule. RuleWithinRuleGroup is the rule within the specified RuleGroup that matched the request listed in the response.
    */
  var RuleWithinRuleGroup: js.UndefOr[ResourceId] = js.undefined
  /**
    * The time at which AWS WAF received the request from your AWS resource, in Unix time format (in seconds).
    */
  var Timestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * A value that indicates how one result in the response relates proportionally to other results in the response. A result that has a weight of 2 represents roughly twice as many CloudFront web requests as a result that has a weight of 1.
    */
  var Weight: SampleWeight
}

object SampledHTTPRequest {
  @scala.inline
  def apply(
    Request: HTTPRequest,
    Weight: SampleWeight,
    Action: Action = null,
    RuleWithinRuleGroup: ResourceId = null,
    Timestamp: Timestamp = null
  ): SampledHTTPRequest = {
    val __obj = js.Dynamic.literal(Request = Request, Weight = Weight)
    if (Action != null) __obj.updateDynamic("Action")(Action)
    if (RuleWithinRuleGroup != null) __obj.updateDynamic("RuleWithinRuleGroup")(RuleWithinRuleGroup)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[SampledHTTPRequest]
  }
}

