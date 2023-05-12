package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicCategoryFilter extends StObject {
  
  /**
    * The category filter function. Valid values for this structure are EXACT and CONTAINS.
    */
  var CategoryFilterFunction: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CategoryFilterFunction] = js.undefined
  
  /**
    * The category filter type. This element is used to specify whether a filter is a simple category filter or an inverse category filter.
    */
  var CategoryFilterType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CategoryFilterType] = js.undefined
  
  /**
    * The constant used in a category filter.
    */
  var Constant: js.UndefOr[TopicCategoryFilterConstant] = js.undefined
  
  /**
    * A Boolean value that indicates if the filter is inverse.
    */
  var Inverse: js.UndefOr[Boolean] = js.undefined
}
object TopicCategoryFilter {
  
  inline def apply(): TopicCategoryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicCategoryFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicCategoryFilter] (val x: Self) extends AnyVal {
    
    inline def setCategoryFilterFunction(value: CategoryFilterFunction): Self = StObject.set(x, "CategoryFilterFunction", value.asInstanceOf[js.Any])
    
    inline def setCategoryFilterFunctionUndefined: Self = StObject.set(x, "CategoryFilterFunction", js.undefined)
    
    inline def setCategoryFilterType(value: CategoryFilterType): Self = StObject.set(x, "CategoryFilterType", value.asInstanceOf[js.Any])
    
    inline def setCategoryFilterTypeUndefined: Self = StObject.set(x, "CategoryFilterType", js.undefined)
    
    inline def setConstant(value: TopicCategoryFilterConstant): Self = StObject.set(x, "Constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "Constant", js.undefined)
    
    inline def setInverse(value: Boolean): Self = StObject.set(x, "Inverse", value.asInstanceOf[js.Any])
    
    inline def setInverseUndefined: Self = StObject.set(x, "Inverse", js.undefined)
  }
}
