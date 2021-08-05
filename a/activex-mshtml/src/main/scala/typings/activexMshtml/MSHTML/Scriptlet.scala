package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scriptlet extends StObject {
  
  def AboutBox(): Unit
  
  /* private */ @JSName("MSHTML.Scriptlet_typekey")
  var MSHTMLDotScriptlet_typekey: Scriptlet
  
  var Scrollbar: Boolean
  
  var embed: Boolean
  
  val event: js.Any
  
  val readyState: Double
  
  var url: String
}
object Scriptlet {
  
  inline def apply(
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
  
  extension [Self <: Scriptlet](x: Self) {
    
    inline def setAboutBox(value: () => Unit): Self = StObject.set(x, "AboutBox", js.Any.fromFunction0(value))
    
    inline def setEmbed(value: Boolean): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotScriptlet_typekey(value: Scriptlet): Self = StObject.set(x, "MSHTML.Scriptlet_typekey", value.asInstanceOf[js.Any])
    
    inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setScrollbar(value: Boolean): Self = StObject.set(x, "Scrollbar", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
