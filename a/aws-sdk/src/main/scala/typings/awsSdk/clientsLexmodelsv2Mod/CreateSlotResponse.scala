package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlotResponse extends StObject {
  
  /**
    * The unique identifier of the bot associated with the slot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot associated with the slot.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The timestamp of the date and time that the slot was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description associated with the slot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The unique identifier of the intent associated with the slot.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The language and local specified for the slot.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * Indicates whether the slot returns multiple values in one response.
    */
  var multipleValuesSetting: js.UndefOr[MultipleValuesSetting] = js.undefined
  
  /**
    * Indicates whether the slot is configured to obfuscate values in Amazon CloudWatch logs.
    */
  var obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined
  
  /**
    * The unique identifier associated with the slot. Use this to identify the slot when you update or delete it.
    */
  var slotId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name specified for the slot.
    */
  var slotName: js.UndefOr[Name] = js.undefined
  
  /**
    * The unique identifier of the slot type associated with this slot.
    */
  var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined
  
  /**
    * Specifications for the constituent sub slots and the expression for the composite slot.
    */
  var subSlotSetting: js.UndefOr[SubSlotSetting] = js.undefined
  
  /**
    * The value elicitation settings specified for the slot.
    */
  var valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting] = js.undefined
}
object CreateSlotResponse {
  
  inline def apply(): CreateSlotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSlotResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setMultipleValuesSetting(value: MultipleValuesSetting): Self = StObject.set(x, "multipleValuesSetting", value.asInstanceOf[js.Any])
    
    inline def setMultipleValuesSettingUndefined: Self = StObject.set(x, "multipleValuesSetting", js.undefined)
    
    inline def setObfuscationSetting(value: ObfuscationSetting): Self = StObject.set(x, "obfuscationSetting", value.asInstanceOf[js.Any])
    
    inline def setObfuscationSettingUndefined: Self = StObject.set(x, "obfuscationSetting", js.undefined)
    
    inline def setSlotId(value: Id): Self = StObject.set(x, "slotId", value.asInstanceOf[js.Any])
    
    inline def setSlotIdUndefined: Self = StObject.set(x, "slotId", js.undefined)
    
    inline def setSlotName(value: Name): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    inline def setSlotNameUndefined: Self = StObject.set(x, "slotName", js.undefined)
    
    inline def setSlotTypeId(value: BuiltInOrCustomSlotTypeId): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeIdUndefined: Self = StObject.set(x, "slotTypeId", js.undefined)
    
    inline def setSubSlotSetting(value: SubSlotSetting): Self = StObject.set(x, "subSlotSetting", value.asInstanceOf[js.Any])
    
    inline def setSubSlotSettingUndefined: Self = StObject.set(x, "subSlotSetting", js.undefined)
    
    inline def setValueElicitationSetting(value: SlotValueElicitationSetting): Self = StObject.set(x, "valueElicitationSetting", value.asInstanceOf[js.Any])
    
    inline def setValueElicitationSettingUndefined: Self = StObject.set(x, "valueElicitationSetting", js.undefined)
  }
}
