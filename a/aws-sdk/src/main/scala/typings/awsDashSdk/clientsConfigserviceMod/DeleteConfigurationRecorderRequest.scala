package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigurationRecorderRequest extends js.Object {
  /**
    * The name of the configuration recorder to be deleted. You can retrieve the name of your configuration recorder by using the DescribeConfigurationRecorders action.
    */
  var ConfigurationRecorderName: RecorderName
}

object DeleteConfigurationRecorderRequest {
  @scala.inline
  def apply(ConfigurationRecorderName: RecorderName): DeleteConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName)
  
    __obj.asInstanceOf[DeleteConfigurationRecorderRequest]
  }
}

