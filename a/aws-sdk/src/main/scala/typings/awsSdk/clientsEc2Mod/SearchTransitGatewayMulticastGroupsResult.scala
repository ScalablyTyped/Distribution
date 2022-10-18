package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTransitGatewayMulticastGroupsResult extends StObject {
  
  /**
    * Information about the transit gateway multicast group.
    */
  var MulticastGroups: js.UndefOr[TransitGatewayMulticastGroupList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object SearchTransitGatewayMulticastGroupsResult {
  
  inline def apply(): SearchTransitGatewayMulticastGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitGatewayMulticastGroupsResult]
  }
  
  extension [Self <: SearchTransitGatewayMulticastGroupsResult](x: Self) {
    
    inline def setMulticastGroups(value: TransitGatewayMulticastGroupList): Self = StObject.set(x, "MulticastGroups", value.asInstanceOf[js.Any])
    
    inline def setMulticastGroupsUndefined: Self = StObject.set(x, "MulticastGroups", js.undefined)
    
    inline def setMulticastGroupsVarargs(value: TransitGatewayMulticastGroup*): Self = StObject.set(x, "MulticastGroups", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
