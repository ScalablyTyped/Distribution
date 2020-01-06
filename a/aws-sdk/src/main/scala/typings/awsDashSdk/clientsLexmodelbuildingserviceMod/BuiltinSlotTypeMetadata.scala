package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuiltinSlotTypeMetadata extends js.Object {
  /**
    * A unique identifier for the built-in slot type. To find the signature for a slot type, see Slot Type Reference in the Alexa Skills Kit.
    */
  var signature: js.UndefOr[BuiltinSlotTypeSignature] = js.native
  /**
    * A list of target locales for the slot. 
    */
  var supportedLocales: js.UndefOr[LocaleList] = js.native
}

object BuiltinSlotTypeMetadata {
  @scala.inline
  def apply(signature: BuiltinSlotTypeSignature = null, supportedLocales: LocaleList = null): BuiltinSlotTypeMetadata = {
    val __obj = js.Dynamic.literal()
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (supportedLocales != null) __obj.updateDynamic("supportedLocales")(supportedLocales.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuiltinSlotTypeMetadata]
  }
}

