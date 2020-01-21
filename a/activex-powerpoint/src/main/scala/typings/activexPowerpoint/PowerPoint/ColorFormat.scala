package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoThemeColorIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ColorFormat")
@js.native
class ColorFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Brightness: Double = js.native
  val Creator: Double = js.native
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ColorFormat_typekey")
  var PowerPointDotColorFormat_typekey: ColorFormat = js.native
  var RGB: MsoRGBType = js.native
  var SchemeColor: PpColorSchemeIndex = js.native
  var TintAndShade: Double = js.native
  val Type: MsoColorType = js.native
}

