package typings.antd.libListMod

import typings.antd.antdBooleans.`false`
import typings.antd.libPaginationPaginationMod.PaginationConfig
import typings.antd.libSpinMod.SpinProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps[T] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var grid: js.UndefOr[ListGridType] = js.undefined
  var header: js.UndefOr[ReactNode] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var itemLayout: js.UndefOr[ListItemLayout] = js.undefined
  var loadMore: js.UndefOr[ReactNode] = js.undefined
  var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
  var locale: js.UndefOr[ListLocale] = js.undefined
  var pagination: js.UndefOr[PaginationConfig | `false`] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderItem: js.UndefOr[js.Function2[/* item */ T, /* index */ Double, ReactNode]] = js.undefined
  var rowKey: js.UndefOr[(js.Function1[/* item */ T, String]) | String] = js.undefined
  var size: js.UndefOr[ListSize] = js.undefined
  var split: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ListProps {
  @scala.inline
  def apply[T](
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    dataSource: js.Array[T] = null,
    extra: ReactNode = null,
    footer: ReactNode = null,
    grid: ListGridType = null,
    header: ReactNode = null,
    id: String = null,
    itemLayout: ListItemLayout = null,
    loadMore: ReactNode = null,
    loading: Boolean | SpinProps = null,
    locale: ListLocale = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    renderItem: (/* item */ T, /* index */ Double) => ReactNode = null,
    rowKey: (js.Function1[/* item */ T, String]) | String = null,
    size: ListSize = null,
    split: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ListProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    if (loadMore != null) __obj.updateDynamic("loadMore")(loadMore.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps[T]]
  }
}

