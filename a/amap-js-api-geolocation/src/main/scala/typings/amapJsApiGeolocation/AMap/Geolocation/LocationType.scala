package typings.amapJsApiGeolocation.AMap.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5
  - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip
  - typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk
*/
trait LocationType extends js.Object

object LocationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html5: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.html5 = this.cast("html5")
  @scala.inline
  def ip: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.ip = this.cast("ip")
  @scala.inline
  def sdk: typings.amapJsApiGeolocation.amapJsApiGeolocationStrings.sdk = this.cast("sdk")
}

