package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureLineObject extends js.Object {
  val Id: String
  @JSName("InfoPath.SignatureLineObject_typekey")
  var InfoPathDotSignatureLineObject_typekey: SignatureLineObject
  val Signature: SignatureObject
  val SignatureAppearanceType: XdSignatureAppearanceType
  var SuggestedSigner: String
  var SuggestedSignerEmailAddress: String
  var SuggestedSignerTitle: String
  def Sign(
    bstrImageURL: String,
    bstrSuggestedSigner: String,
    bstrSuggestedSignerTitle: String,
    bstrSuggestedSignerEmailAddress: String
  ): Boolean
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
}

