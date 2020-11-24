package typings.activexWord.Word

import typings.activexWord.activexWordNumbers.`9999998`
import typings.activexWord.activexWordNumbers.`9999999`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends js.Object {
  
  var AllCaps: Boolean | `9999999` | `9999998` = js.native
  
  var Animation: WdAnimation = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Bold: Boolean | `9999999` | `9999998` = js.native
  
  var BoldBi: Boolean | `9999999` | `9999998` = js.native
  
  var Borders: typings.activexWord.Word.Borders = js.native
  
  var Color: WdColor = js.native
  
  var ColorIndex: WdColorIndex = js.native
  
  var ColorIndexBi: WdColorIndex = js.native
  
  var ContextualAlternates: Double = js.native
  
  val Creator: Double = js.native
  
  var DiacriticColor: WdColor = js.native
  
  var DisableCharacterSpaceGrid: Boolean = js.native
  
  var DoubleStrikeThrough: Double = js.native
  
  val Duplicate: Font = js.native
  
  var Emboss: Boolean | `9999999` | `9999998` = js.native
  
  var EmphasisMark: WdEmphasisMark = js.native
  
  var Engrave: Boolean | `9999999` | `9999998` = js.native
  
  var Fill: FillFormat = js.native
  
  var Glow: GlowFormat = js.native
  
  def Grow(): Unit = js.native
  
  var Hidden: Double = js.native
  
  var Italic: Boolean | `9999999` | `9999998` = js.native
  
  var ItalicBi: Boolean | `9999999` | `9999998` = js.native
  
  var Kerning: Double = js.native
  
  var Ligatures: WdLigatures = js.native
  
  var Line: LineFormat = js.native
  
  var Name: String = js.native
  
  var NameAscii: String = js.native
  
  var NameBi: String = js.native
  
  var NameFarEast: String = js.native
  
  var NameOther: String = js.native
  
  var NumberForm: WdNumberForm = js.native
  
  var NumberSpacing: WdNumberSpacing = js.native
  
  var Outline: Double = js.native
  
  val Parent: js.Any = js.native
  
  var Position: Double = js.native
  
  var Reflection: ReflectionFormat = js.native
  
  def Reset(): Unit = js.native
  
  var Scaling: Double = js.native
  
  def SetAsTemplateDefault(): Unit = js.native
  
  val Shading: typings.activexWord.Word.Shading = js.native
  
  var Shadow: Double = js.native
  
  def Shrink(): Unit = js.native
  
  var Size: Double = js.native
  
  var SizeBi: Double = js.native
  
  var SmallCaps: Boolean | `9999999` | `9999998` = js.native
  
  var Spacing: Double = js.native
  
  var StrikeThrough: Double = js.native
  
  var StylisticSet: WdStylisticSet = js.native
  
  var Subscript: Boolean | `9999999` | `9999998` = js.native
  
  var Superscript: Boolean | `9999999` | `9999998` = js.native
  
  val TextColor: ColorFormat = js.native
  
  var TextShadow: ShadowFormat = js.native
  
  var ThreeD: ThreeDFormat = js.native
  
  var Underline: WdUnderline = js.native
  
  var UnderlineColor: WdColor = js.native
  
  @JSName("Word.Font_typekey")
  var WordDotFont_typekey: Font = js.native
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
  
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    
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
    def setAllCaps(value: Boolean | `9999999` | `9999998`): Self = this.set("AllCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: WdAnimation): Self = this.set("Animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: Boolean | `9999999` | `9999998`): Self = this.set("Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldBi(value: Boolean | `9999999` | `9999998`): Self = this.set("BoldBi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorders(value: Borders): Self = this.set("Borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: WdColor): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndex(value: WdColorIndex): Self = this.set("ColorIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIndexBi(value: WdColorIndex): Self = this.set("ColorIndexBi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextualAlternates(value: Double): Self = this.set("ContextualAlternates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiacriticColor(value: WdColor): Self = this.set("DiacriticColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCharacterSpaceGrid(value: Boolean): Self = this.set("DisableCharacterSpaceGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleStrikeThrough(value: Double): Self = this.set("DoubleStrikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicate(value: Font): Self = this.set("Duplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmboss(value: Boolean | `9999999` | `9999998`): Self = this.set("Emboss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmphasisMark(value: WdEmphasisMark): Self = this.set("EmphasisMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngrave(value: Boolean | `9999999` | `9999998`): Self = this.set("Engrave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: FillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlow(value: GlowFormat): Self = this.set("Glow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrow(value: () => Unit): Self = this.set("Grow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHidden(value: Double): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean | `9999999` | `9999998`): Self = this.set("Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicBi(value: Boolean | `9999999` | `9999998`): Self = this.set("ItalicBi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerning(value: Double): Self = this.set("Kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLigatures(value: WdLigatures): Self = this.set("Ligatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: LineFormat): Self = this.set("Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameAscii(value: String): Self = this.set("NameAscii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameBi(value: String): Self = this.set("NameBi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFarEast(value: String): Self = this.set("NameFarEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOther(value: String): Self = this.set("NameOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberForm(value: WdNumberForm): Self = this.set("NumberForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberSpacing(value: WdNumberSpacing): Self = this.set("NumberSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: Double): Self = this.set("Outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReflection(value: ReflectionFormat): Self = this.set("Reflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScaling(value: Double): Self = this.set("Scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAsTemplateDefault(value: () => Unit): Self = this.set("SetAsTemplateDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShading(value: Shading): Self = this.set("Shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: Double): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrink(value: () => Unit): Self = this.set("Shrink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBi(value: Double): Self = this.set("SizeBi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallCaps(value: Boolean | `9999999` | `9999998`): Self = this.set("SmallCaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("Spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeThrough(value: Double): Self = this.set("StrikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylisticSet(value: WdStylisticSet): Self = this.set("StylisticSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscript(value: Boolean | `9999999` | `9999998`): Self = this.set("Subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscript(value: Boolean | `9999999` | `9999998`): Self = this.set("Superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: ColorFormat): Self = this.set("TextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadow(value: ShadowFormat): Self = this.set("TextShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeD(value: ThreeDFormat): Self = this.set("ThreeD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: WdUnderline): Self = this.set("Underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineColor(value: WdColor): Self = this.set("UnderlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotFont_typekey(value: Font): Self = this.set("Word.Font_typekey", value.asInstanceOf[js.Any])
  }
}
