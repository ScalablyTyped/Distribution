package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ColorScheme")
@js.native
class ColorScheme protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ColorScheme_typekey")
  var PowerPointDotColorScheme_typekey: ColorScheme = js.native
  def Colors(SchemeColor: PpColorSchemeIndex): RGBColor = js.native
  def Delete(): Unit = js.native
}

