package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style of characters in Asian texts. */
trait CharacterPropertiesAsian extends js.Object {
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetAsian: scala.Double
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyAsian: scala.Double
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameAsian: java.lang.String
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchAsian: scala.Double
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameAsian: java.lang.String
  /** This value contains the height of the characters in point. */
  var CharHeightAsian: scala.Double
  /** contains the value of the locale. */
  var CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightAsian: scala.Double
}

object CharacterPropertiesAsian {
  @scala.inline
  def apply(
    CharFontCharSetAsian: scala.Double,
    CharFontFamilyAsian: scala.Double,
    CharFontNameAsian: java.lang.String,
    CharFontPitchAsian: scala.Double,
    CharFontStyleNameAsian: java.lang.String,
    CharHeightAsian: scala.Double,
    CharLocaleAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharPostureAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharWeightAsian: scala.Double
  ): CharacterPropertiesAsian = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CharFontCharSetAsian")(CharFontCharSetAsian)
    __obj.updateDynamic("CharFontFamilyAsian")(CharFontFamilyAsian)
    __obj.updateDynamic("CharFontNameAsian")(CharFontNameAsian)
    __obj.updateDynamic("CharFontPitchAsian")(CharFontPitchAsian)
    __obj.updateDynamic("CharFontStyleNameAsian")(CharFontStyleNameAsian)
    __obj.updateDynamic("CharHeightAsian")(CharHeightAsian)
    __obj.updateDynamic("CharLocaleAsian")(CharLocaleAsian)
    __obj.updateDynamic("CharPostureAsian")(CharPostureAsian)
    __obj.updateDynamic("CharWeightAsian")(CharWeightAsian)
    __obj.asInstanceOf[CharacterPropertiesAsian]
  }
}

