package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOpsItemsRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[OpsItemMaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * One or more filters to limit the reponse.   Key: CreatedTime Operations: GreaterThan, LessThan   Key: LastModifiedBy Operations: Contains, Equals   Key: LastModifiedTime Operations: GreaterThan, LessThan   Key: Priority Operations: Equals   Key: Source Operations: Contains, Equals   Key: Status Operations: Equals   Key: Title Operations: Contains   Key: OperationalData Operations: Equals   Key: OperationalDataKey Operations: Equals   Key: OperationalDataValue Operations: Equals, Contains   Key: OpsItemId Operations: Equals   Key: ResourceId Operations: Contains   Key: AutomationId Operations: Equals  
    */
  var OpsItemFilters: js.UndefOr[OpsItemFilters] = js.undefined
}

object DescribeOpsItemsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[OpsItemMaxResults] = js.undefined,
    NextToken: String = null,
    OpsItemFilters: OpsItemFilters = null
  ): DescribeOpsItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OpsItemFilters != null) __obj.updateDynamic("OpsItemFilters")(OpsItemFilters)
    __obj.asInstanceOf[DescribeOpsItemsRequest]
  }
}

