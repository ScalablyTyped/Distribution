package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssessmentFrameworkRequest extends StObject {
  
  /**
    *  The compliance type that the new custom framework supports, such as CIS or HIPAA. 
    */
  var complianceType: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    *  The control sets that are associated with the framework. 
    */
  var controlSets: CreateAssessmentFrameworkControlSets
  
  /**
    *  An optional description for the new custom framework. 
    */
  var description: js.UndefOr[FrameworkDescription] = js.undefined
  
  /**
    *  The name of the new custom framework. 
    */
  var name: FrameworkName
  
  /**
    *  The tags that are associated with the framework. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAssessmentFrameworkRequest {
  
  inline def apply(controlSets: CreateAssessmentFrameworkControlSets, name: FrameworkName): CreateAssessmentFrameworkRequest = {
    val __obj = js.Dynamic.literal(controlSets = controlSets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentFrameworkRequest]
  }
  
  extension [Self <: CreateAssessmentFrameworkRequest](x: Self) {
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "complianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "complianceType", js.undefined)
    
    inline def setControlSets(value: CreateAssessmentFrameworkControlSets): Self = StObject.set(x, "controlSets", value.asInstanceOf[js.Any])
    
    inline def setControlSetsVarargs(value: CreateAssessmentFrameworkControlSet*): Self = StObject.set(x, "controlSets", js.Array(value*))
    
    inline def setDescription(value: FrameworkDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: FrameworkName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
