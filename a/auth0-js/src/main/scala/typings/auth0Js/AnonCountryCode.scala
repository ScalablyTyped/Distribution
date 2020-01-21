package typings.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountryCode extends js.Object {
  var countryCode: String
}

object AnonCountryCode {
  @scala.inline
  def apply(countryCode: String): AnonCountryCode = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCountryCode]
  }
}

