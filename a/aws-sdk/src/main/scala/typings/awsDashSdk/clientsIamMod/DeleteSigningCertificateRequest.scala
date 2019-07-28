package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSigningCertificateRequest extends js.Object {
  /**
    * The ID of the signing certificate to delete. The format of this parameter, as described by its regex pattern, is a string of characters that can be upper- or lower-cased letters or digits.
    */
  var CertificateId: certificateIdType
  /**
    * The name of the user the signing certificate belongs to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}

object DeleteSigningCertificateRequest {
  @scala.inline
  def apply(CertificateId: certificateIdType, UserName: existingUserNameType = null): DeleteSigningCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[DeleteSigningCertificateRequest]
  }
}

