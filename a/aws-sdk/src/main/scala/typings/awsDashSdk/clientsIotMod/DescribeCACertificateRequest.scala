package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCACertificateRequest extends js.Object {
  /**
    * The CA certificate identifier.
    */
  var certificateId: CertificateId = js.native
}

object DescribeCACertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId): DescribeCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeCACertificateRequest]
  }
}

