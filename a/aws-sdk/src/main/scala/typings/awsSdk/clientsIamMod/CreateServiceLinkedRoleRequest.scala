package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceLinkedRoleRequest extends StObject {
  
  /**
    * The service principal for the Amazon Web Services service to which this role is attached. You use a string similar to a URL but without the http:// in front. For example: elasticbeanstalk.amazonaws.com.  Service principals are unique and case-sensitive. To find the exact service principal for your service-linked role, see Amazon Web Services services that work with IAM in the IAM User Guide. Look for the services that have Yes in the Service-Linked Role column. Choose the Yes link to view the service-linked role documentation for that service.
    */
  var AWSServiceName: groupNameType
  
  /**
    *  A string that you provide, which is combined with the service-provided prefix to form the complete role name. If you make multiple requests for the same service, then you must supply a different CustomSuffix for each request. Otherwise the request fails with a duplicate role name error. For example, you could add -1 or -debug to the suffix. Some services do not support the CustomSuffix parameter. If you provide an optional suffix and the operation fails, try the operation again without the suffix.
    */
  var CustomSuffix: js.UndefOr[customSuffixType] = js.undefined
  
  /**
    * The description of the role.
    */
  var Description: js.UndefOr[roleDescriptionType] = js.undefined
}
object CreateServiceLinkedRoleRequest {
  
  inline def apply(AWSServiceName: groupNameType): CreateServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(AWSServiceName = AWSServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceLinkedRoleRequest]
  }
  
  extension [Self <: CreateServiceLinkedRoleRequest](x: Self) {
    
    inline def setAWSServiceName(value: groupNameType): Self = StObject.set(x, "AWSServiceName", value.asInstanceOf[js.Any])
    
    inline def setCustomSuffix(value: customSuffixType): Self = StObject.set(x, "CustomSuffix", value.asInstanceOf[js.Any])
    
    inline def setCustomSuffixUndefined: Self = StObject.set(x, "CustomSuffix", js.undefined)
    
    inline def setDescription(value: roleDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
