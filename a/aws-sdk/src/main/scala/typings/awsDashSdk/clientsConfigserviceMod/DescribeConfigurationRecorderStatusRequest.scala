package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRecorderStatusRequest extends js.Object {
  /**
    * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of all the configuration recorders associated with the account.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.native
}

object DescribeConfigurationRecorderStatusRequest {
  @scala.inline
  def apply(ConfigurationRecorderNames: ConfigurationRecorderNameList = null): DescribeConfigurationRecorderStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationRecorderNames != null) __obj.updateDynamic("ConfigurationRecorderNames")(ConfigurationRecorderNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusRequest]
  }
}

