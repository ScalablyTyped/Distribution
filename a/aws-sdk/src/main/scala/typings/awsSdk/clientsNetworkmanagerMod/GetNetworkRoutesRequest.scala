package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkRoutesRequest extends StObject {
  
  /**
    * Filter by route table destination. Possible Values: TRANSIT_GATEWAY_ATTACHMENT_ID, RESOURCE_ID, or RESOURCE_TYPE.
    */
  var DestinationFilters: js.UndefOr[FilterMap] = js.undefined
  
  /**
    * An exact CIDR block.
    */
  var ExactCidrMatches: js.UndefOr[ConstrainedStringList] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The most specific route that matches the traffic (longest prefix match).
    */
  var LongestPrefixMatches: js.UndefOr[ConstrainedStringList] = js.undefined
  
  /**
    * The IDs of the prefix lists.
    */
  var PrefixListIds: js.UndefOr[ConstrainedStringList] = js.undefined
  
  /**
    * The ID of the route table.
    */
  var RouteTableIdentifier: typings.awsSdk.clientsNetworkmanagerMod.RouteTableIdentifier
  
  /**
    * The route states.
    */
  var States: js.UndefOr[RouteStateList] = js.undefined
  
  /**
    * The routes with a subnet that match the specified CIDR filter.
    */
  var SubnetOfMatches: js.UndefOr[ConstrainedStringList] = js.undefined
  
  /**
    * The routes with a CIDR that encompasses the CIDR filter. Example: If you specify 10.0.1.0/30, then the result returns 10.0.1.0/29.
    */
  var SupernetOfMatches: js.UndefOr[ConstrainedStringList] = js.undefined
  
  /**
    * The route types.
    */
  var Types: js.UndefOr[RouteTypeList] = js.undefined
}
object GetNetworkRoutesRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId, RouteTableIdentifier: RouteTableIdentifier): GetNetworkRoutesRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], RouteTableIdentifier = RouteTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkRoutesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkRoutesRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationFilters(value: FilterMap): Self = StObject.set(x, "DestinationFilters", value.asInstanceOf[js.Any])
    
    inline def setDestinationFiltersUndefined: Self = StObject.set(x, "DestinationFilters", js.undefined)
    
    inline def setExactCidrMatches(value: ConstrainedStringList): Self = StObject.set(x, "ExactCidrMatches", value.asInstanceOf[js.Any])
    
    inline def setExactCidrMatchesUndefined: Self = StObject.set(x, "ExactCidrMatches", js.undefined)
    
    inline def setExactCidrMatchesVarargs(value: ConstrainedString*): Self = StObject.set(x, "ExactCidrMatches", js.Array(value*))
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLongestPrefixMatches(value: ConstrainedStringList): Self = StObject.set(x, "LongestPrefixMatches", value.asInstanceOf[js.Any])
    
    inline def setLongestPrefixMatchesUndefined: Self = StObject.set(x, "LongestPrefixMatches", js.undefined)
    
    inline def setLongestPrefixMatchesVarargs(value: ConstrainedString*): Self = StObject.set(x, "LongestPrefixMatches", js.Array(value*))
    
    inline def setPrefixListIds(value: ConstrainedStringList): Self = StObject.set(x, "PrefixListIds", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdsUndefined: Self = StObject.set(x, "PrefixListIds", js.undefined)
    
    inline def setPrefixListIdsVarargs(value: ConstrainedString*): Self = StObject.set(x, "PrefixListIds", js.Array(value*))
    
    inline def setRouteTableIdentifier(value: RouteTableIdentifier): Self = StObject.set(x, "RouteTableIdentifier", value.asInstanceOf[js.Any])
    
    inline def setStates(value: RouteStateList): Self = StObject.set(x, "States", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "States", js.undefined)
    
    inline def setStatesVarargs(value: RouteState*): Self = StObject.set(x, "States", js.Array(value*))
    
    inline def setSubnetOfMatches(value: ConstrainedStringList): Self = StObject.set(x, "SubnetOfMatches", value.asInstanceOf[js.Any])
    
    inline def setSubnetOfMatchesUndefined: Self = StObject.set(x, "SubnetOfMatches", js.undefined)
    
    inline def setSubnetOfMatchesVarargs(value: ConstrainedString*): Self = StObject.set(x, "SubnetOfMatches", js.Array(value*))
    
    inline def setSupernetOfMatches(value: ConstrainedStringList): Self = StObject.set(x, "SupernetOfMatches", value.asInstanceOf[js.Any])
    
    inline def setSupernetOfMatchesUndefined: Self = StObject.set(x, "SupernetOfMatches", js.undefined)
    
    inline def setSupernetOfMatchesVarargs(value: ConstrainedString*): Self = StObject.set(x, "SupernetOfMatches", js.Array(value*))
    
    inline def setTypes(value: RouteTypeList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    inline def setTypesVarargs(value: RouteType*): Self = StObject.set(x, "Types", js.Array(value*))
  }
}
