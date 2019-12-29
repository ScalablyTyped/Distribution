package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.atAntvG2Mod.Styles.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 坐标轴标签
  */
trait AxisLabel extends js.Object {
  /**
    * 文本是否需要自动旋转，默认为 true
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  /**
    * 用于格式化坐标轴上显示的文本信息的回调函数
    * @param text 文本值
    * @param item 该文本值对应的原始数据记录
    * @param index 索引值
    * @return 返回格式化后的文本值
    */
  var formatter: js.UndefOr[js.Function3[/* text */ String, /* item */ js.Any, /* index */ Double, String]] = js.undefined
  /**
    * 使用 html 渲染文本
    * @param text 文本值
    * @param item 该文本值对应的原始数据记录
    * @param index 索引值
    * @return 返回 html 字符串
    */
  var htmlTemplate: js.UndefOr[js.Function3[/* text */ String, /* item */ js.Any, /* index */ Double, String]] = js.undefined
  /**
    * 数值，设置坐标轴文本 label 距离坐标轴线的距离
    */
  var offset: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * 设置文本的显示样式，还可以是个回调函数，
    * 回调函数的参数为该坐标轴对应字段的数值
    */
  var textStyle: js.UndefOr[(js.Function1[/* text */ js.UndefOr[String], text]) | text] = js.undefined
}

object AxisLabel {
  @scala.inline
  def apply(
    autoRotate: js.UndefOr[Boolean] = js.undefined,
    formatter: (/* text */ String, /* item */ js.Any, /* index */ Double) => String = null,
    htmlTemplate: (/* text */ String, /* item */ js.Any, /* index */ Double) => String = null,
    offset: Double | js.Array[Double] = null,
    textStyle: (js.Function1[/* text */ js.UndefOr[String], text]) | text = null
  ): AxisLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRotate)) __obj.updateDynamic("autoRotate")(autoRotate.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction3(formatter))
    if (htmlTemplate != null) __obj.updateDynamic("htmlTemplate")(js.Any.fromFunction3(htmlTemplate))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabel]
  }
}

