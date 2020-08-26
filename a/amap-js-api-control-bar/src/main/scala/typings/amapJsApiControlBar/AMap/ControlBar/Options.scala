package typings.amapJsApiControlBar.AMap.ControlBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * 显示位置
    */
  var position: js.UndefOr[Position] = js.native
  /**
    * 是否显示倾斜、旋转按钮
    */
  var showControlButton: js.UndefOr[Boolean] = js.native
  /**
    * 是否显示缩放按钮
    */
  var showZoomBar: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowControlButton(value: Boolean): Self = this.set("showControlButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowControlButton: Self = this.set("showControlButton", js.undefined)
    @scala.inline
    def setShowZoomBar(value: Boolean): Self = this.set("showZoomBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowZoomBar: Self = this.set("showZoomBar", js.undefined)
  }
  
}

