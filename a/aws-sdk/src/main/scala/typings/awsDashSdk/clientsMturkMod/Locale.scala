package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  /**
    *  The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United States of America. 
    */
  var Country: CountryParameters = js.native
  /**
    * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to the state of Washington.
    */
  var Subdivision: js.UndefOr[CountryParameters] = js.native
}

object Locale {
  @scala.inline
  def apply(Country: CountryParameters, Subdivision: CountryParameters = null): Locale = {
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any])
    if (Subdivision != null) __obj.updateDynamic("Subdivision")(Subdivision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

