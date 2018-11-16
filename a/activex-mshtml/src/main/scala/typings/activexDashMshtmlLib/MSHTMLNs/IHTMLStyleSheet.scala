package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IHTMLStyleSheet")
@js.native
class IHTMLStyleSheet protected () extends js.Object {
  var `MSHTML.IHTMLStyleSheet_typekey`: IHTMLStyleSheet = js.native
  var cssText: java.lang.String = js.native
  var disabled: scala.Boolean = js.native
  var href: java.lang.String = js.native
  val id: java.lang.String = js.native
  @JSName("imports")
  val imports_Original: IHTMLStyleSheetsCollection = js.native
  var media: java.lang.String = js.native
  val owningElement: IHTMLElement = js.native
  val parentStyleSheet: IHTMLStyleSheet = js.native
  val readOnly: scala.Boolean = js.native
  @JSName("rules")
  val rules_Original: IHTMLStyleSheetRulesCollection = js.native
  var title: java.lang.String = js.native
  val `type`: java.lang.String = js.native
  /** @param lIndex [lIndex=-1] */
  def addImport(bstrURL: java.lang.String): scala.Double = js.native
  /** @param lIndex [lIndex=-1] */
  def addImport(bstrURL: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  /** @param lIndex [lIndex=-1] */
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String): scala.Double = js.native
  /** @param lIndex [lIndex=-1] */
  def addRule(bstrSelector: java.lang.String, bstrStyle: java.lang.String, lIndex: scala.Double): scala.Double = js.native
  def imports(pvarIndex: js.Any): js.Any = js.native
  def removeImport(lIndex: scala.Double): scala.Unit = js.native
  def removeRule(lIndex: scala.Double): scala.Unit = js.native
  def rules(index: scala.Double): IHTMLStyleSheetRule = js.native
}

