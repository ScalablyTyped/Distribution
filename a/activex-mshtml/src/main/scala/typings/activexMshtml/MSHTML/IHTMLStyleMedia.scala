package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLStyleMedia extends js.Object {
  @JSName("MSHTML.IHTMLStyleMedia_typekey")
  var MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia = js.native
  val `type`: String = js.native
  def matchMedium(mediaQuery: String): Boolean = js.native
}

object IHTMLStyleMedia {
  @scala.inline
  def apply(MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia, matchMedium: String => Boolean, `type`: String): IHTMLStyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("MSHTML.IHTMLStyleMedia_typekey")(MSHTMLDotIHTMLStyleMedia_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleMedia]
  }
  @scala.inline
  implicit class IHTMLStyleMediaOps[Self <: IHTMLStyleMedia] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLStyleMedia_typekey(value: IHTMLStyleMedia): Self = this.set("MSHTML.IHTMLStyleMedia_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchMedium(value: String => Boolean): Self = this.set("matchMedium", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

