package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var AutoRotateNumbers: MsoTriState
  
  var BaselineOffset: Double
  
  var Bold: MsoTriState
  
  val Color: ColorFormat
  
  val Embeddable: MsoTriState
  
  val Embedded: MsoTriState
  
  var Emboss: MsoTriState
  
  var Italic: MsoTriState
  
  var Name: String
  
  var NameAscii: String
  
  var NameComplexScript: String
  
  var NameFarEast: String
  
  var NameOther: String
  
  val Parent: js.Any
  
  @JSName("PowerPoint.Font_typekey")
  var PowerPointDotFont_typekey: Font
  
  var Shadow: MsoTriState
  
  var Size: Double
  
  var Subscript: MsoTriState
  
  var Superscript: MsoTriState
  
  var Underline: MsoTriState
}
object Font {
  
  @scala.inline
  def apply(
    Application: Application,
    AutoRotateNumbers: MsoTriState,
    BaselineOffset: Double,
    Bold: MsoTriState,
    Color: ColorFormat,
    Embeddable: MsoTriState,
    Embedded: MsoTriState,
    Emboss: MsoTriState,
    Italic: MsoTriState,
    Name: String,
    NameAscii: String,
    NameComplexScript: String,
    NameFarEast: String,
    NameOther: String,
    Parent: js.Any,
    PowerPointDotFont_typekey: Font,
    Shadow: MsoTriState,
    Size: Double,
    Subscript: MsoTriState,
    Superscript: MsoTriState,
    Underline: MsoTriState
  ): Font = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoRotateNumbers = AutoRotateNumbers.asInstanceOf[js.Any], BaselineOffset = BaselineOffset.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Embeddable = Embeddable.asInstanceOf[js.Any], Embedded = Embedded.asInstanceOf[js.Any], Emboss = Emboss.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameAscii = NameAscii.asInstanceOf[js.Any], NameComplexScript = NameComplexScript.asInstanceOf[js.Any], NameFarEast = NameFarEast.asInstanceOf[js.Any], NameOther = NameOther.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Font_typekey")(PowerPointDotFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateNumbers(value: MsoTriState): Self = StObject.set(x, "AutoRotateNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineOffset(value: Double): Self = StObject.set(x, "BaselineOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: MsoTriState): Self = StObject.set(x, "Bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ColorFormat): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddable(value: MsoTriState): Self = StObject.set(x, "Embeddable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedded(value: MsoTriState): Self = StObject.set(x, "Embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmboss(value: MsoTriState): Self = StObject.set(x, "Emboss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: MsoTriState): Self = StObject.set(x, "Italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameAscii(value: String): Self = StObject.set(x, "NameAscii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameComplexScript(value: String): Self = StObject.set(x, "NameComplexScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFarEast(value: String): Self = StObject.set(x, "NameFarEast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameOther(value: String): Self = StObject.set(x, "NameOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotFont_typekey(value: Font): Self = StObject.set(x, "PowerPoint.Font_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadow(value: MsoTriState): Self = StObject.set(x, "Shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscript(value: MsoTriState): Self = StObject.set(x, "Subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperscript(value: MsoTriState): Self = StObject.set(x, "Superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: MsoTriState): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
  }
}
