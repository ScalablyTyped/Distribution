package typings.antvG2.anon

import typings.antvG2.mod.Styles.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait End extends js.Object {
  /**
    * 辅助线结束位置，值为原始数据值，支持 callback
    */
  var end: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  /**
    * 图形样式配置
    */
  var lineStyle: js.UndefOr[line] = js.native
  /**
    * 辅助线起始位置，值为原始数据值，支持 callback
    */
  var start: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  var text: js.UndefOr[AutoRotate] = js.native
  /**
    * 指定 guide 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  var top: js.UndefOr[Boolean] = js.native
}

object End {
  @scala.inline
  def apply(): End = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[End]
  }
  @scala.inline
  implicit class EndOps[Self <: End] (val x: Self) extends AnyVal {
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
    def setEndVarargs(value: (String | Double)*): Self = this.set("end", js.Array(value :_*))
    @scala.inline
    def setEnd(value: js.Any | js.Function | (js.Array[String | Double])): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setLineStyle(value: line): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    @scala.inline
    def setStartVarargs(value: (String | Double)*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(value: js.Any | js.Function | (js.Array[String | Double])): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setText(value: AutoRotate): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

