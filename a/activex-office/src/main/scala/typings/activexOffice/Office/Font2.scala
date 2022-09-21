package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font2 extends StObject {
  
  var Allcaps: MsoTriState
  
  val Application: Any
  
  var AutorotateNumbers: MsoTriState
  
  var BaselineOffset: Double
  
  var Bold: MsoTriState
  
  var Caps: MsoTextCaps
  
  val Creator: Double
  
  var DoubleStrikeThrough: MsoTriState
  
  val Embeddable: MsoTriState
  
  val Embedded: MsoTriState
  
  var Equalize: MsoTriState
  
  val Fill: FillFormat
  
  val Glow: GlowFormat
  
  val Highlight: ColorFormat
  
  var Italic: MsoTriState
  
  var Kerning: Double
  
  val Line: LineFormat
  
  var Name: String
  
  var NameAscii: String
  
  var NameComplexScript: String
  
  var NameFarEast: String
  
  var NameOther: String
  
  /* private */ @JSName("Office.Font2_typekey")
  var OfficeDotFont2_typekey: Font2
  
  val Parent: Any
  
  val Reflection: ReflectionFormat
  
  val Shadow: ShadowFormat
  
  var Size: Double
  
  var Smallcaps: MsoTriState
  
  var SoftEdgeFormat: MsoSoftEdgeType
  
  var Spacing: Double
  
  var Strike: MsoTextStrike
  
  var StrikeThrough: MsoTriState
  
  var Subscript: MsoTriState
  
  var Superscript: MsoTriState
  
  val UnderlineColor: ColorFormat
  
  var UnderlineStyle: MsoTextUnderlineType
  
  var WordArtformat: MsoPresetTextEffect
}
object Font2 {
  
  inline def apply(
    Allcaps: MsoTriState,
    Application: Any,
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
    Parent: Any,
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
  
  extension [Self <: Font2](x: Self) {
    
    inline def setAllcaps(value: MsoTriState): Self = StObject.set(x, "Allcaps", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAutorotateNumbers(value: MsoTriState): Self = StObject.set(x, "AutorotateNumbers", value.asInstanceOf[js.Any])
    
    inline def setBaselineOffset(value: Double): Self = StObject.set(x, "BaselineOffset", value.asInstanceOf[js.Any])
    
    inline def setBold(value: MsoTriState): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    inline def setCaps(value: MsoTextCaps): Self = StObject.set(x, "Caps", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDoubleStrikeThrough(value: MsoTriState): Self = StObject.set(x, "DoubleStrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setEmbeddable(value: MsoTriState): Self = StObject.set(x, "Embeddable", value.asInstanceOf[js.Any])
    
    inline def setEmbedded(value: MsoTriState): Self = StObject.set(x, "Embedded", value.asInstanceOf[js.Any])
    
    inline def setEqualize(value: MsoTriState): Self = StObject.set(x, "Equalize", value.asInstanceOf[js.Any])
    
    inline def setFill(value: FillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setGlow(value: GlowFormat): Self = StObject.set(x, "Glow", value.asInstanceOf[js.Any])
    
    inline def setHighlight(value: ColorFormat): Self = StObject.set(x, "Highlight", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: MsoTriState): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    inline def setKerning(value: Double): Self = StObject.set(x, "Kerning", value.asInstanceOf[js.Any])
    
    inline def setLine(value: LineFormat): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameAscii(value: String): Self = StObject.set(x, "NameAscii", value.asInstanceOf[js.Any])
    
    inline def setNameComplexScript(value: String): Self = StObject.set(x, "NameComplexScript", value.asInstanceOf[js.Any])
    
    inline def setNameFarEast(value: String): Self = StObject.set(x, "NameFarEast", value.asInstanceOf[js.Any])
    
    inline def setNameOther(value: String): Self = StObject.set(x, "NameOther", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotFont2_typekey(value: Font2): Self = StObject.set(x, "Office.Font2_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReflection(value: ReflectionFormat): Self = StObject.set(x, "Reflection", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: ShadowFormat): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSmallcaps(value: MsoTriState): Self = StObject.set(x, "Smallcaps", value.asInstanceOf[js.Any])
    
    inline def setSoftEdgeFormat(value: MsoSoftEdgeType): Self = StObject.set(x, "SoftEdgeFormat", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "Spacing", value.asInstanceOf[js.Any])
    
    inline def setStrike(value: MsoTextStrike): Self = StObject.set(x, "Strike", value.asInstanceOf[js.Any])
    
    inline def setStrikeThrough(value: MsoTriState): Self = StObject.set(x, "StrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setSubscript(value: MsoTriState): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    inline def setSuperscript(value: MsoTriState): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColor(value: ColorFormat): Self = StObject.set(x, "UnderlineColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlineStyle(value: MsoTextUnderlineType): Self = StObject.set(x, "UnderlineStyle", value.asInstanceOf[js.Any])
    
    inline def setWordArtformat(value: MsoPresetTextEffect): Self = StObject.set(x, "WordArtformat", value.asInstanceOf[js.Any])
  }
}
