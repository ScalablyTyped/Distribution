package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Placeholders")
@js.native
class Placeholders protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Placeholders_typekey")
  var PowerPointDotPlaceholders_typekey: Placeholders = js.native
  def FindByName(Index: js.Any): Shape = js.native
  def Item(Index: Double): Shape = js.native
}

