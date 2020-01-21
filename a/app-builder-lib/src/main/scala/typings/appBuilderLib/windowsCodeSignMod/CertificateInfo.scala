package typings.appBuilderLib.windowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateInfo extends js.Object {
  val bloodyMicrosoftSubjectDn: String
  val commonName: String
}

object CertificateInfo {
  @scala.inline
  def apply(bloodyMicrosoftSubjectDn: String, commonName: String): CertificateInfo = {
    val __obj = js.Dynamic.literal(bloodyMicrosoftSubjectDn = bloodyMicrosoftSubjectDn.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateInfo]
  }
}

