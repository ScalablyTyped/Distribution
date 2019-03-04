package typings
package actionsDashOnDashGoogleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressLines extends js.Object {
  var addressLines: js.Array[java.lang.String]
  var administrativeArea: java.lang.String
  var languageCode: java.lang.String
  var locality: java.lang.String
  var postalCode: java.lang.String
  var recipients: java.lang.String
  var regionCode: java.lang.String
}

object Anon_AddressLines {
  @scala.inline
  def apply(
    addressLines: js.Array[java.lang.String],
    administrativeArea: java.lang.String,
    languageCode: java.lang.String,
    locality: java.lang.String,
    postalCode: java.lang.String,
    recipients: java.lang.String,
    regionCode: java.lang.String
  ): Anon_AddressLines = {
    val __obj = js.Dynamic.literal(addressLines = addressLines, administrativeArea = administrativeArea, languageCode = languageCode, locality = locality, postalCode = postalCode, recipients = recipients, regionCode = regionCode)
  
    __obj.asInstanceOf[Anon_AddressLines]
  }
}

