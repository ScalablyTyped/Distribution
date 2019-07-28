package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressLines extends js.Object {
  var addressLines: js.Array[String]
  var administrativeArea: String
  var languageCode: String
  var locality: String
  var postalCode: String
  var recipients: String
  var regionCode: String
}

object Anon_AddressLines {
  @scala.inline
  def apply(
    addressLines: js.Array[String],
    administrativeArea: String,
    languageCode: String,
    locality: String,
    postalCode: String,
    recipients: String,
    regionCode: String
  ): Anon_AddressLines = {
    val __obj = js.Dynamic.literal(addressLines = addressLines, administrativeArea = administrativeArea, languageCode = languageCode, locality = locality, postalCode = postalCode, recipients = recipients, regionCode = regionCode)
  
    __obj.asInstanceOf[Anon_AddressLines]
  }
}

