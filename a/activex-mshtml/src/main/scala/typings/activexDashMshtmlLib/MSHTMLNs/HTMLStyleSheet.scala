package typings
package activexDashMshtmlLib.MSHTMLNs

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
  var cssText: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  var href: java.lang.String = js.native
  val id: java.lang.String = js.native
  var ie8_href: java.lang.String = js.native
  val ie9_href: js.Any = js.native
  val ie9_media: js.Any = js.native
  val ie9_title: java.lang.String = js.native
  val ie9_type: java.lang.String = js.native
  @JSName("imports")
  val imports_Original: IHTMLStyleSheetsCollection = js.native
  val isAlternate: scala.Boolean = js.native
  val isPrefAlternate: scala.Boolean = js.native
  var media: java.lang.String = js.native
  val ownerNode: IHTMLElement = js.native
  val ownerRule: IHTMLCSSRule = js.native
  val owningElement: IHTMLElement = js.native
  @JSName("pages")
  val pages_Original: IHTMLStyleSheetPagesCollection = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val readOnly: scala.Boolean = js.native
  @JSName("rules")
  val rules_Original: IHTMLStyleSheetRulesCollection = js.native
  var title: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  /** @param lIndex [lIndex=-1] */
  def addImport(bstrURL: java.lang.String): scala.Double = js.native
  def addImport(bstrURL: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  /** @param lIndex [lIndex=-1] */
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): scala.Double = js.native
  def addPageRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  /** @param lIndex [lIndex=-1] */
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): scala.Double = js.native
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  def cssRules(index: scala.Double): IHTMLStyleSheetRule = js.native
  /** @param lIndex [lIndex=-1] */
  def deleteRule(): scala.Unit = js.native
  def deleteRule(lIndex: scala.Double): scala.Unit = js.native
  def imports(pvarIndex: js.Any): js.Any = js.native
  /** @param lIndex [lIndex=-1] */
  def insertRule(bstrRule: java.lang.String): scala.Double = js.native
  def insertRule(bstrRule: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  def pages(index: scala.Double): IHTMLStyleSheetPage = js.native
  def removeImport(lIndex: scala.Double): scala.Unit = js.native
  def removeRule(lIndex: scala.Double): scala.Unit = js.native
  def rules(index: scala.Double): IHTMLStyleSheetRule = js.native
}

