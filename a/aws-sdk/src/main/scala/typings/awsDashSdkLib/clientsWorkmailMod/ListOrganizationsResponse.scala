package typings
package awsDashSdkLib.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrganizationsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The overview of owned organizations presented as a list of organization summaries.
    */
  var OrganizationSummaries: js.UndefOr[OrganizationSummaries] = js.undefined
}

object ListOrganizationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, OrganizationSummaries: OrganizationSummaries = null): ListOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OrganizationSummaries != null) __obj.updateDynamic("OrganizationSummaries")(OrganizationSummaries)
    __obj.asInstanceOf[ListOrganizationsResponse]
  }
}

