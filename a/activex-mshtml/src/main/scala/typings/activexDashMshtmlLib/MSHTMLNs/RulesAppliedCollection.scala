package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesAppliedCollection extends js.Object {
  val element: IHTMLElement = js.native
  val length: scala.Double = js.native
  val propertyCount: scala.Double = js.native
  def apply(index: scala.Double): IRulesApplied = js.native
  def item(index: scala.Double): IRulesApplied = js.native
  def property(index: scala.Double): java.lang.String = js.native
  def propertyInheritedFrom(name: java.lang.String): IRulesApplied = js.native
  def propertyInheritedTrace(name: java.lang.String, index: scala.Double): IRulesApplied = js.native
  def propertyInheritedTraceLength(name: java.lang.String): scala.Double = js.native
}

