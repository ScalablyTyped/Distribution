package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationConfigurationUpdate extends js.Object {
  /**
    * Describes updates to a Java-based Kinesis Data Analytics application's code configuration.
    */
  var ApplicationCodeConfigurationUpdate: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationCodeConfigurationUpdate
  ] = js.undefined
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationUpdate: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationSnapshotConfigurationUpdate
  ] = js.undefined
  /**
    * Describes updates to the environment properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyUpdates: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.EnvironmentPropertyUpdates] = js.undefined
  /**
    * Describes updates to a Java-based Kinesis Data Analytics application's configuration.
    */
  var FlinkApplicationConfigurationUpdate: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.FlinkApplicationConfigurationUpdate
  ] = js.undefined
  /**
    * Describes updates to an SQL-based Kinesis Data Analytics application's configuration.
    */
  var SqlApplicationConfigurationUpdate: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SqlApplicationConfigurationUpdate
  ] = js.undefined
}

object ApplicationConfigurationUpdate {
  @scala.inline
  def apply(
    ApplicationCodeConfigurationUpdate: ApplicationCodeConfigurationUpdate = null,
    ApplicationSnapshotConfigurationUpdate: ApplicationSnapshotConfigurationUpdate = null,
    EnvironmentPropertyUpdates: EnvironmentPropertyUpdates = null,
    FlinkApplicationConfigurationUpdate: FlinkApplicationConfigurationUpdate = null,
    SqlApplicationConfigurationUpdate: SqlApplicationConfigurationUpdate = null
  ): ApplicationConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (ApplicationCodeConfigurationUpdate != null) __obj.updateDynamic("ApplicationCodeConfigurationUpdate")(ApplicationCodeConfigurationUpdate)
    if (ApplicationSnapshotConfigurationUpdate != null) __obj.updateDynamic("ApplicationSnapshotConfigurationUpdate")(ApplicationSnapshotConfigurationUpdate)
    if (EnvironmentPropertyUpdates != null) __obj.updateDynamic("EnvironmentPropertyUpdates")(EnvironmentPropertyUpdates)
    if (FlinkApplicationConfigurationUpdate != null) __obj.updateDynamic("FlinkApplicationConfigurationUpdate")(FlinkApplicationConfigurationUpdate)
    if (SqlApplicationConfigurationUpdate != null) __obj.updateDynamic("SqlApplicationConfigurationUpdate")(SqlApplicationConfigurationUpdate)
    __obj.asInstanceOf[ApplicationConfigurationUpdate]
  }
}

