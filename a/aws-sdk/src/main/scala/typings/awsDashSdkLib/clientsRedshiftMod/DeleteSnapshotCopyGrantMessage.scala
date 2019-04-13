package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotCopyGrantMessage extends js.Object {
  /**
    * The name of the snapshot copy grant to delete.
    */
  var SnapshotCopyGrantName: String
}

object DeleteSnapshotCopyGrantMessage {
  @scala.inline
  def apply(SnapshotCopyGrantName: String): DeleteSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName)
  
    __obj.asInstanceOf[DeleteSnapshotCopyGrantMessage]
  }
}

