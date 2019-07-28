package typings.activexDashMshtml

import typings.activexDashMshtml.MSHTMLNs.CTemplatePrinter
import typings.activexDashMshtml.MSHTMLNs.HTMLDocument
import typings.activexDashMshtml.MSHTMLNs.Scriptlet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `ScriptBridge.ScriptBridge`: Scriptlet
  var `TemplatePrinter.TemplatePrinter`: CTemplatePrinter
  var htmlfile: HTMLDocument
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `ScriptBridge.ScriptBridge`: Scriptlet,
    `TemplatePrinter.TemplatePrinter`: CTemplatePrinter,
    htmlfile: HTMLDocument
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(htmlfile = htmlfile)
    __obj.updateDynamic("ScriptBridge.ScriptBridge")(`ScriptBridge.ScriptBridge`)
    __obj.updateDynamic("TemplatePrinter.TemplatePrinter")(`TemplatePrinter.TemplatePrinter`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

