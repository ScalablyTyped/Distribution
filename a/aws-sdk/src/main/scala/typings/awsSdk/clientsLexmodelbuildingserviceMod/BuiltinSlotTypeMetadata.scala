package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltinSlotTypeMetadata extends StObject {
  
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
  
  inline def apply(): BuiltinSlotTypeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltinSlotTypeMetadata]
  }
  
  extension [Self <: BuiltinSlotTypeMetadata](x: Self) {
    
    inline def setSignature(value: BuiltinSlotTypeSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSupportedLocales(value: LocaleList): Self = StObject.set(x, "supportedLocales", value.asInstanceOf[js.Any])
    
    inline def setSupportedLocalesUndefined: Self = StObject.set(x, "supportedLocales", js.undefined)
    
    inline def setSupportedLocalesVarargs(value: Locale*): Self = StObject.set(x, "supportedLocales", js.Array(value*))
  }
}
