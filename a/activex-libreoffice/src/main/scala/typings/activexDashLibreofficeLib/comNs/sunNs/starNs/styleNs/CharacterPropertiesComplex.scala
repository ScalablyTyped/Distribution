package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style of characters in complex texts. */
trait CharacterPropertiesComplex extends js.Object {
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: scala.Double
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: scala.Double
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: java.lang.String
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: scala.Double
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: java.lang.String
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: scala.Double
  /** contains the value of the locale. */
  var CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: scala.Double
}

object CharacterPropertiesComplex {
  @scala.inline
  def apply(
    CharFontCharSetComplex: scala.Double,
    CharFontFamilyComplex: scala.Double,
    CharFontNameComplex: java.lang.String,
    CharFontPitchComplex: scala.Double,
    CharFontStyleNameComplex: java.lang.String,
    CharHeightComplex: scala.Double,
    CharLocaleComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharPostureComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharWeightComplex: scala.Double
  ): CharacterPropertiesComplex = {
    val __obj = js.Dynamic.literal(CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamilyComplex = CharFontFamilyComplex, CharFontNameComplex = CharFontNameComplex, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleNameComplex = CharFontStyleNameComplex, CharHeightComplex = CharHeightComplex, CharLocaleComplex = CharLocaleComplex, CharPostureComplex = CharPostureComplex, CharWeightComplex = CharWeightComplex)
  
    __obj.asInstanceOf[CharacterPropertiesComplex]
  }
}

