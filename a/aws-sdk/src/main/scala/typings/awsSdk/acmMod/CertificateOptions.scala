package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateOptions extends js.Object {
  /**
    * You can opt out of certificate transparency logging by specifying the DISABLED option. Opt in by specifying ENABLED. 
    */
  var CertificateTransparencyLoggingPreference: js.UndefOr[typings.awsSdk.acmMod.CertificateTransparencyLoggingPreference] = js.native
}

object CertificateOptions {
  @scala.inline
  def apply(): CertificateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateOptions]
  }
  @scala.inline
  implicit class CertificateOptionsOps[Self <: CertificateOptions] (val x: Self) extends AnyVal {
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
    def setCertificateTransparencyLoggingPreference(value: CertificateTransparencyLoggingPreference): Self = this.set("CertificateTransparencyLoggingPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateTransparencyLoggingPreference: Self = this.set("CertificateTransparencyLoggingPreference", js.undefined)
  }
  
}

