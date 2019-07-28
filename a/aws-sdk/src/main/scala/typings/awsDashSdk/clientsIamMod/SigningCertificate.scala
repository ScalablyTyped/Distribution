package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningCertificate extends js.Object {
  /**
    * The contents of the signing certificate.
    */
  var CertificateBody: certificateBodyType
  /**
    * The ID for the signing certificate.
    */
  var CertificateId: certificateIdType
  /**
    * The status of the signing certificate. Active means that the key is valid for API calls, while Inactive means it is not.
    */
  var Status: statusType
  /**
    * The date when the signing certificate was uploaded.
    */
  var UploadDate: js.UndefOr[dateType] = js.undefined
  /**
    * The name of the user the signing certificate is associated with.
    */
  var UserName: userNameType
}

object SigningCertificate {
  @scala.inline
  def apply(
    CertificateBody: certificateBodyType,
    CertificateId: certificateIdType,
    Status: statusType,
    UserName: userNameType,
    UploadDate: dateType = null
  ): SigningCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody, CertificateId = CertificateId, Status = Status.asInstanceOf[js.Any], UserName = UserName)
    if (UploadDate != null) __obj.updateDynamic("UploadDate")(UploadDate)
    __obj.asInstanceOf[SigningCertificate]
  }
}

