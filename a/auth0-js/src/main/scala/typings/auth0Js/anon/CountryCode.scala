package typings.auth0Js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryCode extends js.Object {
  var countryCode: String
}

object CountryCode {
  @scala.inline
  def apply(countryCode: String): CountryCode = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryCode]
  }
}

