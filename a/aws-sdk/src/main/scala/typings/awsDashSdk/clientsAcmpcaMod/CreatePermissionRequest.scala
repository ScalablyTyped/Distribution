package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePermissionRequest extends js.Object {
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
  var Principal: typings.awsDashSdk.clientsAcmpcaMod.Principal
  /**
    * The ID of the calling account.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.undefined
}

object CreatePermissionRequest {
  @scala.inline
  def apply(
    Actions: ActionList,
    CertificateAuthorityArn: Arn,
    Principal: Principal,
    SourceAccount: AccountId = null
  ): CreatePermissionRequest = {
    val __obj = js.Dynamic.literal(Actions = Actions, CertificateAuthorityArn = CertificateAuthorityArn, Principal = Principal)
    if (SourceAccount != null) __obj.updateDynamic("SourceAccount")(SourceAccount)
    __obj.asInstanceOf[CreatePermissionRequest]
  }
}

