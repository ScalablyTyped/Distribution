package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltinSlotTypeMetadata extends js.Object {
  /**
    * A unique identifier for the built-in slot type. To find the signature for a slot type, see Slot Type Reference in the Alexa Skills Kit.
    */
  var signature: js.UndefOr[BuiltinSlotTypeSignature] = js.undefined
  /**
    * A list of target locales for the slot. 
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.undefined
}

object BuiltinSlotTypeMetadata {
  @scala.inline
  def apply(signature: BuiltinSlotTypeSignature = null, supportedLocales: LocaleList = null): BuiltinSlotTypeMetadata = {
    val __obj = js.Dynamic.literal()
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (supportedLocales != null) __obj.updateDynamic("supportedLocales")(supportedLocales)
    __obj.asInstanceOf[BuiltinSlotTypeMetadata]
  }
}

