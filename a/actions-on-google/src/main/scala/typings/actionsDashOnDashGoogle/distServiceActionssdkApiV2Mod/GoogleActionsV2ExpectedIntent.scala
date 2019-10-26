package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2ExpectedIntent extends js.Object {
  /**
    * Additional configuration data required by a built-in intent. Possible
    * values for the built-in intents: `actions.intent.OPTION ->`
    * [google.actions.v2.OptionValueSpec], `actions.intent.CONFIRMATION ->`
    * [google.actions.v2.ConfirmationValueSpec],
    * `actions.intent.TRANSACTION_REQUIREMENTS_CHECK ->`
    * [google.actions.v2.TransactionRequirementsCheckSpec],
    * `actions.intent.DELIVERY_ADDRESS ->`
    * [google.actions.v2.DeliveryAddressValueSpec],
    * `actions.intent.TRANSACTION_DECISION ->`
    * [google.actions.v2.TransactionDecisionValueSpec],
    * `actions.intent.PLACE ->`
    * [google.actions.v2.PlaceValueSpec],
    * `actions.intent.Link ->`
    * [google.actions.v2.LinkValueSpec]
    */
  var inputValueData: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * The built-in intent name, e.g. `actions.intent.TEXT`, or intents
    * defined in the action package. If the intent specified is not a built-in
    * intent, it is only used for speech biasing and the input provided by the
    * Google Assistant will be the `actions.intent.TEXT` intent.
    */
  var intent: js.UndefOr[String] = js.undefined
  /**
    * Optionally, a parameter of the intent that is being requested. Only valid
    * for requested intents. Used for speech biasing.
    */
  var parameterName: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2ExpectedIntent {
  @scala.inline
  def apply(inputValueData: ApiClientObjectMap[_] = null, intent: String = null, parameterName: String = null): GoogleActionsV2ExpectedIntent = {
    val __obj = js.Dynamic.literal()
    if (inputValueData != null) __obj.updateDynamic("inputValueData")(inputValueData)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName)
    __obj.asInstanceOf[GoogleActionsV2ExpectedIntent]
  }
}

