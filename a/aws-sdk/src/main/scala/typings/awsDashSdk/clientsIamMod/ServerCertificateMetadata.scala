package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerCertificateMetadata extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) specifying the server certificate. For more information about ARNs and how to use them in policies, see IAM Identifiers in the Using IAM guide. 
    */
  var Arn: arnType
  /**
    * The date on which the certificate is set to expire.
    */
  var Expiration: js.UndefOr[dateType] = js.undefined
  /**
    *  The path to the server certificate. For more information about paths, see IAM Identifiers in the Using IAM guide. 
    */
  var Path: pathType
  /**
    *  The stable and unique string identifying the server certificate. For more information about IDs, see IAM Identifiers in the Using IAM guide. 
    */
  var ServerCertificateId: idType
  /**
    * The name that identifies the server certificate.
    */
  var ServerCertificateName: serverCertificateNameType
  /**
    * The date when the server certificate was uploaded.
    */
  var UploadDate: js.UndefOr[dateType] = js.undefined
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
    val __obj = js.Dynamic.literal(Arn = Arn, Path = Path, ServerCertificateId = ServerCertificateId, ServerCertificateName = ServerCertificateName)
    if (Expiration != null) __obj.updateDynamic("Expiration")(Expiration)
    if (UploadDate != null) __obj.updateDynamic("UploadDate")(UploadDate)
    __obj.asInstanceOf[ServerCertificateMetadata]
  }
}

