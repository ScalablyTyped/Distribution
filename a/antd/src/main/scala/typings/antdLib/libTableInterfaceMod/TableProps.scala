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
  var locale: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* pagination */ antdLib.libPaginationPaginationMod.PaginationConfig, 
      /* filters */ stdLib.Record[java.lang.String, js.Array[java.lang.String]], 
      /* sorter */ SorterResult[T], 
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
  var scroll: js.UndefOr[antdLib.Anon_Y] = js.undefined
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[TableSize] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var title: js.UndefOr[
    js.Function1[/* currentPageData */ js.Array[js.Object], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var useFixedHeader: js.UndefOr[scala.Boolean] = js.undefined
}

