package typings.activexDashOffice.Office

import typings.activexDashStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SignatureInfo")
@js.native
class SignatureInfo protected () extends js.Object {
  val Application: js.Any = js.native
  val CertificateVerificationResults: typings.activexDashOffice.Office.CertificateVerificationResults = js.native
  val ContentVerificationResults: typings.activexDashOffice.Office.ContentVerificationResults = js.native
  val Creator: Double = js.native
  val IsCertificateExpired: Boolean = js.native
  val IsCertificateRevoked: Boolean = js.native
  val IsCertificateUntrusted: Boolean = js.native
  val IsValid: Boolean = js.native
  @JSName("Office.SignatureInfo_typekey")
  var OfficeDotSignatureInfo_typekey: SignatureInfo = js.native
  val ReadOnly: Boolean = js.native
  var SignatureComment: String = js.native
  var SignatureImage: IPictureDisp = js.native
  val SignatureProvider: String = js.native
  var SignatureText: String = js.native
  def GetCertificateDetail(certdet: CertificateDetail): js.Any = js.native
  def GetSignatureDetail(sigdet: SignatureDetail): js.Any = js.native
  def SelectCertificateDetailByThumbprint(bstrThumbprint: String): Unit = js.native
  def SelectSignatureCertificate(ParentWindow: js.Any): Unit = js.native
  def ShowSignatureCertificate(ParentWindow: js.Any): Unit = js.native
}

