package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMitigationActionRequest extends js.Object {
  /**
    * The name of the mitigation action that you want to delete.
    */
  var actionName: MitigationActionName
}

object DeleteMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName): DeleteMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName)
  
    __obj.asInstanceOf[DeleteMitigationActionRequest]
  }
}

