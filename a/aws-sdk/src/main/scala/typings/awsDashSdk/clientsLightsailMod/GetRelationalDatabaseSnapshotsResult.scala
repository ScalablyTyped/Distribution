package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseSnapshotsResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get relational database snapshots request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational database snapshots request.
    */
  var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.native
}

object GetRelationalDatabaseSnapshotsResult {
  @scala.inline
  def apply(nextPageToken: String = null, relationalDatabaseSnapshots: RelationalDatabaseSnapshotList = null): GetRelationalDatabaseSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (relationalDatabaseSnapshots != null) __obj.updateDynamic("relationalDatabaseSnapshots")(relationalDatabaseSnapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotsResult]
  }
}

