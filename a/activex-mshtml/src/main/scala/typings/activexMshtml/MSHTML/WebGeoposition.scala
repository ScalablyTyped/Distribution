package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGeoposition extends js.Object {
  @JSName("MSHTML.WebGeoposition_typekey")
  var MSHTMLDotWebGeoposition_typekey: WebGeoposition
  val coords: IWebGeocoordinates
  val timeStamp: Double
}

object WebGeoposition {
  @scala.inline
  def apply(MSHTMLDotWebGeoposition_typekey: WebGeoposition, coords: IWebGeocoordinates, timeStamp: Double): WebGeoposition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeoposition_typekey")(MSHTMLDotWebGeoposition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeoposition]
  }
}

