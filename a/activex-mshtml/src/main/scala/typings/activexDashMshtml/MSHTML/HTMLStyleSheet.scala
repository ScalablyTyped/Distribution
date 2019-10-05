package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.HTMLStyleSheet")
@js.native
class HTMLStyleSheet protected () extends js.Object {
  var `MSHTML.HTMLStyleSheet_typekey`: HTMLStyleSheet = js.native
  val constructor: js.Any = js.native
  @JSName("cssRules")
  val cssRules_Original: IHTMLStyleSheetRulesCollection = js.native
  var cssText: String = js.native
  var disabled: Boolean = js.native
  var href: String = js.native
  val id: String = js.native
  var ie8_href: String = js.native
  val ie9_href: js.Any = js.native
  val ie9_media: js.Any = js.native
  val ie9_title: String = js.native
  val ie9_type: String = js.native
  @JSName("imports")
  val imports_Original: IHTMLStyleSheetsCollection = js.native
  val isAlternate: Boolean = js.native
  val isPrefAlternate: Boolean = js.native
  var media: String = js.native
  val ownerNode: IHTMLElement = js.native
  val ownerRule: IHTMLCSSRule = js.native
  val owningElement: IHTMLElement = js.native
  @JSName("pages")
  val pages_Original: IHTMLStyleSheetPagesCollection = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val readOnly: Boolean = js.native
  @JSName("rules")
  val rules_Original: IHTMLStyleSheetRulesCollection = js.native
  var title: String = js.native
  val `type`: String = js.native
  /** @param lIndex [lIndex=-1] */
  def addImport(bstrURL: String): Double = js.native
  def addImport(bstrURL: String, lIndex: Double): Double = js.native
  /** @param lIndex [lIndex=-1] */
  def addPageRule(bstrSelector: String, bstrStyle: String): Double = js.native
  def addPageRule(bstrSelector: String, bstrStyle: String, lIndex: Double): Double = js.native
  /** @param lIndex [lIndex=-1] */
  def addRule(bstrSelector: String, bstrStyle: String): Double = js.native
  def addRule(bstrSelector: String, bstrStyle: String, lIndex: Double): Double = js.native
  def cssRules(index: Double): IHTMLStyleSheetRule = js.native
  /** @param lIndex [lIndex=-1] */
  def deleteRule(): Unit = js.native
  def deleteRule(lIndex: Double): Unit = js.native
  def imports(pvarIndex: js.Any): js.Any = js.native
  /** @param lIndex [lIndex=-1] */
  def insertRule(bstrRule: String): Double = js.native
  def insertRule(bstrRule: String, lIndex: Double): Double = js.native
  def pages(index: Double): IHTMLStyleSheetPage = js.native
  def removeImport(lIndex: Double): Unit = js.native
  def removeRule(lIndex: Double): Unit = js.native
  def rules(index: Double): IHTMLStyleSheetRule = js.native
}

