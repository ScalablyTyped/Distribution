package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationConfiguration extends js.Object {
  /**
    * The code location and type parameters for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfiguration: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationCodeConfiguration = js.native
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationSnapshotConfiguration] = js.native
  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentProperties: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.EnvironmentProperties] = js.native
  /**
    * The creation and update parameters for a Java-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.FlinkApplicationConfiguration] = js.native
  /**
    * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfiguration: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SqlApplicationConfiguration] = js.native
  /**
    * The array of descriptions of VPC configurations available to the application.
    */
  var VpcConfigurations: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.VpcConfigurations] = js.native
}

object ApplicationConfiguration {
  @scala.inline
  def apply(
    ApplicationCodeConfiguration: ApplicationCodeConfiguration,
    ApplicationSnapshotConfiguration: ApplicationSnapshotConfiguration = null,
    EnvironmentProperties: EnvironmentProperties = null,
    FlinkApplicationConfiguration: FlinkApplicationConfiguration = null,
    SqlApplicationConfiguration: SqlApplicationConfiguration = null,
    VpcConfigurations: VpcConfigurations = null
  ): ApplicationConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationCodeConfiguration = ApplicationCodeConfiguration.asInstanceOf[js.Any])
    if (ApplicationSnapshotConfiguration != null) __obj.updateDynamic("ApplicationSnapshotConfiguration")(ApplicationSnapshotConfiguration.asInstanceOf[js.Any])
    if (EnvironmentProperties != null) __obj.updateDynamic("EnvironmentProperties")(EnvironmentProperties.asInstanceOf[js.Any])
    if (FlinkApplicationConfiguration != null) __obj.updateDynamic("FlinkApplicationConfiguration")(FlinkApplicationConfiguration.asInstanceOf[js.Any])
    if (SqlApplicationConfiguration != null) __obj.updateDynamic("SqlApplicationConfiguration")(SqlApplicationConfiguration.asInstanceOf[js.Any])
    if (VpcConfigurations != null) __obj.updateDynamic("VpcConfigurations")(VpcConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationConfiguration]
  }
}

