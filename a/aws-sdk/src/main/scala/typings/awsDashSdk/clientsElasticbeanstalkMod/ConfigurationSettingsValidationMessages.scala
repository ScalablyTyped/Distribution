package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSettingsValidationMessages extends js.Object {
  /**
    *  A list of ValidationMessage. 
    */
  var Messages: js.UndefOr[ValidationMessagesList] = js.native
}

object ConfigurationSettingsValidationMessages {
  @scala.inline
  def apply(Messages: ValidationMessagesList = null): ConfigurationSettingsValidationMessages = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSettingsValidationMessages]
  }
}

