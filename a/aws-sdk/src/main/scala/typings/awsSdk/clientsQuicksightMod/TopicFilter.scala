package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicFilter extends StObject {
  
  /**
    * The category filter that is associated with this filter.
    */
  var CategoryFilter: js.UndefOr[TopicCategoryFilter] = js.undefined
  
  /**
    * The date range filter.
    */
  var DateRangeFilter: js.UndefOr[TopicDateRangeFilter] = js.undefined
  
  /**
    * The class of the filter. Valid values for this structure are ENFORCED_VALUE_FILTER, CONDITIONAL_VALUE_FILTER, and NAMED_VALUE_FILTER.
    */
  var FilterClass: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FilterClass] = js.undefined
  
  /**
    * A description of the filter used to select items for a topic.
    */
  var FilterDescription: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The name of the filter.
    */
  var FilterName: LimitedString
  
  /**
    * The other names or aliases for the filter.
    */
  var FilterSynonyms: js.UndefOr[Synonyms] = js.undefined
  
  /**
    * The type of the filter. Valid values for this structure are CATEGORY_FILTER, NUMERIC_EQUALITY_FILTER, NUMERIC_RANGE_FILTER, DATE_RANGE_FILTER, and RELATIVE_DATE_FILTER.
    */
  var FilterType: js.UndefOr[NamedFilterType] = js.undefined
  
  /**
    * The numeric equality filter.
    */
  var NumericEqualityFilter: js.UndefOr[TopicNumericEqualityFilter] = js.undefined
  
  /**
    * The numeric range filter.
    */
  var NumericRangeFilter: js.UndefOr[TopicNumericRangeFilter] = js.undefined
  
  /**
    * The name of the field that the filter operates on.
    */
  var OperandFieldName: LimitedString
  
  /**
    * The relative date filter.
    */
  var RelativeDateFilter: js.UndefOr[TopicRelativeDateFilter] = js.undefined
}
object TopicFilter {
  
  inline def apply(FilterName: LimitedString, OperandFieldName: LimitedString): TopicFilter = {
    val __obj = js.Dynamic.literal(FilterName = FilterName.asInstanceOf[js.Any], OperandFieldName = OperandFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicFilter] (val x: Self) extends AnyVal {
    
    inline def setCategoryFilter(value: TopicCategoryFilter): Self = StObject.set(x, "CategoryFilter", value.asInstanceOf[js.Any])
    
    inline def setCategoryFilterUndefined: Self = StObject.set(x, "CategoryFilter", js.undefined)
    
    inline def setDateRangeFilter(value: TopicDateRangeFilter): Self = StObject.set(x, "DateRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setDateRangeFilterUndefined: Self = StObject.set(x, "DateRangeFilter", js.undefined)
    
    inline def setFilterClass(value: FilterClass): Self = StObject.set(x, "FilterClass", value.asInstanceOf[js.Any])
    
    inline def setFilterClassUndefined: Self = StObject.set(x, "FilterClass", js.undefined)
    
    inline def setFilterDescription(value: LimitedString): Self = StObject.set(x, "FilterDescription", value.asInstanceOf[js.Any])
    
    inline def setFilterDescriptionUndefined: Self = StObject.set(x, "FilterDescription", js.undefined)
    
    inline def setFilterName(value: LimitedString): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
    
    inline def setFilterSynonyms(value: Synonyms): Self = StObject.set(x, "FilterSynonyms", value.asInstanceOf[js.Any])
    
    inline def setFilterSynonymsUndefined: Self = StObject.set(x, "FilterSynonyms", js.undefined)
    
    inline def setFilterSynonymsVarargs(value: LimitedString*): Self = StObject.set(x, "FilterSynonyms", js.Array(value*))
    
    inline def setFilterType(value: NamedFilterType): Self = StObject.set(x, "FilterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "FilterType", js.undefined)
    
    inline def setNumericEqualityFilter(value: TopicNumericEqualityFilter): Self = StObject.set(x, "NumericEqualityFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericEqualityFilterUndefined: Self = StObject.set(x, "NumericEqualityFilter", js.undefined)
    
    inline def setNumericRangeFilter(value: TopicNumericRangeFilter): Self = StObject.set(x, "NumericRangeFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericRangeFilterUndefined: Self = StObject.set(x, "NumericRangeFilter", js.undefined)
    
    inline def setOperandFieldName(value: LimitedString): Self = StObject.set(x, "OperandFieldName", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateFilter(value: TopicRelativeDateFilter): Self = StObject.set(x, "RelativeDateFilter", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateFilterUndefined: Self = StObject.set(x, "RelativeDateFilter", js.undefined)
  }
}
