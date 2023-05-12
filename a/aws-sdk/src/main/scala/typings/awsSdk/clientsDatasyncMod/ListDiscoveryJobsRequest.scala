package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveryJobsRequest extends StObject {
  
  /**
    * Specifies how many results you want in the response.
    */
  var MaxResults: js.UndefOr[DiscoveryMaxResults] = js.undefined
  
  /**
    * Specifies an opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only want to list the discovery jobs that are associated with a specific storage system.
    */
  var StorageSystemArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.StorageSystemArn] = js.undefined
}
object ListDiscoveryJobsRequest {
  
  inline def apply(): ListDiscoveryJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveryJobsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDiscoveryJobsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: DiscoveryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageSystemArn(value: StorageSystemArn): Self = StObject.set(x, "StorageSystemArn", value.asInstanceOf[js.Any])
    
    inline def setStorageSystemArnUndefined: Self = StObject.set(x, "StorageSystemArn", js.undefined)
  }
}
