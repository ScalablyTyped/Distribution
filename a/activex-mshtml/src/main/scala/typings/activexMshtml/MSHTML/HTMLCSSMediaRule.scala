package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCSSMediaRule extends js.Object {
  @JSName("MSHTML.HTMLCSSMediaRule_typekey")
  var MSHTMLDotHTMLCSSMediaRule_typekey: HTMLCSSMediaRule = js.native
  @JSName("cssRules")
  val cssRules_Original: IHTMLStyleSheetRulesCollection = js.native
  var cssText: String = js.native
  var media: js.Any = js.native
  val parentRule: IHTMLCSSRule = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val `type`: Double = js.native
  def cssRules(index: Double): IHTMLStyleSheetRule = js.native
  /** @param lIndex [lIndex=-1] */
  def deleteRule(): Unit = js.native
  def deleteRule(lIndex: Double): Unit = js.native
  /** @param lIndex [lIndex=-1] */
  def insertRule(bstrRule: String): Double = js.native
  def insertRule(bstrRule: String, lIndex: Double): Double = js.native
}

