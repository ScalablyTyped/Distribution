package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evaluation extends StObject {
  
  /**
    * Supplementary information about how the evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The ID of the Amazon Web Services resource that was evaluated.
    */
  var ComplianceResourceId: BaseResourceId
  
  /**
    * The type of Amazon Web Services resource that was evaluated.
    */
  var ComplianceResourceType: StringWithCharLimit256
  
  /**
    * Indicates whether the Amazon Web Services resource complies with the Config rule that it was evaluated against. For the Evaluation data type, Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. Config does not support the INSUFFICIENT_DATA value for this data type. Similarly, Config does not accept INSUFFICIENT_DATA as the value for ComplianceType from a PutEvaluations request. For example, an Lambda function for a custom Config rule cannot pass an INSUFFICIENT_DATA value to Config.
    */
  var ComplianceType: typings.awsSdk.clientsConfigserviceMod.ComplianceType
  
  /**
    * The time of the event in Config that triggered the evaluation. For event-based evaluations, the time indicates when Config created the configuration item that triggered the evaluation. For periodic evaluations, the time indicates when Config triggered the evaluation at the frequency that you specified (for example, every 24 hours).
    */
  var OrderingTimestamp: js.Date
}
object Evaluation {
  
  inline def apply(
    ComplianceResourceId: BaseResourceId,
    ComplianceResourceType: StringWithCharLimit256,
    ComplianceType: ComplianceType,
    OrderingTimestamp: js.Date
  ): Evaluation = {
    val __obj = js.Dynamic.literal(ComplianceResourceId = ComplianceResourceId.asInstanceOf[js.Any], ComplianceResourceType = ComplianceResourceType.asInstanceOf[js.Any], ComplianceType = ComplianceType.asInstanceOf[js.Any], OrderingTimestamp = OrderingTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluation]
  }
  
  extension [Self <: Evaluation](x: Self) {
    
    inline def setAnnotation(value: StringWithCharLimit256): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    inline def setComplianceResourceId(value: BaseResourceId): Self = StObject.set(x, "ComplianceResourceId", value.asInstanceOf[js.Any])
    
    inline def setComplianceResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ComplianceResourceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setOrderingTimestamp(value: js.Date): Self = StObject.set(x, "OrderingTimestamp", value.asInstanceOf[js.Any])
  }
}
