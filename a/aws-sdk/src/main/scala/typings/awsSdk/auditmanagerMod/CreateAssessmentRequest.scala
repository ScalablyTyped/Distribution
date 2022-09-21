package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentRequest extends StObject {
  
  /**
    *  The assessment report storage destination for the assessment that's being created. 
    */
  var assessmentReportsDestination: AssessmentReportsDestination
  
  /**
    *  The optional description of the assessment to be created. 
    */
  var description: js.UndefOr[AssessmentDescription] = js.undefined
  
  /**
    *  The identifier for the framework that the assessment will be created from. 
    */
  var frameworkId: UUID
  
  /**
    *  The name of the assessment to be created. 
    */
  var name: AssessmentName
  
  /**
    *  The list of roles for the assessment. 
    */
  var roles: Roles
  
  var scope: Scope
  
  /**
    *  The tags that are associated with the assessment. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAssessmentRequest {
  
  inline def apply(
    assessmentReportsDestination: AssessmentReportsDestination,
    frameworkId: UUID,
    name: AssessmentName,
    roles: Roles,
    scope: Scope
  ): CreateAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentReportsDestination = assessmentReportsDestination.asInstanceOf[js.Any], frameworkId = frameworkId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentRequest]
  }
  
  extension [Self <: CreateAssessmentRequest](x: Self) {
    
    inline def setAssessmentReportsDestination(value: AssessmentReportsDestination): Self = StObject.set(x, "assessmentReportsDestination", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: AssessmentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFrameworkId(value: UUID): Self = StObject.set(x, "frameworkId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AssessmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: Roles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
