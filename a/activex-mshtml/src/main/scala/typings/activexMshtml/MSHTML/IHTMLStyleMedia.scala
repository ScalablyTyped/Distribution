package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLStyleMedia extends js.Object {
  @JSName("MSHTML.IHTMLStyleMedia_typekey")
  var MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia
  val `type`: String
  def matchMedium(mediaQuery: String): Boolean
}

object IHTMLStyleMedia {
  @scala.inline
  def apply(MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia, matchMedium: String => Boolean, `type`: String): IHTMLStyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("MSHTML.IHTMLStyleMedia_typekey")(MSHTMLDotIHTMLStyleMedia_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleMedia]
  }
}

