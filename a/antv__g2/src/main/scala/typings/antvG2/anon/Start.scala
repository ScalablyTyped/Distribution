package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Start extends js.Object {
  /**
    * 辅助框结束位置，值为原始数据值，支持 callback
    */
  var end: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  /**
    * 辅助框起始位置，值为原始数据值，支持 callback
    */
  var start: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  var style: js.UndefOr[FillOpacity] = js.native
  /**
    * 指定 giude 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  var top: js.UndefOr[Boolean] = js.native
}

object Start {
  @scala.inline
  def apply(): Start = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Start]
  }
  @scala.inline
  implicit class StartOps[Self <: Start] (val x: Self) extends AnyVal {
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
    def setStartVarargs(value: (String | Double)*): Self = this.set("start", js.Array(value :_*))
    @scala.inline
    def setStart(value: js.Any | js.Function | (js.Array[String | Double])): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStyle(value: FillOpacity): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

