package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.NextToken] = js.native
  /**
    * The overview of owned organizations presented as a list of organization summaries.
    */
  var OrganizationSummaries: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.OrganizationSummaries] = js.native
}

object ListOrganizationsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, OrganizationSummaries: OrganizationSummaries = null): ListOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationSummaries != null) __obj.updateDynamic("OrganizationSummaries")(OrganizationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrganizationsResponse]
  }
}

