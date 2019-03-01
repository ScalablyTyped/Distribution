package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps[T] extends js.Object {
  var bodyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var childrenColumnName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var components: js.UndefOr[TableComponents] = js.undefined
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var defaultExpandAllRows: js.UndefOr[scala.Boolean] = js.undefined
  var defaultExpandedRowKeys: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  var dropdownPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var expandIcon: js.UndefOr[
    js.Function1[/* props */ ExpandIconProps[T], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var expandIconAsCell: js.UndefOr[scala.Boolean] = js.undefined
  var expandIconColumnIndex: js.UndefOr[scala.Double] = js.undefined
  var expandRowByClick: js.UndefOr[scala.Boolean] = js.undefined
  var expandedRowKeys: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  var expandedRowRender: js.UndefOr[
    js.Function4[
      /* record */ T, 
      /* index */ scala.Double, 
      /* indent */ scala.Double, 
      /* expanded */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var footer: js.UndefOr[
    js.Function1[/* currentPageData */ js.Array[js.Object], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var indentSize: js.UndefOr[scala.Double] = js.undefined
  var loading: js.UndefOr[scala.Boolean | antdLib.libSpinMod.SpinProps] = js.undefined
  var locale: js.UndefOr[TableLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ antdLib.libPaginationPaginationMod.PaginationConfig, 
      /* filters */ stdLib.Record[java.lang.String, js.Array[java.lang.String]], 
      /* sorter */ SorterResult[T], 
      /* extra */ TableCurrentDataSource[T], 
      scala.Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[js.Function2[/* expanded */ scala.Boolean, /* record */ T, scala.Unit]] = js.undefined
  var onExpandedRowsChange: js.UndefOr[
    js.Function1[
      /* expandedRowKeys */ js.Array[java.lang.String] | js.Array[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  var onHeaderRow: js.UndefOr[
    js.Function2[/* columns */ js.Array[ColumnProps[T]], /* index */ scala.Double, _]
  ] = js.undefined
  var onRow: js.UndefOr[js.Function2[/* record */ T, /* index */ scala.Double, _]] = js.undefined
  var onRowClick: js.UndefOr[
    js.Function3[/* record */ T, /* index */ scala.Double, /* event */ reactLib.Event, scala.Unit]
  ] = js.undefined
  var pagination: js.UndefOr[
    antdLib.libPaginationPaginationMod.PaginationConfig | antdLib.antdLibNumbers.`false`
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
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[
    js.Function1[/* currentPageData */ js.Array[js.Object], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var useFixedHeader: js.UndefOr[scala.Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply[T](
    bodyStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    childrenColumnName: java.lang.String = null,
    className: java.lang.String = null,
    columns: js.Array[ColumnProps[T]] = null,
    components: TableComponents = null,
    dataSource: js.Array[T] = null,
    defaultExpandAllRows: js.UndefOr[scala.Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[java.lang.String] | js.Array[scala.Double] = null,
    dropdownPrefixCls: java.lang.String = null,
    expandIcon: js.Function1[/* props */ ExpandIconProps[T], reactLib.reactMod.ReactNs.ReactNode] = null,
    expandIconAsCell: js.UndefOr[scala.Boolean] = js.undefined,
    expandIconColumnIndex: scala.Int | scala.Double = null,
    expandRowByClick: js.UndefOr[scala.Boolean] = js.undefined,
    expandedRowKeys: js.Array[java.lang.String] | js.Array[scala.Double] = null,
    expandedRowRender: js.Function4[
      /* record */ T, 
      /* index */ scala.Double, 
      /* indent */ scala.Double, 
      /* expanded */ scala.Boolean, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    footer: js.Function1[/* currentPageData */ js.Array[js.Object], reactLib.reactMod.ReactNs.ReactNode] = null,
    indentSize: scala.Int | scala.Double = null,
    loading: scala.Boolean | antdLib.libSpinMod.SpinProps = null,
    locale: TableLocale = null,
    onChange: js.Function4[
      /* pagination */ antdLib.libPaginationPaginationMod.PaginationConfig, 
      /* filters */ stdLib.Record[java.lang.String, js.Array[java.lang.String]], 
      /* sorter */ SorterResult[T], 
      /* extra */ TableCurrentDataSource[T], 
      scala.Unit
    ] = null,
    onExpand: js.Function2[/* expanded */ scala.Boolean, /* record */ T, scala.Unit] = null,
    onExpandedRowsChange: js.Function1[
      /* expandedRowKeys */ js.Array[java.lang.String] | js.Array[scala.Double], 
      scala.Unit
    ] = null,
    onHeaderRow: js.Function2[/* columns */ js.Array[ColumnProps[T]], /* index */ scala.Double, _] = null,
    onRow: js.Function2[/* record */ T, /* index */ scala.Double, _] = null,
    onRowClick: js.Function3[/* record */ T, /* index */ scala.Double, /* event */ reactLib.Event, scala.Unit] = null,
    pagination: antdLib.libPaginationPaginationMod.PaginationConfig | antdLib.antdLibNumbers.`false` = null,
    prefixCls: java.lang.String = null,
    rowClassName: js.Function2[/* record */ T, /* index */ scala.Double, java.lang.String] = null,
    rowKey: java.lang.String | (js.Function2[/* record */ T, /* index */ scala.Double, java.lang.String]) = null,
    rowSelection: TableRowSelection[T] = null,
    scroll: antdLib.Anon_X = null,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    size: TableSize = null,
    sortDirections: js.Array[SortOrder] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: js.Function1[/* currentPageData */ js.Array[js.Object], reactLib.reactMod.ReactNs.ReactNode] = null,
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
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon)
    if (!js.isUndefined(expandIconAsCell)) __obj.updateDynamic("expandIconAsCell")(expandIconAsCell)
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick)
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(expandedRowRender)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onExpand != null) __obj.updateDynamic("onExpand")(onExpand)
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(onExpandedRowsChange)
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(onHeaderRow)
    if (onRow != null) __obj.updateDynamic("onRow")(onRow)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName)
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (size != null) __obj.updateDynamic("size")(size)
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader)
    __obj.asInstanceOf[TableProps[T]]
  }
}

