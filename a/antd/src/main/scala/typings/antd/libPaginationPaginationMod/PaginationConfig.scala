package typings.antd.libPaginationPaginationMod

import typings.antd.Anon_GoButton
import typings.antd.antdStrings.`jump-next`
import typings.antd.antdStrings.`jump-prev`
import typings.antd.antdStrings.both
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.next
import typings.antd.antdStrings.page
import typings.antd.antdStrings.prev
import typings.antd.antdStrings.top
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationConfig extends PaginationProps {
  var position: js.UndefOr[top | bottom | both] = js.undefined
}

object PaginationConfig {
  @scala.inline
  def apply(
    className: String = null,
    current: Int | Double = null,
    defaultCurrent: Int | Double = null,
    defaultPageSize: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideOnSinglePage: js.UndefOr[Boolean] = js.undefined,
    itemRender: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ ReactElement) => ReactNode = null,
    locale: js.Object = null,
    onChange: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Unit = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Unit = null,
    pageSize: Int | Double = null,
    pageSizeOptions: js.Array[String] = null,
    position: top | bottom | both = null,
    prefixCls: String = null,
    role: String = null,
    selectPrefixCls: String = null,
    showLessItems: js.UndefOr[Boolean] = js.undefined,
    showQuickJumper: Boolean | Anon_GoButton = null,
    showSizeChanger: js.UndefOr[Boolean] = js.undefined,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactNode = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    style: CSSProperties = null,
    total: Int | Double = null
  ): PaginationConfig = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage)
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls)
    if (!js.isUndefined(showLessItems)) __obj.updateDynamic("showLessItems")(showLessItems)
    if (showQuickJumper != null) __obj.updateDynamic("showQuickJumper")(showQuickJumper.asInstanceOf[js.Any])
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger)
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationConfig]
  }
}

