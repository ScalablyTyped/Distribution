package typings.activexMshtml

import typings.activexMshtml.MSHTML.CTemplatePrinter
import typings.activexMshtml.MSHTML.HTMLDocument
import typings.activexMshtml.MSHTML.Scriptlet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  @JSName("ScriptBridge.ScriptBridge")
  var ScriptBridgeDotScriptBridge: Scriptlet = js.native
  
  @JSName("TemplatePrinter.TemplatePrinter")
  var TemplatePrinterDotTemplatePrinter: CTemplatePrinter = js.native
  
  var htmlfile: HTMLDocument = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(
    ScriptBridgeDotScriptBridge: Scriptlet,
    TemplatePrinterDotTemplatePrinter: CTemplatePrinter,
    htmlfile: HTMLDocument
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(htmlfile = htmlfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ScriptBridge.ScriptBridge")(ScriptBridgeDotScriptBridge.asInstanceOf[js.Any])
    __obj.updateDynamic("TemplatePrinter.TemplatePrinter")(TemplatePrinterDotTemplatePrinter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlfile(value: HTMLDocument): Self = StObject.set(x, "htmlfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptBridgeDotScriptBridge(value: Scriptlet): Self = StObject.set(x, "ScriptBridge.ScriptBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatePrinterDotTemplatePrinter(value: CTemplatePrinter): Self = StObject.set(x, "TemplatePrinter.TemplatePrinter", value.asInstanceOf[js.Any])
  }
}
