package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var info: String
}

object GeolocationError {
  @scala.inline
  def apply(info: String): GeolocationError = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeolocationError]
  }
}

