package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentMetadataItem extends StObject {
  
  /**
    *  The name of the compliance standard that's related to the assessment, such as PCI-DSS. 
    */
  var complianceType: js.UndefOr[ComplianceType] = js.undefined
  
  /**
    *  Specifies when the assessment was created. 
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The delegations that are associated with the assessment. 
    */
  var delegations: js.UndefOr[Delegations] = js.undefined
  
  /**
    *  The unique identifier for the assessment. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The time of the most recent update. 
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The name of the assessment. 
    */
  var name: js.UndefOr[AssessmentName] = js.undefined
  
  /**
    *  The roles that are associated with the assessment. 
    */
  var roles: js.UndefOr[Roles] = js.undefined
  
  /**
    *  The current status of the assessment. 
    */
  var status: js.UndefOr[AssessmentStatus] = js.undefined
}
object AssessmentMetadataItem {
  
  inline def apply(): AssessmentMetadataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentMetadataItem]
  }
  
  extension [Self <: AssessmentMetadataItem](x: Self) {
    
    inline def setComplianceType(value: ComplianceType): Self = StObject.set(x, "complianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "complianceType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDelegations(value: Delegations): Self = StObject.set(x, "delegations", value.asInstanceOf[js.Any])
    
    inline def setDelegationsUndefined: Self = StObject.set(x, "delegations", js.undefined)
    
    inline def setDelegationsVarargs(value: Delegation*): Self = StObject.set(x, "delegations", js.Array(value*))
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setName(value: AssessmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoles(value: Roles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "roles", js.Array(value*))
    
    inline def setStatus(value: AssessmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
