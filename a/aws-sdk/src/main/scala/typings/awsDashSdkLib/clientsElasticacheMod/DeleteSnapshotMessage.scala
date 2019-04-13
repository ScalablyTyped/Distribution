package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSnapshotMessage extends js.Object {
  /**
    * The name of the snapshot to be deleted.
    */
  var SnapshotName: String
}

object DeleteSnapshotMessage {
  @scala.inline
  def apply(SnapshotName: String): DeleteSnapshotMessage = {
    val __obj = js.Dynamic.literal(SnapshotName = SnapshotName)
  
    __obj.asInstanceOf[DeleteSnapshotMessage]
  }
}

