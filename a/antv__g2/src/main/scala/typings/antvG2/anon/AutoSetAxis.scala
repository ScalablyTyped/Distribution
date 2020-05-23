package typings.antvG2.anon

import typings.antvG2.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSetAxis extends js.Object {
  /**
    * 自动设置坐标轴的文本，避免重复和遮挡
    */
  var autoSetAxis: js.UndefOr[Boolean] = js.undefined
  /**
    * 列标题
    */
  var colTitle: js.UndefOr[OffsetY | Null] = js.undefined
  /**
    * 创建每个分面中的视图
    * @param view 视图对象
    * @param facet 行列等信息，常见属性：data rows cols rowIndex colIndex rowField colField
    */
  var eachView: js.UndefOr[js.Function2[/* view */ View, /* facet */ js.Any, Unit]] = js.undefined
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 每个 view 之间的间距
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * 行标题
    */
  var rowTitle: js.UndefOr[OffsetX | Null] = js.undefined
  /**
    * 显示标题
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
}

object AutoSetAxis {
  @scala.inline
  def apply(
    autoSetAxis: js.UndefOr[Boolean] = js.undefined,
    colTitle: js.UndefOr[Null | OffsetY] = js.undefined,
    eachView: (/* view */ View, /* facet */ js.Any) => Unit = null,
    fields: js.Array[String] = null,
    padding: js.UndefOr[Double] = js.undefined,
    rowTitle: js.UndefOr[Null | OffsetX] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined
  ): AutoSetAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSetAxis)) __obj.updateDynamic("autoSetAxis")(autoSetAxis.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colTitle)) __obj.updateDynamic("colTitle")(colTitle.asInstanceOf[js.Any])
    if (eachView != null) __obj.updateDynamic("eachView")(js.Any.fromFunction2(eachView))
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowTitle)) __obj.updateDynamic("rowTitle")(rowTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSetAxis]
  }
}

