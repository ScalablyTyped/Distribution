package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotValueSelectionSetting extends StObject {
  
  /**
    * Provides settings that enable advanced recognition settings for slot values.
    */
  var advancedRecognitionSetting: js.UndefOr[AdvancedRecognitionSetting] = js.undefined
  
  /**
    * A regular expression used to validate the value of a slot.
    */
  var regexFilter: js.UndefOr[SlotValueRegexFilter] = js.undefined
  
  /**
    * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to one of the following values:   OriginalValue - Returns the value entered by the user, if the user value is similar to the slot value.   TopResolution - If there is a resolution list for the slot, return the first value in the resolution list as the slot type value. If there is no resolution list, null is returned.   If you don't specify the valueSelectionStrategy, the default is OriginalValue. 
    */
  var resolutionStrategy: SlotValueResolutionStrategy
}
object SlotValueSelectionSetting {
  
  inline def apply(resolutionStrategy: SlotValueResolutionStrategy): SlotValueSelectionSetting = {
    val __obj = js.Dynamic.literal(resolutionStrategy = resolutionStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotValueSelectionSetting]
  }
  
  extension [Self <: SlotValueSelectionSetting](x: Self) {
    
    inline def setAdvancedRecognitionSetting(value: AdvancedRecognitionSetting): Self = StObject.set(x, "advancedRecognitionSetting", value.asInstanceOf[js.Any])
    
    inline def setAdvancedRecognitionSettingUndefined: Self = StObject.set(x, "advancedRecognitionSetting", js.undefined)
    
    inline def setRegexFilter(value: SlotValueRegexFilter): Self = StObject.set(x, "regexFilter", value.asInstanceOf[js.Any])
    
    inline def setRegexFilterUndefined: Self = StObject.set(x, "regexFilter", js.undefined)
    
    inline def setResolutionStrategy(value: SlotValueResolutionStrategy): Self = StObject.set(x, "resolutionStrategy", value.asInstanceOf[js.Any])
  }
}
