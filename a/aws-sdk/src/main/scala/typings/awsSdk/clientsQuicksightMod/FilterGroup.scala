package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterGroup extends StObject {
  
  /**
    * The filter new feature which can apply filter group to all data sets. Choose one of the following options:    ALL_DATASETS     SINGLE_DATASET   
    */
  var CrossDataset: CrossDatasetTypes
  
  /**
    * The value that uniquely identifies a FilterGroup within a dashboard, template, or analysis.
    */
  var FilterGroupId: ShortRestrictiveResourceId
  
  /**
    * The list of filters that are present in a FilterGroup.
    */
  var Filters: FilterList
  
  /**
    * The configuration that specifies what scope to apply to a FilterGroup. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  var ScopeConfiguration: FilterScopeConfiguration
  
  /**
    * The status of the FilterGroup.
    */
  var Status: js.UndefOr[WidgetStatus] = js.undefined
}
object FilterGroup {
  
  inline def apply(
    CrossDataset: CrossDatasetTypes,
    FilterGroupId: ShortRestrictiveResourceId,
    Filters: FilterList,
    ScopeConfiguration: FilterScopeConfiguration
  ): FilterGroup = {
    val __obj = js.Dynamic.literal(CrossDataset = CrossDataset.asInstanceOf[js.Any], FilterGroupId = FilterGroupId.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], ScopeConfiguration = ScopeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterGroup] (val x: Self) extends AnyVal {
    
    inline def setCrossDataset(value: CrossDatasetTypes): Self = StObject.set(x, "CrossDataset", value.asInstanceOf[js.Any])
    
    inline def setFilterGroupId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "FilterGroupId", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setScopeConfiguration(value: FilterScopeConfiguration): Self = StObject.set(x, "ScopeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WidgetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
