package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopActivationOutput extends StObject {
  
  /**
    * Shows the result of condition evaluations, including those conditions which activated a human review.
    */
  var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[
    typings.awsSdk.clientsRekognitionMod.HumanLoopActivationConditionsEvaluationResults
  ] = js.undefined
  
  /**
    * Shows if and why human review was needed.
    */
  var HumanLoopActivationReasons: js.UndefOr[typings.awsSdk.clientsRekognitionMod.HumanLoopActivationReasons] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the HumanLoop created.
    */
  var HumanLoopArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.HumanLoopArn] = js.undefined
}
object HumanLoopActivationOutput {
  
  inline def apply(): HumanLoopActivationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopActivationOutput]
  }
  
  extension [Self <: HumanLoopActivationOutput](x: Self) {
    
    inline def setHumanLoopActivationConditionsEvaluationResults(value: HumanLoopActivationConditionsEvaluationResults): Self = StObject.set(x, "HumanLoopActivationConditionsEvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopActivationConditionsEvaluationResultsUndefined: Self = StObject.set(x, "HumanLoopActivationConditionsEvaluationResults", js.undefined)
    
    inline def setHumanLoopActivationReasons(value: HumanLoopActivationReasons): Self = StObject.set(x, "HumanLoopActivationReasons", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopActivationReasonsUndefined: Self = StObject.set(x, "HumanLoopActivationReasons", js.undefined)
    
    inline def setHumanLoopActivationReasonsVarargs(value: HumanLoopActivationReason*): Self = StObject.set(x, "HumanLoopActivationReasons", js.Array(value*))
    
    inline def setHumanLoopArn(value: HumanLoopArn): Self = StObject.set(x, "HumanLoopArn", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopArnUndefined: Self = StObject.set(x, "HumanLoopArn", js.undefined)
  }
}
