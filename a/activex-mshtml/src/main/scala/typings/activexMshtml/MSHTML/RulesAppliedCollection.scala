package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesAppliedCollection extends js.Object {
  val element: IHTMLElement = js.native
  val length: Double = js.native
  val propertyCount: Double = js.native
  def apply(index: Double): IRulesApplied = js.native
  def item(index: Double): IRulesApplied = js.native
  def property(index: Double): String = js.native
  def propertyInheritedFrom(name: String): IRulesApplied = js.native
  def propertyInheritedTrace(name: String, index: Double): IRulesApplied = js.native
  def propertyInheritedTraceLength(name: String): Double = js.native
}

