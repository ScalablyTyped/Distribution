package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoPresetTextEffectShape
import typings.activexOffice.Office.MsoTextEffectAlignment
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TextEffectFormat")
@js.native
class TextEffectFormat protected ()
  extends typings.activexExcel.Excel.TextEffectFormat {
  /* CompleteClass */
  override var Alignment: MsoTextEffectAlignment = js.native
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  @JSName("Excel.TextEffectFormat_typekey")
  override var ExcelDotTextEffectFormat_typekey: typings.activexExcel.Excel.TextEffectFormat = js.native
  /* CompleteClass */
  override var FontBold: MsoTriState = js.native
  /* CompleteClass */
  override var FontItalic: MsoTriState = js.native
  /* CompleteClass */
  override var FontName: String = js.native
  /* CompleteClass */
  override var FontSize: Double = js.native
  /* CompleteClass */
  override var KernedPairs: MsoTriState = js.native
  /* CompleteClass */
  override var NormalizedHeight: MsoTriState = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PresetShape: MsoPresetTextEffectShape = js.native
  /* CompleteClass */
  override var PresetTextEffect: MsoPresetTextEffect = js.native
  /* CompleteClass */
  override var RotatedChars: MsoTriState = js.native
  /* CompleteClass */
  override var Text: String = js.native
  /* CompleteClass */
  override var Tracking: Double = js.native
  /* CompleteClass */
  override def ToggleVerticalText(): Unit = js.native
}

