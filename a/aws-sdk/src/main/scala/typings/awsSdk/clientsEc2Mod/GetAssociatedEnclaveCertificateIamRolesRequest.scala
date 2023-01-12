package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedEnclaveCertificateIamRolesRequest extends StObject {
  
  /**
    * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3 object information.
    */
  var CertificateArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
}
object GetAssociatedEnclaveCertificateIamRolesRequest {
  
  inline def apply(): GetAssociatedEnclaveCertificateIamRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedEnclaveCertificateIamRolesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssociatedEnclaveCertificateIamRolesRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: ResourceArn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
  }
}
