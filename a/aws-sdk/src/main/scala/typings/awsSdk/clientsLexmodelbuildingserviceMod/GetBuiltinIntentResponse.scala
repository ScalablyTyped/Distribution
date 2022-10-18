package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBuiltinIntentResponse extends StObject {
  
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
  
  inline def apply(): GetBuiltinIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBuiltinIntentResponse]
  }
  
  extension [Self <: GetBuiltinIntentResponse](x: Self) {
    
    inline def setSignature(value: BuiltinIntentSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSlots(value: BuiltinIntentSlotList): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setSlotsVarargs(value: BuiltinIntentSlot*): Self = StObject.set(x, "slots", js.Array(value*))
    
    inline def setSupportedLocales(value: LocaleList): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    inline def setSupportedLocalesVarargs(value: Locale*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
  }
}
