package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderConstructorOptions extends js.Object {
  var getsUserLocation: scala.Boolean
  var language: java.lang.String
}

object GeocoderConstructorOptions {
  @scala.inline
  def apply(getsUserLocation: scala.Boolean, language: java.lang.String): GeocoderConstructorOptions = {
    val __obj = js.Dynamic.literal(getsUserLocation = getsUserLocation, language = language)
  
    __obj.asInstanceOf[GeocoderConstructorOptions]
  }
}

