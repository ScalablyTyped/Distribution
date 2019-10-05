package typings.activexDashInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureLineObject")
@js.native
class SignatureLineObject protected () extends js.Object {
  val Id: String = js.native
  var `InfoPath.SignatureLineObject_typekey`: SignatureLineObject = js.native
  val Signature: SignatureObject = js.native
  val SignatureAppearanceType: XdSignatureAppearanceType = js.native
  var SuggestedSigner: String = js.native
  var SuggestedSignerEmailAddress: String = js.native
  var SuggestedSignerTitle: String = js.native
  def Sign(
    bstrImageURL: String,
    bstrSuggestedSigner: String,
    bstrSuggestedSignerTitle: String,
    bstrSuggestedSignerEmailAddress: String
  ): Boolean = js.native
}

