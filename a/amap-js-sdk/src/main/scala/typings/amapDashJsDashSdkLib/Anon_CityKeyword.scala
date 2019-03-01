package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CityKeyword extends js.Object {
  var city: java.lang.String
  var keyword: java.lang.String
}

object Anon_CityKeyword {
  @scala.inline
  def apply(city: java.lang.String, keyword: java.lang.String): Anon_CityKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("keyword")(keyword)
    __obj.asInstanceOf[Anon_CityKeyword]
  }
}

