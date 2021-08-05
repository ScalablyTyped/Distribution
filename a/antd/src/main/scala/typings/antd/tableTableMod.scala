package typings.antd

import typings.antd.anon.ScrollToFirstRowOnChange
import typings.antd.antdBooleans.`false`
import typings.antd.antdStrings.SELECT_ALL
import typings.antd.antdStrings.SELECT_INVERT
import typings.antd.antdStrings.ltr
import typings.antd.antdStrings.rtl
import typings.antd.columnGroupMod.ColumnGroupProps
import typings.antd.columnMod.ColumnProps
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
import typings.rcTable.footerCellMod.SummaryCellProps
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
import typings.rcTable.rowMod.FooterRowProps
import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod {
  
  object default {
    
    inline def apply[RecordType /* <: js.Object */](props: TableProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/table/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_Column.default` */
    inline def Column[RecordType](_underscore: ColumnProps[RecordType]): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Column")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_ColumnGroup.default` */
    inline def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ColumnGroup")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    @JSImport("antd/lib/table/Table", "default.SELECTION_ALL")
    @js.native
    def SELECTION_ALL: SELECT_ALL = js.native
    inline def SELECTION_ALL_=(x: SELECT_ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/table/Table", "default.SELECTION_INVERT")
    @js.native
    def SELECTION_INVERT: SELECT_INVERT = js.native
    inline def SELECTION_INVERT_=(x: SELECT_INVERT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_INVERT")(x.asInstanceOf[js.Any])
    
    object Summary {
      
      @JSImport("antd/lib/table/Table", "default.Summary")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/table/Table", "default.Summary.Cell")
      @js.native
      def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element] = js.native
      inline def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/table/Table", "default.Summary.Row")
      @js.native
      def Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
      inline def Row_=(x: js.Function1[/* props */ FooterRowProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
    }
    
    object defaultProps {
      
      @JSImport("antd/lib/table/Table", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/table/Table", "default.defaultProps.rowKey")
      @js.native
      def rowKey: String = js.native
      inline def rowKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(x.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<rc-table.rc-table/lib/Table.TableProps<RecordType>, 'transformColumns' | 'internalHooks' | 'internalRefs' | 'data' | 'columns' | 'scroll' | 'emptyText'> */
  trait TableProps[RecordType] extends StObject {
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var childrenColumnName: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
    
    var components: js.UndefOr[TableComponents[RecordType]] = js.undefined
    
    var dataSource: js.UndefOr[js.Array[RecordType]] = js.undefined
    
    var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
    
    var defaultExpandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    var dropdownPrefixCls: js.UndefOr[String] = js.undefined
    
    var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
    
    var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
    
    var expandRowByClick: js.UndefOr[Boolean] = js.undefined
    
    var expandable: js.UndefOr[ExpandableConfig[RecordType]] = js.undefined
    
    var expandedRowClassName: js.UndefOr[RowClassName[RecordType]] = js.undefined
    
    var expandedRowKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var expandedRowRender: js.UndefOr[ExpandedRowRender[RecordType]] = js.undefined
    
    var footer: js.UndefOr[PanelRender[RecordType]] = js.undefined
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var indentSize: js.UndefOr[Double] = js.undefined
    
    var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
    
    var locale: js.UndefOr[TableLocale] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function4[
          /* pagination */ TablePaginationConfig, 
          /* filters */ Record[String, js.Array[typings.antd.tableInterfaceMod.Key] | Null], 
          /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], 
          /* extra */ TableCurrentDataSource[RecordType], 
          Unit
        ]
      ] = js.undefined
    
    var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ RecordType, Unit]] = js.undefined
    
    var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
    
    var onHeaderRow: js.UndefOr[GetComponentProps[js.Array[ColumnType[RecordType]]]] = js.undefined
    
    var onRow: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
    
    var pagination: js.UndefOr[`false` | TablePaginationConfig] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rowClassName: js.UndefOr[String | RowClassName[RecordType]] = js.undefined
    
    var rowKey: js.UndefOr[String | GetRowKey[RecordType]] = js.undefined
    
    var rowSelection: js.UndefOr[TableRowSelection[RecordType]] = js.undefined
    
    var scroll: js.UndefOr[js.UndefOr[X] & ScrollToFirstRowOnChange] = js.undefined
    
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    var showSorterTooltip: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
    
    var sticky: js.UndefOr[Boolean | TableSticky] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var summary: js.UndefOr[js.Function1[/* data */ js.Array[RecordType], ReactNode]] = js.undefined
    
    var tableLayout: js.UndefOr[TableLayout] = js.undefined
    
    var title: js.UndefOr[PanelRender[RecordType]] = js.undefined
  }
  object TableProps {
    
    inline def apply[RecordType](): TableProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps[RecordType]]
    }
    
    extension [Self <: TableProps[?], RecordType](x: Self & TableProps[RecordType]) {
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setChildrenColumnNameUndefined: Self = StObject.set(x, "childrenColumnName", js.undefined)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumns(value: ColumnsType[RecordType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (ColumnGroupType[RecordType] | typings.antd.tableInterfaceMod.ColumnType[RecordType])*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setComponents(value: TableComponents[RecordType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDataSource(value: js.Array[RecordType]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: RecordType*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
      
      inline def setDefaultExpandAllRows(value: Boolean): Self = StObject.set(x, "defaultExpandAllRows", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllRowsUndefined: Self = StObject.set(x, "defaultExpandAllRows", js.undefined)
      
      inline def setDefaultExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedRowKeysUndefined: Self = StObject.set(x, "defaultExpandedRowKeys", js.undefined)
      
      inline def setDefaultExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedRowKeys", js.Array(value :_*))
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setDropdownPrefixClsUndefined: Self = StObject.set(x, "dropdownPrefixCls", js.undefined)
      
      inline def setExpandIcon(value: /* props */ RenderExpandIconProps[RecordType] => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconColumnIndex(value: Double): Self = StObject.set(x, "expandIconColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setExpandIconColumnIndexUndefined: Self = StObject.set(x, "expandIconColumnIndex", js.undefined)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandRowByClick(value: Boolean): Self = StObject.set(x, "expandRowByClick", value.asInstanceOf[js.Any])
      
      inline def setExpandRowByClickUndefined: Self = StObject.set(x, "expandRowByClick", js.undefined)
      
      inline def setExpandable(value: ExpandableConfig[RecordType]): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setExpandedRowClassName(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "expandedRowClassName", js.Any.fromFunction3(value))
      
      inline def setExpandedRowClassNameUndefined: Self = StObject.set(x, "expandedRowClassName", js.undefined)
      
      inline def setExpandedRowKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
      
      inline def setExpandedRowKeysVarargs(value: Key*): Self = StObject.set(x, "expandedRowKeys", js.Array(value :_*))
      
      inline def setExpandedRowRender(value: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => ReactNode): Self = StObject.set(x, "expandedRowRender", js.Any.fromFunction4(value))
      
      inline def setExpandedRowRenderUndefined: Self = StObject.set(x, "expandedRowRender", js.undefined)
      
      inline def setFooter(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "footer", js.Any.fromFunction1(value))
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndentSize(value: Double): Self = StObject.set(x, "indentSize", value.asInstanceOf[js.Any])
      
      inline def setIndentSizeUndefined: Self = StObject.set(x, "indentSize", js.undefined)
      
      inline def setLoading(value: Boolean | SpinProps): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnChange(
        value: (/* pagination */ TablePaginationConfig, /* filters */ Record[String, js.Array[typings.antd.tableInterfaceMod.Key] | Null], /* sorter */ SorterResult[RecordType] | js.Array[SorterResult[RecordType]], /* extra */ TableCurrentDataSource[RecordType]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnExpand(value: (/* expanded */ Boolean, /* record */ RecordType) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnExpandedRowsChange(value: /* expandedKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onExpandedRowsChange", js.Any.fromFunction1(value))
      
      inline def setOnExpandedRowsChangeUndefined: Self = StObject.set(x, "onExpandedRowsChange", js.undefined)
      
      inline def setOnHeaderRow(
        value: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]
      ): Self = StObject.set(x, "onHeaderRow", js.Any.fromFunction2(value))
      
      inline def setOnHeaderRowUndefined: Self = StObject.set(x, "onHeaderRow", js.undefined)
      
      inline def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      inline def setOnRowUndefined: Self = StObject.set(x, "onRow", js.undefined)
      
      inline def setPagination(value: `false` | TablePaginationConfig): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRowClassName(value: String | RowClassName[RecordType]): Self = StObject.set(x, "rowClassName", value.asInstanceOf[js.Any])
      
      inline def setRowClassNameFunction3(value: (RecordType, /* index */ Double, /* indent */ Double) => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction3(value))
      
      inline def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
      
      inline def setRowKey(value: String | GetRowKey[RecordType]): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setRowKeyFunction2(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "rowKey", js.Any.fromFunction2(value))
      
      inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      inline def setRowSelection(value: TableRowSelection[RecordType]): Self = StObject.set(x, "rowSelection", value.asInstanceOf[js.Any])
      
      inline def setRowSelectionUndefined: Self = StObject.set(x, "rowSelection", js.undefined)
      
      inline def setScroll(value: js.UndefOr[X] & ScrollToFirstRowOnChange): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowSorterTooltip(value: Boolean): Self = StObject.set(x, "showSorterTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowSorterTooltipUndefined: Self = StObject.set(x, "showSorterTooltip", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSortDirections(value: js.Array[SortOrder]): Self = StObject.set(x, "sortDirections", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionsUndefined: Self = StObject.set(x, "sortDirections", js.undefined)
      
      inline def setSortDirectionsVarargs(value: SortOrder*): Self = StObject.set(x, "sortDirections", js.Array(value :_*))
      
      inline def setSticky(value: Boolean | TableSticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSummary(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "summary", js.Any.fromFunction1(value))
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTableLayout(value: TableLayout): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      inline def setTitle(value: /* data */ js.Array[RecordType] => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
