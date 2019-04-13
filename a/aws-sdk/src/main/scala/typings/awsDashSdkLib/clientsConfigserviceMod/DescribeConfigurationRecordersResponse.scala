package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationRecordersResponse extends js.Object {
  /**
    * A list that contains the descriptions of the specified configuration recorders.
    */
  var ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined
}

object DescribeConfigurationRecordersResponse {
  @scala.inline
  def apply(ConfigurationRecorders: ConfigurationRecorderList = null): DescribeConfigurationRecordersResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationRecorders != null) __obj.updateDynamic("ConfigurationRecorders")(ConfigurationRecorders)
    __obj.asInstanceOf[DescribeConfigurationRecordersResponse]
  }
}

