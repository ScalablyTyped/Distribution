package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ExtraColors")
@js.native
class ExtraColors protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.ExtraColors_typekey`: ExtraColors = js.native
  def Add(Type: MsoRGBType): Unit = js.native
  def Clear(): Unit = js.native
  def Item(Index: Double): MsoRGBType = js.native
}

