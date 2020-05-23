package typings.activexWord.Word

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorFormat extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Black: Double
  var Brightness: Double
  val Creator: Double
  var Cyan: Double
  var Magenta: Double
  var Name: String
  var ObjectThemeColor: WdThemeColorIndex
  var OverPrint: MsoTriState
  val Parent: js.Any
  var RGB: Double
  var SchemeColor: Double
  var TintAndShade: Double
  val Type: MsoColorType
  @JSName("Word.ColorFormat_typekey")
  var WordDotColorFormat_typekey: ColorFormat
  var Yellow: Double
  def Ink(Index: Double): Double
  def SetCMYK(Cyan: Double, Magenta: Double, Yellow: Double, Black: Double): Unit
}

object ColorFormat {
  @scala.inline
  def apply(
    Application: Application,
    Black: Double,
    Brightness: Double,
    Creator: Double,
    Cyan: Double,
    Ink: Double => Double,
    Magenta: Double,
    Name: String,
    ObjectThemeColor: WdThemeColorIndex,
    OverPrint: MsoTriState,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    SetCMYK: (Double, Double, Double, Double) => Unit,
    TintAndShade: Double,
    Type: MsoColorType,
    WordDotColorFormat_typekey: ColorFormat,
    Yellow: Double
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Black = Black.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Cyan = Cyan.asInstanceOf[js.Any], Ink = js.Any.fromFunction1(Ink), Magenta = Magenta.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], OverPrint = OverPrint.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], SetCMYK = js.Any.fromFunction4(SetCMYK), TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Yellow = Yellow.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ColorFormat_typekey")(WordDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
}

