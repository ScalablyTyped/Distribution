package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TabStops")
@js.native
class TabStops protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  var DefaultSpacing: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TabStops_typekey")
  var PowerPointDotTabStops_typekey: TabStops = js.native
  def Add(Type: PpTabStopType, Position: Double): TabStop = js.native
  def Item(Index: Double): TabStop = js.native
}

