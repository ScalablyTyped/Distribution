package typings.antd

import typings.antd.antdStrings.SELECT_ALL
import typings.antd.antdStrings.SELECT_INVERT
import typings.antd.columnGroupMod.ColumnGroupProps
import typings.antd.columnMod.ColumnProps
import typings.antd.tableTableMod.TableProps
import typings.rcTable.footerCellMod.SummaryCellProps
import typings.rcTable.rowMod.FooterRowProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  object default {
    
    @JSImport("antd/lib/table", JSImport.Default)
    @js.native
    def apply[RecordType /* <: js.Object */](props: TableProps[RecordType]): Element = js.native
    @JSImport("antd/lib/table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_Column.default` */
    @JSImport("antd/lib/table", "default.Column")
    @js.native
    def Column[RecordType](_underscore: ColumnProps[RecordType]): Null = js.native
    
    /**
      * This is a syntactic sugar for `columns` prop.
      * So HOC will not work on this.
      */
    /* was `typeof imported_ColumnGroup.default` */
    @JSImport("antd/lib/table", "default.ColumnGroup")
    @js.native
    def ColumnGroup[RecordType](_underscore: ColumnGroupProps[RecordType]): Null = js.native
    
    @JSImport("antd/lib/table", "default.SELECTION_ALL")
    @js.native
    def SELECTION_ALL: SELECT_ALL = js.native
    @scala.inline
    def SELECTION_ALL_=(x: SELECT_ALL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/table", "default.SELECTION_INVERT")
    @js.native
    def SELECTION_INVERT: SELECT_INVERT = js.native
    @scala.inline
    def SELECTION_INVERT_=(x: SELECT_INVERT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION_INVERT")(x.asInstanceOf[js.Any])
    
    object Summary {
      
      @JSImport("antd/lib/table", "default.Summary")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/table", "default.Summary.Cell")
      @js.native
      def Cell: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element] = js.native
      @scala.inline
      def Cell_=(x: js.Function1[/* hasClassNameIndexChildrenColSpanRowSpanAlign */ SummaryCellProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cell")(x.asInstanceOf[js.Any])
      
      @JSImport("antd/lib/table", "default.Summary.Row")
      @js.native
      def Row: js.Function1[/* props */ FooterRowProps, Element] = js.native
      @scala.inline
      def Row_=(x: js.Function1[/* props */ FooterRowProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Row")(x.asInstanceOf[js.Any])
    }
    
    object defaultProps {
      
      @JSImport("antd/lib/table", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd/lib/table", "default.defaultProps.rowKey")
      @js.native
      def rowKey: String = js.native
      @scala.inline
      def rowKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowKey")(x.asInstanceOf[js.Any])
    }
  }
}
