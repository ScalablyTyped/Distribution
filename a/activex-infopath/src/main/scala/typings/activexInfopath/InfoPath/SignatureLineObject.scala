package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureLineObject extends StObject {
  
  val Id: String
  
  @JSName("InfoPath.SignatureLineObject_typekey")
  var InfoPathDotSignatureLineObject_typekey: SignatureLineObject
  
  def Sign(
    bstrImageURL: String,
    bstrSuggestedSigner: String,
    bstrSuggestedSignerTitle: String,
    bstrSuggestedSignerEmailAddress: String
  ): Boolean
  
  val Signature: SignatureObject
  
  val SignatureAppearanceType: XdSignatureAppearanceType
  
  var SuggestedSigner: String
  
  var SuggestedSignerEmailAddress: String
  
  var SuggestedSignerTitle: String
}
object SignatureLineObject {
  
  @scala.inline
  def apply(
    Id: String,
    InfoPathDotSignatureLineObject_typekey: SignatureLineObject,
    Sign: (String, String, String, String) => Boolean,
    Signature: SignatureObject,
    SignatureAppearanceType: XdSignatureAppearanceType,
    SuggestedSigner: String,
    SuggestedSignerEmailAddress: String,
    SuggestedSignerTitle: String
  ): SignatureLineObject = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Sign = js.Any.fromFunction4(Sign), Signature = Signature.asInstanceOf[js.Any], SignatureAppearanceType = SignatureAppearanceType.asInstanceOf[js.Any], SuggestedSigner = SuggestedSigner.asInstanceOf[js.Any], SuggestedSignerEmailAddress = SuggestedSignerEmailAddress.asInstanceOf[js.Any], SuggestedSignerTitle = SuggestedSignerTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignatureLineObject_typekey")(InfoPathDotSignatureLineObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureLineObject]
  }
  
  @scala.inline
  implicit class SignatureLineObjectMutableBuilder[Self <: SignatureLineObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSignatureLineObject_typekey(value: SignatureLineObject): Self = StObject.set(x, "InfoPath.SignatureLineObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: (String, String, String, String) => Boolean): Self = StObject.set(x, "Sign", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSignature(value: SignatureObject): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAppearanceType(value: XdSignatureAppearanceType): Self = StObject.set(x, "SignatureAppearanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSigner(value: String): Self = StObject.set(x, "SuggestedSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSignerEmailAddress(value: String): Self = StObject.set(x, "SuggestedSignerEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSignerTitle(value: String): Self = StObject.set(x, "SuggestedSignerTitle", value.asInstanceOf[js.Any])
  }
}
