package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentsResponse extends js.Object {
  /**
    * The list of application components.
    */
  var ApplicationComponentList: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ApplicationComponentList] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListComponentsResponse {
  @scala.inline
  def apply(ApplicationComponentList: ApplicationComponentList = null, NextToken: PaginationToken = null): ListComponentsResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationComponentList != null) __obj.updateDynamic("ApplicationComponentList")(ApplicationComponentList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentsResponse]
  }
}

