package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasAction extends js.Object {
  /**
    * 创建一个颜色的渐变点。
    * 小于最小 stop 的部分会按最小 stop 的 color 来渲染，大于最大 stop 的部分会按最大 stop 的 color 来渲染。
    *
    * @param stop 渐变点位置，值必须在 [0,1] 范围内
    * @param color 颜色值
    */
  def addColorStop(stop: Double, color: Color): Unit = js.native
}

object CanvasAction {
  @scala.inline
  def apply(addColorStop: (Double, Color) => Unit): CanvasAction = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.asInstanceOf[CanvasAction]
  }
  @scala.inline
  implicit class CanvasActionOps[Self <: CanvasAction] (val x: Self) extends AnyVal {
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
    def setAddColorStop(value: (Double, Color) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
  }
  
}

