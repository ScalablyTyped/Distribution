package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIamInstanceProfileAssociationsRequest extends js.Object {
  /**
    * The IAM instance profile associations.
    */
  var AssociationIds: js.UndefOr[AssociationIdList] = js.undefined
  /**
    * The filters.    instance-id - The ID of the instance.    state - The state of the association (associating | associated | disassociating | disassociated).  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeIamInstanceProfileAssociationsRequest {
  @scala.inline
  def apply(
    AssociationIds: AssociationIdList = null,
    Filters: FilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeIamInstanceProfileAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AssociationIds != null) __obj.updateDynamic("AssociationIds")(AssociationIds)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsRequest]
  }
}

