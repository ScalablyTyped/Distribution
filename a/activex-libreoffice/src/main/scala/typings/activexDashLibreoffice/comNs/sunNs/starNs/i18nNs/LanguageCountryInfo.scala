package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The language and country identifiers and descriptive names of the loaded locale data returned by {@link XLocaleData.getLanguageCountryInfo()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait LanguageCountryInfo extends js.Object {
  var Country: String
  var CountryDefaultName: String
  var Language: String
  var LanguageDefaultName: String
  var Variant: String
}

object LanguageCountryInfo {
  @scala.inline
  def apply(
    Country: String,
    CountryDefaultName: String,
    Language: String,
    LanguageDefaultName: String,
    Variant: String
  ): LanguageCountryInfo = {
    val __obj = js.Dynamic.literal(Country = Country, CountryDefaultName = CountryDefaultName, Language = Language, LanguageDefaultName = LanguageDefaultName, Variant = Variant)
  
    __obj.asInstanceOf[LanguageCountryInfo]
  }
}

