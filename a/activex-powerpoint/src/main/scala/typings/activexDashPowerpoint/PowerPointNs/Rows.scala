package typings.activexDashPowerpoint.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Rows")
@js.native
class Rows protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Rows_typekey`: Rows = js.native
  /** @param number [BeforeRow=-1] */
  def Add(): Row = js.native
  def Add(BeforeRow: Double): Row = js.native
  def Item(Index: Double): Row = js.native
}

