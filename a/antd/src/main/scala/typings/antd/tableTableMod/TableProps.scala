package typings.antd.tableTableMod

import typings.antd.anon.ScrollToFirstRowOnChange
import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import typings.antd.configProviderSizeContextMod.SizeType
import typings.antd.spinMod.SpinProps
import typings.antd.tableInterfaceMod.ColumnGroupType
import typings.antd.tableInterfaceMod.ColumnsType
import typings.antd.tableInterfaceMod.GetPopupContainer
import typings.antd.tableInterfaceMod.SortOrder
import typings.antd.tableInterfaceMod.SorterResult
import typings.antd.tableInterfaceMod.TableCurrentDataSource
import typings.antd.tableInterfaceMod.TableLocale
import typings.antd.tableInterfaceMod.TablePaginationConfig
import typings.antd.tableInterfaceMod.TableRowSelection
import typings.rcTable.anon.X
import typings.rcTable.interfaceMod.ColumnType
import typings.rcTable.interfaceMod.ExpandableConfig
import typings.rcTable.interfaceMod.ExpandedRowRender
import typings.rcTable.interfaceMod.GetComponentProps
import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.PanelRender
import typings.rcTable.interfaceMod.RenderExpandIcon
import typings.rcTable.interfaceMod.RenderExpandIconProps
import typings.rcTable.interfaceMod.RowClassName
import typings.rcTable.interfaceMod.TableComponents
import typings.rcTable.interfaceMod.TableLayout
import typings.rcTable.interfaceMod.TableSticky
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<rc-table.rc-table/lib/Table.TableProps<RecordType>, 'transformColumns' | 'internalHooks' | 'internalRefs' | 'data' | 'columns' | 'scroll' | 'emptyText'> */
@js.native
trait TableProps[RecordType] extends js.Object {
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var childrenColumnName: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.native
  
  var components: js.UndefOr[TableComponents[RecordType]] = js.native
  
  var dataSource: js.UndefOr[js.Array[RecordType]] = js.native
  
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.native
  
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  
  var direction: js.UndefOr[ltr | rtl] = js.native
  
  var dropdownPrefixCls: js.UndefOr[String] = js.native
  
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.native
  
  var expandIconColumnIndex: js.UndefOr[Double] = js.native
  
  var expandRowByClick: js.UndefOr[Boolean] = js.native
  
  var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.native
  
  var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.native
  
  var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.native
  
  var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.native
  
  var footer: js.UndefOr[PanelRender[RecordType]] = js.native
  
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var indentSize: js.UndefOr[Double] = js.native
  
  var loading: js.UndefOr[Boolean | SpinProps] = js.native
  
  var locale: js.UndefOr[TableLocale] = js.native
  
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ TablePaginationConfig, 
      /* filters */ Record[String, js.Array[typings.antd.tableInterfaceMod.Key] | Null], 
      /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], 
      /* extra */ TableCurrentDataSource[RecordType], 
      Unit
    ]
  ] = js.native
  
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.native
  
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.native
  
  var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.native
  
  var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.native
  
  var pagination: js.UndefOr[`false` | TablePaginationConfig] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.native
  
  var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.native
  
  var rowSelection: js.UndefOr[TableRowSelection[RecordType]] = js.native
  
  var scroll: js.UndefOr[js.UndefOr[X] with ScrollToFirstRowOnChange] = js.native
  
  var showHeader: js.UndefOr[Boolean] = js.native
  
  var showSorterTooltip: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
  
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.native
  
  var sticky: js.UndefOr[Boolean | TableSticky] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], ReactNode]] = js.native
  
  var tableLayout: js.UndefOr[TableLayout] = js.native
  
  var title: js.UndefOr[PanelRender[RecordType]] = js.native
}
object TableProps {
  
