package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of Snapshot instances. 
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.undefined
}

object SnapshotMessage {
  @scala.inline
  def apply(Marker: String = null, Snapshots: SnapshotList = null): SnapshotMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Snapshots != null) __obj.updateDynamic("Snapshots")(Snapshots)
    __obj.asInstanceOf[SnapshotMessage]
  }
}

