package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListComponentsResponse extends js.Object {
  /**
    * The list of application components.
    */
  var ApplicationComponentList: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ApplicationComponentList] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListComponentsResponse {
  @scala.inline
  def apply(ApplicationComponentList: ApplicationComponentList = null, NextToken: PaginationToken = null): ListComponentsResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationComponentList != null) __obj.updateDynamic("ApplicationComponentList")(ApplicationComponentList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListComponentsResponse]
  }
}

