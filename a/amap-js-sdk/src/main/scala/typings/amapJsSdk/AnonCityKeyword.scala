package typings.amapJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCityKeyword extends js.Object {
  var city: String
  var keyword: String
}

object AnonCityKeyword {
  @scala.inline
  def apply(city: String, keyword: String): AnonCityKeyword = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCityKeyword]
  }
}

