package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SignatureInfo")
@js.native
class SignatureInfo protected () extends js.Object {
  val Application: js.Any = js.native
  val CertificateVerificationResults: activexDashOfficeLib.OfficeNs.CertificateVerificationResults = js.native
  val ContentVerificationResults: activexDashOfficeLib.OfficeNs.ContentVerificationResults = js.native
  val Creator: scala.Double = js.native
  val IsCertificateExpired: scala.Boolean = js.native
  val IsCertificateRevoked: scala.Boolean = js.native
  val IsCertificateUntrusted: scala.Boolean = js.native
  val IsValid: scala.Boolean = js.native
  var `Office.SignatureInfo_typekey`: SignatureInfo = js.native
  val ReadOnly: scala.Boolean = js.native
  var SignatureComment: java.lang.String = js.native
  var SignatureImage: activexDashStdoleLib.stdoleNs.IPictureDisp = js.native
  val SignatureProvider: java.lang.String = js.native
  var SignatureText: java.lang.String = js.native
  def GetCertificateDetail(certdet: CertificateDetail): js.Any = js.native
  def GetSignatureDetail(sigdet: SignatureDetail): js.Any = js.native
  def SelectCertificateDetailByThumbprint(bstrThumbprint: java.lang.String): scala.Unit = js.native
  def SelectSignatureCertificate(ParentWindow: js.Any): scala.Unit = js.native
  def ShowSignatureCertificate(ParentWindow: js.Any): scala.Unit = js.native
}

