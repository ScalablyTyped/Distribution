package typings.activexOffice.Office

import typings.activexStdole.stdole.IPictureDisp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureInfo extends js.Object {
  val Application: js.Any = js.native
  val CertificateVerificationResults: typings.activexOffice.Office.CertificateVerificationResults = js.native
  val ContentVerificationResults: typings.activexOffice.Office.ContentVerificationResults = js.native
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
  @scala.inline
  implicit class SignatureInfoOps[Self <: SignatureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateVerificationResults(value: CertificateVerificationResults): Self = this.set("CertificateVerificationResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentVerificationResults(value: ContentVerificationResults): Self = this.set("ContentVerificationResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCertificateDetail(value: CertificateDetail => js.Any): Self = this.set("GetCertificateDetail", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSignatureDetail(value: SignatureDetail => js.Any): Self = this.set("GetSignatureDetail", js.Any.fromFunction1(value))
    @scala.inline
    def setIsCertificateExpired(value: Boolean): Self = this.set("IsCertificateExpired", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCertificateRevoked(value: Boolean): Self = this.set("IsCertificateRevoked", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCertificateUntrusted(value: Boolean): Self = this.set("IsCertificateUntrusted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("IsValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotSignatureInfo_typekey(value: SignatureInfo): Self = this.set("Office.SignatureInfo_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectCertificateDetailByThumbprint(value: String => Unit): Self = this.set("SelectCertificateDetailByThumbprint", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectSignatureCertificate(value: js.Any => Unit): Self = this.set("SelectSignatureCertificate", js.Any.fromFunction1(value))
    @scala.inline
    def setShowSignatureCertificate(value: js.Any => Unit): Self = this.set("ShowSignatureCertificate", js.Any.fromFunction1(value))
    @scala.inline
    def setSignatureComment(value: String): Self = this.set("SignatureComment", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureImage(value: IPictureDisp): Self = this.set("SignatureImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureProvider(value: String): Self = this.set("SignatureProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureText(value: String): Self = this.set("SignatureText", value.asInstanceOf[js.Any])
  }
  
}

