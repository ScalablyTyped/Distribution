package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinksRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * One or more link IDs. The maximum is 10.
    */
  var LinkIds: js.UndefOr[LinkIdList] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The link provider.
    */
  var Provider: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.SiteId] = js.undefined
  
  /**
    * The link type.
    */
  var Type: js.UndefOr[ConstrainedString] = js.undefined
}
object GetLinksRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetLinksRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinksRequest]
  }
  
  extension [Self <: GetLinksRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIds(value: LinkIdList): Self = StObject.set(x, "LinkIds", value.asInstanceOf[js.Any])
    
    inline def setLinkIdsUndefined: Self = StObject.set(x, "LinkIds", js.undefined)
    
    inline def setLinkIdsVarargs(value: LinkId*): Self = StObject.set(x, "LinkIds", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProvider(value: ConstrainedString): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setType(value: ConstrainedString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
