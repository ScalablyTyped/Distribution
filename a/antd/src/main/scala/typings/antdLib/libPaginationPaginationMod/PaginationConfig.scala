package typings
package antdLib.libPaginationPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationConfig extends PaginationProps {
  var position: js.UndefOr[
    antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.both
  ] = js.undefined
}

object PaginationConfig {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    current: scala.Int | scala.Double = null,
    defaultCurrent: scala.Int | scala.Double = null,
    defaultPageSize: scala.Int | scala.Double = null,
    hideOnSinglePage: js.UndefOr[scala.Boolean] = js.undefined,
    itemRender: (/* page */ scala.Double, /* type */ antdLib.antdLibStrings.page | antdLib.antdLibStrings.prev | antdLib.antdLibStrings.next | antdLib.antdLibStrings.`jump-prev` | antdLib.antdLibStrings.`jump-next`, /* originalElement */ reactLib.reactMod.ReactNs.ReactElement[stdLib.HTMLElement]) => reactLib.reactMod.ReactNs.ReactNode = null,
    locale: js.Object = null,
    onChange: (/* page */ scala.Double, /* pageSize */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onShowSizeChange: (/* current */ scala.Double, /* size */ scala.Double) => scala.Unit = null,
    pageSize: scala.Int | scala.Double = null,
    pageSizeOptions: js.Array[java.lang.String] = null,
    position: antdLib.antdLibStrings.top | antdLib.antdLibStrings.bottom | antdLib.antdLibStrings.both = null,
    prefixCls: java.lang.String = null,
    role: java.lang.String = null,
    selectPrefixCls: java.lang.String = null,
    showQuickJumper: scala.Boolean | antdLib.Anon_GoButton = null,
    showSizeChanger: js.UndefOr[scala.Boolean] = js.undefined,
    showTotal: (/* total */ scala.Double, /* range */ js.Tuple2[scala.Double, scala.Double]) => reactLib.reactMod.ReactNs.ReactNode = null,
    simple: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    total: scala.Int | scala.Double = null
  ): PaginationConfig = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
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
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls)
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

