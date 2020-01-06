package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteV2LoggingLevelRequest extends js.Object {
  /**
    * The name of the resource for which you are configuring logging.
    */
  var targetName: LogTargetName = js.native
  /**
    * The type of resource for which you are configuring logging. Must be THING_Group.
    */
  var targetType: LogTargetType = js.native
}

object DeleteV2LoggingLevelRequest {
  @scala.inline
  def apply(targetName: LogTargetName, targetType: LogTargetType): DeleteV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(targetName = targetName.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteV2LoggingLevelRequest]
  }
}

