package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTakeoverActionsType extends js.Object {
  /**
    * Action to take for a high risk.
    */
  var HighAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
  /**
    * Action to take for a low risk.
    */
  var LowAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
  /**
    * Action to take for a medium risk.
    */
  var MediumAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
}

object AccountTakeoverActionsType {
  @scala.inline
  def apply(
    HighAction: AccountTakeoverActionType = null,
    LowAction: AccountTakeoverActionType = null,
    MediumAction: AccountTakeoverActionType = null
  ): AccountTakeoverActionsType = {
    val __obj = js.Dynamic.literal()
    if (HighAction != null) __obj.updateDynamic("HighAction")(HighAction)
    if (LowAction != null) __obj.updateDynamic("LowAction")(LowAction)
    if (MediumAction != null) __obj.updateDynamic("MediumAction")(MediumAction)
    __obj.asInstanceOf[AccountTakeoverActionsType]
  }
}

