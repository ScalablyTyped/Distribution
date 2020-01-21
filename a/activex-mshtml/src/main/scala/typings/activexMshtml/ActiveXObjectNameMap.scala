package typings.activexMshtml

import typings.activexMshtml.MSHTML.CTemplatePrinter
import typings.activexMshtml.MSHTML.HTMLDocument
import typings.activexMshtml.MSHTML.Scriptlet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("ScriptBridge.ScriptBridge")
  var ScriptBridgeDotScriptBridge: Scriptlet
  @JSName("TemplatePrinter.TemplatePrinter")
  var TemplatePrinterDotTemplatePrinter: CTemplatePrinter
  var htmlfile: HTMLDocument
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
}

