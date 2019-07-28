package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigurationRecorderRequest extends js.Object {
  /**
    * The configuration recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorder: typings.awsDashSdk.clientsConfigserviceMod.ConfigurationRecorder
}

object PutConfigurationRecorderRequest {
  @scala.inline
  def apply(ConfigurationRecorder: ConfigurationRecorder): PutConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorder = ConfigurationRecorder)
  
    __obj.asInstanceOf[PutConfigurationRecorderRequest]
  }
}

