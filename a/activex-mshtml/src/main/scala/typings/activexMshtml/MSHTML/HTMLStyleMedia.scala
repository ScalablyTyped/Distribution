package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLStyleMedia extends js.Object {
  @JSName("MSHTML.HTMLStyleMedia_typekey")
  var MSHTMLDotHTMLStyleMedia_typekey: HTMLStyleMedia
  val `type`: String
  def matchMedium(mediaQuery: String): Boolean
}

object HTMLStyleMedia {
  @scala.inline
  def apply(MSHTMLDotHTMLStyleMedia_typekey: HTMLStyleMedia, matchMedium: String => Boolean, `type`: String): HTMLStyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("MSHTML.HTMLStyleMedia_typekey")(MSHTMLDotHTMLStyleMedia_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleMedia]
  }
}

