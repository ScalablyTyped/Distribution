package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlotTypeRequest extends StObject {
  
  /**
    * The identifier of the bot that contains the slot type.
    */
  var botId: Id
  
  /**
    * The version of the bot that contains the slot type. Must be DRAFT.
    */
  var botVersion: DraftBotVersion
  
  /**
    * Specifications for a composite slot type.
    */
  var compositeSlotTypeSetting: js.UndefOr[CompositeSlotTypeSetting] = js.undefined
  
  /**
    * The new description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  var externalSourceSetting: js.UndefOr[ExternalSourceSetting] = js.undefined
  
  /**
    * The identifier of the language and locale that contains the slot type. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The new built-in slot type that should be used as the parent of this slot type.
    */
  var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined
  
  /**
    * The unique identifier of the slot type to update.
    */
  var slotTypeId: Id
  
  /**
    * The new name of the slot type.
    */
  var slotTypeName: Name
  
  /**
    * A new list of values and their optional synonyms that define the values that the slot type can take.
    */
  var slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined
  
  /**
    * The strategy that Amazon Lex should use when deciding on a value from the list of slot type values.
    */
  var valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting] = js.undefined
}
object UpdateSlotTypeRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId, slotTypeId: Id, slotTypeName: Name): UpdateSlotTypeRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotTypeId = slotTypeId.asInstanceOf[js.Any], slotTypeName = slotTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSlotTypeRequest]
  }
  
  extension [Self <: UpdateSlotTypeRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setCompositeSlotTypeSetting(value: CompositeSlotTypeSetting): Self = StObject.set(x, "compositeSlotTypeSetting", value.asInstanceOf[js.Any])
    
    inline def setCompositeSlotTypeSettingUndefined: Self = StObject.set(x, "compositeSlotTypeSetting", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExternalSourceSetting(value: ExternalSourceSetting): Self = StObject.set(x, "externalSourceSetting", value.asInstanceOf[js.Any])
    
    inline def setExternalSourceSettingUndefined: Self = StObject.set(x, "externalSourceSetting", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignature(value: SlotTypeSignature): Self = StObject.set(x, "parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignatureUndefined: Self = StObject.set(x, "parentSlotTypeSignature", js.undefined)
    
    inline def setSlotTypeId(value: Id): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeName(value: Name): Self = StObject.set(x, "slotTypeName", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeValues(value: SlotTypeValues): Self = StObject.set(x, "slotTypeValues", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeValuesUndefined: Self = StObject.set(x, "slotTypeValues", js.undefined)
    
    inline def setSlotTypeValuesVarargs(value: SlotTypeValue*): Self = StObject.set(x, "slotTypeValues", js.Array(value*))
    
    inline def setValueSelectionSetting(value: SlotValueSelectionSetting): Self = StObject.set(x, "valueSelectionSetting", value.asInstanceOf[js.Any])
    
    inline def setValueSelectionSettingUndefined: Self = StObject.set(x, "valueSelectionSetting", js.undefined)
  }
}
