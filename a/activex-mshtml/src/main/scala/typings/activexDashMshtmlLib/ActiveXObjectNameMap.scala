package typings
package activexDashMshtmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `ScriptBridge.ScriptBridge`: activexDashMshtmlLib.MSHTMLNs.Scriptlet
  var `TemplatePrinter.TemplatePrinter`: activexDashMshtmlLib.MSHTMLNs.CTemplatePrinter
  var htmlfile: activexDashMshtmlLib.MSHTMLNs.HTMLDocument
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `ScriptBridge.ScriptBridge`: activexDashMshtmlLib.MSHTMLNs.Scriptlet,
    `TemplatePrinter.TemplatePrinter`: activexDashMshtmlLib.MSHTMLNs.CTemplatePrinter,
    htmlfile: activexDashMshtmlLib.MSHTMLNs.HTMLDocument
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(htmlfile = htmlfile)
    __obj.updateDynamic("ScriptBridge.ScriptBridge")(`ScriptBridge.ScriptBridge`)
    __obj.updateDynamic("TemplatePrinter.TemplatePrinter")(`TemplatePrinter.TemplatePrinter`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

