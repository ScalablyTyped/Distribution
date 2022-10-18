package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubSlotValueElicitationSetting extends StObject {
  
  var defaultValueSpecification: js.UndefOr[SlotDefaultValueSpecification] = js.undefined
  
  var promptSpecification: PromptSpecification
  
  /**
    * If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you can provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of understanding user utterances. This is similar to SampleUtterances for slots.
    */
  var sampleUtterances: js.UndefOr[SampleUtterancesList] = js.undefined
  
  var waitAndContinueSpecification: js.UndefOr[WaitAndContinueSpecification] = js.undefined
}
object SubSlotValueElicitationSetting {
  
  inline def apply(promptSpecification: PromptSpecification): SubSlotValueElicitationSetting = {
    val __obj = js.Dynamic.literal(promptSpecification = promptSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubSlotValueElicitationSetting]
  }
  
  extension [Self <: SubSlotValueElicitationSetting](x: Self) {
    
    inline def setDefaultValueSpecification(value: SlotDefaultValueSpecification): Self = StObject.set(x, "defaultValueSpecification", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueSpecificationUndefined: Self = StObject.set(x, "defaultValueSpecification", js.undefined)
    
    inline def setPromptSpecification(value: PromptSpecification): Self = StObject.set(x, "promptSpecification", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterances(value: SampleUtterancesList): Self = StObject.set(x, "sampleUtterances", value.asInstanceOf[js.Any])
    
    inline def setSampleUtterancesUndefined: Self = StObject.set(x, "sampleUtterances", js.undefined)
    
    inline def setSampleUtterancesVarargs(value: SampleUtterance*): Self = StObject.set(x, "sampleUtterances", js.Array(value*))
    
    inline def setWaitAndContinueSpecification(value: WaitAndContinueSpecification): Self = StObject.set(x, "waitAndContinueSpecification", value.asInstanceOf[js.Any])
    
    inline def setWaitAndContinueSpecificationUndefined: Self = StObject.set(x, "waitAndContinueSpecification", js.undefined)
  }
}
