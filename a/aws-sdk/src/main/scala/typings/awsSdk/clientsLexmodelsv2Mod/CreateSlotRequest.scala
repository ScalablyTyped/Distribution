package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlotRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the slot.
    */
  var botId: Id
  
  /**
    * The version of the bot associated with the slot.
    */
  var botVersion: DraftBotVersion
  
  /**
    * A description of the slot. Use this to help identify the slot in lists.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the intent that contains the slot.
    */
  var intentId: Id
  
  /**
    * The identifier of the language and locale that the slot will be used in. The string must match one of the supported locales. All of the bots, intents, slot types used by the slot must have the same locale. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * Indicates whether the slot returns multiple values in one response. Multi-value slots are only available in the en-US locale. If you set this value to true in any other locale, Amazon Lex throws a ValidationException.  If the multipleValuesSetting is not set, the default value is false.
    */
  var multipleValuesSetting: js.UndefOr[MultipleValuesSetting] = js.undefined
  
  /**
    * Determines how slot values are used in Amazon CloudWatch logs. If the value of the obfuscationSetting parameter is DefaultObfuscation, slot values are obfuscated in the log output. If the value is None, the actual value is present in the log output. The default is to obfuscate values in the CloudWatch logs.
    */
  var obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined
  
  /**
    * The name of the slot. Slot names must be unique within the bot that contains the slot.
    */
  var slotName: Name
  
  /**
    * The unique identifier for the slot type associated with this slot. The slot type determines the values that can be entered into the slot.
    */
  var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined
  
  /**
    * Specifications for the constituent sub slots and the expression for the composite slot.
    */
  var subSlotSetting: js.UndefOr[SubSlotSetting] = js.undefined
  
  /**
    * Specifies prompts that Amazon Lex sends to the user to elicit a response that provides the value for the slot. 
    */
  var valueElicitationSetting: SlotValueElicitationSetting
}
object CreateSlotRequest {
  
  inline def apply(
    botId: Id,
    botVersion: DraftBotVersion,
    intentId: Id,
    localeId: LocaleId,
    slotName: Name,
    valueElicitationSetting: SlotValueElicitationSetting
  ): CreateSlotRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotName = slotName.asInstanceOf[js.Any], valueElicitationSetting = valueElicitationSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSlotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSlotRequest] (val x: Self) extends AnyVal {
    
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
    
    inline def setSlotName(value: Name): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeId(value: BuiltInOrCustomSlotTypeId): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeIdUndefined: Self = StObject.set(x, "slotTypeId", js.undefined)
    
    inline def setSubSlotSetting(value: SubSlotSetting): Self = StObject.set(x, "subSlotSetting", value.asInstanceOf[js.Any])
    
    inline def setSubSlotSettingUndefined: Self = StObject.set(x, "subSlotSetting", js.undefined)
    
    inline def setValueElicitationSetting(value: SlotValueElicitationSetting): Self = StObject.set(x, "valueElicitationSetting", value.asInstanceOf[js.Any])
  }
}
