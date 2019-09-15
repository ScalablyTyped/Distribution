package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.antdNumbers.`false`
import typings.antd.esListMod.ListGridType
import typings.antd.esListMod.ListItemLayout
import typings.antd.esListMod.ListLocale
import typings.antd.esListMod.ListProps
import typings.antd.esListMod.ListSize
import typings.antd.esListMod.default
import typings.antd.esPaginationPaginationMod.PaginationConfig
import typings.antd.esSpinMod.SpinProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, id, className */
object List
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esListMod.default[js.Any]].asInstanceOf[String | js.Object]
  def apply[T](
    bordered: js.UndefOr[Boolean] = js.undefined,
    dataSource: js.Array[T] = null,
    extra: TagMod[Any] = null,
    footer: TagMod[Any] = null,
    grid: ListGridType = null,
    header: TagMod[Any] = null,
    itemLayout: ListItemLayout = null,
    loadMore: TagMod[Any] = null,
    loading: Boolean | SpinProps = null,
    locale: ListLocale = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    renderItem: (/* item */ T, /* index */ Double) => TagMod[Any] = null,
    rowKey: (js.Function1[/* item */ T, String]) | String = null,
    size: ListSize = null,
    split: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (header != null) __obj.updateDynamic("header")(header)
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout)
    if (loadMore != null) __obj.updateDynamic("loadMore")(loadMore)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typings.antd.esListMod.default[js.Any]]]
  }
  type Props = ListProps[js.Any]
}

