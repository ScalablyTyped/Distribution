package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridProjectsRequest extends js.Object {
  /**
    * Return no more than this number of results.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * From a response, used to continue a paginated listing. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTestGridProjectsRequest {
  @scala.inline
  def apply(maxResult: Int | scala.Double = null, nextToken: PaginationToken = null): ListTestGridProjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResult != null) __obj.updateDynamic("maxResult")(maxResult.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridProjectsRequest]
  }
}

