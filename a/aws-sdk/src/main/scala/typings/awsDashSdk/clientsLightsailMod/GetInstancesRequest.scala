package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get instances request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetInstancesRequest {
  @scala.inline
  def apply(pageToken: String = null): GetInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesRequest]
  }
}

