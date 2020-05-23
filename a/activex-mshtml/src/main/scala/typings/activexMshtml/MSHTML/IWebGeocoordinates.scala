package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebGeocoordinates extends js.Object {
  @JSName("MSHTML.IWebGeocoordinates_typekey")
  var MSHTMLDotIWebGeocoordinates_typekey: IWebGeocoordinates
  val accuracy: Double
  val altitude: js.Any
  val altitudeAccuracy: js.Any
  val heading: js.Any
  val latitude: Double
  val longitude: Double
  val speed: js.Any
}

object IWebGeocoordinates {
  @scala.inline
  def apply(
    MSHTMLDotIWebGeocoordinates_typekey: IWebGeocoordinates,
    accuracy: Double,
    altitude: js.Any,
    altitudeAccuracy: js.Any,
    heading: js.Any,
    latitude: Double,
    longitude: Double,
    speed: js.Any
  ): IWebGeocoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IWebGeocoordinates_typekey")(MSHTMLDotIWebGeocoordinates_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebGeocoordinates]
  }
}

