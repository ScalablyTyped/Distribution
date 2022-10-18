package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateEnclaveCertificateIamRoleRequest extends StObject {
  
  /**
    * The ARN of the ACM certificate with which to associate the IAM role.
    */
  var CertificateArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the IAM role to associate with the ACM certificate. You can associate up to 16 IAM roles with an ACM certificate.
    */
  var RoleArn: js.UndefOr[ResourceArn] = js.undefined
}
object AssociateEnclaveCertificateIamRoleRequest {
  
  inline def apply(): AssociateEnclaveCertificateIamRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateEnclaveCertificateIamRoleRequest]
  }
  
  extension [Self <: AssociateEnclaveCertificateIamRoleRequest](x: Self) {
    
    inline def setCertificateArn(value: ResourceArn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setRoleArn(value: ResourceArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
