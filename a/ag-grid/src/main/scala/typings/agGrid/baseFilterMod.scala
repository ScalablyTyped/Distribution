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
import scala.scalajs.js.`|`
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
    
    var eApplyButton: js.Any = js.native
    
    var eButtonsPanel: js.Any = js.native
    
    var eClearButton: js.Any = js.native
    
    var eConditionWrapper: js.Any = js.native
    
    var eFilterBodyWrapper: js.Any = js.native
    
    var filter: String = js.native
    
    var filterCondition: String = js.native
    
    var filterParams: P = js.native
    
    def floatingFilter(from: String): Unit = js.native
    
    def generateFilterHeader(`type`: FilterConditionType): String = js.native
    
    /* private */ def generateTemplate(): js.Any = js.native
    
    def getDebounceMs(filterParams: INumberFilterParams): Double = js.native
    def getDebounceMs(filterParams: ITextFilterParams): Double = js.native
    
    def getNullableModel(): M | CombinedFilter[M] = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    @JSName("init")
    def init_MBaseFilter(params: P): Unit = js.native
    
    def initialiseFilterBodyUi(`type`: FilterConditionType): Unit = js.native
    
    def isFilterConditionActive(`type`: FilterConditionType): Boolean = js.native
    
    def modelFromFloatingFilter(from: String): M = js.native
    
    var newRowsActionKeep: js.Any = js.native
    
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
    @scala.inline
    def CONTAINS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.ENDS_WITH")
    @js.native
    def ENDS_WITH: String = js.native
    @scala.inline
    def ENDS_WITH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENDS_WITH")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.EQUALS")
    @js.native
    def EQUALS: String = js.native
    @scala.inline
    def EQUALS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.GREATER_THAN")
    @js.native
    def GREATER_THAN: String = js.native
    @scala.inline
    def GREATER_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.GREATER_THAN_OR_EQUAL")
    @js.native
    def GREATER_THAN_OR_EQUAL: String = js.native
    @scala.inline
    def GREATER_THAN_OR_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN_OR_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.IN_RANGE")
    @js.native
    def IN_RANGE: String = js.native
    @scala.inline
    def IN_RANGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IN_RANGE")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.LESS_THAN")
    @js.native
    def LESS_THAN: String = js.native
    @scala.inline
    def LESS_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.LESS_THAN_OR_EQUAL")
    @js.native
    def LESS_THAN_OR_EQUAL: String = js.native
    @scala.inline
    def LESS_THAN_OR_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN_OR_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.NOT_CONTAINS")
    @js.native
    def NOT_CONTAINS: String = js.native
    @scala.inline
    def NOT_CONTAINS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_CONTAINS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.NOT_EQUAL")
    @js.native
    def NOT_EQUAL: String = js.native
    @scala.inline
    def NOT_EQUAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUAL")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/filter/baseFilter", "BaseFilter.STARTS_WITH")
    @js.native
    def STARTS_WITH: String = js.native
    @scala.inline
    def STARTS_WITH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STARTS_WITH")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ag-grid/dist/lib/filter/baseFilter", "ComparableBaseFilter")
  @js.native
  abstract class ComparableBaseFilter[T, P /* <: IComparableFilterParams */, M] () extends BaseFilter[T, P, M] {
    def this(template: String) = this()
    
    var eTypeConditionSelector: js.Any = js.native
    
    var eTypeSelector: js.Any = js.native
    
    def filterValues(`type`: FilterConditionType): T | js.Array[T] = js.native
    
    def getApplicableFilterTypes(): js.Array[String] = js.native
    
    def getDefaultType(): String = js.native
    
    def individualFilterPasses(params: IDoesFilterPassParams, `type`: FilterConditionType): Boolean = js.native
    
    @JSName("init")
    def init_MComparableBaseFilter(params: P): Unit = js.native
    
    /* private */ def onFilterTypeChanged(`type`: js.Any): js.Any = js.native
    
    def setFilterType(filterType: String, `type`: FilterConditionType): Unit = js.native
    
    var suppressAndOrCondition: js.Any = js.native
  }
  
  @js.native
  sealed trait FilterConditionType extends StObject
  @JSImport("ag-grid/dist/lib/filter/baseFilter", "FilterConditionType")
  @js.native
  object FilterConditionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterConditionType with Double] = js.native
    
    @js.native
    sealed trait CONDITION extends FilterConditionType
    /* 1 */ val CONDITION: typings.agGrid.baseFilterMod.FilterConditionType.CONDITION with Double = js.native
    
    @js.native
    sealed trait MAIN extends FilterConditionType
    /* 0 */ val MAIN: typings.agGrid.baseFilterMod.FilterConditionType.MAIN with Double = js.native
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
  
  @js.native
  trait CombinedFilter[T] extends StObject {
    
    var condition1: T = js.native
    
    var condition2: T = js.native
    
    var operator: String = js.native
  }
  object CombinedFilter {
    
    @scala.inline
    def apply[T](condition1: T, condition2: T, operator: String): CombinedFilter[T] = {
      val __obj = js.Dynamic.literal(condition1 = condition1.asInstanceOf[js.Any], condition2 = condition2.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombinedFilter[T]]
    }
    
    @scala.inline
    implicit class CombinedFilterMutableBuilder[Self <: CombinedFilter[_], T] (val x: Self with CombinedFilter[T]) extends AnyVal {
      
      @scala.inline
      def setCondition1(value: T): Self = StObject.set(x, "condition1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCondition2(value: T): Self = StObject.set(x, "condition2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    }
  }
  
  type Comparator[T] = js.Function2[/* left */ T, /* right */ T, Double]
  
  @js.native
  trait IComparableFilterParams extends IFilterParams {
    
    var suppressAndOrCondition: Boolean = js.native
  }
  object IComparableFilterParams {
    
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
    ): IComparableFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[IComparableFilterParams]
    }
    
    @scala.inline
    implicit class IComparableFilterParamsMutableBuilder[Self <: IComparableFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuppressAndOrCondition(value: Boolean): Self = StObject.set(x, "suppressAndOrCondition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScalarFilterParams extends IComparableFilterParams {
    
    var inRangeInclusive: js.UndefOr[Boolean] = js.native
    
    var nullComparator: js.UndefOr[NullComparator] = js.native
  }
  object IScalarFilterParams {
    
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
    ): IScalarFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[IScalarFilterParams]
    }
    
    @scala.inline
    implicit class IScalarFilterParamsMutableBuilder[Self <: IScalarFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInRangeInclusive(value: Boolean): Self = StObject.set(x, "inRangeInclusive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInRangeInclusiveUndefined: Self = StObject.set(x, "inRangeInclusive", js.undefined)
      
      @scala.inline
      def setNullComparator(value: NullComparator): Self = StObject.set(x, "nullComparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullComparatorUndefined: Self = StObject.set(x, "nullComparator", js.undefined)
    }
  }
  
  @js.native
  trait NullComparator extends StObject {
    
    @JSName("equals")
    var equals_FNullComparator: js.UndefOr[Boolean] = js.native
    
    var greaterThan: js.UndefOr[Boolean] = js.native
    
    var lessThan: js.UndefOr[Boolean] = js.native
  }
  object NullComparator {
    
    @scala.inline
    def apply(): NullComparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NullComparator]
    }
    
    @scala.inline
    implicit class NullComparatorMutableBuilder[Self <: NullComparator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: Boolean): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setGreaterThan(value: Boolean): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreaterThanUndefined: Self = StObject.set(x, "greaterThan", js.undefined)
      
      @scala.inline
      def setLessThan(value: Boolean): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLessThanUndefined: Self = StObject.set(x, "lessThan", js.undefined)
    }
  }
}
