package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateOrganizationsAccessReportRequest extends StObject {
  
  /**
    * The path of the Organizations entity (root, OU, or account). You can build an entity path using the known structure of your organization. For example, assume that your account ID is 123456789012 and its parent OU ID is ou-rge0-awsabcde. The organization root ID is r-f6g7h8i9j0example and your organization ID is o-a1b2c3d4e5. Your entity path is o-a1b2c3d4e5/r-f6g7h8i9j0example/ou-rge0-awsabcde/123456789012.
    */
  var EntityPath: organizationsEntityPathType
  
  /**
    * The identifier of the Organizations service control policy (SCP). This parameter is optional. This ID is used to generate information about when an account principal that is limited by the SCP attempted to access an Amazon Web Services service.
    */
  var OrganizationsPolicyId: js.UndefOr[organizationsPolicyIdType] = js.undefined
}
object GenerateOrganizationsAccessReportRequest {
  
  inline def apply(EntityPath: organizationsEntityPathType): GenerateOrganizationsAccessReportRequest = {
    val __obj = js.Dynamic.literal(EntityPath = EntityPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateOrganizationsAccessReportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateOrganizationsAccessReportRequest] (val x: Self) extends AnyVal {
    
    inline def setEntityPath(value: organizationsEntityPathType): Self = StObject.set(x, "EntityPath", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsPolicyId(value: organizationsPolicyIdType): Self = StObject.set(x, "OrganizationsPolicyId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsPolicyIdUndefined: Self = StObject.set(x, "OrganizationsPolicyId", js.undefined)
  }
}
