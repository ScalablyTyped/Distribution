package typings.activexMshtml

import typings.activexMshtml.MSHTML.CTemplatePrinter
import typings.activexMshtml.MSHTML.HTMLDocument
import typings.activexMshtml.MSHTML.Scriptlet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends js.Object {
  
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
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
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
    def setScriptBridgeDotScriptBridge(value: Scriptlet): Self = this.set("ScriptBridge.ScriptBridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatePrinterDotTemplatePrinter(value: CTemplatePrinter): Self = this.set("TemplatePrinter.TemplatePrinter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlfile(value: HTMLDocument): Self = this.set("htmlfile", value.asInstanceOf[js.Any])
  }
}
