package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRecordersRequest extends js.Object {
  /**
    * A list of configuration recorder names.
    */
  var ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
}

object DescribeConfigurationRecordersRequest {
  @scala.inline
  def apply(ConfigurationRecorderNames: ConfigurationRecorderNameList = null): DescribeConfigurationRecordersRequest = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationRecorderNames != null) __obj.updateDynamic("ConfigurationRecorderNames")(ConfigurationRecorderNames)
    __obj.asInstanceOf[DescribeConfigurationRecordersRequest]
  }
}

