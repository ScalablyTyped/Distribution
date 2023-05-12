package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterListConfiguration extends StObject {
  
  /**
    * The list of category values for the filter.
    */
  var CategoryValues: js.UndefOr[CategoryValueList] = js.undefined
  
  /**
    * The match operator that is used to determine if a filter should be applied.
    */
  var MatchOperator: CategoryFilterMatchOperator
  
  /**
    * Select all of the values. Null is not the assigned value of select all.    FILTER_ALL_VALUES   
    */
  var SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions] = js.undefined
}
object FilterListConfiguration {
  
  inline def apply(MatchOperator: CategoryFilterMatchOperator): FilterListConfiguration = {
    val __obj = js.Dynamic.literal(MatchOperator = MatchOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterListConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterListConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryValues(value: CategoryValueList): Self = StObject.set(x, "CategoryValues", value.asInstanceOf[js.Any])
    
    inline def setCategoryValuesUndefined: Self = StObject.set(x, "CategoryValues", js.undefined)
    
    inline def setCategoryValuesVarargs(value: CategoryValue*): Self = StObject.set(x, "CategoryValues", js.Array(value*))
    
    inline def setMatchOperator(value: CategoryFilterMatchOperator): Self = StObject.set(x, "MatchOperator", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptions(value: CategoryFilterSelectAllOptions): Self = StObject.set(x, "SelectAllOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptionsUndefined: Self = StObject.set(x, "SelectAllOptions", js.undefined)
  }
}
