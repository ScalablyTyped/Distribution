package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateEvaluationResult extends StObject {
  
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AccountId] = js.undefined
  
  /**
    * Supplementary information about how the agrregate evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AwsRegion] = js.undefined
  
  /**
    * The resource compliance status. For the AggregationEvaluationResult data type, Config supports only the COMPLIANT and NON_COMPLIANT. Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA value.
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
    * The time when Config recorded the aggregate evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[js.Date] = js.undefined
}
object AggregateEvaluationResult {
  
  inline def apply(): AggregateEvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateEvaluationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateEvaluationResult] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAnnotation(value: StringWithCharLimit256): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setConfigRuleInvokedTime(value: js.Date): Self = StObject.set(x, "ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleInvokedTimeUndefined: Self = StObject.set(x, "ConfigRuleInvokedTime", js.undefined)
    
    inline def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = StObject.set(x, "EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluationResultIdentifierUndefined: Self = StObject.set(x, "EvaluationResultIdentifier", js.undefined)
    
    inline def setResultRecordedTime(value: js.Date): Self = StObject.set(x, "ResultRecordedTime", value.asInstanceOf[js.Any])
    
    inline def setResultRecordedTimeUndefined: Self = StObject.set(x, "ResultRecordedTime", js.undefined)
  }
}
