package typings.amapDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.Map.Status> */
trait PartialStatus extends js.Object {
  var animateEnable: js.UndefOr[Boolean] = js.undefined
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var dragEnable: js.UndefOr[Boolean] = js.undefined
  var isHotspot: js.UndefOr[Boolean] = js.undefined
  var jogEnable: js.UndefOr[Boolean] = js.undefined
  var keyboardEnable: js.UndefOr[Boolean] = js.undefined
  var pitchEnable: js.UndefOr[Boolean] = js.undefined
  var resizeEnable: js.UndefOr[Boolean] = js.undefined
  var rotateEnable: js.UndefOr[Boolean] = js.undefined
  var scrollWheel: js.UndefOr[Boolean] = js.undefined
  var touchZoom: js.UndefOr[Boolean] = js.undefined
  var zoomEnable: js.UndefOr[Boolean] = js.undefined
}

object PartialStatus {
  @scala.inline
  def apply(
    animateEnable: js.UndefOr[Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragEnable: js.UndefOr[Boolean] = js.undefined,
    isHotspot: js.UndefOr[Boolean] = js.undefined,
    jogEnable: js.UndefOr[Boolean] = js.undefined,
    keyboardEnable: js.UndefOr[Boolean] = js.undefined,
    pitchEnable: js.UndefOr[Boolean] = js.undefined,
    resizeEnable: js.UndefOr[Boolean] = js.undefined,
    rotateEnable: js.UndefOr[Boolean] = js.undefined,
    scrollWheel: js.UndefOr[Boolean] = js.undefined,
    touchZoom: js.UndefOr[Boolean] = js.undefined,
    zoomEnable: js.UndefOr[Boolean] = js.undefined
  ): PartialStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateEnable)) __obj.updateDynamic("animateEnable")(animateEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragEnable)) __obj.updateDynamic("dragEnable")(dragEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(isHotspot)) __obj.updateDynamic("isHotspot")(isHotspot.asInstanceOf[js.Any])
    if (!js.isUndefined(jogEnable)) __obj.updateDynamic("jogEnable")(jogEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardEnable)) __obj.updateDynamic("keyboardEnable")(keyboardEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(pitchEnable)) __obj.updateDynamic("pitchEnable")(pitchEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeEnable)) __obj.updateDynamic("resizeEnable")(resizeEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateEnable)) __obj.updateDynamic("rotateEnable")(rotateEnable.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollWheel)) __obj.updateDynamic("scrollWheel")(scrollWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomEnable)) __obj.updateDynamic("zoomEnable")(zoomEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStatus]
  }
}

