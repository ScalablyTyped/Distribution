package typings.antd.paginationPaginationMod

import typings.antd.AnonGoButton
import typings.antd.antdStrings.`jump-next`
import typings.antd.antdStrings.`jump-prev`
import typings.antd.antdStrings.next
import typings.antd.antdStrings.page
import typings.antd.antdStrings.prev
import typings.antd.antdStrings.small
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var current: js.UndefOr[Double] = js.undefined
  var defaultCurrent: js.UndefOr[Double] = js.undefined
  var defaultPageSize: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hideOnSinglePage: js.UndefOr[Boolean] = js.undefined
  var itemRender: js.UndefOr[
    js.Function3[
      /* page */ Double, 
      /* type */ page | prev | next | `jump-prev` | `jump-next`, 
      /* originalElement */ ReactElement, 
      ReactNode
    ]
  ] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* page */ Double, /* pageSize */ js.UndefOr[Double], Unit]] = js.undefined
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ Double, /* size */ Double, Unit]] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageSizeOptions: js.UndefOr[js.Array[String]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var selectPrefixCls: js.UndefOr[String] = js.undefined
  var showLessItems: js.UndefOr[Boolean] = js.undefined
  var showQuickJumper: js.UndefOr[Boolean | AnonGoButton] = js.undefined
  var showSizeChanger: js.UndefOr[Boolean] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var showTotal: js.UndefOr[
    js.Function2[/* total */ Double, /* range */ js.Tuple2[Double, Double], ReactNode]
  ] = js.undefined
  var simple: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[typings.antd.antdStrings.default | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object PaginationProps {
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
    prefixCls: String = null,
    responsive: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    selectPrefixCls: String = null,
    showLessItems: js.UndefOr[Boolean] = js.undefined,
    showQuickJumper: Boolean | AnonGoButton = null,
    showSizeChanger: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => ReactNode = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    size: typings.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    total: Int | Double = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showLessItems)) __obj.updateDynamic("showLessItems")(showLessItems.asInstanceOf[js.Any])
    if (showQuickJumper != null) __obj.updateDynamic("showQuickJumper")(showQuickJumper.asInstanceOf[js.Any])
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

