package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationConformancePackDetailedStatusResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OrganizationConformancePackDetailedStatus objects. 
    */
  var OrganizationConformancePackDetailedStatuses: js.UndefOr[
    typings.awsDashSdk.clientsConfigserviceMod.OrganizationConformancePackDetailedStatuses
  ] = js.native
}

object GetOrganizationConformancePackDetailedStatusResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    OrganizationConformancePackDetailedStatuses: OrganizationConformancePackDetailedStatuses = null
  ): GetOrganizationConformancePackDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConformancePackDetailedStatuses != null) __obj.updateDynamic("OrganizationConformancePackDetailedStatuses")(OrganizationConformancePackDetailedStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationConformancePackDetailedStatusResponse]
  }
}

