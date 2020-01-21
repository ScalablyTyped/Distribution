package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoPresetTextEffectShape
import typings.activexOffice.Office.MsoTextEffectAlignment
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TextEffectFormat")
@js.native
class TextEffectFormat protected () extends js.Object {
  var Alignment: MsoTextEffectAlignment = js.native
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Excel.TextEffectFormat_typekey")
  var ExcelDotTextEffectFormat_typekey: TextEffectFormat = js.native
  var FontBold: MsoTriState = js.native
  var FontItalic: MsoTriState = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var KernedPairs: MsoTriState = js.native
  var NormalizedHeight: MsoTriState = js.native
  val Parent: js.Any = js.native
  var PresetShape: MsoPresetTextEffectShape = js.native
  var PresetTextEffect: MsoPresetTextEffect = js.native
  var RotatedChars: MsoTriState = js.native
  var Text: String = js.native
  var Tracking: Double = js.native
  def ToggleVerticalText(): Unit = js.native
}

