package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfiguration: js.UndefOr[ApplicationRestoreConfiguration] = js.undefined
}

object RunConfigurationUpdate {
  @scala.inline
  def apply(ApplicationRestoreConfiguration: ApplicationRestoreConfiguration = null): RunConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    if (ApplicationRestoreConfiguration != null) __obj.updateDynamic("ApplicationRestoreConfiguration")(ApplicationRestoreConfiguration)
    __obj.asInstanceOf[RunConfigurationUpdate]
  }
}

