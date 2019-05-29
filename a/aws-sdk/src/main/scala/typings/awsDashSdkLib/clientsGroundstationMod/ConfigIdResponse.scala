package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigIdResponse extends js.Object {
  /**
    * ARN of a Config.
    */
  var configArn: js.UndefOr[ConfigArn] = js.undefined
  /**
    * UUID of a Config.
    */
  var configId: js.UndefOr[String] = js.undefined
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.undefined
}

object ConfigIdResponse {
  @scala.inline
  def apply(configArn: ConfigArn = null, configId: String = null, configType: ConfigCapabilityType = null): ConfigIdResponse = {
    val __obj = js.Dynamic.literal()
    if (configArn != null) __obj.updateDynamic("configArn")(configArn)
    if (configId != null) __obj.updateDynamic("configId")(configId)
    if (configType != null) __obj.updateDynamic("configType")(configType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigIdResponse]
  }
}

