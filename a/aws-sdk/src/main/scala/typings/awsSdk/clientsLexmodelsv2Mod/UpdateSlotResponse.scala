package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlotResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the slot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the slot version that contains the slot. Will always be DRAFT.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The timestamp of the date and time that the slot was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The updated description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The intent that contains the slot.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The timestamp of the date and time that the slot was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The locale that contains the slot.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * Indicates whether the slot accepts multiple values in one response.
    */
  var multipleValuesSetting: js.UndefOr[MultipleValuesSetting] = js.undefined
  
  /**
    * The updated setting that determines whether the slot value is obfuscated in the Amazon CloudWatch logs.
    */
  var obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined
  
  /**
    * The unique identifier of the slot that was updated.
    */
  var slotId: js.UndefOr[Id] = js.undefined
  
  /**
    * The updated name of the slot.
    */
  var slotName: js.UndefOr[Name] = js.undefined
  
  /**
    * The updated identifier of the slot type that provides values for the slot.
    */
  var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined
  
  /**
    * Specifications for the constituent sub slots and the expression for the composite slot.
    */
  var subSlotSetting: js.UndefOr[SubSlotSetting] = js.undefined
  
  /**
    * The updated prompts that Amazon Lex sends to the user to elicit a response that provides a value for the slot.
    */
  var valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting] = js.undefined
}
object UpdateSlotResponse {
  
  inline def apply(): UpdateSlotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSlotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSlotResponse] (val x: Self) extends AnyVal {
    
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
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
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
