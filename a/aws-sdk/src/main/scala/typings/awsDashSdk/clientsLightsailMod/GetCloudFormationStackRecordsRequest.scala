package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFormationStackRecordsRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get cloud formation stack records request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetCloudFormationStackRecordsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetCloudFormationStackRecordsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFormationStackRecordsRequest]
  }
}

