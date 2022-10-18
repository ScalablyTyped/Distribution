package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSlotResponse extends StObject {
  
  /**
    * The identifier of the bot associated with the slot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot associated with the slot.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the slot was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description specified for the slot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the intent associated with the slot.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * A timestamp of the date and time that the slot was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The language and locale specified for the slot.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * Indicates whether the slot accepts multiple values in a single utterance. If the multipleValuesSetting is not set, the default value is false.
    */
  var multipleValuesSetting: js.UndefOr[MultipleValuesSetting] = js.undefined
  
  /**
    * Whether slot values are shown in Amazon CloudWatch logs. If the value is None, the actual value of the slot is shown in logs.
    */
  var obfuscationSetting: js.UndefOr[ObfuscationSetting] = js.undefined
  
  /**
    * The unique identifier generated for the slot.
    */
  var slotId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name specified for the slot.
    */
  var slotName: js.UndefOr[Name] = js.undefined
  
  /**
    * The identifier of the slot type that determines the values entered into the slot.
    */
  var slotTypeId: js.UndefOr[BuiltInOrCustomSlotTypeId] = js.undefined
  
  /**
    * Specifications for the constituent sub slots and the expression for the composite slot.
    */
  var subSlotSetting: js.UndefOr[SubSlotSetting] = js.undefined
  
  /**
    * Prompts that Amazon Lex uses to elicit a value for the slot.
    */
  var valueElicitationSetting: js.UndefOr[SlotValueElicitationSetting] = js.undefined
}
object DescribeSlotResponse {
  
  inline def apply(): DescribeSlotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSlotResponse]
  }
  
  extension [Self <: DescribeSlotResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
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
