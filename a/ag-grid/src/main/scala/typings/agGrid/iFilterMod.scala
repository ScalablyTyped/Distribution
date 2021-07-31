package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iFilterMod {
  
  trait IDoesFilterPassParams extends StObject {
    
    var data: js.Any
    
    var node: RowNode
  }
  object IDoesFilterPassParams {
    
    @scala.inline
    def apply(data: js.Any, node: RowNode): IDoesFilterPassParams = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDoesFilterPassParams]
    }
    
    @scala.inline
    implicit class IDoesFilterPassParamsMutableBuilder[Self <: IDoesFilterPassParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: RowNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFilter extends StObject {
    
    /** The grid will ask each active filter, in turn, whether each row in the grid passes. If any
      filter fails, then the row will be excluded from the final set. The method is provided a
      params object with attributes node (the rodNode the grid creates that wraps the data) and data
      (the data object that you provided to the grid for that row). */
    def doesFilterPass(params: IDoesFilterPassParams): Boolean
    
    /** If using React or Angular 2, returns the underlying component instance, so you can call methods
      * on it if you want. */
    var getFrameworkComponentInstance: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** Gets the filter state for storing */
    def getModel(): js.Any
    
    /**
      * Optional method used by ag-Grid when rendering floating filters and there isn't a floating filter
      * associated for this filter, this will happen if you create a custom filter and NOT a custom floating
      * filter.
      */
    var getModelAsString: js.UndefOr[js.Function1[/* model */ js.Any, String]] = js.undefined
    
    /** This is used to show the filter icon in the header. If true, the filter icon will be shown. */
    def isFilterActive(): Boolean
    
    /**
      * Optional method used by ag-Grid when rendering floating filters.
      *
      * If this method IS NOT IMPLEMENTED, when the floating filter changes, ag-Grid will automatically call
      * IFilterParams.filterChangedCallback,  triggering the filtering of the data based on the changes from
      * the floating filter. For the simplest cases this is enough.
      *
      * IF IT IS IMPLEMENTED. ag-Grid will delegate into this method the responsibility of calling
      * IFilterParams.filterChangedCallback. This is useful if additional logic is necessary, for instance
      * ag-Grid uses this in addition with the applyNow flag to handle the apply button logic in the default
      * ag-Grid filters.
      *
      *     change: The exact same object passed on FloatingFilter.onFloatingFilterChanged
      */
    var onFloatingFilterChanged: js.UndefOr[js.Function1[/* change */ js.Any, Unit]] = js.undefined
    
    /** Gets called when new rows are inserted into the grid. If the filter needs to change it's state
      after rows are loaded, it can do it here. */
    var onNewRowsLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Restores the filter state. */
    def setModel(model: js.Any): Unit
  }
  object IFilter {
    
    @scala.inline
    def apply(
      doesFilterPass: IDoesFilterPassParams => Boolean,
      getModel: () => js.Any,
      isFilterActive: () => Boolean,
      setModel: js.Any => Unit
    ): IFilter = {
      val __obj = js.Dynamic.literal(doesFilterPass = js.Any.fromFunction1(doesFilterPass), getModel = js.Any.fromFunction0(getModel), isFilterActive = js.Any.fromFunction0(isFilterActive), setModel = js.Any.fromFunction1(setModel))
      __obj.asInstanceOf[IFilter]
    }
    
    @scala.inline
    implicit class IFilterMutableBuilder[Self <: IFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoesFilterPass(value: IDoesFilterPassParams => Boolean): Self = StObject.set(x, "doesFilterPass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFrameworkComponentInstance(value: () => js.Any): Self = StObject.set(x, "getFrameworkComponentInstance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFrameworkComponentInstanceUndefined: Self = StObject.set(x, "getFrameworkComponentInstance", js.undefined)
      
      @scala.inline
      def setGetModel(value: () => js.Any): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModelAsString(value: /* model */ js.Any => String): Self = StObject.set(x, "getModelAsString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetModelAsStringUndefined: Self = StObject.set(x, "getModelAsString", js.undefined)
      
      @scala.inline
      def setIsFilterActive(value: () => Boolean): Self = StObject.set(x, "isFilterActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFloatingFilterChanged(value: /* change */ js.Any => Unit): Self = StObject.set(x, "onFloatingFilterChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFloatingFilterChangedUndefined: Self = StObject.set(x, "onFloatingFilterChanged", js.undefined)
      
      @scala.inline
      def setOnNewRowsLoaded(value: () => Unit): Self = StObject.set(x, "onNewRowsLoaded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNewRowsLoadedUndefined: Self = StObject.set(x, "onNewRowsLoaded", js.undefined)
      
      @scala.inline
      def setSetModel(value: js.Any => Unit): Self = StObject.set(x, "setModel", js.Any.fromFunction1(value))
    }
  }
  
  trait IFilterComp
    extends StObject
       with IFilter
       with IComponent[IFilterParams]
  object IFilterComp {
    
    @scala.inline
    def apply(
      doesFilterPass: IDoesFilterPassParams => Boolean,
      getGui: () => HTMLElement,
      getModel: () => js.Any,
      isFilterActive: () => Boolean,
      setModel: js.Any => Unit
    ): IFilterComp = {
      val __obj = js.Dynamic.literal(doesFilterPass = js.Any.fromFunction1(doesFilterPass), getGui = js.Any.fromFunction0(getGui), getModel = js.Any.fromFunction0(getModel), isFilterActive = js.Any.fromFunction0(isFilterActive), setModel = js.Any.fromFunction1(setModel))
      __obj.asInstanceOf[IFilterComp]
    }
  }
  
  trait IFilterParams extends StObject {
    
    @JSName("$scope")
    var $scope: js.Any
    
    var applyButton: js.UndefOr[Boolean] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var colDef: ColDef
    
    var column: Column
    
    var context: js.Any
    
    var defaultOption: js.UndefOr[String] = js.undefined
    
    def doesRowPassOtherFilter(rowNode: RowNode): Boolean
    
    def filterChangedCallback(): Unit
    
    def filterModifiedCallback(): Unit
    
    var filterOptions: js.UndefOr[js.Array[String]] = js.undefined
    
    var newRowsAction: js.UndefOr[String] = js.undefined
    
    var rowModel: IRowModel
    
    var textFormatter: js.UndefOr[js.Function1[/* from */ String, String]] = js.undefined
    
    def valueGetter(rowNode: RowNode): js.Any
  }
  object IFilterParams {
    
    @scala.inline
    def apply(
      $scope: js.Any,
      colDef: ColDef,
      column: Column,
      context: js.Any,
      doesRowPassOtherFilter: RowNode => Boolean,
      filterChangedCallback: () => Unit,
      filterModifiedCallback: () => Unit,
      rowModel: IRowModel,
      valueGetter: RowNode => js.Any
    ): IFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[IFilterParams]
    }
    
    @scala.inline
    implicit class IFilterParamsMutableBuilder[Self <: IFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$scope(value: js.Any): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyButton(value: Boolean): Self = StObject.set(x, "applyButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyButtonUndefined: Self = StObject.set(x, "applyButton", js.undefined)
      
      @scala.inline
      def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      @scala.inline
      def setColDef(value: ColDef): Self = StObject.set(x, "colDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumn(value: Column): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOption(value: String): Self = StObject.set(x, "defaultOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOptionUndefined: Self = StObject.set(x, "defaultOption", js.undefined)
      
      @scala.inline
      def setDoesRowPassOtherFilter(value: RowNode => Boolean): Self = StObject.set(x, "doesRowPassOtherFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterChangedCallback(value: () => Unit): Self = StObject.set(x, "filterChangedCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilterModifiedCallback(value: () => Unit): Self = StObject.set(x, "filterModifiedCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFilterOptions(value: js.Array[String]): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      @scala.inline
      def setFilterOptionsVarargs(value: String*): Self = StObject.set(x, "filterOptions", js.Array(value :_*))
      
      @scala.inline
      def setNewRowsAction(value: String): Self = StObject.set(x, "newRowsAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewRowsActionUndefined: Self = StObject.set(x, "newRowsAction", js.undefined)
      
      @scala.inline
      def setRowModel(value: IRowModel): Self = StObject.set(x, "rowModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextFormatter(value: /* from */ String => String): Self = StObject.set(x, "textFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextFormatterUndefined: Self = StObject.set(x, "textFormatter", js.undefined)
      
      @scala.inline
      def setValueGetter(value: RowNode => js.Any): Self = StObject.set(x, "valueGetter", js.Any.fromFunction1(value))
    }
  }
  
  trait SerializedFilter extends StObject {
    
    var filterType: String
  }
  object SerializedFilter {
    
    @scala.inline
    def apply(filterType: String): SerializedFilter = {
      val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedFilter]
    }
    
    @scala.inline
    implicit class SerializedFilterMutableBuilder[Self <: SerializedFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilterType(value: String): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    }
  }
}
