package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLStyleSheet")
@js.native
class IHTMLStyleSheet protected () extends js.Object {
  @JSName("MSHTML.IHTMLStyleSheet_typekey")
  var MSHTMLDotIHTMLStyleSheet_typekey: IHTMLStyleSheet = js.native
  var cssText: String = js.native
  var disabled: Boolean = js.native
  var href: String = js.native
  val id: String = js.native
  @JSName("imports")
  val imports_Original: IHTMLStyleSheetsCollection = js.native
  var media: String = js.native
  val owningElement: IHTMLElement = js.native
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
  def addRule(bstrSelector: String, bstrStyle: String): Double = js.native
  def addRule(bstrSelector: String, bstrStyle: String, lIndex: Double): Double = js.native
  def imports(pvarIndex: js.Any): js.Any = js.native
  def removeImport(lIndex: Double): Unit = js.native
  def removeRule(lIndex: Double): Unit = js.native
  def rules(index: Double): IHTMLStyleSheetRule = js.native
}

