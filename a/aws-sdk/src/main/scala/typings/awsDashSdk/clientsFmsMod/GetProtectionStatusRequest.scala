package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProtectionStatusRequest extends js.Object {
  /**
    * The end of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var EndTime: js.UndefOr[TimeStamp] = js.native
  /**
    * Specifies the number of objects that you want AWS Firewall Manager to return for this request. If you have more objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.native
  /**
    * The AWS account that is in scope of the policy that you want to get the details for.
    */
  var MemberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * If you specify a value for MaxResults and you have more objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response, which you can use to retrieve another group of objects. For the second and subsequent GetProtectionStatus requests, specify the value of NextToken from the previous response to get information about another batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the policy for which you want to get the attack information.
    */
  var PolicyId: typings.awsDashSdk.clientsFmsMod.PolicyId = js.native
  /**
    * The start of the time period to query for the attacks. This is a timestamp type. The request syntax listing indicates a number type because the default used by AWS Firewall Manager is Unix time in seconds. However, any valid timestamp format is allowed.
    */
  var StartTime: js.UndefOr[TimeStamp] = js.native
}

object GetProtectionStatusRequest {
  @scala.inline
  def apply(
    PolicyId: PolicyId,
    EndTime: TimeStamp = null,
    MaxResults: Int | Double = null,
    MemberAccountId: AWSAccountId = null,
    NextToken: PaginationToken = null,
    StartTime: TimeStamp = null
  ): GetProtectionStatusRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (MemberAccountId != null) __obj.updateDynamic("MemberAccountId")(MemberAccountId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProtectionStatusRequest]
  }
}

