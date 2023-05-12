package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageSystemResourceMetricsRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the discovery job that collects information about your on-premises storage system.
    */
  var DiscoveryJobArn: typings.awsSdk.clientsDatasyncMod.DiscoveryJobArn
  
  /**
    * Specifies a time within the total duration that the discovery job ran. To see information gathered during a certain time frame, use this parameter with StartTime.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies how many results that you want in the response.
    */
  var MaxResults: js.UndefOr[DiscoveryMaxResults] = js.undefined
  
  /**
    * Specifies an opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
  
  /**
    * Specifies the universally unique identifier (UUID) of the storage system resource that you want information about.
    */
  var ResourceId: typings.awsSdk.clientsDatasyncMod.ResourceId
  
  /**
    * Specifies the kind of storage system resource that you want information about.
    */
  var ResourceType: DiscoveryResourceType
  
  /**
    * Specifies a time within the total duration that the discovery job ran. To see information gathered during a certain time frame, use this parameter with EndTime.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeStorageSystemResourceMetricsRequest {
  
  inline def apply(DiscoveryJobArn: DiscoveryJobArn, ResourceId: ResourceId, ResourceType: DiscoveryResourceType): DescribeStorageSystemResourceMetricsRequest = {
    val __obj = js.Dynamic.literal(DiscoveryJobArn = DiscoveryJobArn.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStorageSystemResourceMetricsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorageSystemResourceMetricsRequest] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobArn(value: DiscoveryJobArn): Self = StObject.set(x, "DiscoveryJobArn", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxResults(value: DiscoveryMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: DiscoveryResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
