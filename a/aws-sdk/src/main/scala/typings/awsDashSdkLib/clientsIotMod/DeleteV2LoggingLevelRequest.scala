package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteV2LoggingLevelRequest extends js.Object {
  /**
    * The name of the resource for which you are configuring logging.
    */
  var targetName: LogTargetName
  /**
    * The type of resource for which you are configuring logging. Must be THING_Group.
    */
  var targetType: LogTargetType
}

object DeleteV2LoggingLevelRequest {
  @scala.inline
  def apply(targetName: LogTargetName, targetType: LogTargetType): DeleteV2LoggingLevelRequest = {
    val __obj = js.Dynamic.literal(targetName = targetName, targetType = targetType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteV2LoggingLevelRequest]
  }
}

