package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iCellRendererMod {
  
  @js.native
  trait ICellRenderer extends StObject {
    
    /** Get the cell to refresh. Return true if successful. Return false if not (or you don't have refresh logic),
      * then the grid will refresh the cell for you. */
    def refresh(params: js.Any): Boolean = js.native
  }
  object ICellRenderer {
    
    @scala.inline
    def apply(refresh: js.Any => Boolean): ICellRenderer = {
      val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction1(refresh))
      __obj.asInstanceOf[ICellRenderer]
    }
    
    @scala.inline
    implicit class ICellRendererMutableBuilder[Self <: ICellRenderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefresh(value: js.Any => Boolean): Self = StObject.set(x, "refresh", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ICellRendererComp
    extends ICellRenderer
       with IComponent[ICellRendererParams]
  object ICellRendererComp {
    
    @scala.inline
    def apply(getGui: () => HTMLElement, refresh: js.Any => Boolean): ICellRendererComp = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), refresh = js.Any.fromFunction1(refresh))
      __obj.asInstanceOf[ICellRendererComp]
    }
  }
  
  type ICellRendererFunc = js.Function1[/* params */ js.Any, HTMLElement | String]
  
  @js.native
  trait ICellRendererParams extends StObject {
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    def addRenderedRowListener(eventType: String, listener: js.Function): Unit = js.native
    
    var api: GridApi = js.native
    
    var colDef: ColDef = js.native
    
    var column: Column = js.native
    
    var columnApi: ColumnApi = js.native
    
    var context: js.Any = js.native
    
    var data: js.Any = js.native
    
    var eGridCell: HTMLElement = js.native
    
    var eParentOfValue: HTMLElement = js.native
    
    def formatValue(value: js.Any): js.Any = js.native
    
    def getValue(): js.Any = js.native
    
    var node: RowNode = js.native
    
    def refreshCell(): Unit = js.native
    
    var rowIndex: Double = js.native
    
    def setValue(value: js.Any): Unit = js.native
    
    var value: js.Any = js.native
    
    var valueFormatted: js.Any = js.native
  }
  object ICellRendererParams {
    
    @scala.inline
    def apply(
      $scope: js.Any,
      addRenderedRowListener: (String, js.Function) => Unit,
      api: GridApi,
      colDef: ColDef,
      column: Column,
      columnApi: ColumnApi,
      context: js.Any,
      data: js.Any,
      eGridCell: HTMLElement,
      eParentOfValue: HTMLElement,
      formatValue: js.Any => js.Any,
      getValue: () => js.Any,
      node: RowNode,
      refreshCell: () => Unit,
      rowIndex: Double,
      setValue: js.Any => Unit,
      value: js.Any,
      valueFormatted: js.Any
    ): ICellRendererParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eGridCell = eGridCell.asInstanceOf[js.Any], eParentOfValue = eParentOfValue.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), getValue = js.Any.fromFunction0(getValue), node = node.asInstanceOf[js.Any], refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellRendererParams]
    }
    
    @scala.inline
    implicit class ICellRendererParamsMutableBuilder[Self <: ICellRendererParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$scope(value: js.Any): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddRenderedRowListener(value: (String, js.Function) => Unit): Self = StObject.set(x, "addRenderedRowListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setApi(value: GridApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnApi(value: ColumnApi): Self = StObject.set(x, "columnApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEGridCell(value: HTMLElement): Self = StObject.set(x, "eGridCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEParentOfValue(value: HTMLElement): Self = StObject.set(x, "eParentOfValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatValue(value: js.Any => js.Any): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshCell(value: () => Unit): Self = StObject.set(x, "refreshCell", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFormatted(value: js.Any): Self = StObject.set(x, "valueFormatted", value.asInstanceOf[js.Any])
    }
  }
}
