package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceComplianceSummariesResult extends js.Object {
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A summary count for specified or targeted managed instances. Summary count includes information about compliant and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that you specify. 
    */
  var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.undefined
}

object ListResourceComplianceSummariesResult {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ResourceComplianceSummaryItems: ResourceComplianceSummaryItemList = null
  ): ListResourceComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceComplianceSummaryItems != null) __obj.updateDynamic("ResourceComplianceSummaryItems")(ResourceComplianceSummaryItems)
    __obj.asInstanceOf[ListResourceComplianceSummariesResult]
  }
}

