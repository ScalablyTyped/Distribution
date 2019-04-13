package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRecorderStatusRequest extends js.Object {
  /**
    * The name(s) of the configuration recorder. If the name is not specified, the action returns the current status of all the configuration recorders associated with the account.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
}

object DescribeConfigurationRecorderStatusRequest {
  @scala.inline
  def apply(ConfigurationRecorderNames: ConfigurationRecorderNameList = null): DescribeConfigurationRecorderStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationRecorderNames != null) __obj.updateDynamic("ConfigurationRecorderNames")(ConfigurationRecorderNames)
    __obj.asInstanceOf[DescribeConfigurationRecorderStatusRequest]
  }
}

