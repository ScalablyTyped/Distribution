package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdCode extends js.Object {
  var adCode: java.lang.String
  var city: java.lang.String
}

object Anon_AdCode {
  @scala.inline
  def apply(adCode: java.lang.String, city: java.lang.String): Anon_AdCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adCode")(adCode)
    __obj.updateDynamic("city")(city)
    __obj.asInstanceOf[Anon_AdCode]
  }
}

