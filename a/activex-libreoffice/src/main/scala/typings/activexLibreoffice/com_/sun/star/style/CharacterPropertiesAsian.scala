package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style of characters in Asian texts. */
trait CharacterPropertiesAsian extends StObject {
  
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetAsian: Double
  
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyAsian: Double
  
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameAsian: String
  
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchAsian: Double
  
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameAsian: String
  
  /** This value contains the height of the characters in point. */
  var CharHeightAsian: Double
  
  /** contains the value of the locale. */
  var CharLocaleAsian: Locale
  
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureAsian: FontSlant
  
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightAsian: Double
}
object CharacterPropertiesAsian {
  
  inline def apply(
    CharFontCharSetAsian: Double,
    CharFontFamilyAsian: Double,
    CharFontNameAsian: String,
    CharFontPitchAsian: Double,
    CharFontStyleNameAsian: String,
    CharHeightAsian: Double,
    CharLocaleAsian: Locale,
    CharPostureAsian: FontSlant,
    CharWeightAsian: Double
  ): CharacterPropertiesAsian = {
    val __obj = js.Dynamic.literal(CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterPropertiesAsian]
  }
  
  extension [Self <: CharacterPropertiesAsian](x: Self) {
    
    inline def setCharFontCharSetAsian(value: Double): Self = StObject.set(x, "CharFontCharSetAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontFamilyAsian(value: Double): Self = StObject.set(x, "CharFontFamilyAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontNameAsian(value: String): Self = StObject.set(x, "CharFontNameAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontPitchAsian(value: Double): Self = StObject.set(x, "CharFontPitchAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontStyleNameAsian(value: String): Self = StObject.set(x, "CharFontStyleNameAsian", value.asInstanceOf[js.Any])
    
    inline def setCharHeightAsian(value: Double): Self = StObject.set(x, "CharHeightAsian", value.asInstanceOf[js.Any])
    
    inline def setCharLocaleAsian(value: Locale): Self = StObject.set(x, "CharLocaleAsian", value.asInstanceOf[js.Any])
    
    inline def setCharPostureAsian(value: FontSlant): Self = StObject.set(x, "CharPostureAsian", value.asInstanceOf[js.Any])
    
    inline def setCharWeightAsian(value: Double): Self = StObject.set(x, "CharWeightAsian", value.asInstanceOf[js.Any])
  }
}
