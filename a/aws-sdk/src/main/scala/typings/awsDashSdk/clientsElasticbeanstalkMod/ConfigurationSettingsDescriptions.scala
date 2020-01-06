package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSettingsDescriptions extends js.Object {
  /**
    *  A list of ConfigurationSettingsDescription. 
    */
  var ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.native
}

object ConfigurationSettingsDescriptions {
  @scala.inline
  def apply(ConfigurationSettings: ConfigurationSettingsDescriptionList = null): ConfigurationSettingsDescriptions = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSettings != null) __obj.updateDynamic("ConfigurationSettings")(ConfigurationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSettingsDescriptions]
  }
}

