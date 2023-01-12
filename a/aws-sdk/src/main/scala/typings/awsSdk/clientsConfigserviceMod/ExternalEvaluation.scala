package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalEvaluation extends StObject {
  
  /**
    * Supplementary information about the reason of compliance. For example, this task was completed on a specific date.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * The evaluated compliance resource ID. Config accepts only Amazon Web Services account ID.
    */
  var ComplianceResourceId: BaseResourceId
  
  /**
    * The evaluated compliance resource type. Config accepts AWS::::Account resource type.
    */
  var ComplianceResourceType: StringWithCharLimit256
  
  /**
    * The compliance of the Amazon Web Services resource. The valid values are COMPLIANT, NON_COMPLIANT,  and NOT_APPLICABLE.
    */
  var ComplianceType: typings.awsSdk.clientsConfigserviceMod.ComplianceType
  
  /**
    * The time when the compliance was recorded. 
    */
  var OrderingTimestamp: js.Date
}
object ExternalEvaluation {
  
  inline def apply(
    ComplianceResourceId: BaseResourceId,
    ComplianceResourceType: StringWithCharLimit256,
    ComplianceType: ComplianceType,
    OrderingTimestamp: js.Date
  ): ExternalEvaluation = {
    val __obj = js.Dynamic.literal(ComplianceResourceId = ComplianceResourceId.asInstanceOf[js.Any], ComplianceResourceType = ComplianceResourceType.asInstanceOf[js.Any], ComplianceType = ComplianceType.asInstanceOf[js.Any], OrderingTimestamp = OrderingTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalEvaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalEvaluation] (val x: Self) extends AnyVal {
    
    inline def setAnnotation(value: StringWithCharLimit256): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    inline def setComplianceResourceId(value: BaseResourceId): Self = StObject.set(x, "ComplianceResourceId", value.asInstanceOf[js.Any])
    
    inline def setComplianceResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ComplianceResourceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setOrderingTimestamp(value: js.Date): Self = StObject.set(x, "OrderingTimestamp", value.asInstanceOf[js.Any])
  }
}
