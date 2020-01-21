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
  def apply(CertificateAuthorityArn: Arn, Principal: Principal, SourceAccount: AccountId = null): DeletePermissionRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any])
    if (SourceAccount != null) __obj.updateDynamic("SourceAccount")(SourceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePermissionRequest]
  }
}

