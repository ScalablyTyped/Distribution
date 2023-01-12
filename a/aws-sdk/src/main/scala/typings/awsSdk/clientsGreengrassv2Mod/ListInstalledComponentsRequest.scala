package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstalledComponentsRequest extends StObject {
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: CoreDeviceThingName
  
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[DefaultMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The filter for the list of components. Choose from the following options:    ALL – The list includes all components installed on the core device.    ROOT – The list includes only root components, which are components that you specify in a deployment. When you choose this option, the list doesn't include components that the core device installs as dependencies of other components.   Default: ROOT 
    */
  var topologyFilter: js.UndefOr[InstalledComponentTopologyFilter] = js.undefined
}
object ListInstalledComponentsRequest {
  
  inline def apply(coreDeviceThingName: CoreDeviceThingName): ListInstalledComponentsRequest = {
    val __obj = js.Dynamic.literal(coreDeviceThingName = coreDeviceThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstalledComponentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstalledComponentsRequest] (val x: Self) extends AnyVal {
    
    inline def setCoreDeviceThingName(value: CoreDeviceThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: DefaultMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTopologyFilter(value: InstalledComponentTopologyFilter): Self = StObject.set(x, "topologyFilter", value.asInstanceOf[js.Any])
    
    inline def setTopologyFilterUndefined: Self = StObject.set(x, "topologyFilter", js.undefined)
  }
}
