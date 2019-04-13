package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /**
    * The private CA operations that can be performed by the designated AWS service.
    */
  var Actions: js.UndefOr[ActionList] = js.undefined
  /**
    * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  /**
    * The time at which the permission was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.undefined
  /**
    * The name of the policy that is associated with the permission.
    */
  var Policy: js.UndefOr[String] = js.undefined
  /**
    * The AWS service or entity that holds the permission. At this time, the only valid principal is acm.amazonaws.com.
    */
  var Principal: js.UndefOr[String] = js.undefined
  /**
    * The ID of the account that assigned the permission.
    */
  var SourceAccount: js.UndefOr[String] = js.undefined
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
    if (Actions != null) __obj.updateDynamic("Actions")(Actions)
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    if (Principal != null) __obj.updateDynamic("Principal")(Principal)
    if (SourceAccount != null) __obj.updateDynamic("SourceAccount")(SourceAccount)
    __obj.asInstanceOf[Permission]
  }
}

