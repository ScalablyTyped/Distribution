package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * object represents a specific geographical, political, or cultural region.
  *
  * An operation that requires a `Locale` to perform its task is called **locale-sensitive** and uses the `Locale` to tailor information for the user. For
  * example, displaying a number is a locale-sensitive operation; the number should be formatted according to the customs/conventions of the user's native
  * country, region, or culture.
  *
  * Because a `Locale` object is just an identifier for a region, no validity check is performed. If you want to see whether particular resources are
  * available for the `Locale` , use the {@link com.sun.star.resource.XLocale.getAvailableLocales()} method to ask for the locales it supports.
  *
  * **Note:** When you ask for a resource for a particular locale, you get the best available match, not necessarily precisely what you asked for. For
  * more information, see {@link com.sun.star.resource.XResourceBundle} .
  *
  * Each implementation that performs locale-sensitive operations allows you to get all the available objects of that type. Use the {@link
  * com.sun.star.resource.XLocale} interface to set the locale.
  */
trait Locale extends js.Object {
  /**
    * specifies an **ISO 3166 Country Code** .
    *
    * These codes are the upper-case two-letter codes as defined by ISO 3166-1. You can find a full list of these codes at a number of sites, such as: ;
    * [`http://www.iso.org/iso/country_codes/iso_3166_code_lists/country_names_and_code_elements.htm`]{@link
    * url="http://www.iso.org/iso/country_codes/iso_3166_code_lists/country_names_and_code_elements.htm"} .
    *
    * If this field contains an empty string, the meaning depends on the context.
    */
  var Country: java.lang.String
  /**
    * specifies an **ISO 639 Language Code** .
    *
    * These codes are preferably the lower-case two-letter codes as defined by ISO 639-1, or three-letter codes as defined by ISO 639-3. You can find a full
    * list of these codes at a number of sites, such as: ; [`http://sil.org/iso639-3/codes.asp`]{@link url="http://sil.org/iso639-3/codes.asp"} .
    *
    * If this field contains an empty string, the meaning depends on the context.
    *
    * Since LibreOffice 4.2, if the locale can not be represented using only ISO 639 and ISO 3166 codes this field contains the ISO 639-3 reserved for local
    * use code "<strong>qlt</strong>" and a **BCP 47** language tag is present in the Variant field.
    */
  var Language: java.lang.String
  /**
    * specifies a **BCP 47** Language Tag.
    *
    * Since LibreOffice 4.2, **if** the Language field is the code "<strong>qlt</strong>" this field contains the full BCP 47 language tag. If the Language
    * field is not "qlt" this field is empty.
    *
    * You can find BCP 47 language tag resources at ; [`http://www.langtag.net/`]{@link url="http://www.langtag.net/"} .
    *
    * Earlier versions of the documentation mentioned "vendor and; browser-specific" codes but that was never supported. Use of any arbitrary strings in the
    * Variant field that do not form a valid BCP 47 language tag is **strongly deprecated** .
    */
  var Variant: java.lang.String
}

