package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    *  The country of the locale. Must be a valid ISO 3166 country code. For example, the code US refers to the United States of America. 
    */
  var Country: CountryParameters
  /**
    * The state or subdivision of the locale. A valid ISO 3166-2 subdivision code. For example, the code WA refers to the state of Washington.
    */
  var Subdivision: js.UndefOr[CountryParameters] = js.undefined
}

object Locale {
  @scala.inline
  def apply(Country: CountryParameters, Subdivision: CountryParameters = null): Locale = {
    val __obj = js.Dynamic.literal(Country = Country)
    if (Subdivision != null) __obj.updateDynamic("Subdivision")(Subdivision)
    __obj.asInstanceOf[Locale]
  }
}

