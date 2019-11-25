package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2Argument extends js.Object {
  /**
    * Specified when query pattern includes a `$org.schema.type.YesNo` type or
    * expected input has a built-in intent: `actions.intent.CONFIRMATION`.
    * NOTE: if the boolean value is missing, it represents `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Specified for the built-in intent: `actions.intent.DATETIME`.
    */
  var datetimeValue: js.UndefOr[GoogleActionsV2DateTime] = js.undefined
  /**
    * Extension whose type depends on the argument.
    * For example, if the argument name is `SIGN_IN` for the
    * `actions.intent.SIGN_IN` intent, then this extension will
    * contain a SignInValue value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Specified for built-in intent: \"actions.intent.NUMBER\"
    */
  var floatValue: js.UndefOr[Double] = js.undefined
  /**
    * Specified when query pattern includes a $org.schema.type.Number type or
    * expected input has a built-in intent: \"assistant.intent.action.NUMBER\".
    */
  var intValue: js.UndefOr[String] = js.undefined
  /**
    * Name of the argument being provided for the input.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Specified when query pattern includes a $org.schema.type.Location type or
    * expected input has a built-in intent: \"actions.intent.PLACE\".
    */
  var placeValue: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * The raw text, typed or spoken, that provided the value for the argument.
    */
  var rawText: js.UndefOr[String] = js.undefined
  /**
    * Specified when an error was encountered while computing the argument. For
    * example, the built-in intent \"actions.intent.PLACE\" can return an error
    * status if the user denied the permission to access their device location.
    */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
  /**
    * Specified when Google needs to pass data value in JSON format.
    */
  var structuredValue: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  /**
    * Specified when query pattern includes a `$org.schema.type.Text` type or
    * expected input has a built-in intent: `actions.intent.TEXT`, or
    * `actions.intent.OPTION`. Note that for the `OPTION` intent, we set the
    * `text_value` as option key, the `raw_text` above will indicate the raw
    * span in user's query.
    */
  var textValue: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2Argument {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    datetimeValue: GoogleActionsV2DateTime = null,
    extension: ApiClientObjectMap[_] = null,
    floatValue: Int | Double = null,
    intValue: String = null,
    name: String = null,
    placeValue: GoogleActionsV2Location = null,
    rawText: String = null,
    status: GoogleRpcStatus = null,
    structuredValue: ApiClientObjectMap[_] = null,
    textValue: String = null
  ): GoogleActionsV2Argument = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (datetimeValue != null) __obj.updateDynamic("datetimeValue")(datetimeValue.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (floatValue != null) __obj.updateDynamic("floatValue")(floatValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeValue != null) __obj.updateDynamic("placeValue")(placeValue.asInstanceOf[js.Any])
    if (rawText != null) __obj.updateDynamic("rawText")(rawText.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (structuredValue != null) __obj.updateDynamic("structuredValue")(structuredValue.asInstanceOf[js.Any])
    if (textValue != null) __obj.updateDynamic("textValue")(textValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2Argument]
  }
}

