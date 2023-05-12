package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFilterListConfiguration extends StObject {
  
  /**
    * The list of category values for the filter.
    */
  var CategoryValues: js.UndefOr[CategoryValueList] = js.undefined
  
  /**
    * The match operator that is used to determine if a filter should be applied.
    */
  var MatchOperator: CategoryFilterMatchOperator
  
  /**
    * This option determines how null values should be treated when filtering data.    ALL_VALUES: Include null values in filtered results.    NULLS_ONLY: Only include null values in filtered results.    NON_NULLS_ONLY: Exclude null values from filtered results.  
    */
  var NullOption: FilterNullOption
  
  /**
    * Select all of the values. Null is not the assigned value of select all.    FILTER_ALL_VALUES   
    */
  var SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions] = js.undefined
}
object CustomFilterListConfiguration {
  
  inline def apply(MatchOperator: CategoryFilterMatchOperator, NullOption: FilterNullOption): CustomFilterListConfiguration = {
    val __obj = js.Dynamic.literal(MatchOperator = MatchOperator.asInstanceOf[js.Any], NullOption = NullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilterListConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomFilterListConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryValues(value: CategoryValueList): Self = StObject.set(x, "CategoryValues", value.asInstanceOf[js.Any])
    
    inline def setCategoryValuesUndefined: Self = StObject.set(x, "CategoryValues", js.undefined)
    
    inline def setCategoryValuesVarargs(value: CategoryValue*): Self = StObject.set(x, "CategoryValues", js.Array(value*))
    
    inline def setMatchOperator(value: CategoryFilterMatchOperator): Self = StObject.set(x, "MatchOperator", value.asInstanceOf[js.Any])
    
    inline def setNullOption(value: FilterNullOption): Self = StObject.set(x, "NullOption", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptions(value: CategoryFilterSelectAllOptions): Self = StObject.set(x, "SelectAllOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptionsUndefined: Self = StObject.set(x, "SelectAllOptions", js.undefined)
  }
}
