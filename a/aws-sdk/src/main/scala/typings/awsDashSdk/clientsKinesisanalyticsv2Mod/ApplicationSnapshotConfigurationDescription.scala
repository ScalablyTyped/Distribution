package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSnapshotConfigurationDescription extends js.Object {
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabled: BooleanObject
}

object ApplicationSnapshotConfigurationDescription {
  @scala.inline
  def apply(SnapshotsEnabled: BooleanObject): ApplicationSnapshotConfigurationDescription = {
    val __obj = js.Dynamic.literal(SnapshotsEnabled = SnapshotsEnabled)
  
    __obj.asInstanceOf[ApplicationSnapshotConfigurationDescription]
  }
}

