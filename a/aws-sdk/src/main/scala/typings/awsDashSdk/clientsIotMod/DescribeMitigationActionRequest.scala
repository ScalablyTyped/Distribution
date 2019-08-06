package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMitigationActionRequest extends js.Object {
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: MitigationActionName
}

object DescribeMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName): DescribeMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName)
  
    __obj.asInstanceOf[DescribeMitigationActionRequest]
  }
}

