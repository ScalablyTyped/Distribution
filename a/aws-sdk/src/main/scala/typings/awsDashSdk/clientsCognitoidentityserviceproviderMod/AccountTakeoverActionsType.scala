package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountTakeoverActionsType extends js.Object {
  /**
    * Action to take for a high risk.
    */
  var HighAction: js.UndefOr[AccountTakeoverActionType] = js.native
  /**
    * Action to take for a low risk.
    */
  var LowAction: js.UndefOr[AccountTakeoverActionType] = js.native
  /**
    * Action to take for a medium risk.
    */
  var MediumAction: js.UndefOr[AccountTakeoverActionType] = js.native
}

object AccountTakeoverActionsType {
  @scala.inline
  def apply(
    HighAction: AccountTakeoverActionType = null,
    LowAction: AccountTakeoverActionType = null,
    MediumAction: AccountTakeoverActionType = null
  ): AccountTakeoverActionsType = {
    val __obj = js.Dynamic.literal()
    if (HighAction != null) __obj.updateDynamic("HighAction")(HighAction.asInstanceOf[js.Any])
    if (LowAction != null) __obj.updateDynamic("LowAction")(LowAction.asInstanceOf[js.Any])
    if (MediumAction != null) __obj.updateDynamic("MediumAction")(MediumAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTakeoverActionsType]
  }
}

