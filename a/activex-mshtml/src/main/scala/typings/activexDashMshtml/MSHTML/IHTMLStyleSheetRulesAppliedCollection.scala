package typings.activexDashMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IHTMLStyleSheetRulesAppliedCollection extends js.Object {
  val length: Double = js.native
  def apply(index: Double): IHTMLStyleSheetRule = js.native
  def item(index: Double): IHTMLStyleSheetRule = js.native
  def propertyAppliedBy(name: String): IHTMLStyleSheetRule = js.native
  def propertyAppliedTrace(name: String, index: Double): IHTMLStyleSheetRule = js.native
  def propertyAppliedTraceLength(name: String): Double = js.native
}

