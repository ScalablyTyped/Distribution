package typings.activexOffice.Office

import typings.activexStdole.stdole.IPictureDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureInfo extends StObject {
  
  val Application: js.Any
  
  val CertificateVerificationResults: typings.activexOffice.Office.CertificateVerificationResults
  
  val ContentVerificationResults: typings.activexOffice.Office.ContentVerificationResults
  
  val Creator: Double
  
  def GetCertificateDetail(certdet: CertificateDetail): js.Any
  
  def GetSignatureDetail(sigdet: SignatureDetail): js.Any
  
  val IsCertificateExpired: Boolean
  
  val IsCertificateRevoked: Boolean
  
  val IsCertificateUntrusted: Boolean
  
  val IsValid: Boolean
  
  @JSName("Office.SignatureInfo_typekey")
  var OfficeDotSignatureInfo_typekey: SignatureInfo
  
  val ReadOnly: Boolean
  
  def SelectCertificateDetailByThumbprint(bstrThumbprint: String): Unit
  
  def SelectSignatureCertificate(ParentWindow: js.Any): Unit
  
  def ShowSignatureCertificate(ParentWindow: js.Any): Unit
  
  var SignatureComment: String
  
  var SignatureImage: IPictureDisp
  
  val SignatureProvider: String
  
  var SignatureText: String
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
  implicit class SignatureInfoMutableBuilder[Self <: SignatureInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateVerificationResults(value: CertificateVerificationResults): Self = StObject.set(x, "CertificateVerificationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentVerificationResults(value: ContentVerificationResults): Self = StObject.set(x, "ContentVerificationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCertificateDetail(value: CertificateDetail => js.Any): Self = StObject.set(x, "GetCertificateDetail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSignatureDetail(value: SignatureDetail => js.Any): Self = StObject.set(x, "GetSignatureDetail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCertificateExpired(value: Boolean): Self = StObject.set(x, "IsCertificateExpired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCertificateRevoked(value: Boolean): Self = StObject.set(x, "IsCertificateRevoked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCertificateUntrusted(value: Boolean): Self = StObject.set(x, "IsCertificateUntrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "IsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSignatureInfo_typekey(value: SignatureInfo): Self = StObject.set(x, "Office.SignatureInfo_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectCertificateDetailByThumbprint(value: String => Unit): Self = StObject.set(x, "SelectCertificateDetailByThumbprint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectSignatureCertificate(value: js.Any => Unit): Self = StObject.set(x, "SelectSignatureCertificate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowSignatureCertificate(value: js.Any => Unit): Self = StObject.set(x, "ShowSignatureCertificate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignatureComment(value: String): Self = StObject.set(x, "SignatureComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureImage(value: IPictureDisp): Self = StObject.set(x, "SignatureImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProvider(value: String): Self = StObject.set(x, "SignatureProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureText(value: String): Self = StObject.set(x, "SignatureText", value.asInstanceOf[js.Any])
  }
}
