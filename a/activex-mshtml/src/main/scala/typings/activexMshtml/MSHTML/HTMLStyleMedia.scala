package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStyleMedia extends js.Object {
  @JSName("MSHTML.HTMLStyleMedia_typekey")
  var MSHTMLDotHTMLStyleMedia_typekey: HTMLStyleMedia = js.native
  val `type`: String = js.native
  def matchMedium(mediaQuery: String): Boolean = js.native
}

object HTMLStyleMedia {
  @scala.inline
  def apply(MSHTMLDotHTMLStyleMedia_typekey: HTMLStyleMedia, matchMedium: String => Boolean, `type`: String): HTMLStyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("MSHTML.HTMLStyleMedia_typekey")(MSHTMLDotHTMLStyleMedia_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleMedia]
  }
  @scala.inline
  implicit class HTMLStyleMediaOps[Self <: HTMLStyleMedia] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotHTMLStyleMedia_typekey(value: HTMLStyleMedia): Self = this.set("MSHTML.HTMLStyleMedia_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchMedium(value: String => Boolean): Self = this.set("matchMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

