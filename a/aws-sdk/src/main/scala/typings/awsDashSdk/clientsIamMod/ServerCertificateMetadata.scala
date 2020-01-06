package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificateMetadata extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use them in policies, see IAM Identifiers in the IAM User Guide. 
    */
  var Arn: arnType = js.native
  /**
    * The date on which the certificate is set to expire.
    */
  var Expiration: js.UndefOr[dateType] = js.native
  /**
    *  The path to the server certificate. For more information about paths, see IAM Identifiers in the IAM User Guide. 
    */
  var Path: pathType = js.native
  /**
    *  The stable and unique string identifying the server certificate. For more information about IDs, see IAM Identifiers in the IAM User Guide. 
    */
  var ServerCertificateId: idType = js.native
  /**
    * The name that identifies the server certificate.
    */
  var ServerCertificateName: serverCertificateNameType = js.native
  /**
    * The date when the server certificate was uploaded.
    */
  var UploadDate: js.UndefOr[dateType] = js.native
}

object ServerCertificateMetadata {
  @scala.inline
  def apply(
    Arn: arnType,
    Path: pathType,
    ServerCertificateId: idType,
    ServerCertificateName: serverCertificateNameType,
    Expiration: dateType = null,
    UploadDate: dateType = null
  ): ServerCertificateMetadata = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], ServerCertificateId = ServerCertificateId.asInstanceOf[js.Any], ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration.asInstanceOf[js.Any])
    if (UploadDate != null) __obj.updateDynamic("UploadDate")(UploadDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificateMetadata]
  }
}

