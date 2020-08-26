package typings.antvG2.anon

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  /**
    * 显示的文本内容
    */
  var content: js.UndefOr[String] = js.native
  /**
    * x 方向的偏移量
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    * y 方向偏移量
    */
  var offsetY: js.UndefOr[Double] = js.native
  /**
    * 文本的起始位置，值为原始数据值，支持 callback
    */
  var position: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.native
  /**
    * 文本的图形样式属性
    */
  var style: js.UndefOr[text] = js.native
  /**
    * 指定 guide 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  var top: js.UndefOr[Boolean] = js.native
}

object Content {
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setPositionVarargs(value: (String | Double)*): Self = this.set("position", js.Array(value :_*))
    @scala.inline
    def setPosition(value: js.Any | js.Function | (js.Array[String | Double])): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStyle(value: text): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

