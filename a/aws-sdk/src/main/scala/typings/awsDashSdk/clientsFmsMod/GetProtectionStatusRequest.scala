package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProtectionStatusRequest extends js.Object {
  /**
    * The end of the time period to query for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var EndTime: js.UndefOr[TimeStamp] = js.undefined
  /**
    * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  /**
    * The AWS account that is in scope of the policy that you want to get the details for.
    */
  var MemberAccountId: js.UndefOr[AWSAccountId] = js.undefined
  /**
    * If you specify a value for MaxResults and you have more objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of objects. For the second and subsequent GetProtectionStatus requests, specify the value of NextToken from the previous response to get information about another batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ID of the policy for which you want to get the attack information.
    */
  var PolicyId: typings.awsDashSdk.clientsFmsMod.PolicyId
  /**
    * The start of the time period to query for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var StartTime: js.UndefOr[TimeStamp] = js.undefined
}

object GetProtectionStatusRequest {
  @scala.inline
  def apply(
    PolicyId: PolicyId,
    EndTime: TimeStamp = null,
    MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
    MemberAccountId: AWSAccountId = null,
    NextToken: PaginationToken = null,
    StartTime: TimeStamp = null
  ): GetProtectionStatusRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (MemberAccountId != null) __obj.updateDynamic("MemberAccountId")(MemberAccountId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[GetProtectionStatusRequest]
  }
}

