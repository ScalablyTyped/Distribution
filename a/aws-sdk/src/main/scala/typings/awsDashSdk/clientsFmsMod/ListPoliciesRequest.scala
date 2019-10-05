package typings.awsDashSdk.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesRequest extends js.Object {
  /**
    * Specifies the number of PolicySummary objects that you want AWS Firewall Manager to return for this request. If you have more PolicySummary objects than the number that you specify for MaxResults, the response includes a NextToken value that you can use to get another batch of PolicySummary objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  /**
    * If you specify a value for MaxResults and you have more PolicySummary objects than the number that you specify for MaxResults, AWS Firewall Manager returns a NextToken value in the response that allows you to list another group of PolicySummary objects. For the second and subsequent ListPolicies requests, specify the value of NextToken from the previous response to get information about another batch of PolicySummary objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListPoliciesRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: PaginationToken = null): ListPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListPoliciesRequest]
  }
}

