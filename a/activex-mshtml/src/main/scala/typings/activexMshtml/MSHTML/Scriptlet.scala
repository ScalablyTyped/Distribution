package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scriptlet extends js.Object {
  
  def AboutBox(): Unit = js.native
  
  @JSName("MSHTML.Scriptlet_typekey")
  var MSHTMLDotScriptlet_typekey: Scriptlet = js.native
  
  var Scrollbar: Boolean = js.native
  
  var embed: Boolean = js.native
  
  val event: js.Any = js.native
  
  val readyState: Double = js.native
  
  var url: String = js.native
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
  
  @scala.inline
  implicit class ScriptletOps[Self <: Scriptlet] (val x: Self) extends AnyVal {
    
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
    def setAboutBox(value: () => Unit): Self = this.set("AboutBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotScriptlet_typekey(value: Scriptlet): Self = this.set("MSHTML.Scriptlet_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbar(value: Boolean): Self = this.set("Scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbed(value: Boolean): Self = this.set("embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyState(value: Double): Self = this.set("readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
