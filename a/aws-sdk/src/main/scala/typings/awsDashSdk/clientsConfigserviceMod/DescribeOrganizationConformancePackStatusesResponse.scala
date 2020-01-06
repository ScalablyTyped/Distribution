package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrganizationConformancePackStatusesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * A list of OrganizationConformancePackStatus objects. 
    */
  var OrganizationConformancePackStatuses: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.OrganizationConformancePackStatuses] = js.native
}

object DescribeOrganizationConformancePackStatusesResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    OrganizationConformancePackStatuses: OrganizationConformancePackStatuses = null
  ): DescribeOrganizationConformancePackStatusesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OrganizationConformancePackStatuses != null) __obj.updateDynamic("OrganizationConformancePackStatuses")(OrganizationConformancePackStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConformancePackStatusesResponse]
  }
}

