package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdCode extends js.Object {
  var adCode: String
  var city: String
}

object Anon_AdCode {
  @scala.inline
  def apply(adCode: String, city: String): Anon_AdCode = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AdCode]
  }
}

