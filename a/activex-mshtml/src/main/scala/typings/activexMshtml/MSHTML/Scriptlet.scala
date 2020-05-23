package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scriptlet extends js.Object {
  @JSName("MSHTML.Scriptlet_typekey")
  var MSHTMLDotScriptlet_typekey: Scriptlet
  var Scrollbar: Boolean
  var embed: Boolean
  val event: js.Any
  val readyState: Double
  var url: String
  def AboutBox(): Unit
}

object Scriptlet {
  @scala.inline
  def apply(
    AboutBox: () => Unit,
    MSHTMLDotScriptlet_typekey: Scriptlet,
    Scrollbar: Boolean,
    embed: Boolean,
    event: js.Any,
    readyState: Double,
    url: String
  ): Scriptlet = {
    val __obj = js.Dynamic.literal(AboutBox = js.Any.fromFunction0(AboutBox), Scrollbar = Scrollbar.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.Scriptlet_typekey")(MSHTMLDotScriptlet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scriptlet]
  }
}

