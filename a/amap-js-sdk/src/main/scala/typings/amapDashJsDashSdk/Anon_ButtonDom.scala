package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMap.CircleOptions
import typings.amapDashJsDashSdk.AMap.MarkerOptions
import typings.amapDashJsDashSdk.AMap.Pixel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonDom extends js.Object {
  var buttonDom: js.UndefOr[String | HTMLElement] = js.undefined
  var buttonOffset: js.UndefOr[Pixel] = js.undefined
  var buttonPosition: js.UndefOr[String] = js.undefined
  var circleOptions: js.UndefOr[CircleOptions] = js.undefined
  var convert: js.UndefOr[Boolean] = js.undefined
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var noIpLocate: js.UndefOr[Boolean] = js.undefined
  var panToLocation: js.UndefOr[Boolean] = js.undefined
  var showButton: js.UndefOr[Boolean] = js.undefined
  var showCircle: js.UndefOr[Boolean] = js.undefined
  var showMarker: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
  var zoomToAccuracy: js.UndefOr[Boolean] = js.undefined
}

object Anon_ButtonDom {
  @scala.inline
  def apply(
    buttonDom: String | HTMLElement = null,
    buttonOffset: Pixel = null,
    buttonPosition: String = null,
    circleOptions: CircleOptions = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    markerOptions: MarkerOptions = null,
    maximumAge: Int | Double = null,
    noIpLocate: js.UndefOr[Boolean] = js.undefined,
    panToLocation: js.UndefOr[Boolean] = js.undefined,
    showButton: js.UndefOr[Boolean] = js.undefined,
    showCircle: js.UndefOr[Boolean] = js.undefined,
    showMarker: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    useNative: js.UndefOr[Boolean] = js.undefined,
    zoomToAccuracy: js.UndefOr[Boolean] = js.undefined
  ): Anon_ButtonDom = {
    val __obj = js.Dynamic.literal()
    if (buttonDom != null) __obj.updateDynamic("buttonDom")(buttonDom.asInstanceOf[js.Any])
    if (buttonOffset != null) __obj.updateDynamic("buttonOffset")(buttonOffset.asInstanceOf[js.Any])
    if (buttonPosition != null) __obj.updateDynamic("buttonPosition")(buttonPosition.asInstanceOf[js.Any])
    if (circleOptions != null) __obj.updateDynamic("circleOptions")(circleOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.asInstanceOf[js.Any])
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (!js.isUndefined(noIpLocate)) __obj.updateDynamic("noIpLocate")(noIpLocate.asInstanceOf[js.Any])
    if (!js.isUndefined(panToLocation)) __obj.updateDynamic("panToLocation")(panToLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(showButton)) __obj.updateDynamic("showButton")(showButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showCircle)) __obj.updateDynamic("showCircle")(showCircle.asInstanceOf[js.Any])
    if (!js.isUndefined(showMarker)) __obj.updateDynamic("showMarker")(showMarker.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToAccuracy)) __obj.updateDynamic("zoomToAccuracy")(zoomToAccuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ButtonDom]
  }
}

