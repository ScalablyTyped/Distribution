package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigRequest extends js.Object {
  /**
    * Parameters of a Config.
    */
  var configData: ConfigTypeData
  /**
    * Name of a Config.
    */
  var name: SafeName
  /**
    * Tags assigned to a Config.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object CreateConfigRequest {
  @scala.inline
  def apply(configData: ConfigTypeData, name: SafeName, tags: TagsMap = null): CreateConfigRequest = {
    val __obj = js.Dynamic.literal(configData = configData, name = name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateConfigRequest]
  }
}

