package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ExtraColors")
@js.native
class ExtraColors protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: ExtraColors = js.native
  def Add(Type: MsoRGBType): Unit = js.native
  def Clear(): Unit = js.native
  def Item(Index: Double): MsoRGBType = js.native
}

