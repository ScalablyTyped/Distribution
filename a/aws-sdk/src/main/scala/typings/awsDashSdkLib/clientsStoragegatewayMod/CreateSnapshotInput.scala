package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotInput extends js.Object {
  /**
    * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the AWS Storage Gateway snapshot Details pane, Description field
    */
  var SnapshotDescription: awsDashSdkLib.clientsStoragegatewayMod.SnapshotDescription
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: awsDashSdkLib.clientsStoragegatewayMod.VolumeARN
}

object CreateSnapshotInput {
  @scala.inline
  def apply(SnapshotDescription: SnapshotDescription, VolumeARN: VolumeARN): CreateSnapshotInput = {
    val __obj = js.Dynamic.literal(SnapshotDescription = SnapshotDescription, VolumeARN = VolumeARN)
  
    __obj.asInstanceOf[CreateSnapshotInput]
  }
}

