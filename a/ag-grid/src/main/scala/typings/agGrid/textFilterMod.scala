package typings.agGrid

import typings.agGrid.baseFilterMod.ComparableBaseFilter
import typings.agGrid.baseFilterMod.FilterConditionType
import typings.agGrid.baseFilterMod.IComparableFilterParams
import typings.agGrid.baseFilterMod.IScalarFilterParams
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iFilterMod.SerializedFilter
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFilterMod {
  
  @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter")
  @js.native
  class TextFilter () extends ComparableBaseFilter[String, ITextFilterParams, SerializedTextFilter] {
    def this(template: String) = this()
    
    /* private */ def addFilterChangedListener(`type`: js.Any): js.Any = js.native
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MTextFilter(): Unit = js.native
    
    /* private */ def checkIndividualFilter(params: js.Any, filterType: js.Any, filterText: js.Any): js.Any = js.native
    
    var comparator: js.Any = js.native
    
    var eFilterConditionTextField: js.Any = js.native
    
    var eFilterTextField: js.Any = js.native
    
    var filterConditionText: js.Any = js.native
    
    var filterText: js.Any = js.native
    
    var formatter: js.Any = js.native
    
    def getFilter(): String = js.native
    
    /* private */ def onFilterTextFieldChanged(`type`: js.Any): js.Any = js.native
    
    def setFilter(filter: String, `type`: FilterConditionType): Unit = js.native
    
    def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
  }
  /* static members */
  object TextFilter {
    
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_COMPARATOR")
    @js.native
    def DEFAULT_COMPARATOR: TextComparator = js.native
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_COMPARATOR")
    @js.native
    def DEFAULT_COMPARATOR(filter: String, gridValue: js.Any, filterText: String): Boolean = js.native
    @scala.inline
    def DEFAULT_COMPARATOR_=(x: TextComparator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_COMPARATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_FORMATTER")
    @js.native
    def DEFAULT_FORMATTER: TextFormatter = js.native
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_FORMATTER")
    @js.native
    def DEFAULT_FORMATTER(from: String): String = js.native
    @scala.inline
    def DEFAULT_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FORMATTER")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_LOWERCASE_FORMATTER")
    @js.native
    def DEFAULT_LOWERCASE_FORMATTER: TextFormatter = js.native
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_LOWERCASE_FORMATTER")
    @js.native
    def DEFAULT_LOWERCASE_FORMATTER(from: String): String = js.native
    @scala.inline
    def DEFAULT_LOWERCASE_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_LOWERCASE_FORMATTER")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait INumberFilterParams extends IScalarFilterParams {
    
    var debounceMs: js.UndefOr[Double] = js.native
  }
  object INumberFilterParams {
    
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
      suppressAndOrCondition: Boolean,
      valueGetter: RowNode => js.Any
    ): INumberFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[INumberFilterParams]
    }
    
    @scala.inline
    implicit class INumberFilterParamsMutableBuilder[Self <: INumberFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
    }
  }
  
  @js.native
  trait ITextFilterParams extends IComparableFilterParams {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var debounceMs: js.UndefOr[Double] = js.native
    
    var textCustomComparator: js.UndefOr[TextComparator] = js.native
  }
  object ITextFilterParams {
    
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
      suppressAndOrCondition: Boolean,
      valueGetter: RowNode => js.Any
    ): ITextFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[ITextFilterParams]
    }
    
    @scala.inline
    implicit class ITextFilterParamsMutableBuilder[Self <: ITextFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
      
      @scala.inline
      def setTextCustomComparator(value: (/* filter */ String, /* gridValue */ js.Any, /* filterText */ String) => Boolean): Self = StObject.set(x, "textCustomComparator", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTextCustomComparatorUndefined: Self = StObject.set(x, "textCustomComparator", js.undefined)
    }
  }
  
  @js.native
  trait SerializedTextFilter extends SerializedFilter {
    
    var filter: String = js.native
    
    var `type`: String = js.native
  }
  object SerializedTextFilter {
    
    @scala.inline
    def apply(filter: String, filterType: String, `type`: String): SerializedTextFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedTextFilter]
    }
    
    @scala.inline
    implicit class SerializedTextFilterMutableBuilder[Self <: SerializedTextFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TextComparator = js.Function3[/* filter */ String, /* gridValue */ js.Any, /* filterText */ String, Boolean]
  
  type TextFormatter = js.Function1[/* from */ String, String]
}
