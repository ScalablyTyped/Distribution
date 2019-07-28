package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCACertificateRequest extends js.Object {
  /**
    * The CA certificate identifier.
    */
  var certificateId: CertificateId
}

object DescribeCACertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId): DescribeCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId)
  
    __obj.asInstanceOf[DescribeCACertificateRequest]
  }
}

