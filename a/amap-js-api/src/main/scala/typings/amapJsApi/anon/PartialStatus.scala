package typings.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.Map.Status> */
@js.native
trait PartialStatus extends js.Object {
  var animateEnable: js.UndefOr[Boolean] = js.native
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  var dragEnable: js.UndefOr[Boolean] = js.native
  var isHotspot: js.UndefOr[Boolean] = js.native
  var jogEnable: js.UndefOr[Boolean] = js.native
  var keyboardEnable: js.UndefOr[Boolean] = js.native
  var pitchEnable: js.UndefOr[Boolean] = js.native
  var resizeEnable: js.UndefOr[Boolean] = js.native
  var rotateEnable: js.UndefOr[Boolean] = js.native
  var scrollWheel: js.UndefOr[Boolean] = js.native
  var touchZoom: js.UndefOr[Boolean] = js.native
  var zoomEnable: js.UndefOr[Boolean] = js.native
}

object PartialStatus {
  @scala.inline
  def apply(): PartialStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatus]
  }
  @scala.inline
  implicit class PartialStatusOps[Self <: PartialStatus] (val x: Self) extends AnyVal {
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
    def setAnimateEnable(value: Boolean): Self = this.set("animateEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateEnable: Self = this.set("animateEnable", js.undefined)
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleClickZoom: Self = this.set("doubleClickZoom", js.undefined)
    @scala.inline
    def setDragEnable(value: Boolean): Self = this.set("dragEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragEnable: Self = this.set("dragEnable", js.undefined)
    @scala.inline
    def setIsHotspot(value: Boolean): Self = this.set("isHotspot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHotspot: Self = this.set("isHotspot", js.undefined)
    @scala.inline
    def setJogEnable(value: Boolean): Self = this.set("jogEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJogEnable: Self = this.set("jogEnable", js.undefined)
    @scala.inline
    def setKeyboardEnable(value: Boolean): Self = this.set("keyboardEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardEnable: Self = this.set("keyboardEnable", js.undefined)
    @scala.inline
    def setPitchEnable(value: Boolean): Self = this.set("pitchEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePitchEnable: Self = this.set("pitchEnable", js.undefined)
    @scala.inline
    def setResizeEnable(value: Boolean): Self = this.set("resizeEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeEnable: Self = this.set("resizeEnable", js.undefined)
    @scala.inline
    def setRotateEnable(value: Boolean): Self = this.set("rotateEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateEnable: Self = this.set("rotateEnable", js.undefined)
    @scala.inline
    def setScrollWheel(value: Boolean): Self = this.set("scrollWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollWheel: Self = this.set("scrollWheel", js.undefined)
    @scala.inline
    def setTouchZoom(value: Boolean): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchZoom: Self = this.set("touchZoom", js.undefined)
    @scala.inline
    def setZoomEnable(value: Boolean): Self = this.set("zoomEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomEnable: Self = this.set("zoomEnable", js.undefined)
  }
  
}

