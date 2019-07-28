package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCopyGrantMessage extends js.Object {
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeSnapshotCopyGrant request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.  Constraints: You can specify either the SnapshotCopyGrantName parameter or the Marker parameter, but not both. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The list of SnapshotCopyGrant objects.
    */
  var SnapshotCopyGrants: js.UndefOr[SnapshotCopyGrantList] = js.undefined
}

object SnapshotCopyGrantMessage {
  @scala.inline
  def apply(Marker: String = null, SnapshotCopyGrants: SnapshotCopyGrantList = null): SnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (SnapshotCopyGrants != null) __obj.updateDynamic("SnapshotCopyGrants")(SnapshotCopyGrants)
    __obj.asInstanceOf[SnapshotCopyGrantMessage]
  }
}

