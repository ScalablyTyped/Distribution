package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListComplianceItemsRequest extends js.Object {
  /**
    * One or more compliance filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[ComplianceStringFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The ID for the resources from which to get compliance information. Currently, you can only specify one resource ID.
    */
  var ResourceIds: js.UndefOr[ComplianceResourceIdList] = js.undefined
  /**
    * The type of resource from which to get compliance information. Currently, the only supported resource type is ManagedInstance.
    */
  var ResourceTypes: js.UndefOr[ComplianceResourceTypeList] = js.undefined
}

object ListComplianceItemsRequest {
  @scala.inline
  def apply(
    Filters: ComplianceStringFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    ResourceIds: ComplianceResourceIdList = null,
    ResourceTypes: ComplianceResourceTypeList = null
  ): ListComplianceItemsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceIds != null) __obj.updateDynamic("ResourceIds")(ResourceIds)
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes)
    __obj.asInstanceOf[ListComplianceItemsRequest]
  }
}

