package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorageSystemResourcesResponse extends StObject {
  
  /**
    * The opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
  
  /**
    * The information collected about your storage system's resources. A response can also include Amazon Web Services storage service recommendations. For more information, see storage resource information collected by and recommendations provided by DataSync Discovery.
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.clientsDatasyncMod.ResourceDetails] = js.undefined
}
object DescribeStorageSystemResourcesResponse {
  
  inline def apply(): DescribeStorageSystemResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStorageSystemResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStorageSystemResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
  }
}
