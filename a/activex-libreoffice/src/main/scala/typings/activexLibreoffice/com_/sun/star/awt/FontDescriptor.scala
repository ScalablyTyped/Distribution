package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the characteristics of a font.
  *
  * For example, this can be used to select a font.
  */
@js.native
trait FontDescriptor extends StObject {
  
  /**
    * specifies the character set which is supported by the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.CharSet} .
    */
  var CharSet: Double = js.native
  
  /**
    * specifies the character width.
    *
    * Depending on the specified width, a font that supports this width may be selected.
    *
    * The value is expressed as a percentage.
    */
  var CharacterWidth: Double = js.native
  
  /**
    * specifies the general style of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontFamily} .
    */
  var Family: Double = js.native
  
  /** specifies the height of the font in the measure of the destination. */
  var Height: Double = js.native
  
  /** For requesting, it specifies if there is a kerning table available. For selecting, it specifies if the kerning table is to be used. */
  var Kerning: Boolean = js.native
  
  /** specifies the exact name of the font. */
  var Name: String = js.native
  
  /**
    * specifies the rotation of the font.
    *
    * The unit of measure is degrees; 0 is the baseline.
    */
  var Orientation: Double = js.native
  
  /**
    * specifies the pitch of the font.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontPitch} .
    */
  var Pitch: Double = js.native
  
  /** specifies the slant of the font. */
  var Slant: FontSlant = js.native
  
  /**
    * specifies the kind of strikeout.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontStrikeout} .
    */
  var Strikeout: Double = js.native
  
  /** specifies the style name of the font. */
  var StyleName: String = js.native
  
  /**
    * specifies the technology of the font representation.
    *
    * One or more values out of the constant group {@link com.sun.star.awt.FontType} can be combined by an arithmetical or-operation.
    */
  var Type: Double = js.native
  
  /**
    * specifies the kind of underlining.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.FontUnderline} .
    */
  var Underline: Double = js.native
  
  /**
    * specifies the thickness of the line.
    *
    * Depending on the specified weight, a font that supports this thickness may be selected.
    *
    * The value is expressed as a percentage.
    */
  var Weight: Double = js.native
  
  /** specifies the width of the font in the measure of the destination. */
  var Width: Double = js.native
  
  /**
    * specifies if only words get underlined.
    *
    * `TRUE` means that only non-space characters get underlined, `FALSE` means that the spacing also gets underlined.
    *
    * This property is only valid if the property {@link com.sun.star.awt.FontDescriptor.Underline} is not {@link FontUnderline.NONE} .
    */
  var WordLineMode: Boolean = js.native
}
object FontDescriptor {
  
  @scala.inline
  def apply(
    CharSet: Double,
    CharacterWidth: Double,
    Family: Double,
    Height: Double,
    Kerning: Boolean,
    Name: String,
    Orientation: Double,
    Pitch: Double,
    Slant: FontSlant,
    Strikeout: Double,
    StyleName: String,
    Type: Double,
    Underline: Double,
    Weight: Double,
    Width: Double,
    WordLineMode: Boolean
  ): FontDescriptor = {
    val __obj = js.Dynamic.literal(CharSet = CharSet.asInstanceOf[js.Any], CharacterWidth = CharacterWidth.asInstanceOf[js.Any], Family = Family.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Kerning = Kerning.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Pitch = Pitch.asInstanceOf[js.Any], Slant = Slant.asInstanceOf[js.Any], Strikeout = Strikeout.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WordLineMode = WordLineMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontDescriptor]
  }
  
  @scala.inline
  implicit class FontDescriptorMutableBuilder[Self <: FontDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharSet(value: Double): Self = StObject.set(x, "CharSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterWidth(value: Double): Self = StObject.set(x, "CharacterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: Double): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerning(value: Boolean): Self = StObject.set(x, "Kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Double): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "Pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlant(value: FontSlant): Self = StObject.set(x, "Slant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeout(value: Double): Self = StObject.set(x, "Strikeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleName(value: String): Self = StObject.set(x, "StyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: Double): Self = StObject.set(x, "Underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordLineMode(value: Boolean): Self = StObject.set(x, "WordLineMode", value.asInstanceOf[js.Any])
  }
}
