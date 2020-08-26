package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialization options for geocoder objects.
  */
@js.native
trait GeocoderConstructorOptions extends js.Object {
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var language: js.UndefOr[String] = js.native
}

object GeocoderConstructorOptions {
  @scala.inline
  def apply(): GeocoderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderConstructorOptions]
  }
  @scala.inline
  implicit class GeocoderConstructorOptionsOps[Self <: GeocoderConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetsUserLocation(value: Boolean): Self = this.set("getsUserLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetsUserLocation: Self = this.set("getsUserLocation", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
  
}

