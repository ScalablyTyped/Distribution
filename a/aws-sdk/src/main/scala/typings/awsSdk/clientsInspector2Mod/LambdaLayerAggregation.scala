package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaLayerAggregation extends StObject {
  
  /**
    * The names of the AWS Lambda functions associated with the layers.
    */
  var functionNames: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function layer. 
    */
  var layerArns: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The resource IDs for the AWS Lambda function layers.
    */
  var resourceIds: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The finding severity to use for sorting the results.
    */
  var sortBy: js.UndefOr[LambdaLayerSortBy] = js.undefined
  
  /**
    * The order to use for sorting the results.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object LambdaLayerAggregation {
  
  inline def apply(): LambdaLayerAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaLayerAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaLayerAggregation] (val x: Self) extends AnyVal {
    
    inline def setFunctionNames(value: StringFilterList): Self = StObject.set(x, "functionNames", value.asInstanceOf[js.Any])
    
    inline def setFunctionNamesUndefined: Self = StObject.set(x, "functionNames", js.undefined)
    
    inline def setFunctionNamesVarargs(value: StringFilter*): Self = StObject.set(x, "functionNames", js.Array(value*))
    
    inline def setLayerArns(value: StringFilterList): Self = StObject.set(x, "layerArns", value.asInstanceOf[js.Any])
    
    inline def setLayerArnsUndefined: Self = StObject.set(x, "layerArns", js.undefined)
    
    inline def setLayerArnsVarargs(value: StringFilter*): Self = StObject.set(x, "layerArns", js.Array(value*))
    
    inline def setResourceIds(value: StringFilterList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: StringFilter*): Self = StObject.set(x, "resourceIds", js.Array(value*))
    
    inline def setSortBy(value: LambdaLayerSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
