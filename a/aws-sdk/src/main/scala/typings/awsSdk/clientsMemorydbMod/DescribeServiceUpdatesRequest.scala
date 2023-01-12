package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceUpdatesRequest extends StObject {
  
  /**
    * The list of cluster names to identify service updates to apply
    */
  var ClusterNames: js.UndefOr[ClusterNameList] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the service update to describe.
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The status(es) of the service updates to filter on
    */
  var Status: js.UndefOr[ServiceUpdateStatusList] = js.undefined
}
object DescribeServiceUpdatesRequest {
  
  inline def apply(): DescribeServiceUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceUpdatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeServiceUpdatesRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterNames(value: ClusterNameList): Self = StObject.set(x, "ClusterNames", value.asInstanceOf[js.Any])
    
    inline def setClusterNamesUndefined: Self = StObject.set(x, "ClusterNames", js.undefined)
    
    inline def setClusterNamesVarargs(value: String*): Self = StObject.set(x, "ClusterNames", js.Array(value*))
    
    inline def setMaxResults(value: IntegerOptional): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setStatus(value: ServiceUpdateStatusList): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStatusVarargs(value: ServiceUpdateStatus*): Self = StObject.set(x, "Status", js.Array(value*))
  }
}
