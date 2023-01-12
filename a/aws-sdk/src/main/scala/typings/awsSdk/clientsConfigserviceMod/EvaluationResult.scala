package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResult extends StObject {
  
  /**
    * Supplementary information about how the evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * Indicates whether the Amazon Web Services resource complies with the Config rule that evaluated it. For the EvaluationResult data type, Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. Config does not support the INSUFFICIENT_DATA value for the EvaluationResult data type.
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ComplianceType] = js.undefined
  
  /**
    * The time when the Config rule evaluated the Amazon Web Services resource.
    */
  var ConfigRuleInvokedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Uniquely identifies the evaluation result.
    */
  var EvaluationResultIdentifier: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationResultIdentifier] = js.undefined
  
  /**
    * The time when Config recorded the evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An encrypted token that associates an evaluation with an Config rule. The token identifies the rule, the Amazon Web Services resource being evaluated, and the event that triggered the evaluation.
    */
  var ResultToken: js.UndefOr[String] = js.undefined
}
object EvaluationResult {
  
  inline def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    
    inline def setAnnotation(value: StringWithCharLimit256): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setConfigRuleInvokedTime(value: js.Date): Self = StObject.set(x, "ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleInvokedTimeUndefined: Self = StObject.set(x, "ConfigRuleInvokedTime", js.undefined)
    
    inline def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = StObject.set(x, "EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultIdentifierUndefined: Self = StObject.set(x, "EvaluationResultIdentifier", js.undefined)
    
    inline def setResultRecordedTime(value: js.Date): Self = StObject.set(x, "ResultRecordedTime", value.asInstanceOf[js.Any])
    
    inline def setResultRecordedTimeUndefined: Self = StObject.set(x, "ResultRecordedTime", js.undefined)
    
    inline def setResultToken(value: String): Self = StObject.set(x, "ResultToken", value.asInstanceOf[js.Any])
    
    inline def setResultTokenUndefined: Self = StObject.set(x, "ResultToken", js.undefined)
  }
}
