package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlotTypeResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the slot type.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that contains the slot type. This is always DRAFT.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * Specifications for a composite slot type.
    */
  var compositeSlotTypeSetting: js.UndefOr[CompositeSlotTypeSetting] = js.undefined
  
  /**
    * The timestamp of the date and time that the slot type was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The updated description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  var externalSourceSetting: js.UndefOr[ExternalSourceSetting] = js.undefined
  
  /**
    * A timestamp of the date and time that the slot type was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The language and locale of the updated slot type.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The updated signature of the built-in slot type that is the parent of this slot type.
    */
  var parentSlotTypeSignature: js.UndefOr[SlotTypeSignature] = js.undefined
  
  /**
    * The unique identifier of the updated slot type.
    */
  var slotTypeId: js.UndefOr[Id] = js.undefined
  
  /**
    * The updated name of the slot type.
    */
  var slotTypeName: js.UndefOr[Name] = js.undefined
  
  /**
    * The updated values that the slot type provides.
    */
  var slotTypeValues: js.UndefOr[SlotTypeValues] = js.undefined
  
  /**
    * The updated strategy that Amazon Lex uses to determine which value to select from the slot type.
    */
  var valueSelectionSetting: js.UndefOr[SlotValueSelectionSetting] = js.undefined
}
object UpdateSlotTypeResponse {
  
  inline def apply(): UpdateSlotTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSlotTypeResponse]
  }
  
  extension [Self <: UpdateSlotTypeResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCompositeSlotTypeSetting(value: CompositeSlotTypeSetting): Self = StObject.set(x, "compositeSlotTypeSetting", value.asInstanceOf[js.Any])
    
    inline def setCompositeSlotTypeSettingUndefined: Self = StObject.set(x, "compositeSlotTypeSetting", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExternalSourceSetting(value: ExternalSourceSetting): Self = StObject.set(x, "externalSourceSetting", value.asInstanceOf[js.Any])
    
    inline def setExternalSourceSettingUndefined: Self = StObject.set(x, "externalSourceSetting", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setParentSlotTypeSignature(value: SlotTypeSignature): Self = StObject.set(x, "parentSlotTypeSignature", value.asInstanceOf[js.Any])
    
    inline def setParentSlotTypeSignatureUndefined: Self = StObject.set(x, "parentSlotTypeSignature", js.undefined)
    
    inline def setSlotTypeId(value: Id): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeIdUndefined: Self = StObject.set(x, "slotTypeId", js.undefined)
    
    inline def setSlotTypeName(value: Name): Self = StObject.set(x, "slotTypeName", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeNameUndefined: Self = StObject.set(x, "slotTypeName", js.undefined)
    
    inline def setSlotTypeValues(value: SlotTypeValues): Self = StObject.set(x, "slotTypeValues", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeValuesUndefined: Self = StObject.set(x, "slotTypeValues", js.undefined)
    
    inline def setSlotTypeValuesVarargs(value: SlotTypeValue*): Self = StObject.set(x, "slotTypeValues", js.Array(value*))
    
    inline def setValueSelectionSetting(value: SlotValueSelectionSetting): Self = StObject.set(x, "valueSelectionSetting", value.asInstanceOf[js.Any])
    
    inline def setValueSelectionSettingUndefined: Self = StObject.set(x, "valueSelectionSetting", js.undefined)
  }
}
