package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AddIns")
@js.native
class AddIns protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.AddIns_typekey`: AddIns = js.native
  def Add(FileName: String): AddIn = js.native
  def Item(Index: js.Any): AddIn = js.native
  def Remove(Index: js.Any): Unit = js.native
}

