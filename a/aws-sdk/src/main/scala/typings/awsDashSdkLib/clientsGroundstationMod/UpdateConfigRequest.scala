package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigRequest extends js.Object {
  /**
    * Parameters for a Config.
    */
  var configData: ConfigTypeData
  /**
    * UUID of a Config.
    */
  var configId: String
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
  /**
    * Name of a Config.
    */
  var name: SafeName
}

object UpdateConfigRequest {
  @scala.inline
  def apply(configData: ConfigTypeData, configId: String, configType: ConfigCapabilityType, name: SafeName): UpdateConfigRequest = {
    val __obj = js.Dynamic.literal(configData = configData, configId = configId, configType = configType.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[UpdateConfigRequest]
  }
}

