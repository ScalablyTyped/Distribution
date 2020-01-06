package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseSnapshotsRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database snapshots request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabaseSnapshotsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetRelationalDatabaseSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotsRequest]
  }
}

