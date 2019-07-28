package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderConstructorOptions extends js.Object {
  var getsUserLocation: Boolean
  var language: String
}

object GeocoderConstructorOptions {
  @scala.inline
  def apply(getsUserLocation: Boolean, language: String): GeocoderConstructorOptions = {
    val __obj = js.Dynamic.literal(getsUserLocation = getsUserLocation, language = language)
  
    __obj.asInstanceOf[GeocoderConstructorOptions]
  }
}

