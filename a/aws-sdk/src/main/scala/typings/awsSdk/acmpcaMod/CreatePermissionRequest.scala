package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePermissionRequest extends StObject {
  
  /**
    * The actions that the specified AWS service principal can use. These include IssueCertificate, GetCertificate, and ListPermissions.
    */
  var Actions: ActionList
  
  /**
    * The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the ListCertificateAuthorities action. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
    */
  var Principal: typings.awsSdk.acmpcaMod.Principal
  
  /**
    * The ID of the calling account.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.undefined
}
object CreatePermissionRequest {
  
  @scala.inline
  def apply(Actions: ActionList, CertificateAuthorityArn: Arn, Principal: Principal): CreatePermissionRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePermissionRequest]
  }
  
  @scala.inline
  implicit class CreatePermissionRequestMutableBuilder[Self <: CreatePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: ActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ActionType*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccount(value: AccountId): Self = StObject.set(x, "SourceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccountUndefined: Self = StObject.set(x, "SourceAccount", js.undefined)
  }
}
