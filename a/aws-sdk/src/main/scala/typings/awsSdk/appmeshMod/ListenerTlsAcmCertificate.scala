package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerTlsAcmCertificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see TLS Encryption.
    */
  var certificateArn: Arn = js.native
}

object ListenerTlsAcmCertificate {
  @scala.inline
  def apply(certificateArn: Arn): ListenerTlsAcmCertificate = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListenerTlsAcmCertificate]
  }
}

