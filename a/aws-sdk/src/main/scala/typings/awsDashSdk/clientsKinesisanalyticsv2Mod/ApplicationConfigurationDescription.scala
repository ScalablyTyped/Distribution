package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationConfigurationDescription extends js.Object {
  /**
    * The details about the application code for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfigurationDescription: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationCodeConfigurationDescription
  ] = js.undefined
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfigurationDescription: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationSnapshotConfigurationDescription
  ] = js.undefined
  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentPropertyDescriptions: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.EnvironmentPropertyDescriptions] = js.undefined
  /**
    * The details about a Java-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfigurationDescription: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.FlinkApplicationConfigurationDescription
  ] = js.undefined
  /**
    * The details about the starting properties for a Kinesis Data Analytics application.
    */
  var RunConfigurationDescription: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RunConfigurationDescription] = js.undefined
  /**
    * The details about inputs, outputs, and reference data sources for an SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfigurationDescription: js.UndefOr[
    typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SqlApplicationConfigurationDescription
  ] = js.undefined
}

object ApplicationConfigurationDescription {
  @scala.inline
  def apply(
    ApplicationCodeConfigurationDescription: ApplicationCodeConfigurationDescription = null,
    ApplicationSnapshotConfigurationDescription: ApplicationSnapshotConfigurationDescription = null,
    EnvironmentPropertyDescriptions: EnvironmentPropertyDescriptions = null,
    FlinkApplicationConfigurationDescription: FlinkApplicationConfigurationDescription = null,
    RunConfigurationDescription: RunConfigurationDescription = null,
    SqlApplicationConfigurationDescription: SqlApplicationConfigurationDescription = null
  ): ApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationCodeConfigurationDescription != null) __obj.updateDynamic("ApplicationCodeConfigurationDescription")(ApplicationCodeConfigurationDescription)
    if (ApplicationSnapshotConfigurationDescription != null) __obj.updateDynamic("ApplicationSnapshotConfigurationDescription")(ApplicationSnapshotConfigurationDescription)
    if (EnvironmentPropertyDescriptions != null) __obj.updateDynamic("EnvironmentPropertyDescriptions")(EnvironmentPropertyDescriptions)
    if (FlinkApplicationConfigurationDescription != null) __obj.updateDynamic("FlinkApplicationConfigurationDescription")(FlinkApplicationConfigurationDescription)
    if (RunConfigurationDescription != null) __obj.updateDynamic("RunConfigurationDescription")(RunConfigurationDescription)
    if (SqlApplicationConfigurationDescription != null) __obj.updateDynamic("SqlApplicationConfigurationDescription")(SqlApplicationConfigurationDescription)
    __obj.asInstanceOf[ApplicationConfigurationDescription]
  }
}

