package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFilterConfiguration extends StObject {
  
  /**
    * The category value for the filter. This field is mutually exclusive to ParameterName.
    */
  var CategoryValue: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CategoryValue] = js.undefined
  
  /**
    * The match operator that is used to determine if a filter should be applied.
    */
  var MatchOperator: CategoryFilterMatchOperator
  
  /**
    * This option determines how null values should be treated when filtering data.    ALL_VALUES: Include null values in filtered results.    NULLS_ONLY: Only include null values in filtered results.    NON_NULLS_ONLY: Exclude null values from filtered results.  
    */
  var NullOption: FilterNullOption
  
  /**
    * The parameter whose value should be used for the filter value. This field is mutually exclusive to CategoryValue.
    */
  var ParameterName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ParameterName] = js.undefined
  
  /**
    * Select all of the values. Null is not the assigned value of select all.    FILTER_ALL_VALUES   
    */
  var SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions] = js.undefined
}
object CustomFilterConfiguration {
  
  inline def apply(MatchOperator: CategoryFilterMatchOperator, NullOption: FilterNullOption): CustomFilterConfiguration = {
    val __obj = js.Dynamic.literal(MatchOperator = MatchOperator.asInstanceOf[js.Any], NullOption = NullOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilterConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomFilterConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCategoryValue(value: CategoryValue): Self = StObject.set(x, "CategoryValue", value.asInstanceOf[js.Any])
    
    inline def setCategoryValueUndefined: Self = StObject.set(x, "CategoryValue", js.undefined)
    
    inline def setMatchOperator(value: CategoryFilterMatchOperator): Self = StObject.set(x, "MatchOperator", value.asInstanceOf[js.Any])
    
    inline def setNullOption(value: FilterNullOption): Self = StObject.set(x, "NullOption", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: ParameterName): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setSelectAllOptions(value: CategoryFilterSelectAllOptions): Self = StObject.set(x, "SelectAllOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllOptionsUndefined: Self = StObject.set(x, "SelectAllOptions", js.undefined)
  }
}
