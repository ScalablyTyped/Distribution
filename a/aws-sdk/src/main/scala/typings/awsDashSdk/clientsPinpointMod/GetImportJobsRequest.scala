package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImportJobsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is currently not supported by the App Metrics and Campaign Metrics resources.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
  /**
    * The NextToken string that specifies which page of results to return in a paginated response.
    */
  var Token: js.UndefOr[__string] = js.undefined
}

object GetImportJobsRequest {
  @scala.inline
  def apply(ApplicationId: __string, PageSize: __string = null, Token: __string = null): GetImportJobsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    if (Token != null) __obj.updateDynamic("Token")(Token)
    __obj.asInstanceOf[GetImportJobsRequest]
  }
}

