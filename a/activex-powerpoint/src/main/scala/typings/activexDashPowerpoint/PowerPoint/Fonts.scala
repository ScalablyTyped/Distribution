package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Fonts")
@js.native
class Fonts protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Fonts_typekey")
  var PowerPointDotFonts_typekey: Fonts = js.native
  def Item(Index: js.Any): Font = js.native
  def Replace(Original: String, Replacement: String): Unit = js.native
}

