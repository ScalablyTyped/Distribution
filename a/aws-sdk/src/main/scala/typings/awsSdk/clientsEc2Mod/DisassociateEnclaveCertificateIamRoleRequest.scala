package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateEnclaveCertificateIamRoleRequest extends StObject {
  
  /**
    * The ARN of the ACM certificate from which to disassociate the IAM role.
    */
  var CertificateArn: CertificateId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the IAM role to disassociate.
    */
  var RoleArn: RoleId
}
object DisassociateEnclaveCertificateIamRoleRequest {
  
  inline def apply(CertificateArn: CertificateId, RoleArn: RoleId): DisassociateEnclaveCertificateIamRoleRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateEnclaveCertificateIamRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateEnclaveCertificateIamRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: CertificateId): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setRoleArn(value: RoleId): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
