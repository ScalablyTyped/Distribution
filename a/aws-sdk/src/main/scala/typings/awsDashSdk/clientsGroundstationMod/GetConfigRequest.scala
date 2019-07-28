package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigRequest extends js.Object {
  /**
    * UUID of a Config.
    */
  var configId: String
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
}

object GetConfigRequest {
  @scala.inline
  def apply(configId: String, configType: ConfigCapabilityType): GetConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId, configType = configType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConfigRequest]
  }
}

