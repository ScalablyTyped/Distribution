package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoTriState
import typings.activexWord.Word.WdThemeColorIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ColorFormat")
@js.native
class ColorFormat protected ()
  extends typings.activexWord.Word.ColorFormat {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var Black: Double = js.native
  /* CompleteClass */
  override var Brightness: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Cyan: Double = js.native
  /* CompleteClass */
  override var Magenta: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var ObjectThemeColor: WdThemeColorIndex = js.native
  /* CompleteClass */
  override var OverPrint: MsoTriState = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var RGB: Double = js.native
  /* CompleteClass */
  override var SchemeColor: Double = js.native
  /* CompleteClass */
  override var TintAndShade: Double = js.native
  /* CompleteClass */
  override val Type: MsoColorType = js.native
  /* CompleteClass */
  @JSName("Word.ColorFormat_typekey")
  override var WordDotColorFormat_typekey: typings.activexWord.Word.ColorFormat = js.native
  /* CompleteClass */
  override var Yellow: Double = js.native
  /* CompleteClass */
  override def Ink(Index: Double): Double = js.native
  /* CompleteClass */
  override def SetCMYK(Cyan: Double, Magenta: Double, Yellow: Double, Black: Double): Unit = js.native
}

