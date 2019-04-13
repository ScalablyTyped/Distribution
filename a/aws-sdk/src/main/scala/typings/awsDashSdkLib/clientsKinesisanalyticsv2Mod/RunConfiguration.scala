package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunConfiguration extends js.Object {
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
  /**
    * Describes the starting parameters for an SQL-based Kinesis Data Analytics application.
    */
  var SqlRunConfigurations: js.UndefOr[SqlRunConfigurations] = js.undefined
}

object RunConfiguration {
  @scala.inline
  def apply(
    ApplicationRestoreConfiguration: ApplicationRestoreConfiguration = null,
    SqlRunConfigurations: SqlRunConfigurations = null
  ): RunConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ApplicationRestoreConfiguration != null) __obj.updateDynamic("ApplicationRestoreConfiguration")(ApplicationRestoreConfiguration)
    if (SqlRunConfigurations != null) __obj.updateDynamic("SqlRunConfigurations")(SqlRunConfigurations)
    __obj.asInstanceOf[RunConfiguration]
  }
}

