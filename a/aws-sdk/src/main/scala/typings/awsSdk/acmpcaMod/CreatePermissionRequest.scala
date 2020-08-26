package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePermissionRequest extends js.Object {
  /**
    * The actions that the specified AWS service principal can use. These include IssueCertificate, GetCertificate, and ListPermissions.
    */
  var Actions: ActionList = js.native
  /**
    * The Amazon Resource Name (ARN) of the CA that grants the permissions. You can find the ARN by calling the ListCertificateAuthorities action. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * The AWS service or identity that receives the permission. At this time, the only valid principal is acm.amazonaws.com.
    */
  var Principal: typings.awsSdk.acmpcaMod.Principal = js.native
  /**
    * The ID of the calling account.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.native
}

object CreatePermissionRequest {
  @scala.inline
  def apply(Actions: ActionList, CertificateAuthorityArn: Arn, Principal: Principal): CreatePermissionRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePermissionRequest]
  }
  @scala.inline
  implicit class CreatePermissionRequestOps[Self <: CreatePermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsVarargs(value: ActionType*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: ActionList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipal(value: Principal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceAccount(value: AccountId): Self = this.set("SourceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAccount: Self = this.set("SourceAccount", js.undefined)
  }
  
}

