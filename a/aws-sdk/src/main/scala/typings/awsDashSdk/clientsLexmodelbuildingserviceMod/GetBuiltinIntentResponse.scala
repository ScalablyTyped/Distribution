package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBuiltinIntentResponse extends js.Object {
  /**
    * The unique identifier for a built-in intent.
    */
  var signature: js.UndefOr[BuiltinIntentSignature] = js.undefined
  /**
    * An array of BuiltinIntentSlot objects, one entry for each slot type in the intent.
    */
  var slots: js.UndefOr[BuiltinIntentSlotList] = js.undefined
  /**
    * A list of locales that the intent supports.
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.undefined
}

object GetBuiltinIntentResponse {
  @scala.inline
  def apply(
    signature: BuiltinIntentSignature = null,
    slots: BuiltinIntentSlotList = null,
    supportedLocales: LocaleList = null
  ): GetBuiltinIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (slots != null) __obj.updateDynamic("slots")(slots)
    if (supportedLocales != null) __obj.updateDynamic("supportedLocales")(supportedLocales)
    __obj.asInstanceOf[GetBuiltinIntentResponse]
  }
}

