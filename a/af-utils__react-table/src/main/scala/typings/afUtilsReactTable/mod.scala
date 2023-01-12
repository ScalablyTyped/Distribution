package typings.afUtilsReactTable

import typings.afUtilsReactTable.afUtilsReactTableStrings.Cell
import typings.afUtilsReactTable.afUtilsReactTableStrings.align
import typings.afUtilsReactTable.afUtilsReactTableStrings.background
import typings.afUtilsReactTable.afUtilsReactTableStrings.border
import typings.afUtilsReactTable.afUtilsReactTableStrings.format
import typings.afUtilsReactTable.afUtilsReactTableStrings.key
import typings.afUtilsReactTable.afUtilsReactTableStrings.label
import typings.afUtilsReactTable.afUtilsReactTableStrings.minWidth
import typings.afUtilsReactTable.afUtilsReactTableStrings.render
import typings.afUtilsReactTable.afUtilsReactTableStrings.width
import typings.afUtilsReactTable.anon.Columns
import typings.afUtilsReactTable.anon.Data
import typings.afUtilsReactTable.anon.Ref
import typings.afUtilsReactTable.anon.TypeofColumnModel
import typings.afUtilsReactVirtualHeadless.mod.EventType
import typings.afUtilsReactVirtualHeadless.mod.Model
import typings.afUtilsReactVirtualHeadless.mod.SubscriptionProps
import typings.afUtilsReactVirtualHeadless.mod.VirtualModelFunction
import typings.csstype.mod.Property.TextAlign
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@af-utils/react-table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@af-utils/react-table", "ColumnModel")
  @js.native
  open class ColumnModel () extends StObject {
    
    var Cell: js.UndefOr[ReactNode] = js.native
    
    var align: js.UndefOr[TextAlign] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var border: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[js.Function1[/* cellData */ Any, ReactNode]] = js.native
    
    // Don't think it's possible to not redefine these.
    var key: String = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var render: js.UndefOr[js.Function2[/* cellData */ Any, /* row */ Any, ReactNode]] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  /* static members */
  object ColumnModel {
    
    @JSImport("@af-utils/react-table", "ColumnModel.KEYS")
    @js.native
    val KEYS: js.Tuple10[key, align, label, render, format, Cell, background, border, width, minWidth] = js.native
  }
  
  @JSImport("@af-utils/react-table", "DefaultTableComponents")
  @js.native
  val DefaultTableComponents: ComponentMap = js.native
  
  @JSImport("@af-utils/react-table", "EVT_ALL")
  @js.native
  val EVT_ALL: js.Array[EventType] = js.native
  
  @JSImport("@af-utils/react-table", "EVT_FROM")
  @js.native
  val EVT_FROM: /* 0 */ Double = js.native
  
  @JSImport("@af-utils/react-table", "EVT_SCROLL_SIZE")
  @js.native
  val EVT_SCROLL_SIZE: /* 2 */ Double = js.native
  
  @JSImport("@af-utils/react-table", "EVT_SIZES")
  @js.native
  val EVT_SIZES: /* 3 */ Double = js.native
  
  @JSImport("@af-utils/react-table", "EVT_TO")
  @js.native
  val EVT_TO: /* 1 */ Double = js.native
  
  @JSImport("@af-utils/react-table", "Subscription")
  @js.native
  val Subscription: FC[PropsWithChildren[SubscriptionProps]] = js.native
  
  @JSImport("@af-utils/react-table", "Table")
  @js.native
  val Table: FC[TableProps] = js.native
  
  inline def mapVisibleRange(model: Model, callback: js.Function2[/* from */ Double, /* delta */ js.UndefOr[Double], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapVisibleRange")(model.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapVisibleRange(
    model: Model,
    callback: js.Function2[/* from */ Double, /* delta */ js.UndefOr[Double], Unit],
    countOffset: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapVisibleRange")(model.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], countOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useComponentSubscription(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useComponentSubscription")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useComponentSubscription(model: Model, events: js.Array[EventType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useComponentSubscription")(model.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useOnce[T /* <: ReactNode */](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnce")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useSubscription(model: Model, events: js.Array[EventType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(model.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useSubscription(model: Model, events: js.Array[EventType], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(model.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@af-utils/react-table", "useVirtual")
  @js.native
  val useVirtual: VirtualModelFunction = js.native
  
  @JSImport("@af-utils/react-table", "useVirtualModel")
  @js.native
  val useVirtualModel: VirtualModelFunction = js.native
  
  trait ComponentMap extends StObject {
    
    // Cell is called by Row, since the user can override Row, they can choose to pass different props to Cell.
    // I don't think it's possible to tighten this type.
    var Cell: js.UndefOr[js.Function1[/* props */ Record[String, Any], ReactNode]] = js.undefined
    
    // Same as above.
    var CellForEmptyRow: js.UndefOr[js.Function1[/* props */ Record[String, Any], ReactNode]] = js.undefined
    
    var FooterCell: js.UndefOr[js.Function1[/* props */ Record[String, Any], ReactNode]] = js.undefined
    
    var FooterCells: js.UndefOr[js.Function1[/* param0 */ Columns, ReactNode]] = js.undefined
    
    // Same as above.
    var HeaderCell: js.UndefOr[js.Function1[/* props */ Record[String, Any], ReactNode]] = js.undefined
    
    var HeaderCells: js.UndefOr[js.Function1[/* param0 */ Columns, ReactNode]] = js.undefined
    
    // "/* To prevent double memoization in case of HOC usage */"
    var OriginalRow: js.UndefOr[js.Function1[/* param0 */ Data, ReactNode]] = js.undefined
    
    // Row rendering function
    var Row: js.UndefOr[js.Function1[/* param0 */ Data, ReactNode]] = js.undefined
    
    // For the basic table elements, you can use a string for dom elements
    // Otherwise, a function that accepts a props object for the specific table element and returns a react element
    // When using a function, you must render children with no changes, as the library renders the children specifically.
    // Outer table element
    var Table: js.UndefOr[
        String | (js.Function1[/* props */ HTMLAttributes[HTMLTableElement], ReactElement])
      ] = js.undefined
    
    // Table body section
    var Tbody: js.UndefOr[
        String | (js.Function1[/* props */ HTMLAttributes[HTMLTableSectionElement], ReactElement])
      ] = js.undefined
    
    // Table data element
    var Td: js.UndefOr[
        String | (js.Function1[/* props */ HTMLAttributes[HTMLTableCellElement], ReactElement])
      ] = js.undefined
    
    // Table footer section
    var Tfoot: js.UndefOr[
        String | (js.Function1[/* props */ HTMLAttributes[HTMLTableSectionElement], ReactElement])
      ] = js.undefined
    
    // Table header element
    var Th: js.UndefOr[
        String | (js.Function1[/* props */ HTMLAttributes[HTMLTableCellElement], ReactElement])
      ] = js.undefined
    
    // Table header section
    var Thead: js.UndefOr[
        String | (js.Function1[/* props */ HTMLAttributes[HTMLTableSectionElement], ReactElement])
      ] = js.undefined
    
    // Table row element
    var Tr: js.UndefOr[
        String | (js.Function1[/* props */ HTMLAttributes[HTMLTableRowElement], ReactElement])
      ] = js.undefined
  }
  object ComponentMap {
    
    inline def apply(): ComponentMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentMap] (val x: Self) extends AnyVal {
      
      inline def setCell(value: /* props */ Record[String, Any] => ReactNode): Self = StObject.set(x, "Cell", js.Any.fromFunction1(value))
      
      inline def setCellForEmptyRow(value: /* props */ Record[String, Any] => ReactNode): Self = StObject.set(x, "CellForEmptyRow", js.Any.fromFunction1(value))
      
      inline def setCellForEmptyRowUndefined: Self = StObject.set(x, "CellForEmptyRow", js.undefined)
      
      inline def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
      
      inline def setFooterCell(value: /* props */ Record[String, Any] => ReactNode): Self = StObject.set(x, "FooterCell", js.Any.fromFunction1(value))
      
      inline def setFooterCellUndefined: Self = StObject.set(x, "FooterCell", js.undefined)
      
      inline def setFooterCells(value: /* param0 */ Columns => ReactNode): Self = StObject.set(x, "FooterCells", js.Any.fromFunction1(value))
      
      inline def setFooterCellsUndefined: Self = StObject.set(x, "FooterCells", js.undefined)
      
      inline def setHeaderCell(value: /* props */ Record[String, Any] => ReactNode): Self = StObject.set(x, "HeaderCell", js.Any.fromFunction1(value))
      
      inline def setHeaderCellUndefined: Self = StObject.set(x, "HeaderCell", js.undefined)
      
      inline def setHeaderCells(value: /* param0 */ Columns => ReactNode): Self = StObject.set(x, "HeaderCells", js.Any.fromFunction1(value))
      
      inline def setHeaderCellsUndefined: Self = StObject.set(x, "HeaderCells", js.undefined)
      
      inline def setOriginalRow(value: /* param0 */ Data => ReactNode): Self = StObject.set(x, "OriginalRow", js.Any.fromFunction1(value))
      
      inline def setOriginalRowUndefined: Self = StObject.set(x, "OriginalRow", js.undefined)
      
      inline def setRow(value: /* param0 */ Data => ReactNode): Self = StObject.set(x, "Row", js.Any.fromFunction1(value))
      
      inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
      
      inline def setTable(value: String | (js.Function1[/* props */ HTMLAttributes[HTMLTableElement], ReactElement])): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableFunction1(value: /* props */ HTMLAttributes[HTMLTableElement] => ReactElement): Self = StObject.set(x, "Table", js.Any.fromFunction1(value))
      
      inline def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      inline def setTbody(value: String | (js.Function1[/* props */ HTMLAttributes[HTMLTableSectionElement], ReactElement])): Self = StObject.set(x, "Tbody", value.asInstanceOf[js.Any])
      
      inline def setTbodyFunction1(value: /* props */ HTMLAttributes[HTMLTableSectionElement] => ReactElement): Self = StObject.set(x, "Tbody", js.Any.fromFunction1(value))
      
      inline def setTbodyUndefined: Self = StObject.set(x, "Tbody", js.undefined)
      
      inline def setTd(value: String | (js.Function1[/* props */ HTMLAttributes[HTMLTableCellElement], ReactElement])): Self = StObject.set(x, "Td", value.asInstanceOf[js.Any])
      
      inline def setTdFunction1(value: /* props */ HTMLAttributes[HTMLTableCellElement] => ReactElement): Self = StObject.set(x, "Td", js.Any.fromFunction1(value))
      
      inline def setTdUndefined: Self = StObject.set(x, "Td", js.undefined)
      
      inline def setTfoot(value: String | (js.Function1[/* props */ HTMLAttributes[HTMLTableSectionElement], ReactElement])): Self = StObject.set(x, "Tfoot", value.asInstanceOf[js.Any])
      
      inline def setTfootFunction1(value: /* props */ HTMLAttributes[HTMLTableSectionElement] => ReactElement): Self = StObject.set(x, "Tfoot", js.Any.fromFunction1(value))
      
      inline def setTfootUndefined: Self = StObject.set(x, "Tfoot", js.undefined)
      
      inline def setTh(value: String | (js.Function1[/* props */ HTMLAttributes[HTMLTableCellElement], ReactElement])): Self = StObject.set(x, "Th", value.asInstanceOf[js.Any])
      
      inline def setThFunction1(value: /* props */ HTMLAttributes[HTMLTableCellElement] => ReactElement): Self = StObject.set(x, "Th", js.Any.fromFunction1(value))
      
      inline def setThUndefined: Self = StObject.set(x, "Th", js.undefined)
      
      inline def setThead(value: String | (js.Function1[/* props */ HTMLAttributes[HTMLTableSectionElement], ReactElement])): Self = StObject.set(x, "Thead", value.asInstanceOf[js.Any])
      
      inline def setTheadFunction1(value: /* props */ HTMLAttributes[HTMLTableSectionElement] => ReactElement): Self = StObject.set(x, "Thead", js.Any.fromFunction1(value))
      
      inline def setTheadUndefined: Self = StObject.set(x, "Thead", js.undefined)
      
      inline def setTr(value: String | (js.Function1[/* props */ HTMLAttributes[HTMLTableRowElement], ReactElement])): Self = StObject.set(x, "Tr", value.asInstanceOf[js.Any])
      
      inline def setTrFunction1(value: /* props */ HTMLAttributes[HTMLTableRowElement] => ReactElement): Self = StObject.set(x, "Tr", js.Any.fromFunction1(value))
      
      inline def setTrUndefined: Self = StObject.set(x, "Tr", js.undefined)
    }
  }
  
  type RowProps = (Record[String, Any]) & Ref
  
  trait TableColumnProps extends StObject {
    
    var Cell: js.UndefOr[ReactNode] = js.undefined
    
    // Note, align is not explicitly checked in the code.
    var align: js.UndefOr[TextAlign] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[String] = js.undefined
    
    // Note, format overrides render if both are present.
    var format: js.UndefOr[js.Function1[/* cellData */ Any, ReactNode]] = js.undefined
    
    var key: String
    
    var label: js.UndefOr[String] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var render: js.UndefOr[js.Function2[/* cellData */ Any, /* row */ Any, ReactNode]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object TableColumnProps {
    
    inline def apply(key: String): TableColumnProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableColumnProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableColumnProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: TextAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCell(value: ReactNode): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
      
      inline def setFormat(value: /* cellData */ Any => ReactNode): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setRender(value: (/* cellData */ Any, /* row */ Any) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TableProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    // Defaults to base TableColumn, can be extended
    var ColumnModel: js.UndefOr[TypeofColumnModel] = js.undefined
    
    var columns: js.Array[ColumnModel]
    
    var components: js.UndefOr[ComponentMap] = js.undefined
    
    var footer: js.UndefOr[Boolean] = js.undefined
    
    var getKey: js.UndefOr[js.Function2[/* index */ Double, /* rowProps */ js.UndefOr[RowProps], Any]] = js.undefined
    
    // getRowData is hard to confine to a single set of types
    // since you can overwrite the default Row component, you could then call getRowData with whatever you want.
    // The default Row component calls getRowData with the index of the row.
    def getRowData(args: Any*): Any
    
    // getRowProps by default provides a ref to the row.  You shouldn't need to use this since you can override the Row component.
    var getRowProps: js.UndefOr[
        js.Function3[/* model */ Model, /* index */ Double, /* rowData */ js.UndefOr[Any], RowProps]
      ] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var model: Model
  }
  object TableProps {
    
    inline def apply(columns: js.Array[ColumnModel], getRowData: /* repeated */ Any => Any, model: Model): TableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], getRowData = js.Any.fromFunction1(getRowData), model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      inline def setColumnModel(value: TypeofColumnModel): Self = StObject.set(x, "ColumnModel", value.asInstanceOf[js.Any])
      
      inline def setColumnModelUndefined: Self = StObject.set(x, "ColumnModel", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnModel]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnModel*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComponents(value: ComponentMap): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGetKey(value: (/* index */ Double, /* rowProps */ js.UndefOr[RowProps]) => Any): Self = StObject.set(x, "getKey", js.Any.fromFunction2(value))
      
      inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
      
      inline def setGetRowData(value: /* repeated */ Any => Any): Self = StObject.set(x, "getRowData", js.Any.fromFunction1(value))
      
      inline def setGetRowProps(value: (/* model */ Model, /* index */ Double, /* rowData */ js.UndefOr[Any]) => RowProps): Self = StObject.set(x, "getRowProps", js.Any.fromFunction3(value))
      
      inline def setGetRowPropsUndefined: Self = StObject.set(x, "getRowProps", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
}
