package typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod

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
    val __obj = js.Dynamic.literal(bloodyMicrosoftSubjectDn = bloodyMicrosoftSubjectDn, commonName = commonName)
  
    __obj.asInstanceOf[CertificateInfo]
  }
}

