package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerTlsCertificate extends js.Object {
  /**
    * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
    */
  var acm: js.UndefOr[ListenerTlsAcmCertificate] = js.native
  /**
    * A reference to an object that represents a local file certificate.
    */
  var file: js.UndefOr[ListenerTlsFileCertificate] = js.native
}

object ListenerTlsCertificate {
  @scala.inline
  def apply(acm: ListenerTlsAcmCertificate = null, file: ListenerTlsFileCertificate = null): ListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    if (acm != null) __obj.updateDynamic("acm")(acm.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTlsCertificate]
  }
}

