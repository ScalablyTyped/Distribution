package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTCEventBehavior extends js.Object {
  @JSName("MSHTML.HTCEventBehavior_typekey")
  var MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior
  def fire(pVar: IHTMLEventObj): Unit
}

object HTCEventBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior, fire: IHTMLEventObj => Unit): HTCEventBehavior = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire))
    __obj.updateDynamic("MSHTML.HTCEventBehavior_typekey")(MSHTMLDotHTCEventBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCEventBehavior]
  }
}

