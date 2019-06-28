package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppsRequest extends js.Object {
  /**
    * The maximum number of items to include on each page in a paginated response.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[__string] = js.undefined
}

object GetAppsRequest {
  @scala.inline
  def apply(PageSize: __string = null, Token: __string = null): GetAppsRequest = {
    val __obj = js.Dynamic.literal()
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetAppsRequest]
  }
}

