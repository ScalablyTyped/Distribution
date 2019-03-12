package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TabStops")
@js.native
class TabStops protected () extends js.Object {
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Count: scala.Double = js.native
  var DefaultSpacing: scala.Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.TabStops_typekey`: TabStops = js.native
  def Add(Type: PpTabStopType, Position: scala.Double): TabStop = js.native
  def Item(Index: scala.Double): TabStop = js.native
}

