package typings.amapJsApi.AMap.Overlay

import typings.amapJsApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ExtraData] extends js.Object {
  /**
    * 事件是否穿透到地图
    */
  var bubble: js.UndefOr[Boolean] = js.native
  /**
    * 是否支持点击
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * 鼠标悬停时的鼠标样式
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * 是否支持拖拽
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * 自定义数据
    */
  var extData: js.UndefOr[ExtraData] = js.native
  /**
    * 所属地图
    */
  var map: js.UndefOr[Map] = js.native
}

object Options {
  @scala.inline
  def apply[ExtraData](): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ExtraData]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
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
    def setBubble(value: Boolean): Self = this.set("bubble", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubble: Self = this.set("bubble", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setExtData(value: ExtraData): Self = this.set("extData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtData: Self = this.set("extData", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

