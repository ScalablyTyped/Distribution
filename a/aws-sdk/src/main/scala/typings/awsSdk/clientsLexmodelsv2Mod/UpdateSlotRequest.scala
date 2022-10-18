package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlotRequest extends StObject {
  
  /**
    * The unique identifier of the bot that contains the slot.
    */
  var botId: Id
  
  /**
    * The version of the bot that contains the slot. Must always be DRAFT.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The new description for the slot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the intent that contains the slot.
    */
  var intentId: Id
  
  /**
    * The identifier of the language and locale that contains the slot. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * Determines whether the slot accepts multiple values in one response. Multiple value slots are only available in the en-US locale. If you set this value to true in any other locale, Amazon Lex throws a ValidationException. If the multipleValuesSetting is not set, the default value is false.
    */
  var multipleValuesSetting: js.UndefOr[MultipleValuesSetting] = js.undefined
  
  /**
    * New settings that determine how slot values are formatted in Amazon CloudWatch logs. 
    */
  var obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined
  
  /**
    * The unique identifier for the slot to update.
    */
  var slotId: Id
  
  /**
    * The new name for the slot.
    */
  var slotName: Name
  
  /**
    * The unique identifier of the new slot type to associate with this slot. 
    */
  var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined
  
  /**
    * Specifications for the constituent sub slots and the expression for the composite slot.
    */
  var subSlotSetting: js.UndefOr[SubSlotSetting] = js.undefined
  
  /**
    * A new set of prompts that Amazon Lex sends to the user to elicit a response the provides a value for the slot.
    */
  var valueElicitationSetting: SlotValueElicitationSetting
}
object UpdateSlotRequest {
  
  inline def apply(
    botId: Id,
    botVersion: DraftBotVersion,
    intentId: Id,
    localeId: LocaleId,
    slotId: Id,
    slotName: Name,
    valueElicitationSetting: SlotValueElicitationSetting
  ): UpdateSlotRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotId = slotId.asInstanceOf[js.Any], slotName = slotName.asInstanceOf[js.Any], valueElicitationSetting = valueElicitationSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSlotRequest]
  }
  
  extension [Self <: UpdateSlotRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMultipleValuesSetting(value: MultipleValuesSetting): Self = StObject.set(x, "multipleValuesSetting", value.asInstanceOf[js.Any])
    
    inline def setMultipleValuesSettingUndefined: Self = StObject.set(x, "multipleValuesSetting", js.undefined)
    
    inline def setObfuscationSetting(value: ObfuscationSetting): Self = StObject.set(x, "obfuscationSetting", value.asInstanceOf[js.Any])
    
    inline def setObfuscationSettingUndefined: Self = StObject.set(x, "obfuscationSetting", js.undefined)
    
    inline def setSlotId(value: Id): Self = StObject.set(x, "slotId", value.asInstanceOf[js.Any])
    
    inline def setSlotName(value: Name): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeId(value: BuiltInOrCustomSlotTypeId): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeIdUndefined: Self = StObject.set(x, "slotTypeId", js.undefined)
    
    inline def setSubSlotSetting(value: SubSlotSetting): Self = StObject.set(x, "subSlotSetting", value.asInstanceOf[js.Any])
    
    inline def setSubSlotSettingUndefined: Self = StObject.set(x, "subSlotSetting", js.undefined)
    
    inline def setValueElicitationSetting(value: SlotValueElicitationSetting): Self = StObject.set(x, "valueElicitationSetting", value.asInstanceOf[js.Any])
  }
}
