package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsResponse extends js.Object {
  /**
    * The list of applications.
    */
  var ApplicationInfoList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfoList] = js.native
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListApplicationsResponse {
  @scala.inline
  def apply(ApplicationInfoList: ApplicationInfoList = null, NextToken: PaginationToken = null): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfoList != null) __obj.updateDynamic("ApplicationInfoList")(ApplicationInfoList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

