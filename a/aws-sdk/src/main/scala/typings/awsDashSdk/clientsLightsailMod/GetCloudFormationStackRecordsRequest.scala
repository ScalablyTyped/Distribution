package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCloudFormationStackRecordsRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get cloud formation stack records request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetCloudFormationStackRecordsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetCloudFormationStackRecordsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetCloudFormationStackRecordsRequest]
  }
}

