package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVirtualClustersRequest extends StObject {
  
  /**
    * The container provider ID of the virtual cluster.
    */
  var containerProviderId: js.UndefOr[String1024] = js.undefined
  
  /**
    * The container provider type of the virtual cluster. EKS is the only supported type as of now.
    */
  var containerProviderType: js.UndefOr[ContainerProviderType] = js.undefined
  
  /**
    * The date and time after which the virtual clusters are created.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time before which the virtual clusters are created.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of virtual clusters that can be listed.
    */
  var maxResults: js.UndefOr[JavaInteger] = js.undefined
  
  /**
    * The token for the next set of virtual clusters to return. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The states of the requested virtual clusters.
    */
  var states: js.UndefOr[VirtualClusterStates] = js.undefined
}
object ListVirtualClustersRequest {
  
  inline def apply(): ListVirtualClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualClustersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVirtualClustersRequest] (val x: Self) extends AnyVal {
    
    inline def setContainerProviderId(value: String1024): Self = StObject.set(x, "containerProviderId", value.asInstanceOf[js.Any])
    
    inline def setContainerProviderIdUndefined: Self = StObject.set(x, "containerProviderId", js.undefined)
    
    inline def setContainerProviderType(value: ContainerProviderType): Self = StObject.set(x, "containerProviderType", value.asInstanceOf[js.Any])
    
    inline def setContainerProviderTypeUndefined: Self = StObject.set(x, "containerProviderType", js.undefined)
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setMaxResults(value: JavaInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStates(value: VirtualClusterStates): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: VirtualClusterState*): Self = StObject.set(x, "states", js.Array(value*))
  }
}
