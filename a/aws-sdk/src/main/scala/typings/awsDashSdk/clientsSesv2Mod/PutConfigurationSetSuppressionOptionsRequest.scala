package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetSuppressionOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to change the suppression list preferences for.
    */
  var ConfigurationSetName: typings.awsDashSdk.clientsSesv2Mod.ConfigurationSetName = js.native
  /**
    * A list that contains the reasons that email addresses are automatically added to the suppression list for your account. This list can contain any or all of the following:    COMPLAINT – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a complaint.    BOUNCE – Amazon SES adds an email address to the suppression list for your account when a message sent to that address results in a hard bounce.  
    */
  var SuppressedReasons: js.UndefOr[SuppressionListReasons] = js.native
}

object PutConfigurationSetSuppressionOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, SuppressedReasons: SuppressionListReasons = null): PutConfigurationSetSuppressionOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    if (SuppressedReasons != null) __obj.updateDynamic("SuppressedReasons")(SuppressedReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetSuppressionOptionsRequest]
  }
}

