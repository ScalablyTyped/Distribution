package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthInfo extends js.Object {
  /**
    * The type of action for which the principal is being authorized.
    */
  var actionType: js.UndefOr[ActionType] = js.undefined
  /**
    * The resources for which the principal is being authorized to perform the specified action.
    */
  var resources: js.UndefOr[Resources] = js.undefined
}

object AuthInfo {
  @scala.inline
  def apply(actionType: ActionType = null, resources: Resources = null): AuthInfo = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[AuthInfo]
  }
}

