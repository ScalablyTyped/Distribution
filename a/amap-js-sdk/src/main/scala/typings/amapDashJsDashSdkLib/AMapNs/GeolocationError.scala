package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var info: java.lang.String
}

object GeolocationError {
  @scala.inline
  def apply(info: java.lang.String): GeolocationError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info)
    __obj.asInstanceOf[GeolocationError]
  }
}

