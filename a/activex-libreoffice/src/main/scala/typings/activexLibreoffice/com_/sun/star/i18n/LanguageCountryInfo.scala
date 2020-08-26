package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The language and country identifiers and descriptive names of the loaded locale data returned by {@link XLocaleData.getLanguageCountryInfo()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
@js.native
trait LanguageCountryInfo extends js.Object {
  var Country: String = js.native
  var CountryDefaultName: String = js.native
  var Language: String = js.native
  var LanguageDefaultName: String = js.native
  var Variant: String = js.native
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
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], CountryDefaultName = CountryDefaultName.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LanguageDefaultName = LanguageDefaultName.asInstanceOf[js.Any], Variant = Variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageCountryInfo]
  }
  @scala.inline
  implicit class LanguageCountryInfoOps[Self <: LanguageCountryInfo] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryDefaultName(value: String): Self = this.set("CountryDefaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageDefaultName(value: String): Self = this.set("LanguageDefaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariant(value: String): Self = this.set("Variant", value.asInstanceOf[js.Any])
  }
  
}

