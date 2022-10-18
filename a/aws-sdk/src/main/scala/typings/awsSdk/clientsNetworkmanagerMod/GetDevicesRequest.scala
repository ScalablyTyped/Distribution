package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicesRequest extends StObject {
  
  /**
    * One or more device IDs. The maximum is 10.
    */
  var DeviceIds: js.UndefOr[DeviceIdList] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.SiteId] = js.undefined
}
object GetDevicesRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetDevicesRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesRequest]
  }
  
  extension [Self <: GetDevicesRequest](x: Self) {
    
    inline def setDeviceIds(value: DeviceIdList): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsUndefined: Self = StObject.set(x, "DeviceIds", js.undefined)
    
    inline def setDeviceIdsVarargs(value: DeviceId*): Self = StObject.set(x, "DeviceIds", js.Array(value*))
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
  }
}
