package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePermissionRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the private CA that issued the permissions. You can find the CA's ARN by calling the ListCertificateAuthorities action. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * The AWS service or identity that will have its CA permissions revoked. At this time, the only valid service principal is acm.amazonaws.com 
    */
  var Principal: typings.awsSdk.acmpcaMod.Principal
  
  /**
    * The AWS account that calls this action.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.undefined
}
object DeletePermissionRequest {
  
  inline def apply(CertificateAuthorityArn: Arn, Principal: Principal): DeletePermissionRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionRequest]
  }
  
  extension [Self <: DeletePermissionRequest](x: Self) {
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setSourceAccount(value: AccountId): Self = StObject.set(x, "SourceAccount", value.asInstanceOf[js.Any])
    
    inline def setSourceAccountUndefined: Self = StObject.set(x, "SourceAccount", js.undefined)
  }
}
