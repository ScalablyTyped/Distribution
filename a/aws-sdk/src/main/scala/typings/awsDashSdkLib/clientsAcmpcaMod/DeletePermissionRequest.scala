package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePermissionRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the private CA that issued the permissions. You can find the CA's ARN by calling the ListCertificateAuthorities operation. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
  /**
    * The AWS service or identity that will have its CA permissions revoked. At this time, the only valid service principal is acm.amazonaws.com 
    */
  var Principal: awsDashSdkLib.clientsAcmpcaMod.Principal
  /**
    * The AWS account that calls this operation.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.undefined
}

object DeletePermissionRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, Principal: Principal, SourceAccount: AccountId = null): DeletePermissionRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn, Principal = Principal)
    if (SourceAccount != null) __obj.updateDynamic("SourceAccount")(SourceAccount)
    __obj.asInstanceOf[DeletePermissionRequest]
  }
}

