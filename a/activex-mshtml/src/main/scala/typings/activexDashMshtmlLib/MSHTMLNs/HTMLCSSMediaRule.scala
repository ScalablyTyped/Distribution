package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLCSSMediaRule")
@js.native
class HTMLCSSMediaRule protected () extends js.Object {
  var `MSHTML.HTMLCSSMediaRule_typekey`: HTMLCSSMediaRule = js.native
  @JSName("cssRules")
  val cssRules_Original: IHTMLStyleSheetRulesCollection = js.native
  var cssText: java.lang.String = js.native
  var media: js.Any = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val `type`: scala.Double = js.native
  def cssRules(index: scala.Double): IHTMLStyleSheetRule = js.native
  /** @param lIndex [lIndex=-1] */
  def deleteRule(): scala.Unit = js.native
  def deleteRule(lIndex: scala.Double): scala.Unit = js.native
  /** @param lIndex [lIndex=-1] */
  def insertRule(bstrRule: java.lang.String): scala.Double = js.native
  def insertRule(bstrRule: java.lang.String, lIndex: scala.Double): scala.Double = js.native
}

