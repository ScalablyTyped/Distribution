package typings.activexOffice.Office

import typings.activexStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureInfo extends js.Object {
  val Application: js.Any
  val CertificateVerificationResults: typings.activexOffice.Office.CertificateVerificationResults
  val ContentVerificationResults: typings.activexOffice.Office.ContentVerificationResults
  val Creator: Double
  val IsCertificateExpired: Boolean
  val IsCertificateRevoked: Boolean
  val IsCertificateUntrusted: Boolean
  val IsValid: Boolean
  @JSName("Office.SignatureInfo_typekey")
  var OfficeDotSignatureInfo_typekey: SignatureInfo
  val ReadOnly: Boolean
  var SignatureComment: String
  var SignatureImage: IPictureDisp
  val SignatureProvider: String
  var SignatureText: String
  def GetCertificateDetail(certdet: CertificateDetail): js.Any
  def GetSignatureDetail(sigdet: SignatureDetail): js.Any
  def SelectCertificateDetailByThumbprint(bstrThumbprint: String): Unit
  def SelectSignatureCertificate(ParentWindow: js.Any): Unit
  def ShowSignatureCertificate(ParentWindow: js.Any): Unit
}

object SignatureInfo {
  @scala.inline
  def apply(
    Application: js.Any,
    CertificateVerificationResults: CertificateVerificationResults,
    ContentVerificationResults: ContentVerificationResults,
    Creator: Double,
    GetCertificateDetail: CertificateDetail => js.Any,
    GetSignatureDetail: SignatureDetail => js.Any,
    IsCertificateExpired: Boolean,
    IsCertificateRevoked: Boolean,
    IsCertificateUntrusted: Boolean,
    IsValid: Boolean,
    OfficeDotSignatureInfo_typekey: SignatureInfo,
    ReadOnly: Boolean,
    SelectCertificateDetailByThumbprint: String => Unit,
    SelectSignatureCertificate: js.Any => Unit,
    ShowSignatureCertificate: js.Any => Unit,
    SignatureComment: String,
    SignatureImage: IPictureDisp,
    SignatureProvider: String,
    SignatureText: String
  ): SignatureInfo = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CertificateVerificationResults = CertificateVerificationResults.asInstanceOf[js.Any], ContentVerificationResults = ContentVerificationResults.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], GetCertificateDetail = js.Any.fromFunction1(GetCertificateDetail), GetSignatureDetail = js.Any.fromFunction1(GetSignatureDetail), IsCertificateExpired = IsCertificateExpired.asInstanceOf[js.Any], IsCertificateRevoked = IsCertificateRevoked.asInstanceOf[js.Any], IsCertificateUntrusted = IsCertificateUntrusted.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], SelectCertificateDetailByThumbprint = js.Any.fromFunction1(SelectCertificateDetailByThumbprint), SelectSignatureCertificate = js.Any.fromFunction1(SelectSignatureCertificate), ShowSignatureCertificate = js.Any.fromFunction1(ShowSignatureCertificate), SignatureComment = SignatureComment.asInstanceOf[js.Any], SignatureImage = SignatureImage.asInstanceOf[js.Any], SignatureProvider = SignatureProvider.asInstanceOf[js.Any], SignatureText = SignatureText.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SignatureInfo_typekey")(OfficeDotSignatureInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInfo]
  }
}

