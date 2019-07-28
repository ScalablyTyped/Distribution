package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSnapshotInput extends js.Object {
  /**
    * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the AWS Storage Gateway snapshot Details pane, Description field
    */
  var SnapshotDescription: typings.awsDashSdk.clientsStoragegatewayMod.SnapshotDescription
  /**
    * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typings.awsDashSdk.clientsStoragegatewayMod.VolumeARN
}

object CreateSnapshotInput {
  @scala.inline
  def apply(SnapshotDescription: SnapshotDescription, VolumeARN: VolumeARN, Tags: Tags = null): CreateSnapshotInput = {
    val __obj = js.Dynamic.literal(SnapshotDescription = SnapshotDescription, VolumeARN = VolumeARN)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateSnapshotInput]
  }
}

