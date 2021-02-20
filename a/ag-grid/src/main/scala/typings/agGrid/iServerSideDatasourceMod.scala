package typings.agGrid

import typings.agGrid.iColumnVOMod.ColumnVO
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iServerSideDatasourceMod {
  
  @js.native
  trait IServerSideDatasource extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    def getRows(params: IServerSideGetRowsParams): Unit = js.native
  }
  object IServerSideDatasource {
    
    @scala.inline
    def apply(getRows: IServerSideGetRowsParams => Unit): IServerSideDatasource = {
      val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction1(getRows))
      __obj.asInstanceOf[IServerSideDatasource]
    }
    
    @scala.inline
    implicit class IServerSideDatasourceMutableBuilder[Self <: IServerSideDatasource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetRows(value: IServerSideGetRowsParams => Unit): Self = StObject.set(x, "getRows", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IServerSideGetRowsParams extends StObject {
    
    def failCallback(): Unit = js.native
    
    var parentNode: RowNode = js.native
    
    var request: IServerSideGetRowsRequest = js.native
    
    def successCallback(rowsThisPage: js.Array[_], lastRow: Double): Unit = js.native
  }
  object IServerSideGetRowsParams {
    
    @scala.inline
    def apply(
      failCallback: () => Unit,
      parentNode: RowNode,
      request: IServerSideGetRowsRequest,
      successCallback: (js.Array[_], Double) => Unit
    ): IServerSideGetRowsParams = {
      val __obj = js.Dynamic.literal(failCallback = js.Any.fromFunction0(failCallback), parentNode = parentNode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], successCallback = js.Any.fromFunction2(successCallback))
      __obj.asInstanceOf[IServerSideGetRowsParams]
    }
    
    @scala.inline
    implicit class IServerSideGetRowsParamsMutableBuilder[Self <: IServerSideGetRowsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailCallback(value: () => Unit): Self = StObject.set(x, "failCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setParentNode(value: RowNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: IServerSideGetRowsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessCallback(value: (js.Array[_], Double) => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IServerSideGetRowsRequest extends StObject {
    
    var endRow: Double = js.native
    
    var filterModel: js.Any = js.native
    
    var groupKeys: js.Array[String] = js.native
    
    var pivotCols: js.Array[ColumnVO] = js.native
    
    var pivotMode: Boolean = js.native
    
    var rowGroupCols: js.Array[ColumnVO] = js.native
    
    var sortModel: js.Any = js.native
    
    var startRow: Double = js.native
    
    var valueCols: js.Array[ColumnVO] = js.native
  }
  object IServerSideGetRowsRequest {
    
    @scala.inline
    def apply(
      endRow: Double,
      filterModel: js.Any,
      groupKeys: js.Array[String],
      pivotCols: js.Array[ColumnVO],
      pivotMode: Boolean,
      rowGroupCols: js.Array[ColumnVO],
      sortModel: js.Any,
      startRow: Double,
      valueCols: js.Array[ColumnVO]
    ): IServerSideGetRowsRequest = {
      val __obj = js.Dynamic.literal(endRow = endRow.asInstanceOf[js.Any], filterModel = filterModel.asInstanceOf[js.Any], groupKeys = groupKeys.asInstanceOf[js.Any], pivotCols = pivotCols.asInstanceOf[js.Any], pivotMode = pivotMode.asInstanceOf[js.Any], rowGroupCols = rowGroupCols.asInstanceOf[js.Any], sortModel = sortModel.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any], valueCols = valueCols.asInstanceOf[js.Any])
      __obj.asInstanceOf[IServerSideGetRowsRequest]
    }
    
    @scala.inline
    implicit class IServerSideGetRowsRequestMutableBuilder[Self <: IServerSideGetRowsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterModel(value: js.Any): Self = StObject.set(x, "filterModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupKeys(value: js.Array[String]): Self = StObject.set(x, "groupKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupKeysVarargs(value: String*): Self = StObject.set(x, "groupKeys", js.Array(value :_*))
      
      @scala.inline
      def setPivotCols(value: js.Array[ColumnVO]): Self = StObject.set(x, "pivotCols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotColsVarargs(value: ColumnVO*): Self = StObject.set(x, "pivotCols", js.Array(value :_*))
      
      @scala.inline
      def setPivotMode(value: Boolean): Self = StObject.set(x, "pivotMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupCols(value: js.Array[ColumnVO]): Self = StObject.set(x, "rowGroupCols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupColsVarargs(value: ColumnVO*): Self = StObject.set(x, "rowGroupCols", js.Array(value :_*))
      
      @scala.inline
      def setSortModel(value: js.Any): Self = StObject.set(x, "sortModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueCols(value: js.Array[ColumnVO]): Self = StObject.set(x, "valueCols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueColsVarargs(value: ColumnVO*): Self = StObject.set(x, "valueCols", js.Array(value :_*))
    }
  }
}
