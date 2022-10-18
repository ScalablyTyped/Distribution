package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackEvaluationResult extends StObject {
  
  /**
    * Supplementary information about how the evaluation determined the compliance. 
    */
  var Annotation: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Annotation] = js.undefined
  
  /**
    * The compliance type. The allowed values are COMPLIANT and NON_COMPLIANT. INSUFFICIENT_DATA is not supported.
    */
  var ComplianceType: ConformancePackComplianceType
  
  /**
    * The time when Config rule evaluated Amazon Web Services resource.
    */
  var ConfigRuleInvokedTime: js.Date
  
  var EvaluationResultIdentifier: typings.awsSdk.clientsConfigserviceMod.EvaluationResultIdentifier
  
  /**
    * The time when Config recorded the evaluation result. 
    */
  var ResultRecordedTime: js.Date
}
object ConformancePackEvaluationResult {
  
  inline def apply(
    ComplianceType: ConformancePackComplianceType,
    ConfigRuleInvokedTime: js.Date,
    EvaluationResultIdentifier: EvaluationResultIdentifier,
    ResultRecordedTime: js.Date
  ): ConformancePackEvaluationResult = {
    val __obj = js.Dynamic.literal(ComplianceType = ComplianceType.asInstanceOf[js.Any], ConfigRuleInvokedTime = ConfigRuleInvokedTime.asInstanceOf[js.Any], EvaluationResultIdentifier = EvaluationResultIdentifier.asInstanceOf[js.Any], ResultRecordedTime = ResultRecordedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackEvaluationResult]
  }
  
  extension [Self <: ConformancePackEvaluationResult](x: Self) {
    
    inline def setAnnotation(value: Annotation): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    inline def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleInvokedTime(value: js.Date): Self = StObject.set(x, "ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = StObject.set(x, "EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResultRecordedTime(value: js.Date): Self = StObject.set(x, "ResultRecordedTime", value.asInstanceOf[js.Any])
  }
}
