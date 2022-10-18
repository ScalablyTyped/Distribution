package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugRuleEvaluationStatus extends StObject {
  
  /**
    * Timestamp when the rule evaluation status was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the rule configuration.
    */
  var RuleConfigurationName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RuleConfigurationName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rule evaluation job.
    */
  var RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn] = js.undefined
  
  /**
    * Status of the rule evaluation.
    */
  var RuleEvaluationStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RuleEvaluationStatus] = js.undefined
  
  /**
    * Details from the rule evaluation.
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.clientsSagemakerMod.StatusDetails] = js.undefined
}
object DebugRuleEvaluationStatus {
  
  inline def apply(): DebugRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugRuleEvaluationStatus]
  }
  
  extension [Self <: DebugRuleEvaluationStatus](x: Self) {
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setRuleConfigurationName(value: RuleConfigurationName): Self = StObject.set(x, "RuleConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setRuleConfigurationNameUndefined: Self = StObject.set(x, "RuleConfigurationName", js.undefined)
    
    inline def setRuleEvaluationJobArn(value: ProcessingJobArn): Self = StObject.set(x, "RuleEvaluationJobArn", value.asInstanceOf[js.Any])
    
    inline def setRuleEvaluationJobArnUndefined: Self = StObject.set(x, "RuleEvaluationJobArn", js.undefined)
    
    inline def setRuleEvaluationStatus(value: RuleEvaluationStatus): Self = StObject.set(x, "RuleEvaluationStatus", value.asInstanceOf[js.Any])
    
    inline def setRuleEvaluationStatusUndefined: Self = StObject.set(x, "RuleEvaluationStatus", js.undefined)
    
    inline def setStatusDetails(value: StatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
  }
}
