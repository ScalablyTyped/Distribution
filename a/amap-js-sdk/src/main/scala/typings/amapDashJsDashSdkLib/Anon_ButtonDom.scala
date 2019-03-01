package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonDom extends js.Object {
  var buttonDom: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var buttonOffset: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Pixel] = js.undefined
  var buttonPosition: js.UndefOr[java.lang.String] = js.undefined
  var circleOptions: js.UndefOr[amapDashJsDashSdkLib.AMapNs.CircleOptions] = js.undefined
  var convert: js.UndefOr[scala.Boolean] = js.undefined
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  var markerOptions: js.UndefOr[amapDashJsDashSdkLib.AMapNs.MarkerOptions] = js.undefined
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  var noIpLocate: js.UndefOr[scala.Boolean] = js.undefined
  var panToLocation: js.UndefOr[scala.Boolean] = js.undefined
  var showButton: js.UndefOr[scala.Boolean] = js.undefined
  var showCircle: js.UndefOr[scala.Boolean] = js.undefined
  var showMarker: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
  var zoomToAccuracy: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ButtonDom {
  @scala.inline
  def apply(
    buttonDom: java.lang.String | stdLib.HTMLElement = null,
    buttonOffset: amapDashJsDashSdkLib.AMapNs.Pixel = null,
    buttonPosition: java.lang.String = null,
    circleOptions: amapDashJsDashSdkLib.AMapNs.CircleOptions = null,
    convert: js.UndefOr[scala.Boolean] = js.undefined,
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    markerOptions: amapDashJsDashSdkLib.AMapNs.MarkerOptions = null,
    maximumAge: scala.Int | scala.Double = null,
    noIpLocate: js.UndefOr[scala.Boolean] = js.undefined,
    panToLocation: js.UndefOr[scala.Boolean] = js.undefined,
    showButton: js.UndefOr[scala.Boolean] = js.undefined,
    showCircle: js.UndefOr[scala.Boolean] = js.undefined,
    showMarker: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    useNative: js.UndefOr[scala.Boolean] = js.undefined,
    zoomToAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ButtonDom = {
    val __obj = js.Dynamic.literal()
    if (buttonDom != null) __obj.updateDynamic("buttonDom")(buttonDom.asInstanceOf[js.Any])
    if (buttonOffset != null) __obj.updateDynamic("buttonOffset")(buttonOffset)
    if (buttonPosition != null) __obj.updateDynamic("buttonPosition")(buttonPosition)
    if (circleOptions != null) __obj.updateDynamic("circleOptions")(circleOptions)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions)
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (!js.isUndefined(noIpLocate)) __obj.updateDynamic("noIpLocate")(noIpLocate)
    if (!js.isUndefined(panToLocation)) __obj.updateDynamic("panToLocation")(panToLocation)
    if (!js.isUndefined(showButton)) __obj.updateDynamic("showButton")(showButton)
    if (!js.isUndefined(showCircle)) __obj.updateDynamic("showCircle")(showCircle)
    if (!js.isUndefined(showMarker)) __obj.updateDynamic("showMarker")(showMarker)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    if (!js.isUndefined(zoomToAccuracy)) __obj.updateDynamic("zoomToAccuracy")(zoomToAccuracy)
    __obj.asInstanceOf[Anon_ButtonDom]
  }
}

