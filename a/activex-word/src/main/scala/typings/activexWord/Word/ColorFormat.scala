package typings.activexWord.Word

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ColorFormat")
@js.native
class ColorFormat protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Black: Double = js.native
  var Brightness: Double = js.native
  val Creator: Double = js.native
  var Cyan: Double = js.native
  var Magenta: Double = js.native
  var Name: String = js.native
  var ObjectThemeColor: WdThemeColorIndex = js.native
  var OverPrint: MsoTriState = js.native
  val Parent: js.Any = js.native
  var RGB: Double = js.native
  var SchemeColor: Double = js.native
  var TintAndShade: Double = js.native
  val Type: MsoColorType = js.native
  @JSName("Word.ColorFormat_typekey")
  var WordDotColorFormat_typekey: ColorFormat = js.native
  var Yellow: Double = js.native
  def Ink(Index: Double): Double = js.native
  def SetCMYK(Cyan: Double, Magenta: Double, Yellow: Double, Black: Double): Unit = js.native
}

