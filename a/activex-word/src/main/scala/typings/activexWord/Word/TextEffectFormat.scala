package typings.activexWord.Word

import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoPresetTextEffectShape
import typings.activexOffice.Office.MsoTextEffectAlignment
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEffectFormat extends js.Object {
  var Alignment: MsoTextEffectAlignment = js.native
  val Application: typings.activexWord.Word.Application = js.native
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
  @JSName("Word.TextEffectFormat_typekey")
  var WordDotTextEffectFormat_typekey: TextEffectFormat = js.native
  def ToggleVerticalText(): Unit = js.native
}

object TextEffectFormat {
  @scala.inline
  def apply(
    Alignment: MsoTextEffectAlignment,
    Application: Application,
    Creator: Double,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    FontName: String,
    FontSize: Double,
    KernedPairs: MsoTriState,
    NormalizedHeight: MsoTriState,
    Parent: js.Any,
    PresetShape: MsoPresetTextEffectShape,
    PresetTextEffect: MsoPresetTextEffect,
    RotatedChars: MsoTriState,
    Text: String,
    ToggleVerticalText: () => Unit,
    Tracking: Double,
    WordDotTextEffectFormat_typekey: TextEffectFormat
  ): TextEffectFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], KernedPairs = KernedPairs.asInstanceOf[js.Any], NormalizedHeight = NormalizedHeight.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetShape = PresetShape.asInstanceOf[js.Any], PresetTextEffect = PresetTextEffect.asInstanceOf[js.Any], RotatedChars = RotatedChars.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], ToggleVerticalText = js.Any.fromFunction0(ToggleVerticalText), Tracking = Tracking.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TextEffectFormat_typekey")(WordDotTextEffectFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEffectFormat]
  }
  @scala.inline
  implicit class TextEffectFormatOps[Self <: TextEffectFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignment(value: MsoTextEffectAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontBold(value: MsoTriState): Self = this.set("FontBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontItalic(value: MsoTriState): Self = this.set("FontItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontName(value: String): Self = this.set("FontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("FontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernedPairs(value: MsoTriState): Self = this.set("KernedPairs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizedHeight(value: MsoTriState): Self = this.set("NormalizedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresetShape(value: MsoPresetTextEffectShape): Self = this.set("PresetShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setPresetTextEffect(value: MsoPresetTextEffect): Self = this.set("PresetTextEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotatedChars(value: MsoTriState): Self = this.set("RotatedChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleVerticalText(value: () => Unit): Self = this.set("ToggleVerticalText", js.Any.fromFunction0(value))
    @scala.inline
    def setTracking(value: Double): Self = this.set("Tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotTextEffectFormat_typekey(value: TextEffectFormat): Self = this.set("Word.TextEffectFormat_typekey", value.asInstanceOf[js.Any])
  }
  
}

