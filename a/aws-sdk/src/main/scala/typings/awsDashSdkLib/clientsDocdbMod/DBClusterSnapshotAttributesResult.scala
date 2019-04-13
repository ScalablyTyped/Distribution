package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterSnapshotAttributesResult extends js.Object {
  /**
    * The list of attributes and values for the DB cluster snapshot.
    */
  var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.undefined
  /**
    * The identifier of the DB cluster snapshot that the attributes apply to.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
}

object DBClusterSnapshotAttributesResult {
  @scala.inline
  def apply(
    DBClusterSnapshotAttributes: DBClusterSnapshotAttributeList = null,
    DBClusterSnapshotIdentifier: String = null
  ): DBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshotAttributes != null) __obj.updateDynamic("DBClusterSnapshotAttributes")(DBClusterSnapshotAttributes)
    if (DBClusterSnapshotIdentifier != null) __obj.updateDynamic("DBClusterSnapshotIdentifier")(DBClusterSnapshotIdentifier)
    __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
  }
}

