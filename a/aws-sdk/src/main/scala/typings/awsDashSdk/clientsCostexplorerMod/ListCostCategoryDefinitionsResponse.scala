package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCostCategoryDefinitionsResponse extends js.Object {
  /**
    *  A reference to a Cost Category containing enough information to identify the Cost Category. 
    */
  var CostCategoryReferences: js.UndefOr[CostCategoryReferencesList] = js.native
  /**
    *  The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextToken: js.UndefOr[NextPageToken] = js.native
}

object ListCostCategoryDefinitionsResponse {
  @scala.inline
  def apply(CostCategoryReferences: CostCategoryReferencesList = null, NextToken: NextPageToken = null): ListCostCategoryDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (CostCategoryReferences != null) __obj.updateDynamic("CostCategoryReferences")(CostCategoryReferences.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCostCategoryDefinitionsResponse]
  }
}

