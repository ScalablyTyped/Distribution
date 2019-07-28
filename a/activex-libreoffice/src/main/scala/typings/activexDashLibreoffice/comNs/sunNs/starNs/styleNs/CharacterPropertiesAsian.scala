package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style of characters in Asian texts. */
trait CharacterPropertiesAsian extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(CharFontCharSetAsian = CharFontCharSetAsian, CharFontFamilyAsian = CharFontFamilyAsian, CharFontNameAsian = CharFontNameAsian, CharFontPitchAsian = CharFontPitchAsian, CharFontStyleNameAsian = CharFontStyleNameAsian, CharHeightAsian = CharHeightAsian, CharLocaleAsian = CharLocaleAsian, CharPostureAsian = CharPostureAsian, CharWeightAsian = CharWeightAsian)
  
    __obj.asInstanceOf[CharacterPropertiesAsian]
  }
}

