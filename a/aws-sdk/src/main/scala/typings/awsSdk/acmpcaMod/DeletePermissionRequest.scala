package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePermissionRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the private CA that issued the permissions. You can find the CA's ARN by calling the ListCertificateAuthorities action. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * The AWS service or identity that will have its CA permissions revoked. At this time, the only valid service principal is acm.amazonaws.com 
    */
  var Principal: typings.awsSdk.acmpcaMod.Principal = js.native
  /**
    * The AWS account that calls this action.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.native
}

object DeletePermissionRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, Principal: Principal): DeletePermissionRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionRequest]
  }
  @scala.inline
  implicit class DeletePermissionRequestOps[Self <: DeletePermissionRequest] (val x: Self) extends AnyVal {
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
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipal(value: Principal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceAccount(value: AccountId): Self = this.set("SourceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAccount: Self = this.set("SourceAccount", js.undefined)
  }
  
}

