package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps[T] extends js.Object {
  var bodyStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var childrenColumnName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var components: js.UndefOr[TableComponents] = js.undefined
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var defaultExpandAllRows: js.UndefOr[scala.Boolean] = js.undefined
  var defaultExpandedRowKeys: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  var dropdownPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var expandIcon: js.UndefOr[js.Function1[/* props */ ExpandIconProps[T], reactLib.reactMod.ReactNode]] = js.undefined
  var expandIconAsCell: js.UndefOr[scala.Boolean] = js.undefined
  var expandIconColumnIndex: js.UndefOr[scala.Double] = js.undefined
  var expandRowByClick: js.UndefOr[scala.Boolean] = js.undefined
  var expandedRowKeys: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  var expandedRowRender: js.UndefOr[
    js.Function4[
      /* record */ T, 
      /* index */ scala.Double, 
      /* indent */ scala.Double, 
      /* expanded */ scala.Boolean, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var footer: js.UndefOr[
    js.Function1[/* currentPageData */ js.Array[js.Object], reactLib.reactMod.ReactNode]
  ] = js.undefined
  var indentSize: js.UndefOr[scala.Double] = js.undefined
  var loading: js.UndefOr[scala.Boolean | antdLib.esSpinMod.SpinProps] = js.undefined
  var locale: js.UndefOr[TableLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ antdLib.esPaginationPaginationMod.PaginationConfig, 
      /* filters */ antdLib.RecordkeyofTArraystring, 
      /* sorter */ SorterResult[T], 
      /* extra */ TableCurrentDataSource[T], 
      scala.Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[js.Function2[/* expanded */ scala.Boolean, /* record */ T, scala.Unit]] = js.undefined
  var onExpandedRowsChange: js.UndefOr[
    js.Function1[/* expandedRowKeys */ js.Array[scala.Double | java.lang.String], scala.Unit]
  ] = js.undefined
  var onHeaderRow: js.UndefOr[
    js.Function2[/* columns */ js.Array[ColumnProps[T]], /* index */ scala.Double, _]
  ] = js.undefined
  var onRow: js.UndefOr[js.Function2[/* record */ T, /* index */ scala.Double, _]] = js.undefined
  var onRowClick: js.UndefOr[
    js.Function3[/* record */ T, /* index */ scala.Double, /* event */ stdLib.Event, scala.Unit]
  ] = js.undefined
  var pagination: js.UndefOr[
    antdLib.esPaginationPaginationMod.PaginationConfig | antdLib.antdLibNumbers.`false`
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var rowClassName: js.UndefOr[js.Function2[/* record */ T, /* index */ scala.Double, java.lang.String]] = js.undefined
  var rowKey: js.UndefOr[
    java.lang.String | (js.Function2[/* record */ T, /* index */ scala.Double, java.lang.String])
  ] = js.undefined
  var rowSelection: js.UndefOr[TableRowSelection[T]] = js.undefined
  var scroll: js.UndefOr[antdLib.Anon_X] = js.undefined
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[TableSize] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[
    js.Function1[/* currentPageData */ js.Array[js.Object], reactLib.reactMod.ReactNode]
  ] = js.undefined
  var useFixedHeader: js.UndefOr[scala.Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply[T](
    bodyStyle: reactLib.reactMod.CSSProperties = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    childrenColumnName: java.lang.String = null,
    className: java.lang.String = null,
    columns: js.Array[ColumnProps[T]] = null,
    components: TableComponents = null,
    dataSource: js.Array[T] = null,
    defaultExpandAllRows: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[scala.Double | java.lang.String] = null,
    dropdownPrefixCls: java.lang.String = null,
    expandIcon: /* props */ ExpandIconProps[T] => reactLib.reactMod.ReactNode = null,
    expandIconAsCell: js.UndefOr[scala.Boolean] = js.undefined,
    expandIconColumnIndex: scala.Int | scala.Double = null,
    expandRowByClick: js.UndefOr[scala.Boolean] = js.undefined,
    expandedRowKeys: js.Array[scala.Double | java.lang.String] = null,
    expandedRowRender: (/* record */ T, /* index */ scala.Double, /* indent */ scala.Double, /* expanded */ scala.Boolean) => reactLib.reactMod.ReactNode = null,
    footer: /* currentPageData */ js.Array[js.Object] => reactLib.reactMod.ReactNode = null,
    indentSize: scala.Int | scala.Double = null,
    loading: scala.Boolean | antdLib.esSpinMod.SpinProps = null,
    locale: TableLocale = null,
    onChange: (/* pagination */ antdLib.esPaginationPaginationMod.PaginationConfig, /* filters */ antdLib.RecordkeyofTArraystring, /* sorter */ SorterResult[T], /* extra */ TableCurrentDataSource[T]) => scala.Unit = null,
    onExpand: (/* expanded */ scala.Boolean, /* record */ T) => scala.Unit = null,
    onExpandedRowsChange: /* expandedRowKeys */ js.Array[scala.Double | java.lang.String] => scala.Unit = null,
    onHeaderRow: (/* columns */ js.Array[ColumnProps[T]], /* index */ scala.Double) => _ = null,
    onRow: (/* record */ T, /* index */ scala.Double) => _ = null,
    onRowClick: (/* record */ T, /* index */ scala.Double, /* event */ stdLib.Event) => scala.Unit = null,
    pagination: antdLib.esPaginationPaginationMod.PaginationConfig | antdLib.antdLibNumbers.`false` = null,
    prefixCls: java.lang.String = null,
    rowClassName: (/* record */ T, /* index */ scala.Double) => java.lang.String = null,
    rowKey: java.lang.String | (js.Function2[/* record */ T, /* index */ scala.Double, java.lang.String]) = null,
    rowSelection: TableRowSelection[T] = null,
    scroll: antdLib.Anon_X = null,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    size: TableSize = null,
    sortDirections: js.Array[SortOrder] = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: /* currentPageData */ js.Array[js.Object] => reactLib.reactMod.ReactNode = null,
    useFixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  ): TableProps[T] = {
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
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4(onChange))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2(onExpand))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1(onExpandedRowsChange))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2(onHeaderRow))
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
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader)
    __obj.asInstanceOf[TableProps[T]]
  }
}

