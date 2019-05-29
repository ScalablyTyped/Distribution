package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigRequest extends js.Object {
  /**
    * UUID of a Config.
    */
  var configId: String
  /**
    * Type of a Config.
    */
  var configType: ConfigCapabilityType
}

object DeleteConfigRequest {
  @scala.inline
  def apply(configId: String, configType: ConfigCapabilityType): DeleteConfigRequest = {
    val __obj = js.Dynamic.literal(configId = configId, configType = configType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConfigRequest]
  }
}

