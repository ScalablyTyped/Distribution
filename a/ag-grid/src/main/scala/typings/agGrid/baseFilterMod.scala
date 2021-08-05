package typings.agGrid

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.componentMod.Component
import typings.agGrid.contextMod.Context
import typings.agGrid.floatingFilterMod.FloatingFilterChange
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.iFilterMod.IDoesFilterPassParams
import typings.agGrid.iFilterMod.IFilter
import typings.agGrid.iFilterMod.IFilterParams
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import typings.agGrid.textFilterMod.INumberFilterParams
import typings.agGrid.textFilterMod.ITextFilterParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseFilterMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because Already inherited
  - typings.agGrid.iFilterMod.IFilterComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
  @js.native
  abstract class BaseFilter[T, P /* <: IFilterParams */, M] ()
    extends Component
       with IFilter {
    def this(template: String) = this()
    
    def acceptsBooleanLogic(): Boolean = js.native
    
    var applyActive: Boolean = js.native
    
    def bodyTemplate(`type`: FilterConditionType): String = js.native
    
    var clearActive: Boolean = js.native
    
    var conditionValue: String = js.native
    
    var context: Context = js.native
    
    /* private */ def createConditionBody(`type`: js.Any): js.Any = js.native
    
    /* private */ def createConditionTemplate(`type`: js.Any): js.Any = js.native
    
    def customInit(): Unit = js.native
    
    var defaultFilter: String = js.native
    
    /* private */ def doOnFilterChanged(applyNow: js.Any): js.Any = js.native
    
    /** The grid will ask each active filter, in turn, whether each row in the grid passes. If any
      filter fails, then the row will be excluded from the final set. The method is provided a
      params object with attributes node (the rodNode the grid creates that wraps the data) and data
      (the data object that you provided to the grid for that row). */
    /* CompleteClass */
    override def doesFilterPass(params: IDoesFilterPassParams): Boolean = js.native
    
    /* private */ var eApplyButton: js.Any = js.native
    
    /* private */ var eButtonsPanel: js.Any = js.native
    
    /* private */ var eClearButton: js.Any = js.native
    
    /* private */ var eConditionWrapper: js.Any = js.native
    
    /* private */ var eFilterBodyWrapper: js.Any = js.native
    
    var filter: String = js.native
    
    var filterCondition: String = js.native
    
    var filterParams: P = js.native
    
    def floatingFilter(from: String): Unit = js.native
    
    def generateFilterHeader(`type`: FilterConditionType): String = js.native
    
    /* private */ def generateTemplate(): js.Any = js.native
    
    def getDebounceMs(filterParams: INumberFilterParams): Double = js.native
    def getDebounceMs(filterParams: ITextFilterParams): Double = js.native
    
    /** Gets the filter state for storing */
    /* CompleteClass */
    override def getModel(): js.Any = js.native
    
    def getNullableModel(): M | CombinedFilter[M] = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    @JSName("init")
    def init_MBaseFilter(params: P): Unit = js.native
    
    def initialiseFilterBodyUi(`type`: FilterConditionType): Unit = js.native
    
    /** This is used to show the filter icon in the header. If true, the filter icon will be shown. */
    /* CompleteClass */
    override def isFilterActive(): Boolean = js.native
    
    def isFilterConditionActive(`type`: FilterConditionType): Boolean = js.native
    
    def modelFromFloatingFilter(from: String): M = js.native
    
    /* private */ var newRowsActionKeep: js.Any = js.native
    
    def onClearButton(): Unit = js.native
    
    def onFilterChanged(): Unit = js.native
    def onFilterChanged(applyNow: Boolean): Unit = js.native
    
    @JSName("onFloatingFilterChanged")
    def onFloatingFilterChanged_MBaseFilter(change: FloatingFilterChange): Boolean = js.native
    
    @JSName("onNewRowsLoaded")
    def onNewRowsLoaded_MBaseFilter(): Unit = js.native
    
    def parse(toParse: M, `type`: FilterConditionType): Unit = js.native
    
    /* private */ def redrawCondition(): js.Any = js.native
    
    def refreshFilterBodyUi(`type`: FilterConditionType): Unit = js.native
    
    /* private */ def refreshOperatorUi(): js.Any = js.native
    
    def resetState(): Unit = js.native
    
    def serialize(`type`: FilterConditionType): M = js.native
    
    def setModel(model: M): Unit = js.native
    /** Restores the filter state. */
    /* CompleteClass */
    override def setModel(model: js.Any): Unit = js.native
    def setModel(model: CombinedFilter[M]): Unit = js.native
    
    def translate(toTranslate: String): String = js.native
    
    def wrapCondition(mainCondition: String): String = js.native
  }
  /* static members */
  object BaseFilter {
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.CONTAINS")
    @js.native
    def CONTAINS: String = js.native
    inline def CONTAINS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.ENDS_WITH")
    @js.native
    def ENDS_WITH: String = js.native
    inline def ENDS_WITH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENDS_WITH")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.EQUALS")
    @js.native
    def EQUALS: String = js.native
    inline def EQUALS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.GREATER_THAN")
    @js.native
    def GREATER_THAN: String = js.native
    inline def GREATER_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.GREATER_THAN_OR_EQUAL")
    @js.native
    def GREATER_THAN_OR_EQUAL: String = js.native
    inline def GREATER_THAN_OR_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN_OR_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.IN_RANGE")
    @js.native
    def IN_RANGE: String = js.native
    inline def IN_RANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IN_RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.LESS_THAN")
    @js.native
    def LESS_THAN: String = js.native
    inline def LESS_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.LESS_THAN_OR_EQUAL")
    @js.native
    def LESS_THAN_OR_EQUAL: String = js.native
    inline def LESS_THAN_OR_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN_OR_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.NOT_CONTAINS")
    @js.native
    def NOT_CONTAINS: String = js.native
    inline def NOT_CONTAINS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_CONTAINS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.NOT_EQUAL")
    @js.native
    def NOT_EQUAL: String = js.native
    inline def NOT_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.STARTS_WITH")
    @js.native
    def STARTS_WITH: String = js.native
    inline def STARTS_WITH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STARTS_WITH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ag-grid/dist/lib/filter/baseFilter", "ComparableBaseFilter")
  @js.native
  abstract class ComparableBaseFilter[T, P /* <: IComparableFilterParams */, M] () extends BaseFilter[T, P, M] {
    def this(template: String) = this()
    
    /* private */ var eTypeConditionSelector: js.Any = js.native
    
    /* private */ var eTypeSelector: js.Any = js.native
    
    def filterValues(`type`: FilterConditionType): T | js.Array[T] = js.native
    
    def getApplicableFilterTypes(): js.Array[String] = js.native
    
    def getDefaultType(): String = js.native
    
    def individualFilterPasses(params: IDoesFilterPassParams, `type`: FilterConditionType): Boolean = js.native
    
    @JSName("init")
    def init_MComparableBaseFilter(params: P): Unit = js.native
    
    /* private */ def onFilterTypeChanged(`type`: js.Any): js.Any = js.native
    
    def setFilterType(filterType: String, `type`: FilterConditionType): Unit = js.native
    
    /* private */ var suppressAndOrCondition: js.Any = js.native
  }
  
  @js.native
  sealed trait FilterConditionType extends StObject
  @JSImport("ag-grid/dist/lib/filter/baseFilter", "FilterConditionType")
  @js.native
  object FilterConditionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterConditionType & Double] = js.native
    
    @js.native
    sealed trait CONDITION
      extends StObject
         with FilterConditionType
    /* 1 */ val CONDITION: typings.agGrid.baseFilterMod.FilterConditionType.CONDITION & Double = js.native
    
    @js.native
    sealed trait MAIN
      extends StObject
         with FilterConditionType
    /* 0 */ val MAIN: typings.agGrid.baseFilterMod.FilterConditionType.MAIN & Double = js.native
  }
  
  @JSImport("ag-grid/dist/lib/filter/baseFilter", "ScalarBaseFilter")
  @js.native
  abstract class ScalarBaseFilter[T, P /* <: IScalarFilterParams */, M] () extends ComparableBaseFilter[T, P, M] {
    def this(template: String) = this()
    
    def comparator(): Comparator[T] = js.native
    
    /* private */ def doIndividualFilterPasses(params: js.Any, `type`: js.Any, filter: js.Any): js.Any = js.native
    
    /* private */ def nullComparator(`type`: js.Any): js.Any = js.native
    
    /* private */ def translateNull(`type`: js.Any): js.Any = js.native
  }
  /* static members */
  object ScalarBaseFilter {
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "ScalarBaseFilter.DEFAULT_NULL_COMPARATOR")
    @js.native
    val DEFAULT_NULL_COMPARATOR: NullComparator = js.native
  }
  
  trait CombinedFilter[T] extends StObject {
    
    var condition1: T
    
    var condition2: T
    
    var operator: String
  }
  object CombinedFilter {
    
    inline def apply[T](condition1: T, condition2: T, operator: String): CombinedFilter[T] = {
      val __obj = js.Dynamic.literal(condition1 = condition1.asInstanceOf[js.Any], condition2 = condition2.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedFilter[T]]
    }
    
    extension [Self <: CombinedFilter[?], T](x: Self & CombinedFilter[T]) {
      
      inline def setCondition1(value: T): Self = StObject.set(x, "condition1", value.asInstanceOf[js.Any])
      
      inline def setCondition2(value: T): Self = StObject.set(x, "condition2", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    }
  }
  
  type Comparator[T] = js.Function2[/* left */ T, /* right */ T, Double]
  
  trait IComparableFilterParams
    extends StObject
       with IFilterParams {
    
    var suppressAndOrCondition: Boolean
  }
  object IComparableFilterParams {
    
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
    ): IComparableFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[IComparableFilterParams]
    }
    
    extension [Self <: IComparableFilterParams](x: Self) {
      
      inline def setSuppressAndOrCondition(value: Boolean): Self = StObject.set(x, "suppressAndOrCondition", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScalarFilterParams
    extends StObject
       with IComparableFilterParams {
    
    var inRangeInclusive: js.UndefOr[Boolean] = js.undefined
    
    var nullComparator: js.UndefOr[NullComparator] = js.undefined
  }
  object IScalarFilterParams {
    
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
    ): IScalarFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[IScalarFilterParams]
    }
    
    extension [Self <: IScalarFilterParams](x: Self) {
      
      inline def setInRangeInclusive(value: Boolean): Self = StObject.set(x, "inRangeInclusive", value.asInstanceOf[js.Any])
      
      inline def setInRangeInclusiveUndefined: Self = StObject.set(x, "inRangeInclusive", js.undefined)
      
      inline def setNullComparator(value: NullComparator): Self = StObject.set(x, "nullComparator", value.asInstanceOf[js.Any])
      
      inline def setNullComparatorUndefined: Self = StObject.set(x, "nullComparator", js.undefined)
    }
  }
  
  trait NullComparator extends StObject {
    
    @JSName("equals")
    var equals_FNullComparator: js.UndefOr[Boolean] = js.undefined
    
    var greaterThan: js.UndefOr[Boolean] = js.undefined
    
    var lessThan: js.UndefOr[Boolean] = js.undefined
  }
  object NullComparator {
    
    inline def apply(): NullComparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NullComparator]
    }
    
    extension [Self <: NullComparator](x: Self) {
      
      inline def setEquals_(value: Boolean): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setGreaterThan(value: Boolean): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
      
      inline def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
      
      inline def setLessThan(value: Boolean): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
      
      inline def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
    }
  }
}
