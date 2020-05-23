package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCode extends js.Object {
  var adCode: String
  var city: String
}

object AdCode {
  @scala.inline
  def apply(adCode: String, city: String): AdCode = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCode]
  }
}

