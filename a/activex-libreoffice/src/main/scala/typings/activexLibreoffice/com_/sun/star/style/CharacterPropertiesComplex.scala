package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style of characters in complex texts. */
@js.native
trait CharacterPropertiesComplex extends js.Object {
  
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: Double = js.native
  
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: Double = js.native
  
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: String = js.native
  
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: Double = js.native
  
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: String = js.native
  
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: Double = js.native
  
  /** contains the value of the locale. */
  var CharLocaleComplex: Locale = js.native
  
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: FontSlant = js.native
  
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: Double = js.native
}
object CharacterPropertiesComplex {
  
  @scala.inline
  def apply(
    CharFontCharSetComplex: Double,
    CharFontFamilyComplex: Double,
    CharFontNameComplex: String,
    CharFontPitchComplex: Double,
    CharFontStyleNameComplex: String,
    CharHeightComplex: Double,
    CharLocaleComplex: Locale,
    CharPostureComplex: FontSlant,
    CharWeightComplex: Double
  ): CharacterPropertiesComplex = {
    val __obj = js.Dynamic.literal(CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterPropertiesComplex]
  }
  
  @scala.inline
  implicit class CharacterPropertiesComplexOps[Self <: CharacterPropertiesComplex] (val x: Self) extends AnyVal {
    
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
    def setCharFontCharSetComplex(value: Double): Self = this.set("CharFontCharSetComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharFontFamilyComplex(value: Double): Self = this.set("CharFontFamilyComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharFontNameComplex(value: String): Self = this.set("CharFontNameComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharFontPitchComplex(value: Double): Self = this.set("CharFontPitchComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharFontStyleNameComplex(value: String): Self = this.set("CharFontStyleNameComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharHeightComplex(value: Double): Self = this.set("CharHeightComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharLocaleComplex(value: Locale): Self = this.set("CharLocaleComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharPostureComplex(value: FontSlant): Self = this.set("CharPostureComplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharWeightComplex(value: Double): Self = this.set("CharWeightComplex", value.asInstanceOf[js.Any])
  }
}
