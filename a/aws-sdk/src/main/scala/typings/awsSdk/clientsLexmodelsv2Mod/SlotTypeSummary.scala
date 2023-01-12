package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeSummary extends StObject {
  
  /**
    * The description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A timestamp of the date and time that the slot type was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If the slot type is derived from a built-on slot type, the name of the parent slot type.
    */
  var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined
  
  /**
    * Indicates the type of the slot type.    Custom - A slot type that you created using custom values. For more information, see Creating custom slot types.    Extended - A slot type created by extending the AMAZON.AlphaNumeric built-in slot type. For more information, see AMAZON.AlphaNumeric.    ExternalGrammar - A slot type using a custom GRXML grammar to define values. For more information, see Using a custom grammar slot type.  
    */
  var slotTypeCategory: js.UndefOr[SlotTypeCategory] = js.undefined
  
  /**
    * The unique identifier assigned to the slot type.
    */
  var slotTypeId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the slot type.
    */
  var slotTypeName: js.UndefOr[Name] = js.undefined
}
object SlotTypeSummary {
  
  inline def apply(): SlotTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotTypeSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotTypeSummary] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setParentSlotTypeSignature(value: SlotTypeSignature): Self = StObject.set(x, "parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignatureUndefined: Self = StObject.set(x, "parentSlotTypeSignature", js.undefined)
    
    inline def setSlotTypeCategory(value: SlotTypeCategory): Self = StObject.set(x, "slotTypeCategory", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeCategoryUndefined: Self = StObject.set(x, "slotTypeCategory", js.undefined)
    
    inline def setSlotTypeId(value: Id): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeIdUndefined: Self = StObject.set(x, "slotTypeId", js.undefined)
    
    inline def setSlotTypeName(value: Name): Self = StObject.set(x, "slotTypeName", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeNameUndefined: Self = StObject.set(x, "slotTypeName", js.undefined)
  }
}
