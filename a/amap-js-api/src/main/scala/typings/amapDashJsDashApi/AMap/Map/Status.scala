package typings.amapDashJsDashApi.AMap.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  /**
    * 是否开启动画
    */
  var animateEnable: Boolean
  /**
    * 是否双击缩放
    */
  var doubleClickZoom: Boolean
  /**
    * 是否支持拖拽
    */
  var dragEnable: Boolean
  var isHotspot: Boolean
  /**
    * 是否开启缓动效果
    */
  var jogEnable: Boolean
  /**
    * 是否支持键盘
    */
  var keyboardEnable: Boolean
  /**
    * 是否支持调整俯仰角
    */
  var pitchEnable: Boolean
  var resizeEnable: Boolean
  /**
    * 是否支持旋转
    */
  var rotateEnable: Boolean
  /**
    * 是否支持滚轮缩放
    */
  var scrollWheel: Boolean
  /**
    * 是否支持触摸缩放
    */
  var touchZoom: Boolean
  /**
    * 是否支持缩放
    */
  var zoomEnable: Boolean
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
}

