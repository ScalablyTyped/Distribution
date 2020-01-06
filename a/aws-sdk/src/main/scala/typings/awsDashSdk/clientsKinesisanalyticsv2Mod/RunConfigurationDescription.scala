package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunConfigurationDescription extends js.Object {
  /**
    * Describes the restore behavior of a restarting application.
    */
  var ApplicationRestoreConfigurationDescription: js.UndefOr[ApplicationRestoreConfiguration] = js.native
}

object RunConfigurationDescription {
  @scala.inline
  def apply(ApplicationRestoreConfigurationDescription: ApplicationRestoreConfiguration = null): RunConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationRestoreConfigurationDescription != null) __obj.updateDynamic("ApplicationRestoreConfigurationDescription")(ApplicationRestoreConfigurationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunConfigurationDescription]
  }
}

