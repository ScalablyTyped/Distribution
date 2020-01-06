package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    * The private CA actions that can be performed by the designated AWS service.
    */
  var Actions: js.UndefOr[ActionList] = js.native
  /**
    * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  /**
    * The time at which the permission was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.native
  /**
    * The name of the policy that is associated with the permission.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * The AWS service or entity that holds the permission. At this time, the only valid principal is acm.amazonaws.com.
    */
  var Principal: js.UndefOr[String] = js.native
  /**
    * The ID of the account that assigned the permission.
    */
  var SourceAccount: js.UndefOr[String] = js.native
}

object Permission {
  @scala.inline
  def apply(
    Actions: ActionList = null,
    CertificateAuthorityArn: Arn = null,
    CreatedAt: TStamp = null,
    Policy: String = null,
    Principal: String = null,
    SourceAccount: String = null
  ): Permission = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    if (Principal != null) __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    if (SourceAccount != null) __obj.updateDynamic("SourceAccount")(SourceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
}

