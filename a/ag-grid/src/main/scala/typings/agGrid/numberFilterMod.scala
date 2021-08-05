package typings.agGrid

import typings.agGrid.baseFilterMod.FilterConditionType
import typings.agGrid.baseFilterMod.ScalarBaseFilter
import typings.agGrid.iFilterMod.SerializedFilter
import typings.agGrid.textFilterMod.INumberFilterParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFilterMod {
  
  @JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter")
  @js.native
  class NumberFilter () extends ScalarBaseFilter[Double, INumberFilterParams, SerializedNumberFilter] {
    def this(template: String) = this()
    
    /* private */ def addFilterChangedEventListeners(`type`: js.Any, filterElement: js.Any, filterToElement: js.Any): js.Any = js.native
    
    @JSName("afterGuiAttached")
    def afterGuiAttached_MNumberFilter(): Unit = js.native
    
    /* private */ def asNumber(value: js.Any): js.Any = js.native
    
    /* private */ var eFilterTextConditionField: js.Any = js.native
    
    /* private */ var eFilterTextField: js.Any = js.native
    
    /* private */ var eFilterToConditionText: js.Any = js.native
    
    /* private */ var eFilterToTextField: js.Any = js.native
    
    /* private */ var eNumberToConditionPanel: js.Any = js.native
    
    /* private */ var eNumberToPanel: js.Any = js.native
    
    var filterNumber: js.Any = js.native
    
    var filterNumberCondition: js.Any = js.native
    
    var filterNumberConditionTo: js.Any = js.native
    
    var filterNumberTo: js.Any = js.native
    
    def getFilter(`type`: FilterConditionType): js.Any = js.native
    
    /* private */ def onTextFieldsChanged(`type`: js.Any, filterElement: js.Any, filterToElement: js.Any): js.Any = js.native
    
    def setFilter(filter: js.Any, `type`: FilterConditionType): Unit = js.native
    
    def setFilterTo(filter: js.Any, `type`: FilterConditionType): Unit = js.native
    
    def setType(filterType: String, `type`: FilterConditionType): Unit = js.native
    
    /* private */ def stringToFloat(value: js.Any): js.Any = js.native
  }
  /* static members */
  object NumberFilter {
    
    @JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/filter/numberFilter", "NumberFilter.LESS_THAN")
    @js.native
    def LESS_THAN: String = js.native
    inline def LESS_THAN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(x.asInstanceOf[js.Any])
  }
  
  trait SerializedNumberFilter
    extends StObject
       with SerializedFilter {
    
    var filter: Double
    
    var filterTo: Double
    
    var `type`: String
  }
  object SerializedNumberFilter {
    
    inline def apply(filter: Double, filterTo: Double, filterType: String, `type`: String): SerializedNumberFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterTo = filterTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedNumberFilter]
    }
    
    extension [Self <: SerializedNumberFilter](x: Self) {
      
      inline def setFilter(value: Double): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterTo(value: Double): Self = StObject.set(x, "filterTo", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
