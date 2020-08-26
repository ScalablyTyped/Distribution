package typings.antd.listMod

import typings.antd.antdBooleans.`false`
import typings.antd.paginationPaginationMod.PaginationConfig
import typings.antd.spinMod.SpinProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProps[T] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var className: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[js.Array[T]] = js.native
  var extra: js.UndefOr[ReactNode] = js.native
  var footer: js.UndefOr[ReactNode] = js.native
  var grid: js.UndefOr[ListGridType] = js.native
  var header: js.UndefOr[ReactNode] = js.native
  var id: js.UndefOr[String] = js.native
  var itemLayout: js.UndefOr[ListItemLayout] = js.native
  var loadMore: js.UndefOr[ReactNode] = js.native
  var loading: js.UndefOr[Boolean | SpinProps] = js.native
  var locale: js.UndefOr[ListLocale] = js.native
  var pagination: js.UndefOr[PaginationConfig | `false`] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, ReactNode]] = js.native
  var rowKey: js.UndefOr[(js.Function1[/* item */ T, String]) | String] = js.native
  var size: js.UndefOr[ListSize] = js.native
  var split: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ListProps {
  @scala.inline
  def apply[T](): ListProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProps[T]]
  }
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps[_], T] (val x: Self with ListProps[T]) extends AnyVal {
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: T*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[T]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setExtra(value: ReactNode): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setFooter(value: ReactNode): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setGrid(value: ListGridType): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHeader(value: ReactNode): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemLayout(value: ListItemLayout): Self = this.set("itemLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemLayout: Self = this.set("itemLayout", js.undefined)
    @scala.inline
    def setLoadMore(value: ReactNode): Self = this.set("loadMore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMore: Self = this.set("loadMore", js.undefined)
    @scala.inline
    def setLoading(value: Boolean | SpinProps): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLocale(value: ListLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPagination(value: PaginationConfig | `false`): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRenderItem(value: (/* item */ T, /* index */ Double) => ReactNode): Self = this.set("renderItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
    @scala.inline
    def setRowKeyFunction1(value: /* item */ T => String): Self = this.set("rowKey", js.Any.fromFunction1(value))
    @scala.inline
    def setRowKey(value: (js.Function1[/* item */ T, String]) | String): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    @scala.inline
    def setSize(value: ListSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSplit(value: Boolean): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

