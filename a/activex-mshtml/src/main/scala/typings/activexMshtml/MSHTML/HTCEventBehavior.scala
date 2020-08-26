package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTCEventBehavior extends js.Object {
  @JSName("MSHTML.HTCEventBehavior_typekey")
  var MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior = js.native
  def fire(pVar: IHTMLEventObj): Unit = js.native
}

object HTCEventBehavior {
  @scala.inline
  def apply(MSHTMLDotHTCEventBehavior_typekey: HTCEventBehavior, fire: IHTMLEventObj => Unit): HTCEventBehavior = {
    val __obj = js.Dynamic.literal(fire = js.Any.fromFunction1(fire))
    __obj.updateDynamic("MSHTML.HTCEventBehavior_typekey")(MSHTMLDotHTCEventBehavior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCEventBehavior]
  }
  @scala.inline
  implicit class HTCEventBehaviorOps[Self <: HTCEventBehavior] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotHTCEventBehavior_typekey(value: HTCEventBehavior): Self = this.set("MSHTML.HTCEventBehavior_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFire(value: IHTMLEventObj => Unit): Self = this.set("fire", js.Any.fromFunction1(value))
  }
  
}

