package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureSetup extends StObject {
  
  var AdditionalXml: String
  
  var AllowComments: Boolean
  
  val Application: Any
  
  val Creator: Double
  
  val Id: String
  
  /* private */ @JSName("Office.SignatureSetup_typekey")
  var OfficeDotSignatureSetup_typekey: SignatureSetup
  
  val ReadOnly: Boolean
  
  var ShowSignDate: Boolean
  
  val SignatureProvider: String
  
  var SigningInstructions: String
  
  var SuggestedSigner: String
  
  var SuggestedSignerEmail: String
  
  var SuggestedSignerLine2: String
}
object SignatureSetup {
  
  inline def apply(
    AdditionalXml: String,
    AllowComments: Boolean,
    Application: Any,
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
  
  extension [Self <: SignatureSetup](x: Self) {
    
    inline def setAdditionalXml(value: String): Self = StObject.set(x, "AdditionalXml", value.asInstanceOf[js.Any])
    
    inline def setAllowComments(value: Boolean): Self = StObject.set(x, "AllowComments", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSignatureSetup_typekey(value: SignatureSetup): Self = StObject.set(x, "Office.SignatureSetup_typekey", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setShowSignDate(value: Boolean): Self = StObject.set(x, "ShowSignDate", value.asInstanceOf[js.Any])
    
    inline def setSignatureProvider(value: String): Self = StObject.set(x, "SignatureProvider", value.asInstanceOf[js.Any])
    
    inline def setSigningInstructions(value: String): Self = StObject.set(x, "SigningInstructions", value.asInstanceOf[js.Any])
    
    inline def setSuggestedSigner(value: String): Self = StObject.set(x, "SuggestedSigner", value.asInstanceOf[js.Any])
    
    inline def setSuggestedSignerEmail(value: String): Self = StObject.set(x, "SuggestedSignerEmail", value.asInstanceOf[js.Any])
    
    inline def setSuggestedSignerLine2(value: String): Self = StObject.set(x, "SuggestedSignerLine2", value.asInstanceOf[js.Any])
  }
}
