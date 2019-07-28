package typings.activexDashWord.WordNs

import typings.activexDashOffice.OfficeNs.MsoPresetTextEffect
import typings.activexDashOffice.OfficeNs.MsoPresetTextEffectShape
import typings.activexDashOffice.OfficeNs.MsoTextEffectAlignment
import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TextEffectFormat")
@js.native
class TextEffectFormat protected () extends js.Object {
  var Alignment: MsoTextEffectAlignment = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Creator: Double = js.native
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
  var `Word.TextEffectFormat_typekey`: TextEffectFormat = js.native
  def ToggleVerticalText(): Unit = js.native
}

