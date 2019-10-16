package typings.antd

import typings.antd.antdNumbers.`false`
import typings.antd.esPaginationPaginationMod.PaginationConfig
import typings.antd.esSpinMod.SpinProps
import typings.antd.esTableInterfaceMod.ColumnProps
import typings.antd.esTableInterfaceMod.ExpandIconProps
import typings.antd.esTableInterfaceMod.SortOrder
import typings.antd.esTableInterfaceMod.SorterResult
import typings.antd.esTableInterfaceMod.TableComponents
import typings.antd.esTableInterfaceMod.TableCurrentDataSource
import typings.antd.esTableInterfaceMod.TableEventListeners
import typings.antd.esTableInterfaceMod.TableLocale
import typings.antd.esTableInterfaceMod.TableRowSelection
import typings.antd.esTableInterfaceMod.TableSize
import typings.csstype.csstypeMod.TableLayoutProperty
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<antd.antd/es/table/interface.TableProps<any>, 'loading' | 'footer' | 'style' | 'title' | 'scroll' | 'size' | 'children' | 'className' | 'prefixCls' | 'locale' | 'getPopupContainer' | 'onChange' | 'dataSource' | 'expandIcon' | 'tableLayout' | 'columns' | 'bordered' | 'bodyStyle' | 'pagination' | 'rowKey' | 'dropdownPrefixCls' | 'rowSelection' | 'components' | 'rowClassName' | 'expandedRowRender' | 'defaultExpandAllRows' | 'defaultExpandedRowKeys' | 'expandedRowKeys' | 'expandIconAsCell' | 'expandIconColumnIndex' | 'expandRowByClick' | 'onExpandedRowsChange' | 'onExpand' | 'indentSize' | 'onRowClick' | 'onRow' | 'onHeaderRow' | 'useFixedHeader' | 'showHeader' | 'childrenColumnName' | 'sortDirections'> */
trait PickTablePropsanyloadingfooterstyletitlescrollsize extends js.Object {
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var childrenColumnName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnProps[_]]] = js.undefined
  var components: js.UndefOr[TableComponents] = js.undefined
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var dropdownPrefixCls: js.UndefOr[String] = js.undefined
  var expandIcon: js.UndefOr[js.Function1[/* props */ ExpandIconProps[_], ReactNode]] = js.undefined
  var expandIconAsCell: js.UndefOr[Boolean] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  var expandedRowKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var expandedRowRender: js.UndefOr[
    js.Function4[
      /* record */ js.Any, 
      /* index */ Double, 
      /* indent */ Double, 
      /* expanded */ Boolean, 
      ReactNode
    ]
  ] = js.undefined
  var footer: js.UndefOr[js.Function1[/* currentPageData */ js.Array[_], ReactNode]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var indentSize: js.UndefOr[Double] = js.undefined
  var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
  var locale: js.UndefOr[TableLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ PaginationConfig, 
      /* filters */ Record[String, js.Array[String]], 
      /* sorter */ SorterResult[_], 
      /* extra */ TableCurrentDataSource[_], 
      Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ js.Any, Unit]] = js.undefined
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedRowKeys */ js.Array[Double | String], Unit]] = js.undefined
  var onHeaderRow: js.UndefOr[js.Function1[/* columns */ js.Array[ColumnProps[_]], TableEventListeners]] = js.undefined
  var onRow: js.UndefOr[js.Function2[/* record */ js.Any, /* index */ Double, TableEventListeners]] = js.undefined
  var onRowClick: js.UndefOr[js.Function3[/* record */ js.Any, /* index */ Double, /* event */ Event, Unit]] = js.undefined
  var pagination: js.UndefOr[PaginationConfig | `false`] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowClassName: js.UndefOr[js.Function2[/* record */ js.Any, /* index */ Double, String]] = js.undefined
  var rowKey: js.UndefOr[String | (js.Function2[/* record */ js.Any, /* index */ Double, String])] = js.undefined
  var rowSelection: js.UndefOr[TableRowSelection[_]] = js.undefined
  var scroll: js.UndefOr[Anon_ScrollToFirstRowOnChange] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[TableSize] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tableLayout: js.UndefOr[TableLayoutProperty] = js.undefined
  var title: js.UndefOr[js.Function1[/* currentPageData */ js.Array[_], ReactNode]] = js.undefined
  var useFixedHeader: js.UndefOr[Boolean] = js.undefined
}

object PickTablePropsanyloadingfooterstyletitlescrollsize {
  @scala.inline
  def apply(
    bodyStyle: CSSProperties = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    childrenColumnName: String = null,
    className: String = null,
    columns: js.Array[ColumnProps[_]] = null,
    components: TableComponents = null,
    dataSource: js.Array[_] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Double | String] = null,
    dropdownPrefixCls: String = null,
    expandIcon: /* props */ ExpandIconProps[_] => ReactNode = null,
    expandIconAsCell: js.UndefOr[Boolean] = js.undefined,
    expandIconColumnIndex: Int | Double = null,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandedRowKeys: js.Array[Double | String] = null,
    expandedRowRender: (/* record */ js.Any, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode = null,
    footer: /* currentPageData */ js.Array[_] => ReactNode = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    indentSize: Int | Double = null,
    loading: Boolean | SpinProps = null,
    locale: TableLocale = null,
    onChange: (/* pagination */ PaginationConfig, /* filters */ Record[String, js.Array[String]], /* sorter */ SorterResult[_], /* extra */ TableCurrentDataSource[_]) => Unit = null,
    onExpand: (/* expanded */ Boolean, /* record */ js.Any) => Unit = null,
    onExpandedRowsChange: /* expandedRowKeys */ js.Array[Double | String] => Unit = null,
    onHeaderRow: /* columns */ js.Array[ColumnProps[_]] => TableEventListeners = null,
    onRow: (/* record */ js.Any, /* index */ Double) => TableEventListeners = null,
    onRowClick: (/* record */ js.Any, /* index */ Double, /* event */ Event) => Unit = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    rowClassName: (/* record */ js.Any, /* index */ Double) => String = null,
    rowKey: String | (js.Function2[/* record */ js.Any, /* index */ Double, String]) = null,
    rowSelection: TableRowSelection[_] = null,
    scroll: Anon_ScrollToFirstRowOnChange = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    size: TableSize = null,
    sortDirections: js.Array[SortOrder] = null,
    style: CSSProperties = null,
    tableLayout: TableLayoutProperty = null,
    title: /* currentPageData */ js.Array[_] => ReactNode = null,
    useFixedHeader: js.UndefOr[Boolean] = js.undefined
  ): PickTablePropsanyloadingfooterstyletitlescrollsize = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle)
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName)
    if (className != null) __obj.updateDynamic("className")(className)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (components != null) __obj.updateDynamic("components")(components)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows)
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys)
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (!js.isUndefined(expandIconAsCell)) __obj.updateDynamic("expandIconAsCell")(expandIconAsCell)
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick)
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys)
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4(expandedRowRender))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction1(onHeaderRow))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3(onRowClick))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction2(rowClassName))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (size != null) __obj.updateDynamic("size")(size)
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout)
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader)
    __obj.asInstanceOf[PickTablePropsanyloadingfooterstyletitlescrollsize]
  }
}

