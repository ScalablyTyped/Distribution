package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerMachineDetectionConfig extends StObject {
  
  /**
    * Wait for the answering machine prompt.
    */
  var AwaitAnswerMachinePrompt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The flag to indicate if answer machine detection analysis needs to be performed for a voice call. If set to true, TrafficType must be set as CAMPAIGN. 
    */
  var EnableAnswerMachineDetection: js.UndefOr[Boolean] = js.undefined
}
object AnswerMachineDetectionConfig {
  
  inline def apply(): AnswerMachineDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerMachineDetectionConfig]
  }
  
  extension [Self <: AnswerMachineDetectionConfig](x: Self) {
    
    inline def setAwaitAnswerMachinePrompt(value: Boolean): Self = StObject.set(x, "AwaitAnswerMachinePrompt", value.asInstanceOf[js.Any])
    
    inline def setAwaitAnswerMachinePromptUndefined: Self = StObject.set(x, "AwaitAnswerMachinePrompt", js.undefined)
    
    inline def setEnableAnswerMachineDetection(value: Boolean): Self = StObject.set(x, "EnableAnswerMachineDetection", value.asInstanceOf[js.Any])
    
    inline def setEnableAnswerMachineDetectionUndefined: Self = StObject.set(x, "EnableAnswerMachineDetection", js.undefined)
  }
}
