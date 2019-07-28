package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationRestoreConfiguration extends js.Object {
  /**
    * Specifies how the application should be restored.
    */
  var ApplicationRestoreType: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationRestoreType
  /**
    * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if RESTORE_FROM_CUSTOM_SNAPSHOT is specified for the ApplicationRestoreType.
    */
  var SnapshotName: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotName] = js.undefined
}

object ApplicationRestoreConfiguration {
  @scala.inline
  def apply(ApplicationRestoreType: ApplicationRestoreType, SnapshotName: SnapshotName = null): ApplicationRestoreConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationRestoreType = ApplicationRestoreType.asInstanceOf[js.Any])
    if (SnapshotName != null) __obj.updateDynamic("SnapshotName")(SnapshotName)
    __obj.asInstanceOf[ApplicationRestoreConfiguration]
  }
}

