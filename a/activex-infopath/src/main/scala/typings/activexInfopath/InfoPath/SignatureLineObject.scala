package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureLineObject extends js.Object {
  
  val Id: String = js.native
  
  @JSName("InfoPath.SignatureLineObject_typekey")
  var InfoPathDotSignatureLineObject_typekey: SignatureLineObject = js.native
  
  def Sign(
    bstrImageURL: String,
    bstrSuggestedSigner: String,
    bstrSuggestedSignerTitle: String,
    bstrSuggestedSignerEmailAddress: String
  ): Boolean = js.native
  
  val Signature: SignatureObject = js.native
  
  val SignatureAppearanceType: XdSignatureAppearanceType = js.native
  
  var SuggestedSigner: String = js.native
  
  var SuggestedSignerEmailAddress: String = js.native
  
  var SuggestedSignerTitle: String = js.native
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
  implicit class SignatureLineObjectOps[Self <: SignatureLineObject] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSignatureLineObject_typekey(value: SignatureLineObject): Self = this.set("InfoPath.SignatureLineObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: (String, String, String, String) => Boolean): Self = this.set("Sign", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSignature(value: SignatureObject): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAppearanceType(value: XdSignatureAppearanceType): Self = this.set("SignatureAppearanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSigner(value: String): Self = this.set("SuggestedSigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSignerEmailAddress(value: String): Self = this.set("SuggestedSignerEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSignerTitle(value: String): Self = this.set("SuggestedSignerTitle", value.asInstanceOf[js.Any])
  }
}
