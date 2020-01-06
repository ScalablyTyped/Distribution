package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceSnapshotsRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get instance snapshots request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetInstanceSnapshotsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetInstanceSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceSnapshotsRequest]
  }
}

