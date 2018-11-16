package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.SignatureLineObject")
@js.native
class SignatureLineObject protected () extends js.Object {
  val Id: java.lang.String = js.native
  var `InfoPath.SignatureLineObject_typekey`: SignatureLineObject = js.native
  val Signature: SignatureObject = js.native
  val SignatureAppearanceType: XdSignatureAppearanceType = js.native
  var SuggestedSigner: java.lang.String = js.native
  var SuggestedSignerEmailAddress: java.lang.String = js.native
  var SuggestedSignerTitle: java.lang.String = js.native
  def Sign(
    bstrImageURL: java.lang.String,
    bstrSuggestedSigner: java.lang.String,
    bstrSuggestedSignerTitle: java.lang.String,
    bstrSuggestedSignerEmailAddress: java.lang.String
  ): scala.Boolean = js.native
}

