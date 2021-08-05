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
    
    /* private */ var comparator: js.Any = js.native
    
    /* private */ var eFilterConditionTextField: js.Any = js.native
    
    /* private */ var eFilterTextField: js.Any = js.native
    
    /* private */ var filterConditionText: js.Any = js.native
    
    /* private */ var filterText: js.Any = js.native
    
    /* private */ var formatter: js.Any = js.native
    
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
    inline def DEFAULT_COMPARATOR(filter: String, gridValue: js.Any, filterText: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_COMPARATOR")(filter.asInstanceOf[js.Any], gridValue.asInstanceOf[js.Any], filterText.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def DEFAULT_COMPARATOR_=(x: TextComparator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_COMPARATOR")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_FORMATTER")
    @js.native
    def DEFAULT_FORMATTER: TextFormatter = js.native
    inline def DEFAULT_FORMATTER(from: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_FORMATTER")(from.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def DEFAULT_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FORMATTER")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/textFilter", "TextFilter.DEFAULT_LOWERCASE_FORMATTER")
    @js.native
    def DEFAULT_LOWERCASE_FORMATTER: TextFormatter = js.native
    inline def DEFAULT_LOWERCASE_FORMATTER(from: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_LOWERCASE_FORMATTER")(from.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def DEFAULT_LOWERCASE_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_LOWERCASE_FORMATTER")(x.asInstanceOf[js.Any])
  }
  
  trait INumberFilterParams
    extends StObject
       with IScalarFilterParams {
    
    var debounceMs: js.UndefOr[Double] = js.undefined
  }
  object INumberFilterParams {
    
    inline def apply(
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
    
    extension [Self <: INumberFilterParams](x: Self) {
      
      inline def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
      
      inline def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
    }
  }
  
  trait ITextFilterParams
    extends StObject
       with IComparableFilterParams {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var debounceMs: js.UndefOr[Double] = js.undefined
    
    var textCustomComparator: js.UndefOr[TextComparator] = js.undefined
  }
  object ITextFilterParams {
    
    inline def apply(
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
    
    extension [Self <: ITextFilterParams](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setDebounceMs(value: Double): Self = StObject.set(x, "debounceMs", value.asInstanceOf[js.Any])
      
      inline def setDebounceMsUndefined: Self = StObject.set(x, "debounceMs", js.undefined)
      
      inline def setTextCustomComparator(value: (/* filter */ String, /* gridValue */ js.Any, /* filterText */ String) => Boolean): Self = StObject.set(x, "textCustomComparator", js.Any.fromFunction3(value))
      
      inline def setTextCustomComparatorUndefined: Self = StObject.set(x, "textCustomComparator", js.undefined)
    }
  }
  
  trait SerializedTextFilter
    extends StObject
       with SerializedFilter {
    
    var filter: String
    
    var `type`: String
  }
  object SerializedTextFilter {
    
    inline def apply(filter: String, filterType: String, `type`: String): SerializedTextFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedTextFilter]
    }
    
    extension [Self <: SerializedTextFilter](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TextComparator = js.Function3[/* filter */ String, /* gridValue */ js.Any, /* filterText */ String, Boolean]
  
  type TextFormatter = js.Function1[/* from */ String, String]
}
