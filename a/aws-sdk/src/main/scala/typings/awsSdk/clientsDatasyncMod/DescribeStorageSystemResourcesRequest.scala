package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageSystemResourcesRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your on-premises storage system.
    */
  var DiscoveryJobArn: typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn
  
  /**
    * Filters the storage system resources that you want returned. For example, this might be volumes associated with a specific storage virtual machine (SVM).
    */
  var Filter: js.UndefOr[ResourceFilters] = js.undefined
  
  /**
    * Specifies the maximum number of storage system resources that you want to list in a response.
    */
  var MaxResults: js.UndefOr[DiscoveryMaxResults] = js.undefined
  
  /**
    * Specifies an opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
  
  /**
    * Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want information about. You can't use this parameter in combination with the Filter parameter.
    */
  var ResourceIds: js.UndefOr[typings.awsSdk.clientsDatasyncMod.ResourceIds] = js.undefined
  
  /**
    * Specifies what kind of storage system resources that you want information about.
    */
  var ResourceType: DiscoveryResourceType
}
object DescribeStorageSystemResourcesRequest {
  
  inline def apply(DiscoveryJobArn: DiscoveryJobArn, ResourceType: DiscoveryResourceType): DescribeStorageSystemResourcesRequest = {
    val __obj = js.Dynamic.literal(DiscoveryJobArn = DiscoveryJobArn.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStorageSystemResourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorageSystemResourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: ResourceFilters): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: DiscoveryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceIds(value: ResourceIds): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "ResourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: ResourceId*): Self = StObject.set(x, "ResourceIds", js.Array(value*))
    
    inline def setResourceType(value: DiscoveryResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
