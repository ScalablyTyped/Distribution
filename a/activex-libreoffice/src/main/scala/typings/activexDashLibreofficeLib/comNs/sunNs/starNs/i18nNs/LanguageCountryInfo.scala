package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The language and country identifiers and descriptive names of the loaded locale data returned by {@link XLocaleData.getLanguageCountryInfo()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait LanguageCountryInfo extends js.Object {
  var Country: java.lang.String
  var CountryDefaultName: java.lang.String
  var Language: java.lang.String
  var LanguageDefaultName: java.lang.String
  var Variant: java.lang.String
}

object LanguageCountryInfo {
  @scala.inline
  def apply(
    Country: java.lang.String,
    CountryDefaultName: java.lang.String,
    Language: java.lang.String,
    LanguageDefaultName: java.lang.String,
    Variant: java.lang.String
  ): LanguageCountryInfo = {
    val __obj = js.Dynamic.literal(Country = Country, CountryDefaultName = CountryDefaultName, Language = Language, LanguageDefaultName = LanguageDefaultName, Variant = Variant)
  
    __obj.asInstanceOf[LanguageCountryInfo]
  }
}

