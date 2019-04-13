package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSettings extends js.Object {
  /**
    * Enables or disables persistent application settings for users during their streaming sessions. 
    */
  var Enabled: Boolean
  /**
    * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same persistent application settings to be used across multiple stacks by specifying the same settings group for each stack. 
    */
  var SettingsGroup: js.UndefOr[SettingsGroup] = js.undefined
}

object ApplicationSettings {
  @scala.inline
  def apply(Enabled: Boolean, SettingsGroup: SettingsGroup = null): ApplicationSettings = {
    val __obj = js.Dynamic.literal(Enabled = Enabled)
    if (SettingsGroup != null) __obj.updateDynamic("SettingsGroup")(SettingsGroup)
    __obj.asInstanceOf[ApplicationSettings]
  }
}

