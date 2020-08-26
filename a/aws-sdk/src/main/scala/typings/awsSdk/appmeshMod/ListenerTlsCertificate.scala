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
  def apply(): ListenerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerTlsCertificate]
  }
  @scala.inline
  implicit class ListenerTlsCertificateOps[Self <: ListenerTlsCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcm(value: ListenerTlsAcmCertificate): Self = this.set("acm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcm: Self = this.set("acm", js.undefined)
    @scala.inline
    def setFile(value: ListenerTlsFileCertificate): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}

