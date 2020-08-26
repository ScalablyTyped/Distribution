package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Font2 extends js.Object {
  var Allcaps: MsoTriState = js.native
  val Application: js.Any = js.native
  var AutorotateNumbers: MsoTriState = js.native
  var BaselineOffset: Double = js.native
  var Bold: MsoTriState = js.native
  var Caps: MsoTextCaps = js.native
  val Creator: Double = js.native
  var DoubleStrikeThrough: MsoTriState = js.native
  val Embeddable: MsoTriState = js.native
  val Embedded: MsoTriState = js.native
  var Equalize: MsoTriState = js.native
  val Fill: FillFormat = js.native
  val Glow: GlowFormat = js.native
  val Highlight: ColorFormat = js.native
  var Italic: MsoTriState = js.native
  var Kerning: Double = js.native
  val Line: LineFormat = js.native
  var Name: String = js.native
  var NameAscii: String = js.native
  var NameComplexScript: String = js.native
  var NameFarEast: String = js.native
  var NameOther: String = js.native
  @JSName("Office.Font2_typekey")
  var OfficeDotFont2_typekey: Font2 = js.native
  val Parent: js.Any = js.native
  val Reflection: ReflectionFormat = js.native
  val Shadow: ShadowFormat = js.native
  var Size: Double = js.native
  var Smallcaps: MsoTriState = js.native
  var SoftEdgeFormat: MsoSoftEdgeType = js.native
  var Spacing: Double = js.native
  var Strike: MsoTextStrike = js.native
  var StrikeThrough: MsoTriState = js.native
  var Subscript: MsoTriState = js.native
  var Superscript: MsoTriState = js.native
  val UnderlineColor: ColorFormat = js.native
  var UnderlineStyle: MsoTextUnderlineType = js.native
  var WordArtformat: MsoPresetTextEffect = js.native
}

object Font2 {
  @scala.inline
  def apply(
    Allcaps: MsoTriState,
    Application: js.Any,
    AutorotateNumbers: MsoTriState,
    BaselineOffset: Double,
    Bold: MsoTriState,
    Caps: MsoTextCaps,
    Creator: Double,
    DoubleStrikeThrough: MsoTriState,
    Embeddable: MsoTriState,
    Embedded: MsoTriState,
    Equalize: MsoTriState,
    Fill: FillFormat,
    Glow: GlowFormat,
    Highlight: ColorFormat,
    Italic: MsoTriState,
    Kerning: Double,
    Line: LineFormat,
    Name: String,
    NameAscii: String,
    NameComplexScript: String,
    NameFarEast: String,
    NameOther: String,
    OfficeDotFont2_typekey: Font2,
    Parent: js.Any,
    Reflection: ReflectionFormat,
    Shadow: ShadowFormat,
    Size: Double,
    Smallcaps: MsoTriState,
    SoftEdgeFormat: MsoSoftEdgeType,
    Spacing: Double,
    Strike: MsoTextStrike,
    StrikeThrough: MsoTriState,
    Subscript: MsoTriState,
    Superscript: MsoTriState,
    UnderlineColor: ColorFormat,
    UnderlineStyle: MsoTextUnderlineType,
    WordArtformat: MsoPresetTextEffect
  ): Font2 = {
    val __obj = js.Dynamic.literal(Allcaps = Allcaps.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutorotateNumbers = AutorotateNumbers.asInstanceOf[js.Any], BaselineOffset = BaselineOffset.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Caps = Caps.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DoubleStrikeThrough = DoubleStrikeThrough.asInstanceOf[js.Any], Embeddable = Embeddable.asInstanceOf[js.Any], Embedded = Embedded.asInstanceOf[js.Any], Equalize = Equalize.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Glow = Glow.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Kerning = Kerning.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameComplexScript = NameComplexScript.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reflection = Reflection.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Smallcaps = Smallcaps.asInstanceOf[js.Any], SoftEdgeFormat = SoftEdgeFormat.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], Strike = Strike.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], UnderlineColor = UnderlineColor.asInstanceOf[js.Any], UnderlineStyle = UnderlineStyle.asInstanceOf[js.Any], WordArtformat = WordArtformat.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Font2_typekey")(OfficeDotFont2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font2]
  }
  @scala.inline
  implicit class Font2Ops[Self <: Font2] (val x: Self) extends AnyVal {
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
    def setAllcaps(value: MsoTriState): Self = this.set("Allcaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutorotateNumbers(value: MsoTriState): Self = this.set("AutorotateNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaselineOffset(value: Double): Self = this.set("BaselineOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setBold(value: MsoTriState): Self = this.set("Bold", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaps(value: MsoTextCaps): Self = this.set("Caps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoubleStrikeThrough(value: MsoTriState): Self = this.set("DoubleStrikeThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbeddable(value: MsoTriState): Self = this.set("Embeddable", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbedded(value: MsoTriState): Self = this.set("Embedded", value.asInstanceOf[js.Any])
    @scala.inline
    def setEqualize(value: MsoTriState): Self = this.set("Equalize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: FillFormat): Self = this.set("Fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlow(value: GlowFormat): Self = this.set("Glow", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight(value: ColorFormat): Self = this.set("Highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setItalic(value: MsoTriState): Self = this.set("Italic", value.asInstanceOf[js.Any])
    @scala.inline
    def setKerning(value: Double): Self = this.set("Kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: LineFormat): Self = this.set("Line", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameAscii(value: String): Self = this.set("NameAscii", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameComplexScript(value: String): Self = this.set("NameComplexScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameFarEast(value: String): Self = this.set("NameFarEast", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameOther(value: String): Self = this.set("NameOther", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotFont2_typekey(value: Font2): Self = this.set("Office.Font2_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReflection(value: ReflectionFormat): Self = this.set("Reflection", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadow(value: ShadowFormat): Self = this.set("Shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmallcaps(value: MsoTriState): Self = this.set("Smallcaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoftEdgeFormat(value: MsoSoftEdgeType): Self = this.set("SoftEdgeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpacing(value: Double): Self = this.set("Spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrike(value: MsoTextStrike): Self = this.set("Strike", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrikeThrough(value: MsoTriState): Self = this.set("StrikeThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscript(value: MsoTriState): Self = this.set("Subscript", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperscript(value: MsoTriState): Self = this.set("Superscript", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderlineColor(value: ColorFormat): Self = this.set("UnderlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderlineStyle(value: MsoTextUnderlineType): Self = this.set("UnderlineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordArtformat(value: MsoPresetTextEffect): Self = this.set("WordArtformat", value.asInstanceOf[js.Any])
  }
  
}

