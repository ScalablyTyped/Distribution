package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationsResponse extends js.Object {
  /**
    * The list of applications.
    */
  var ApplicationInfoList: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ApplicationInfoList] = js.undefined
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListApplicationsResponse {
  @scala.inline
  def apply(ApplicationInfoList: ApplicationInfoList = null, NextToken: PaginationToken = null): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfoList != null) __obj.updateDynamic("ApplicationInfoList")(ApplicationInfoList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