  @scala.inline
  def apply[RecordType](): TableProps[RecordType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableProps[RecordType]]
  }
  
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps[_], RecordType] (val x: Self with TableProps[RecordType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenColumnName(value: String): Self = this.set("childrenColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildrenColumnName: Self = this.set("childrenColumnName", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (ColumnGroupType[RecordType] | typings.antd.tableInterfaceMod.ColumnType[RecordType])*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: ColumnsType[RecordType]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setComponents(value: TableComponents[RecordType]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: RecordType*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[RecordType]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDefaultExpandAllRows(value: Boolean): Self = this.set("defaultExpandAllRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpandAllRows: Self = this.set("defaultExpandAllRows", js.undefined)
    
    @scala.inline
    def setDefaultExpandedRowKeysVarargs(value: Key*): Self = this.set("defaultExpandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = this.set("defaultExpandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExpandedRowKeys: Self = this.set("defaultExpandedRowKeys", js.undefined)
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDropdownPrefixCls(value: String): Self = this.set("dropdownPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownPrefixCls: Self = this.set("dropdownPrefixCls", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = this.set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    
    @scala.inline
    def setExpandIconColumnIndex(value: Double): Self = this.set("expandIconColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandIconColumnIndex: Self = this.set("expandIconColumnIndex", js.undefined)
    
    @scala.inline
    def setExpandRowByClick(value: Boolean): Self = this.set("expandRowByClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandRowByClick: Self = this.set("expandRowByClick", js.undefined)
    
    @scala.inline
    def setExpandable(value: ExpandableConfig[RecordType]): Self = this.set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    
    @scala.inline
    def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = this.set("expandedRowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExpandedRowClassName: Self = this.set("expandedRowClassName", js.undefined)
    
    @scala.inline
    def setExpandedRowKeysVarargs(value: Key*): Self = this.set("expandedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandedRowKeys(value: js.Array[Key]): Self = this.set("expandedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedRowKeys: Self = this.set("expandedRowKeys", js.undefined)
    
    @scala.inline
    def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = this.set("expandedRowRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteExpandedRowRender: Self = this.set("expandedRowRender", js.undefined)
    
    @scala.inline
    def setFooter(value: /* data */ js.Array[RecordType] => ReactNode): Self = this.set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndentSize(value: Double): Self = this.set("indentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentSize: Self = this.set("indentSize", js.undefined)
    
    @scala.inline
    def setLoading(value: Boolean | SpinProps): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setLocale(value: TableLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* pagination */ TablePaginationConfig, /* filters */ Record[String, js.Array[typings.antd.tableInterfaceMod.Key] | Null], /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], /* extra */ TableCurrentDataSource[RecordType]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = this.set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = this.set("onExpandedRowsChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExpandedRowsChange: Self = this.set("onExpandedRowsChange", js.undefined)
    
    @scala.inline
    def setOnHeaderRow(
      value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
    ): Self = this.set("onHeaderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHeaderRow: Self = this.set("onHeaderRow", js.undefined)
    
    @scala.inline
    def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = this.set("onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRow: Self = this.set("onRow", js.undefined)
    
    @scala.inline
    def setPagination(value: `false` | TablePaginationConfig): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = this.set("rowClassName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRowClassName(value: String | RowClassName[RecordType]): Self = this.set("rowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowClassName: Self = this.set("rowClassName", js.undefined)
    
    @scala.inline
    def setRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = this.set("rowKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowKey(value: String | GetRowKey[RecordType]): Self = this.set("rowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowKey: Self = this.set("rowKey", js.undefined)
    
    @scala.inline
    def setRowSelection(value: TableRowSelection[RecordType]): Self = this.set("rowSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSelection: Self = this.set("rowSelection", js.undefined)
    
    @scala.inline
    def setScroll(value: js.UndefOr[X] with ScrollToFirstRowOnChange): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    
    @scala.inline
    def setShowSorterTooltip(value: Boolean): Self = this.set("showSorterTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSorterTooltip: Self = this.set("showSorterTooltip", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSortDirectionsVarargs(value: SortOrder*): Self = this.set("sortDirections", js.Array(value :_*))
    
    @scala.inline
    def setSortDirections(value: js.Array[SortOrder]): Self = this.set("sortDirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirections: Self = this.set("sortDirections", js.undefined)
    
    @scala.inline
    def setSticky(value: Boolean | TableSticky): Self = this.set("sticky", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSummary(value: /* data */ js.Array[RecordType] => ReactNode): Self = this.set("summary", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTableLayout(value: TableLayout): Self = this.set("tableLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableLayout: Self = this.set("tableLayout", js.undefined)
    
    @scala.inline
    def setTitle(value: /* data */ js.Array[RecordType] => ReactNode): Self = this.set("title", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
