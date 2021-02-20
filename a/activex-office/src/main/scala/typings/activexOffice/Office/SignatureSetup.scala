package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureSetup extends StObject {
  
  var AdditionalXml: String = js.native
  
  var AllowComments: Boolean = js.native
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  val Id: String = js.native
  
  @JSName("Office.SignatureSetup_typekey")
  var OfficeDotSignatureSetup_typekey: SignatureSetup = js.native
  
  val ReadOnly: Boolean = js.native
  
  var ShowSignDate: Boolean = js.native
  
  val SignatureProvider: String = js.native
  
  var SigningInstructions: String = js.native
  
  var SuggestedSigner: String = js.native
  
  var SuggestedSignerEmail: String = js.native
  
  var SuggestedSignerLine2: String = js.native
}
object SignatureSetup {
  
  @scala.inline
  def apply(
    AdditionalXml: String,
    AllowComments: Boolean,
    Application: js.Any,
    Creator: Double,
    Id: String,
    OfficeDotSignatureSetup_typekey: SignatureSetup,
    ReadOnly: Boolean,
    ShowSignDate: Boolean,
    SignatureProvider: String,
    SigningInstructions: String,
    SuggestedSigner: String,
    SuggestedSignerEmail: String,
    SuggestedSignerLine2: String
  ): SignatureSetup = {
    val __obj = js.Dynamic.literal(AdditionalXml = AdditionalXml.asInstanceOf[js.Any], AllowComments = AllowComments.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], ShowSignDate = ShowSignDate.asInstanceOf[js.Any], SignatureProvider = SignatureProvider.asInstanceOf[js.Any], SigningInstructions = SigningInstructions.asInstanceOf[js.Any], SuggestedSigner = SuggestedSigner.asInstanceOf[js.Any], SuggestedSignerEmail = SuggestedSignerEmail.asInstanceOf[js.Any], SuggestedSignerLine2 = SuggestedSignerLine2.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SignatureSetup_typekey")(OfficeDotSignatureSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureSetup]
  }
  
  @scala.inline
  implicit class SignatureSetupMutableBuilder[Self <: SignatureSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalXml(value: String): Self = StObject.set(x, "AdditionalXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowComments(value: Boolean): Self = StObject.set(x, "AllowComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotSignatureSetup_typekey(value: SignatureSetup): Self = StObject.set(x, "Office.SignatureSetup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSignDate(value: Boolean): Self = StObject.set(x, "ShowSignDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureProvider(value: String): Self = StObject.set(x, "SignatureProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningInstructions(value: String): Self = StObject.set(x, "SigningInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSigner(value: String): Self = StObject.set(x, "SuggestedSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSignerEmail(value: String): Self = StObject.set(x, "SuggestedSignerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSignerLine2(value: String): Self = StObject.set(x, "SuggestedSignerLine2", value.asInstanceOf[js.Any])
  }
}
