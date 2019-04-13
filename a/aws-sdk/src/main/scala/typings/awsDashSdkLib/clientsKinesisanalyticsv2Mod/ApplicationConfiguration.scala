package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationConfiguration extends js.Object {
  /**
    * The code location and type parameters for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationCodeConfiguration: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationCodeConfiguration
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var ApplicationSnapshotConfiguration: js.UndefOr[ApplicationSnapshotConfiguration] = js.undefined
  /**
    * Describes execution properties for a Java-based Kinesis Data Analytics application.
    */
  var EnvironmentProperties: js.UndefOr[EnvironmentProperties] = js.undefined
  /**
    * The creation and update parameters for a Java-based Kinesis Data Analytics application.
    */
  var FlinkApplicationConfiguration: js.UndefOr[FlinkApplicationConfiguration] = js.undefined
  /**
    * The creation and update parameters for an SQL-based Kinesis Data Analytics application.
    */
  var SqlApplicationConfiguration: js.UndefOr[SqlApplicationConfiguration] = js.undefined
}

object ApplicationConfiguration {
  @scala.inline
  def apply(
    ApplicationCodeConfiguration: ApplicationCodeConfiguration,
    ApplicationSnapshotConfiguration: ApplicationSnapshotConfiguration = null,
    EnvironmentProperties: EnvironmentProperties = null,
    FlinkApplicationConfiguration: FlinkApplicationConfiguration = null,
    SqlApplicationConfiguration: SqlApplicationConfiguration = null
  ): ApplicationConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationCodeConfiguration = ApplicationCodeConfiguration)
    if (ApplicationSnapshotConfiguration != null) __obj.updateDynamic("ApplicationSnapshotConfiguration")(ApplicationSnapshotConfiguration)
    if (EnvironmentProperties != null) __obj.updateDynamic("EnvironmentProperties")(EnvironmentProperties)
    if (FlinkApplicationConfiguration != null) __obj.updateDynamic("FlinkApplicationConfiguration")(FlinkApplicationConfiguration)
    if (SqlApplicationConfiguration != null) __obj.updateDynamic("SqlApplicationConfiguration")(SqlApplicationConfiguration)
    __obj.asInstanceOf[ApplicationConfiguration]
  }
}

