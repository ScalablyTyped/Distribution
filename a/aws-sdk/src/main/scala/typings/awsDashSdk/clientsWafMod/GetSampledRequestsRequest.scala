package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSampledRequestsRequest extends js.Object {
  /**
    * The number of requests that you want AWS WAF to return from among the first 5,000 requests that your AWS resource received during the time range. If your resource received fewer requests than the value of MaxItems, GetSampledRequests returns information about all of them. 
    */
  var MaxItems: GetSampledRequestsMaxItems
  /**
    *  RuleId is one of three values:   The RuleId of the Rule or the RuleGroupId of the RuleGroup for which you want GetSampledRequests to return a sample of requests.    Default_Action, which causes GetSampledRequests to return a sample of the requests that didn't match any of the rules in the specified WebACL.  
    */
  var RuleId: ResourceId
  /**
    * The start date and time and the end date and time of the range for which you want GetSampledRequests to return a sample of requests. Specify the date and time in the following format: "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var TimeWindow: typings.awsDashSdk.clientsWafMod.TimeWindow
  /**
    * The WebACLId of the WebACL for which you want GetSampledRequests to return a sample of requests.
    */
  var WebAclId: ResourceId
}

object GetSampledRequestsRequest {
  @scala.inline
  def apply(
    MaxItems: GetSampledRequestsMaxItems,
    RuleId: ResourceId,
    TimeWindow: TimeWindow,
    WebAclId: ResourceId
  ): GetSampledRequestsRequest = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems, RuleId = RuleId, TimeWindow = TimeWindow, WebAclId = WebAclId)
  
    __obj.asInstanceOf[GetSampledRequestsRequest]
  }
}

