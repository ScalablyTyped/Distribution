package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopConfigurationRecorderRequest extends js.Object {
  /**
    * The name of the recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorderName: RecorderName
}

object StopConfigurationRecorderRequest {
  @scala.inline
  def apply(ConfigurationRecorderName: RecorderName): StopConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName)
  
    __obj.asInstanceOf[StopConfigurationRecorderRequest]
  }
}

