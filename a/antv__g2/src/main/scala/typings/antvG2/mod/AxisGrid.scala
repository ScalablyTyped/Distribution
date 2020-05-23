package typings.antvG2.mod

import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.polygon
import typings.antvG2.mod.Styles.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisGrid extends js.Object {
  /**
    * 声明网格顶点从两个刻度中间开始，默认从刻度点开始
    */
  var align: js.UndefOr[center] = js.undefined
  /**
    * 当网格类型 type 为 polygon 时，使用 alternateColor 为网格设置交替的颜色。
    * 指定一个值则先渲染奇数层，两个值则交替渲染
    */
  var alternateColor: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  /**
    * 是否隐藏第一条网格线，默认为 false
    */
  var hideFirstLine: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否隐藏最后一条网格线，默认为 false
    */
  var hideLastLine: js.UndefOr[Boolean] = js.undefined
  /**
    * 当网格类型 type 为 line 时，使用 lineStyle 设置样式
    */
  var lineStyle: js.UndefOr[line] = js.undefined
  /**
    * 声明网格的类型，line 表示线，polygon 表示矩形框
    */
  var `type`: js.UndefOr[typings.antvG2.antvG2Strings.line | polygon] = js.undefined
}

object AxisGrid {
  @scala.inline
  def apply(
    align: center = null,
    alternateColor: String | (js.Tuple2[String, String]) = null,
    hideFirstLine: js.UndefOr[Boolean] = js.undefined,
    hideLastLine: js.UndefOr[Boolean] = js.undefined,
    lineStyle: line = null,
    `type`: typings.antvG2.antvG2Strings.line | polygon = null
  ): AxisGrid = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (alternateColor != null) __obj.updateDynamic("alternateColor")(alternateColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFirstLine)) __obj.updateDynamic("hideFirstLine")(hideFirstLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLastLine)) __obj.updateDynamic("hideLastLine")(hideLastLine.get.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisGrid]
  }
}

