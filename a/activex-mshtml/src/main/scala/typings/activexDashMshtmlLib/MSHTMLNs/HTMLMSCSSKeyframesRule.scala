package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLMSCSSKeyframesRule")
@js.native
class HTMLMSCSSKeyframesRule protected () extends js.Object {
  var `MSHTML.HTMLMSCSSKeyframesRule_typekey`: HTMLMSCSSKeyframesRule = js.native
  @JSName("cssRules")
  val cssRules_Original: IHTMLStyleSheetRulesCollection = js.native
  var cssText: java.lang.String = js.native
  var name: java.lang.String = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val `type`: scala.Double = js.native
  def appendRule(bstrRule: java.lang.String): scala.Unit = js.native
  def cssRules(index: scala.Double): IHTMLStyleSheetRule = js.native
  def deleteRule(bstrKey: java.lang.String): scala.Unit = js.native
  def findRule(bstrKey: java.lang.String): IHTMLMSCSSKeyframeRule = js.native
}

