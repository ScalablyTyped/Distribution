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
  def apply(CertificateTransparencyLoggingPreference: CertificateTransparencyLoggingPreference = null): CertificateOptions = {
    val __obj = js.Dynamic.literal()
    if (CertificateTransparencyLoggingPreference != null) __obj.updateDynamic("CertificateTransparencyLoggingPreference")(CertificateTransparencyLoggingPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateOptions]
  }
}

