package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCACertificateRequest extends js.Object {
  /**
    * The ID of the certificate to delete. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
}

object DeleteCACertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId): DeleteCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId)
  
    __obj.asInstanceOf[DeleteCACertificateRequest]
  }
}

