package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGeoposition extends js.Object {
  @JSName("MSHTML.WebGeoposition_typekey")
  var MSHTMLDotWebGeoposition_typekey: WebGeoposition = js.native
  val coords: IWebGeocoordinates = js.native
  val timeStamp: Double = js.native
}

object WebGeoposition {
  @scala.inline
  def apply(MSHTMLDotWebGeoposition_typekey: WebGeoposition, coords: IWebGeocoordinates, timeStamp: Double): WebGeoposition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.WebGeoposition_typekey")(MSHTMLDotWebGeoposition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGeoposition]
  }
  @scala.inline
  implicit class WebGeopositionOps[Self <: WebGeoposition] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotWebGeoposition_typekey(value: WebGeoposition): Self = this.set("MSHTML.WebGeoposition_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoords(value: IWebGeocoordinates): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
  
}

