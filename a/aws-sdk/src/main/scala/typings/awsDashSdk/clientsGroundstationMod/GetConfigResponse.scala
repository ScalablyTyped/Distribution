package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigResponse extends js.Object {
  /**
    * ARN of a Config
    
    */
  var configArn: ConfigArn
  /**
    * Data elements in a Config.
    */
  var configData: ConfigTypeData
  /**
    * UUID of a Config.
    */
  var configId: String
  /**
    * Type of a Config.
    */
  var configType: js.UndefOr[ConfigCapabilityType] = js.undefined
  /**
    * Name of a Config.
    */
  var name: String
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object GetConfigResponse {
  @scala.inline
  def apply(
    configArn: ConfigArn,
    configData: ConfigTypeData,
    configId: String,
    name: String,
    configType: ConfigCapabilityType = null,
    tags: TagsMap = null
  ): GetConfigResponse = {
    val __obj = js.Dynamic.literal(configArn = configArn, configData = configData, configId = configId, name = name)
    if (configType != null) __obj.updateDynamic("configType")(configType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetConfigResponse]
  }
}

