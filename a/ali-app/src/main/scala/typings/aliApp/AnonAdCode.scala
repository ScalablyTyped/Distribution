package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdCode extends js.Object {
  var adCode: String
  var city: String
}

object AnonAdCode {
  @scala.inline
  def apply(adCode: String, city: String): AnonAdCode = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdCode]
  }
}

