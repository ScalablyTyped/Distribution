package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.CircleOptions
import typings.amapJsSdk.AMap.MarkerOptions
import typings.amapJsSdk.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonDom extends js.Object {
  var buttonDom: js.UndefOr[String | HTMLElement] = js.native
  var buttonOffset: js.UndefOr[Pixel] = js.native
  var buttonPosition: js.UndefOr[String] = js.native
  var circleOptions: js.UndefOr[CircleOptions] = js.native
  var convert: js.UndefOr[Boolean] = js.native
  var enableHighAccuracy: js.UndefOr[Boolean] = js.native
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  var maximumAge: js.UndefOr[Double] = js.native
  var noIpLocate: js.UndefOr[Boolean] = js.native
  var panToLocation: js.UndefOr[Boolean] = js.native
  var showButton: js.UndefOr[Boolean] = js.native
  var showCircle: js.UndefOr[Boolean] = js.native
  var showMarker: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
  var zoomToAccuracy: js.UndefOr[Boolean] = js.native
}

object ButtonDom {
  @scala.inline
  def apply(): ButtonDom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDom]
  }
  @scala.inline
  implicit class ButtonDomOps[Self <: ButtonDom] (val x: Self) extends AnyVal {
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
    def setButtonDom(value: String | HTMLElement): Self = this.set("buttonDom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonDom: Self = this.set("buttonDom", js.undefined)
    @scala.inline
    def setButtonOffset(value: Pixel): Self = this.set("buttonOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonOffset: Self = this.set("buttonOffset", js.undefined)
    @scala.inline
    def setButtonPosition(value: String): Self = this.set("buttonPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonPosition: Self = this.set("buttonPosition", js.undefined)
    @scala.inline
    def setCircleOptions(value: CircleOptions): Self = this.set("circleOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleOptions: Self = this.set("circleOptions", js.undefined)
    @scala.inline
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighAccuracy: Self = this.set("enableHighAccuracy", js.undefined)
    @scala.inline
    def setMarkerOptions(value: MarkerOptions): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumAge: Self = this.set("maximumAge", js.undefined)
    @scala.inline
    def setNoIpLocate(value: Boolean): Self = this.set("noIpLocate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoIpLocate: Self = this.set("noIpLocate", js.undefined)
    @scala.inline
    def setPanToLocation(value: Boolean): Self = this.set("panToLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanToLocation: Self = this.set("panToLocation", js.undefined)
    @scala.inline
    def setShowButton(value: Boolean): Self = this.set("showButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowButton: Self = this.set("showButton", js.undefined)
    @scala.inline
    def setShowCircle(value: Boolean): Self = this.set("showCircle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCircle: Self = this.set("showCircle", js.undefined)
    @scala.inline
    def setShowMarker(value: Boolean): Self = this.set("showMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMarker: Self = this.set("showMarker", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
    @scala.inline
    def setZoomToAccuracy(value: Boolean): Self = this.set("zoomToAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomToAccuracy: Self = this.set("zoomToAccuracy", js.undefined)
  }
  
}

