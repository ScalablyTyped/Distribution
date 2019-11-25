package typings.antd.libTableInterfaceMod

import typings.antd.Anon_ScrollToFirstRowOnChange
import typings.antd.antdNumbers.`false`
import typings.antd.libPaginationPaginationMod.PaginationConfig
import typings.antd.libSpinMod.SpinProps
import typings.csstype.csstypeMod.TableLayoutProperty
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps[T] extends js.Object {
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var childrenColumnName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var components: js.UndefOr[TableComponents] = js.undefined
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var dropdownPrefixCls: js.UndefOr[String] = js.undefined
  var expandIcon: js.UndefOr[js.Function1[/* props */ ExpandIconProps[T], ReactNode]] = js.undefined
  var expandIconAsCell: js.UndefOr[Boolean] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  var expandedRowKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var expandedRowRender: js.UndefOr[
    js.Function4[
      /* record */ T, 
      /* index */ Double, 
      /* indent */ Double, 
      /* expanded */ Boolean, 
      ReactNode
    ]
  ] = js.undefined
  var footer: js.UndefOr[js.Function1[/* currentPageData */ js.Array[T], ReactNode]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var indentSize: js.UndefOr[Double] = js.undefined
  var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
  var locale: js.UndefOr[TableLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ PaginationConfig, 
      /* filters */ Record[String, js.Array[String]], 
      /* sorter */ SorterResult[T], 
      /* extra */ TableCurrentDataSource[T], 
      Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ T, Unit]] = js.undefined
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedRowKeys */ js.Array[Double | String], Unit]] = js.undefined
  var onHeaderRow: js.UndefOr[js.Function1[/* columns */ js.Array[ColumnProps[T]], TableEventListeners]] = js.undefined
  var onRow: js.UndefOr[js.Function2[/* record */ T, /* index */ Double, TableEventListeners]] = js.undefined
  var onRowClick: js.UndefOr[js.Function3[/* record */ T, /* index */ Double, /* event */ Event, Unit]] = js.undefined
  var pagination: js.UndefOr[PaginationConfig | `false`] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowClassName: js.UndefOr[js.Function2[/* record */ T, /* index */ Double, String]] = js.undefined
  var rowKey: js.UndefOr[String | (js.Function2[/* record */ T, /* index */ Double, String])] = js.undefined
  var rowSelection: js.UndefOr[TableRowSelection[T]] = js.undefined
  var scroll: js.UndefOr[Anon_ScrollToFirstRowOnChange] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[TableSize] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tableLayout: js.UndefOr[TableLayoutProperty] = js.undefined
  var title: js.UndefOr[js.Function1[/* currentPageData */ js.Array[T], ReactNode]] = js.undefined
  var useFixedHeader: js.UndefOr[Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply[T](
    bodyStyle: CSSProperties = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    childrenColumnName: String = null,
    className: String = null,
    columns: js.Array[ColumnProps[T]] = null,
    components: TableComponents = null,
    dataSource: js.Array[T] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Double | String] = null,
    dropdownPrefixCls: String = null,
    expandIcon: /* props */ ExpandIconProps[T] => ReactNode = null,
    expandIconAsCell: js.UndefOr[Boolean] = js.undefined,
    expandIconColumnIndex: Int | Double = null,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandedRowKeys: js.Array[Double | String] = null,
    expandedRowRender: (/* record */ T, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode = null,
    footer: /* currentPageData */ js.Array[T] => ReactNode = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    indentSize: Int | Double = null,
    loading: Boolean | SpinProps = null,
    locale: TableLocale = null,
    onChange: (/* pagination */ PaginationConfig, /* filters */ Record[String, js.Array[String]], /* sorter */ SorterResult[T], /* extra */ TableCurrentDataSource[T]) => Unit = null,
    onExpand: (/* expanded */ Boolean, /* record */ T) => Unit = null,
    onExpandedRowsChange: /* expandedRowKeys */ js.Array[Double | String] => Unit = null,
    onHeaderRow: /* columns */ js.Array[ColumnProps[T]] => TableEventListeners = null,
    onRow: (/* record */ T, /* index */ Double) => TableEventListeners = null,
    onRowClick: (/* record */ T, /* index */ Double, /* event */ Event) => Unit = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    rowClassName: (/* record */ T, /* index */ Double) => String = null,
    rowKey: String | (js.Function2[/* record */ T, /* index */ Double, String]) = null,
    rowSelection: TableRowSelection[T] = null,
    scroll: Anon_ScrollToFirstRowOnChange = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    size: TableSize = null,
    sortDirections: js.Array[SortOrder] = null,
    style: CSSProperties = null,
    tableLayout: TableLayoutProperty = null,
    title: /* currentPageData */ js.Array[T] => ReactNode = null,
    useFixedHeader: js.UndefOr[Boolean] = js.undefined
  ): TableProps[T] = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (!js.isUndefined(expandIconAsCell)) __obj.updateDynamic("expandIconAsCell")(expandIconAsCell.asInstanceOf[js.Any])
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.asInstanceOf[js.Any])
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4(expandedRowRender))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction1(onHeaderRow))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3(onRowClick))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction2(rowClassName))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps[T]]
  }
}

