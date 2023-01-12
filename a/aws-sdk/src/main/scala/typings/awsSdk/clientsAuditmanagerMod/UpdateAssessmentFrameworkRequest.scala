package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentFrameworkRequest extends StObject {
  
  /**
    *  The compliance type that the new custom framework supports, such as CIS or HIPAA. 
    */
  var complianceType: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    *  The control sets that are associated with the framework. 
    */
  var controlSets: UpdateAssessmentFrameworkControlSets
  
  /**
    *  The description of the updated framework. 
    */
  var description: js.UndefOr[FrameworkDescription] = js.undefined
  
  /**
    *  The unique identifier for the framework. 
    */
  var frameworkId: UUID
  
  /**
    *  The name of the framework to be updated. 
    */
  var name: FrameworkName
}
object UpdateAssessmentFrameworkRequest {
  
  inline def apply(controlSets: UpdateAssessmentFrameworkControlSets, frameworkId: UUID, name: FrameworkName): UpdateAssessmentFrameworkRequest = {
    val __obj = js.Dynamic.literal(controlSets = controlSets.asInstanceOf[js.Any], frameworkId = frameworkId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentFrameworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAssessmentFrameworkRequest] (val x: Self) extends AnyVal {
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "complianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "complianceType", js.undefined)
    
    inline def setControlSets(value: UpdateAssessmentFrameworkControlSets): Self = StObject.set(x, "controlSets", value.asInstanceOf[js.Any])
    
    inline def setControlSetsVarargs(value: UpdateAssessmentFrameworkControlSet*): Self = StObject.set(x, "controlSets", js.Array(value*))
    
    inline def setDescription(value: FrameworkDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFrameworkId(value: UUID): Self = StObject.set(x, "frameworkId", value.asInstanceOf[js.Any])
    
    inline def setName(value: FrameworkName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
