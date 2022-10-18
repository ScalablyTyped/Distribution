package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInSlotTypeSummary extends StObject {
  
  /**
    * The description of the built-in slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The signature of the built-in slot type. Use this to specify the parent slot type of a derived slot type.
    */
  var slotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined
}
object BuiltInSlotTypeSummary {
  
  inline def apply(): BuiltInSlotTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltInSlotTypeSummary]
  }
  
  extension [Self <: BuiltInSlotTypeSummary](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setSlotTypeSignature(value: SlotTypeSignature): Self = StObject.set(x, "slotTypeSignature", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeSignatureUndefined: Self = StObject.set(x, "slotTypeSignature", js.undefined)
  }
}
