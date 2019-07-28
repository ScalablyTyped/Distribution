package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style of characters in complex texts. */
trait CharacterPropertiesComplex extends js.Object {
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: Double
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: Double
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: String
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: Double
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: String
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: Double
  /** contains the value of the locale. */
  var CharLocaleComplex: Locale
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: FontSlant
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: Double
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
    val __obj = js.Dynamic.literal(CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamilyComplex = CharFontFamilyComplex, CharFontNameComplex = CharFontNameComplex, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleNameComplex = CharFontStyleNameComplex, CharHeightComplex = CharHeightComplex, CharLocaleComplex = CharLocaleComplex, CharPostureComplex = CharPostureComplex, CharWeightComplex = CharWeightComplex)
  
    __obj.asInstanceOf[CharacterPropertiesComplex]
  }
}

