package typings.antvG2.mod

import typings.antvG2.mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 坐标轴标签
  */
@js.native
trait AxisLabel extends js.Object {
  /**
    * 文本是否需要自动旋转，默认为 true
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  /**
    * 用于格式化坐标轴上显示的文本信息的回调函数
    * @param text 文本值
    * @param item 该文本值对应的原始数据记录
    * @param index 索引值
    * @return 返回格式化后的文本值
    */
  var formatter: js.UndefOr[js.Function3[/* text */ String, /* item */ js.Any, /* index */ Double, String]] = js.native
  /**
    * 使用 html 渲染文本
    * @param text 文本值
    * @param item 该文本值对应的原始数据记录
    * @param index 索引值
    * @return 返回 html 字符串
    */
  var htmlTemplate: js.UndefOr[js.Function3[/* text */ String, /* item */ js.Any, /* index */ Double, String]] = js.native
  /**
    * 数值，设置坐标轴文本 label 距离坐标轴线的距离
    */
  var offset: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * 设置文本的显示样式，还可以是个回调函数，
    * 回调函数的参数为该坐标轴对应字段的数值
    */
  var textStyle: js.UndefOr[(js.Function1[/* text */ js.UndefOr[String], text]) | text] = js.native
}

object AxisLabel {
  @scala.inline
  def apply(): AxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabel]
  }
  @scala.inline
  implicit class AxisLabelOps[Self <: AxisLabel] (val x: Self) extends AnyVal {
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
    def setAutoRotate(value: Boolean): Self = this.set("autoRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRotate: Self = this.set("autoRotate", js.undefined)
    @scala.inline
    def setFormatter(value: (/* text */ String, /* item */ js.Any, /* index */ Double) => String): Self = this.set("formatter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setHtmlTemplate(value: (/* text */ String, /* item */ js.Any, /* index */ Double) => String): Self = this.set("htmlTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteHtmlTemplate: Self = this.set("htmlTemplate", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: Double | js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setTextStyleFunction1(value: /* text */ js.UndefOr[String] => text): Self = this.set("textStyle", js.Any.fromFunction1(value))
    @scala.inline
    def setTextStyle(value: (js.Function1[/* text */ js.UndefOr[String], text]) | text): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

