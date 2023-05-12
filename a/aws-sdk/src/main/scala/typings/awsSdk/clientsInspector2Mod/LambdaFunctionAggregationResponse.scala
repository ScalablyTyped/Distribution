package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionAggregationResponse extends StObject {
  
  /**
    * The ID of the AWS account that owns the AWS Lambda function. 
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The AWS Lambda function names included in the aggregation results.
    */
  var functionName: js.UndefOr[String] = js.undefined
  
  /**
    * The tags included in the aggregation results.
    */
  var lambdaTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The date that the AWS Lambda function included in the aggregation results was last changed.
    */
  var lastModifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The resource IDs included in the aggregation results.
    */
  var resourceId: NonEmptyString
  
  /**
    * The runtimes included in the aggregation results.
    */
  var runtime: js.UndefOr[String] = js.undefined
  
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object LambdaFunctionAggregationResponse {
  
  inline def apply(resourceId: NonEmptyString): LambdaFunctionAggregationResponse = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAggregationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaFunctionAggregationResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
    
    inline def setLambdaTags(value: TagMap): Self = StObject.set(x, "lambdaTags", value.asInstanceOf[js.Any])
    
    inline def setLambdaTagsUndefined: Self = StObject.set(x, "lambdaTags", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAtUndefined: Self = StObject.set(x, "lastModifiedAt", js.undefined)
    
    inline def setResourceId(value: NonEmptyString): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
