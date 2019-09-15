package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.antd.Anon_GoButton
import typings.antd.antdStrings.`jump-next`
import typings.antd.antdStrings.`jump-prev`
import typings.antd.antdStrings.next
import typings.antd.antdStrings.page
import typings.antd.antdStrings.prev
import typings.antd.esPaginationMod.default
import typings.antd.esPaginationPaginationMod.PaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: role, style, className, disabled */
object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esPaginationMod.default].asInstanceOf[String | js.Object]
  def apply(
    current: Int | Double = null,
    defaultCurrent: Int | Double = null,
    defaultPageSize: Int | Double = null,
    hideOnSinglePage: js.UndefOr[Boolean] = js.undefined,
    itemRender: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ ReactElement) => TagMod[Any] = null,
    locale: js.Object = null,
    onChange: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Unit = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Unit = null,
    pageSize: Int | Double = null,
    pageSizeOptions: js.Array[String] = null,
    prefixCls: String = null,
    selectPrefixCls: String = null,
    showLessItems: js.UndefOr[Boolean] = js.undefined,
    showQuickJumper: Boolean | Anon_GoButton = null,
    showSizeChanger: js.UndefOr[Boolean] = js.undefined,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => TagMod[Any] = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    total: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage)
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls)
    if (!js.isUndefined(showLessItems)) __obj.updateDynamic("showLessItems")(showLessItems)
    if (showQuickJumper != null) __obj.updateDynamic("showQuickJumper")(showQuickJumper.asInstanceOf[js.Any])
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger)
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (size != null) __obj.updateDynamic("size")(size)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

