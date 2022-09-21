package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentRequest extends StObject {
  
  /**
    *  The description of the assessment. 
    */
  var assessmentDescription: js.UndefOr[AssessmentDescription] = js.undefined
  
  /**
    *  The unique identifier for the assessment. 
    */
  var assessmentId: UUID
  
  /**
    *  The name of the assessment to be updated. 
    */
  var assessmentName: js.UndefOr[AssessmentName] = js.undefined
  
  /**
    *  The assessment report storage destination for the assessment that's being updated. 
    */
  var assessmentReportsDestination: js.UndefOr[AssessmentReportsDestination] = js.undefined
  
  /**
    *  The list of roles for the assessment. 
    */
  var roles: js.UndefOr[Roles] = js.undefined
  
  /**
    *  The scope of the assessment. 
    */
  var scope: Scope
}
object UpdateAssessmentRequest {
  
  inline def apply(assessmentId: UUID, scope: Scope): UpdateAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentRequest]
  }
  
  extension [Self <: UpdateAssessmentRequest](x: Self) {
    
    inline def setAssessmentDescription(value: AssessmentDescription): Self = StObject.set(x, "assessmentDescription", value.asInstanceOf[js.Any])
    
    inline def setAssessmentDescriptionUndefined: Self = StObject.set(x, "assessmentDescription", js.undefined)
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentName(value: AssessmentName): Self = StObject.set(x, "assessmentName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentNameUndefined: Self = StObject.set(x, "assessmentName", js.undefined)
    
    inline def setAssessmentReportsDestination(value: AssessmentReportsDestination): Self = StObject.set(x, "assessmentReportsDestination", value.asInstanceOf[js.Any])
    
    inline def setAssessmentReportsDestinationUndefined: Self = StObject.set(x, "assessmentReportsDestination", js.undefined)
    
    inline def setRoles(value: Roles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
