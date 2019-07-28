package typings.activexDashMshtml.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLMSCSSKeyframesRule")
@js.native
class HTMLMSCSSKeyframesRule protected () extends js.Object {
  var `MSHTML.HTMLMSCSSKeyframesRule_typekey`: HTMLMSCSSKeyframesRule = js.native
  @JSName("cssRules")
  val cssRules_Original: IHTMLStyleSheetRulesCollection = js.native
  var cssText: String = js.native
  var name: String = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val `type`: Double = js.native
  def appendRule(bstrRule: String): Unit = js.native
  def cssRules(index: Double): IHTMLStyleSheetRule = js.native
  def deleteRule(bstrKey: String): Unit = js.native
  def findRule(bstrKey: String): IHTMLMSCSSKeyframeRule = js.native
}

