package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDBClusterSnapshotAttributesMessage extends js.Object {
  /**
    * The identifier for the DB cluster snapshot to describe the attributes for.
    */
  var DBClusterSnapshotIdentifier: String
}

object DescribeDBClusterSnapshotAttributesMessage {
  @scala.inline
  def apply(DBClusterSnapshotIdentifier: String): DescribeDBClusterSnapshotAttributesMessage = {
    val __obj = js.Dynamic.literal(DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier)
  
    __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesMessage]
  }
}

