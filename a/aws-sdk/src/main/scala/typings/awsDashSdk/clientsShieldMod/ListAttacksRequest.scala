package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttacksRequest extends js.Object {
  /**
    * The end of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
    */
  var EndTime: js.UndefOr[TimeRange] = js.native
  /**
    * The maximum number of AttackSummary objects to be returned. If this is left blank, the first 20 results will be returned. This is a maximum value; it is possible that AWS WAF will return the results in smaller batches. That is, the number of AttackSummary objects returned could be less than MaxResults, even if there are still more AttackSummary objects yet to return. If there are more AttackSummary objects to return, AWS WAF will always also return a NextToken.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsShieldMod.MaxResults] = js.native
  /**
    * The ListAttacksRequest.NextMarker value from a previous call to ListAttacksRequest. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked. If this is left blank, all applicable resources for this account will be included.
    */
  var ResourceArns: js.UndefOr[ResourceArnFilterList] = js.native
  /**
    * The start of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
    */
  var StartTime: js.UndefOr[TimeRange] = js.native
}

object ListAttacksRequest {
  @scala.inline
  def apply(
    EndTime: TimeRange = null,
    MaxResults: Int | scala.Double = null,
    NextToken: Token = null,
    ResourceArns: ResourceArnFilterList = null,
    StartTime: TimeRange = null
  ): ListAttacksRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ResourceArns != null) __obj.updateDynamic("ResourceArns")(ResourceArns.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttacksRequest]
  }
}

