package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionAggregation extends StObject {
  
  /**
    * The AWS Lambda function names to include in the aggregation results.
    */
  var functionNames: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The tags to include in the aggregation results.
    */
  var functionTags: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * The resource IDs to include in the aggregation results.
    */
  var resourceIds: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * Returns findings aggregated by AWS Lambda function runtime environments.
    */
  var runtimes: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The finding severity to use for sorting the results.
    */
  var sortBy: js.UndefOr[LambdaFunctionSortBy] = js.undefined
  
  /**
    * The order to use for sorting the results.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object LambdaFunctionAggregation {
  
  inline def apply(): LambdaFunctionAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaFunctionAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionAggregation] (val x: Self) extends AnyVal {
    
    inline def setFunctionNames(value: StringFilterList): Self = StObject.set(x, "functionNames", value.asInstanceOf[js.Any])
    
    inline def setFunctionNamesUndefined: Self = StObject.set(x, "functionNames", js.undefined)
    
    inline def setFunctionNamesVarargs(value: StringFilter*): Self = StObject.set(x, "functionNames", js.Array(value*))
    
    inline def setFunctionTags(value: MapFilterList): Self = StObject.set(x, "functionTags", value.asInstanceOf[js.Any])
    
    inline def setFunctionTagsUndefined: Self = StObject.set(x, "functionTags", js.undefined)
    
    inline def setFunctionTagsVarargs(value: MapFilter*): Self = StObject.set(x, "functionTags", js.Array(value*))
    
    inline def setResourceIds(value: StringFilterList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: StringFilter*): Self = StObject.set(x, "resourceIds", js.Array(value*))
    
    inline def setRuntimes(value: StringFilterList): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    inline def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    inline def setRuntimesVarargs(value: StringFilter*): Self = StObject.set(x, "runtimes", js.Array(value*))
    
    inline def setSortBy(value: LambdaFunctionSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
