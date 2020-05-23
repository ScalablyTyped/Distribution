package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`9999998`
import typings.activexWord.activexWordNumbers.`9999999`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var AllCaps: Boolean | `9999999` | `9999998`
  var Animation: WdAnimation
  val Application: typings.activexWord.Word.Application
  var Bold: Boolean | `9999999` | `9999998`
  var BoldBi: Boolean | `9999999` | `9999998`
  var Borders: typings.activexWord.Word.Borders
  var Color: WdColor
  var ColorIndex: WdColorIndex
  var ColorIndexBi: WdColorIndex
  var ContextualAlternates: Double
  val Creator: Double
  var DiacriticColor: WdColor
  var DisableCharacterSpaceGrid: Boolean
  var DoubleStrikeThrough: Double
  val Duplicate: Font
  var Emboss: Boolean | `9999999` | `9999998`
  var EmphasisMark: WdEmphasisMark
  var Engrave: Boolean | `9999999` | `9999998`
  var Fill: FillFormat
  var Glow: GlowFormat
  var Hidden: Double
  var Italic: Boolean | `9999999` | `9999998`
  var ItalicBi: Boolean | `9999999` | `9999998`
  var Kerning: Double
  var Ligatures: WdLigatures
  var Line: LineFormat
  var Name: String
  var NameAscii: String
  var NameBi: String
  var NameFarEast: String
  var NameOther: String
  var NumberForm: WdNumberForm
  var NumberSpacing: WdNumberSpacing
  var Outline: Double
  val Parent: js.Any
  var Position: Double
  var Reflection: ReflectionFormat
  var Scaling: Double
  val Shading: typings.activexWord.Word.Shading
  var Shadow: Double
  var Size: Double
  var SizeBi: Double
  var SmallCaps: Boolean | `9999999` | `9999998`
  var Spacing: Double
  var StrikeThrough: Double
  var StylisticSet: WdStylisticSet
  var Subscript: Boolean | `9999999` | `9999998`
  var Superscript: Boolean | `9999999` | `9999998`
  val TextColor: ColorFormat
  var TextShadow: ShadowFormat
  var ThreeD: ThreeDFormat
  var Underline: WdUnderline
  var UnderlineColor: WdColor
  @JSName("Word.Font_typekey")
  var WordDotFont_typekey: Font
  def Grow(): Unit
  def Reset(): Unit
  def SetAsTemplateDefault(): Unit
  def Shrink(): Unit
}

object Font {
  @scala.inline
  def apply(
    AllCaps: Boolean | `9999999` | `9999998`,
    Animation: WdAnimation,
    Application: Application,
    Bold: Boolean | `9999999` | `9999998`,
    BoldBi: Boolean | `9999999` | `9999998`,
    Borders: Borders,
    Color: WdColor,
    ColorIndex: WdColorIndex,
    ColorIndexBi: WdColorIndex,
    ContextualAlternates: Double,
    Creator: Double,
    DiacriticColor: WdColor,
    DisableCharacterSpaceGrid: Boolean,
    DoubleStrikeThrough: Double,
    Duplicate: Font,
    Emboss: Boolean | `9999999` | `9999998`,
    EmphasisMark: WdEmphasisMark,
    Engrave: Boolean | `9999999` | `9999998`,
    Fill: FillFormat,
    Glow: GlowFormat,
    Grow: () => Unit,
    Hidden: Double,
    Italic: Boolean | `9999999` | `9999998`,
    ItalicBi: Boolean | `9999999` | `9999998`,
    Kerning: Double,
    Ligatures: WdLigatures,
    Line: LineFormat,
    Name: String,
    NameAscii: String,
    NameBi: String,
    NameFarEast: String,
    NameOther: String,
    NumberForm: WdNumberForm,
    NumberSpacing: WdNumberSpacing,
    Outline: Double,
    Parent: js.Any,
    Position: Double,
    Reflection: ReflectionFormat,
    Reset: () => Unit,
    Scaling: Double,
    SetAsTemplateDefault: () => Unit,
    Shading: Shading,
    Shadow: Double,
    Shrink: () => Unit,
    Size: Double,
    SizeBi: Double,
    SmallCaps: Boolean | `9999999` | `9999998`,
    Spacing: Double,
    StrikeThrough: Double,
    StylisticSet: WdStylisticSet,
    Subscript: Boolean | `9999999` | `9999998`,
    Superscript: Boolean | `9999999` | `9999998`,
    TextColor: ColorFormat,
    TextShadow: ShadowFormat,
    ThreeD: ThreeDFormat,
    Underline: WdUnderline,
    UnderlineColor: WdColor,
    WordDotFont_typekey: Font
  ): Font = {
    val __obj = js.Dynamic.literal(AllCaps = AllCaps.asInstanceOf[js.Any], Animation = Animation.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], BoldBi = BoldBi.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], ColorIndexBi = ColorIndexBi.asInstanceOf[js.Any], ContextualAlternates = ContextualAlternates.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DiacriticColor = DiacriticColor.asInstanceOf[js.Any], DisableCharacterSpaceGrid = DisableCharacterSpaceGrid.asInstanceOf[js.Any], DoubleStrikeThrough = DoubleStrikeThrough.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], Emboss = Emboss.asInstanceOf[js.Any], EmphasisMark = EmphasisMark.asInstanceOf[js.Any], Engrave = Engrave.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Grow = js.Any.fromFunction0(Grow), Hidden = Hidden.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], ItalicBi = ItalicBi.asInstanceOf[js.Any], Kerning = Kerning.asInstanceOf[js.Any], Ligatures = Ligatures.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameBi = NameBi.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], NumberForm = NumberForm.asInstanceOf[js.Any], NumberSpacing = NumberSpacing.asInstanceOf[js.Any], Outline = Outline.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Reset = js.Any.fromFunction0(Reset), Scaling = Scaling.asInstanceOf[js.Any], SetAsTemplateDefault = js.Any.fromFunction0(SetAsTemplateDefault), Shading = Shading.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Shrink = js.Any.fromFunction0(Shrink), Size = Size.asInstanceOf[js.Any], SizeBi = SizeBi.asInstanceOf[js.Any], SmallCaps = SmallCaps.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], StylisticSet = StylisticSet.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextShadow = TextShadow.asInstanceOf[js.Any], ThreeD = ThreeD.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], UnderlineColor = UnderlineColor.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Font_typekey")(WordDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

