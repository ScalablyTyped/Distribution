package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseSnapshotsResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get relational database snapshots request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An object describing the result of your get relational database snapshots request.
    */
  var relationalDatabaseSnapshots: js.UndefOr[RelationalDatabaseSnapshotList] = js.undefined
}

object GetRelationalDatabaseSnapshotsResult {
  @scala.inline
  def apply(
    nextPageToken: java.lang.String = null,
    relationalDatabaseSnapshots: RelationalDatabaseSnapshotList = null
  ): GetRelationalDatabaseSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (relationalDatabaseSnapshots != null) __obj.updateDynamic("relationalDatabaseSnapshots")(relationalDatabaseSnapshots)
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotsResult]
  }
}

