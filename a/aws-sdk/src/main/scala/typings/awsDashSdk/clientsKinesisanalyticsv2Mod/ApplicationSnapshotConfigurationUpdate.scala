package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSnapshotConfigurationUpdate extends js.Object {
  /**
    * Describes updates to whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabledUpdate: BooleanObject
}

object ApplicationSnapshotConfigurationUpdate {
  @scala.inline
  def apply(SnapshotsEnabledUpdate: BooleanObject): ApplicationSnapshotConfigurationUpdate = {
    val __obj = js.Dynamic.literal(SnapshotsEnabledUpdate = SnapshotsEnabledUpdate)
  
    __obj.asInstanceOf[ApplicationSnapshotConfigurationUpdate]
  }
}

