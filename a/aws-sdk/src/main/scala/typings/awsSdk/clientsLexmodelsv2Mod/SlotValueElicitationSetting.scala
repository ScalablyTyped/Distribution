package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotValueElicitationSetting extends StObject {
  
  /**
    * A list of default values for a slot. Default values are used when Amazon Lex hasn't determined a value for a slot. You can specify default values from context variables, session attributes, and defined values.
    */
  var defaultValueSpecification: js.UndefOr[SlotDefaultValueSpecification] = js.undefined
  
  /**
    * The prompt that Amazon Lex uses to elicit the slot value from the user.
    */
  var promptSpecification: js.UndefOr[PromptSpecification] = js.undefined
  
  /**
    * If you know a specific pattern that users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of understanding user utterances.
    */
  var sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
  
  /**
    * Specifies the settings that Amazon Lex uses when a slot value is successfully entered by a user.
    */
  var slotCaptureSetting: js.UndefOr[SlotCaptureSetting] = js.undefined
  
  /**
    * Specifies whether the slot is required or optional.
    */
  var slotConstraint: SlotConstraint
  
  var waitAndContinueSpecification: js.UndefOr[WaitAndContinueSpecification] = js.undefined
}
object SlotValueElicitationSetting {
  
  inline def apply(slotConstraint: SlotConstraint): SlotValueElicitationSetting = {
    val __obj = js.Dynamic.literal(slotConstraint = slotConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotValueElicitationSetting]
  }
  
  extension [Self <: SlotValueElicitationSetting](x: Self) {
    
    inline def setDefaultValueSpecification(value: SlotDefaultValueSpecification): Self = StObject.set(x, "defaultValueSpecification", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueSpecificationUndefined: Self = StObject.set(x, "defaultValueSpecification", js.undefined)
    
    inline def setPromptSpecification(value: PromptSpecification): Self = StObject.set(x, "promptSpecification", value.asInstanceOf[js.Any])
    
    inline def setPromptSpecificationUndefined: Self = StObject.set(x, "promptSpecification", js.undefined)
    
    inline def setSampleUtterances(value: SampleUtterancesList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: SampleUtterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value*))
    
    inline def setSlotCaptureSetting(value: SlotCaptureSetting): Self = StObject.set(x, "slotCaptureSetting", value.asInstanceOf[js.Any])
    
    inline def setSlotCaptureSettingUndefined: Self = StObject.set(x, "slotCaptureSetting", js.undefined)
    
    inline def setSlotConstraint(value: SlotConstraint): Self = StObject.set(x, "slotConstraint", value.asInstanceOf[js.Any])
    
    inline def setWaitAndContinueSpecification(value: WaitAndContinueSpecification): Self = StObject.set(x, "waitAndContinueSpecification", value.asInstanceOf[js.Any])
    
    inline def setWaitAndContinueSpecificationUndefined: Self = StObject.set(x, "waitAndContinueSpecification", js.undefined)
  }
}
