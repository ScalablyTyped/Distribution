package typings.agGrid

import typings.agGrid.baseFilterMod.FilterConditionType
import typings.agGrid.baseFilterMod.IComparableFilterParams
import typings.agGrid.baseFilterMod.ScalarBaseFilter
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.componentMod.Component
import typings.agGrid.dateComponentMod.IDate
import typings.agGrid.dateComponentMod.IDateParams
import typings.agGrid.iFilterMod.SerializedFilter
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFilterMod {
  
  @JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter")
  @js.native
  class DateFilter () extends ScalarBaseFilter[Date, IDateFilterParams, SerializedDateFilter] {
    def this(template: String) = this()
    
    var componentRecipes: js.Any = js.native
    
    /* private */ def createComponents(`type`: js.Any): js.Any = js.native
    
    var dateFrom: js.Any = js.native
    
    var dateFromComponent: js.Any = js.native
    
    var dateFromCondition: js.Any = js.native
    
    var dateFromConditionComponent: js.Any = js.native
    
    var dateTo: js.Any = js.native
    
    var dateToComponent: js.Any = js.native
    
    var dateToCondition: js.Any = js.native
    
    var dateToConditionComponent: js.Any = js.native
    
    /* private */ def defaultComparator(filterDate: js.Any, cellValue: js.Any): js.Any = js.native
    
    var eDateFromConditionPanel: js.Any = js.native
    
    var eDateFromPanel: js.Any = js.native
    
    var eDateToConditionPanel: js.Any = js.native
    
    var eDateToPanel: js.Any = js.native
    
    def getDateFrom(): String = js.native
    
    def getDateTo(): String = js.native
    
    def getFilterType(): String = js.native
    
    /* private */ def onDateChanged(`type`: js.Any): js.Any = js.native
    
    def setDateFrom(date: String, `type`: FilterConditionType): Unit = js.native
    
    /* private */ def setDateFrom_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
    
    def setDateTo(date: String, `type`: FilterConditionType): Unit = js.native
    
    /* private */ def setDateTo_date(parsedDate: js.Any, `type`: js.Any): js.Any = js.native
    
    def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
  }
  /* static members */
  object DateFilter {
    
    @JSImport("ag-grid/dist/lib/filter/dateFilter", "DateFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def removeTimezone(from: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTimezone")(from.asInstanceOf[js.Any]).asInstanceOf[Date]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.agGrid.iComponentMod.IComponent because Already inherited
  - typings.agGrid.dateComponentMod.IDateComp because var conflicts: afterGuiAttached, destroy, init. Inlined  */ @JSImport("ag-grid/dist/lib/filter/dateFilter", "DefaultDateComponent")
  @js.native
  class DefaultDateComponent ()
    extends Component
       with IDate {
    
    var eDateInput: js.Any = js.native
    
    /** Returns the current date represented by this editor */
    /* CompleteClass */
    override def getDate(): Date = js.native
    
    @JSName("init")
    def init_MDefaultDateComponent(params: IDateParams): Unit = js.native
    
    var listener: js.Any = js.native
    
    /** Sets the date represented by this component */
    /* CompleteClass */
    override def setDate(date: Date): Unit = js.native
  }
  
  type IDateComparatorFunc = js.Function2[/* filterLocalDateAtMidnight */ Date, /* cellValue */ js.Any, Double]
  
  trait IDateFilterParams
    extends StObject
       with IComparableFilterParams {
    
    var browserDatePicker: js.UndefOr[Boolean] = js.undefined
    
    var comparator: js.UndefOr[IDateComparatorFunc] = js.undefined
  }
  object IDateFilterParams {
    
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
    ): IDateFilterParams = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
      __obj.asInstanceOf[IDateFilterParams]
    }
    
    @scala.inline
    implicit class IDateFilterParamsMutableBuilder[Self <: IDateFilterParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowserDatePicker(value: Boolean): Self = StObject.set(x, "browserDatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserDatePickerUndefined: Self = StObject.set(x, "browserDatePicker", js.undefined)
      
      @scala.inline
      def setComparator(value: (/* filterLocalDateAtMidnight */ Date, /* cellValue */ js.Any) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    }
  }
  
  trait SerializedDateFilter
    extends StObject
       with SerializedFilter {
    
    var dateFrom: String
    
    var dateTo: String
    
    var `type`: String
  }
  object SerializedDateFilter {
    
    @scala.inline
    def apply(dateFrom: String, dateTo: String, filterType: String, `type`: String): SerializedDateFilter = {
      val __obj = js.Dynamic.literal(dateFrom = dateFrom.asInstanceOf[js.Any], dateTo = dateTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedDateFilter]
    }
    
    @scala.inline
    implicit class SerializedDateFilterMutableBuilder[Self <: SerializedDateFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateFrom(value: String): Self = StObject.set(x, "dateFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTo(value: String): Self = StObject.set(x, "dateTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
