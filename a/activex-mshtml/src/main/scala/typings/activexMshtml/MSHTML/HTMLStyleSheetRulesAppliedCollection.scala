package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLStyleSheetRulesAppliedCollection extends js.Object {
  val length: Double = js.native
  def apply(index: Double): IHTMLStyleSheetRule = js.native
  def item(index: Double): IHTMLStyleSheetRule = js.native
  def propertyAppliedBy(name: String): IHTMLStyleSheetRule = js.native
  def propertyAppliedTrace(name: String, index: Double): IHTMLStyleSheetRule = js.native
  def propertyAppliedTraceLength(name: String): Double = js.native
}

