package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsageLimitsRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results. The default is 100.
    */
  var maxResults: js.UndefOr[ListUsageLimitsRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListUsageLimits operation returns a nextToken, you can include the returned nextToken in subsequent ListUsageLimits operations, which returns results in the next page. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
    */
  var resourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Redshift Serverless feature whose limits you want to see.
    */
  var usageType: js.UndefOr[UsageLimitUsageType] = js.undefined
}
object ListUsageLimitsRequest {
  
  inline def apply(): ListUsageLimitsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsageLimitsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUsageLimitsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListUsageLimitsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setUsageType(value: UsageLimitUsageType): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
    
    inline def setUsageTypeUndefined: Self = StObject.set(x, "usageType", js.undefined)
  }
}
