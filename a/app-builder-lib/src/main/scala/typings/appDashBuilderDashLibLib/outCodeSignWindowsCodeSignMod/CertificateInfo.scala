package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateInfo extends js.Object {
  val bloodyMicrosoftSubjectDn: java.lang.String
  val commonName: java.lang.String
}

object CertificateInfo {
  @scala.inline
  def apply(bloodyMicrosoftSubjectDn: java.lang.String, commonName: java.lang.String): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bloodyMicrosoftSubjectDn")(bloodyMicrosoftSubjectDn)
    __obj.updateDynamic("commonName")(commonName)
    __obj.asInstanceOf[CertificateInfo]
  }
}

