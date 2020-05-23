package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGeocoordinates extends js.Object {
  @JSName("MSHTML.WebGeocoordinates_typekey")
  var MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates
  val accuracy: Double
  val altitude: js.Any
  val altitudeAccuracy: js.Any
  val heading: js.Any
  val latitude: Double
  val longitude: Double
  val speed: js.Any
}

object WebGeocoordinates {
  @scala.inline
  def apply(
    MSHTMLDotWebGeocoordinates_typekey: WebGeocoordinates,
    accuracy: Double,
    altitude: js.Any,
    altitudeAccuracy: js.Any,
    heading: js.Any,
    latitude: Double,
    longitude: Double,
    speed: js.Any
  ): WebGeocoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeocoordinates_typekey")(MSHTMLDotWebGeocoordinates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeocoordinates]
  }
}

