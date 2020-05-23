package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTCDescBehavior extends js.Object {
  @JSName("MSHTML.HTCDescBehavior_typekey")
  var MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior
  val name: String
  val urn: String
}

object HTCDescBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCDescBehavior_typekey: HTCDescBehavior, name: String, urn: String): HTCDescBehavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDescBehavior_typekey")(MSHTMLDotHTCDescBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDescBehavior]
  }
}

