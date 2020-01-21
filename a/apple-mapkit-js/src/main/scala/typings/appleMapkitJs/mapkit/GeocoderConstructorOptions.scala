package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialization options for geocoder objects.
  */
trait GeocoderConstructorOptions extends js.Object {
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var language: js.UndefOr[String] = js.undefined
}

object GeocoderConstructorOptions {
  @scala.inline
  def apply(getsUserLocation: js.UndefOr[Boolean] = js.undefined, language: String = null): GeocoderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(getsUserLocation)) __obj.updateDynamic("getsUserLocation")(getsUserLocation.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderConstructorOptions]
  }
}

