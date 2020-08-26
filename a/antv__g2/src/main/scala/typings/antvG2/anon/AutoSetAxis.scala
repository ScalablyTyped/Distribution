package typings.antvG2.anon

import typings.antvG2.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSetAxis extends js.Object {
  /**
    * 自动设置坐标轴的文本，避免重复和遮挡
    */
  var autoSetAxis: js.UndefOr[Boolean] = js.native
  /**
    * 列标题
    */
  var colTitle: js.UndefOr[OffsetY | Null] = js.native
  /**
    * 创建每个分面中的视图
    * @param view 视图对象
    * @param facet 行列等信息，常见属性：data rows cols rowIndex colIndex rowField colField
    */
  var eachView: js.UndefOr[js.Function2[/* view */ View, /* facet */ js.Any, Unit]] = js.native
  var fields: js.UndefOr[js.Array[String]] = js.native
  /**
    * 每个 view 之间的间距
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * 行标题
    */
  var rowTitle: js.UndefOr[OffsetX | Null] = js.native
  /**
    * 显示标题
    */
  var showTitle: js.UndefOr[Boolean] = js.native
}

object AutoSetAxis {
  @scala.inline
  def apply(): AutoSetAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoSetAxis]
  }
  @scala.inline
  implicit class AutoSetAxisOps[Self <: AutoSetAxis] (val x: Self) extends AnyVal {
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
    def setAutoSetAxis(value: Boolean): Self = this.set("autoSetAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSetAxis: Self = this.set("autoSetAxis", js.undefined)
    @scala.inline
    def setColTitle(value: OffsetY): Self = this.set("colTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColTitle: Self = this.set("colTitle", js.undefined)
    @scala.inline
    def setColTitleNull: Self = this.set("colTitle", null)
    @scala.inline
    def setEachView(value: (/* view */ View, /* facet */ js.Any) => Unit): Self = this.set("eachView", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEachView: Self = this.set("eachView", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRowTitle(value: OffsetX): Self = this.set("rowTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowTitle: Self = this.set("rowTitle", js.undefined)
    @scala.inline
    def setRowTitleNull: Self = this.set("rowTitle", null)
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
  }
  
}

