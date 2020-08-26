package typings.amapJsApi.AMap.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  /**
    * 是否开启动画
    */
  var animateEnable: Boolean = js.native
  /**
    * 是否双击缩放
    */
  var doubleClickZoom: Boolean = js.native
  /**
    * 是否支持拖拽
    */
  var dragEnable: Boolean = js.native
  var isHotspot: Boolean = js.native
  /**
    * 是否开启缓动效果
    */
  var jogEnable: Boolean = js.native
  /**
    * 是否支持键盘
    */
  var keyboardEnable: Boolean = js.native
  /**
    * 是否支持调整俯仰角
    */
  var pitchEnable: Boolean = js.native
  var resizeEnable: Boolean = js.native
  /**
    * 是否支持旋转
    */
  var rotateEnable: Boolean = js.native
  /**
    * 是否支持滚轮缩放
    */
  var scrollWheel: Boolean = js.native
  /**
    * 是否支持触摸缩放
    */
  var touchZoom: Boolean = js.native
  /**
    * 是否支持缩放
    */
  var zoomEnable: Boolean = js.native
}

object Status {
  @scala.inline
  def apply(
    animateEnable: Boolean,
    doubleClickZoom: Boolean,
    dragEnable: Boolean,
    isHotspot: Boolean,
    jogEnable: Boolean,
    keyboardEnable: Boolean,
    pitchEnable: Boolean,
    resizeEnable: Boolean,
    rotateEnable: Boolean,
    scrollWheel: Boolean,
    touchZoom: Boolean,
    zoomEnable: Boolean
  ): Status = {
    val __obj = js.Dynamic.literal(animateEnable = animateEnable.asInstanceOf[js.Any], doubleClickZoom = doubleClickZoom.asInstanceOf[js.Any], dragEnable = dragEnable.asInstanceOf[js.Any], isHotspot = isHotspot.asInstanceOf[js.Any], jogEnable = jogEnable.asInstanceOf[js.Any], keyboardEnable = keyboardEnable.asInstanceOf[js.Any], pitchEnable = pitchEnable.asInstanceOf[js.Any], resizeEnable = resizeEnable.asInstanceOf[js.Any], rotateEnable = rotateEnable.asInstanceOf[js.Any], scrollWheel = scrollWheel.asInstanceOf[js.Any], touchZoom = touchZoom.asInstanceOf[js.Any], zoomEnable = zoomEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
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
    def setDoubleClickZoom(value: Boolean): Self = this.set("doubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragEnable(value: Boolean): Self = this.set("dragEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsHotspot(value: Boolean): Self = this.set("isHotspot", value.asInstanceOf[js.Any])
    @scala.inline
    def setJogEnable(value: Boolean): Self = this.set("jogEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyboardEnable(value: Boolean): Self = this.set("keyboardEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setPitchEnable(value: Boolean): Self = this.set("pitchEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeEnable(value: Boolean): Self = this.set("resizeEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateEnable(value: Boolean): Self = this.set("rotateEnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollWheel(value: Boolean): Self = this.set("scrollWheel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchZoom(value: Boolean): Self = this.set("touchZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomEnable(value: Boolean): Self = this.set("zoomEnable", value.asInstanceOf[js.Any])
  }
  
}

