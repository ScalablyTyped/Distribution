package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceEvaluationSummaryResponse extends StObject {
  
  /**
    * The compliance status of the resource evaluation summary.
    */
  var Compliance: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    * Returns an EvaluationContext object.
    */
  var EvaluationContext: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationContext] = js.undefined
  
  /**
    * Lists results of the mode that you requested to retrieve the resource evaluation summary. The valid values are Detective or Proactive.
    */
  var EvaluationMode: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationMode] = js.undefined
  
  /**
    * The start timestamp when Config rule starts evaluating compliance for the provided resource details.
    */
  var EvaluationStartTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Returns an EvaluationStatus object.
    */
  var EvaluationStatus: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationStatus] = js.undefined
  
  /**
    * Returns a ResourceDetails object.
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceDetails] = js.undefined
  
  /**
    * The unique ResourceEvaluationId of Amazon Web Services resource execution for which you want to retrieve the evaluation summary.
    */
  var ResourceEvaluationId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceEvaluationId] = js.undefined
}
object GetResourceEvaluationSummaryResponse {
  
  inline def apply(): GetResourceEvaluationSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceEvaluationSummaryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceEvaluationSummaryResponse] (val x: Self) extends AnyVal {
    
    inline def setCompliance(value: ComplianceType): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    inline def setEvaluationContext(value: EvaluationContext): Self = StObject.set(x, "EvaluationContext", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextUndefined: Self = StObject.set(x, "EvaluationContext", js.undefined)
    
    inline def setEvaluationMode(value: EvaluationMode): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "EvaluationMode", js.undefined)
    
    inline def setEvaluationStartTimestamp(value: js.Date): Self = StObject.set(x, "EvaluationStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEvaluationStartTimestampUndefined: Self = StObject.set(x, "EvaluationStartTimestamp", js.undefined)
    
    inline def setEvaluationStatus(value: EvaluationStatus): Self = StObject.set(x, "EvaluationStatus", value.asInstanceOf[js.Any])
    
    inline def setEvaluationStatusUndefined: Self = StObject.set(x, "EvaluationStatus", js.undefined)
    
    inline def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
    
    inline def setResourceEvaluationId(value: ResourceEvaluationId): Self = StObject.set(x, "ResourceEvaluationId", value.asInstanceOf[js.Any])
    
    inline def setResourceEvaluationIdUndefined: Self = StObject.set(x, "ResourceEvaluationId", js.undefined)
  }
}
