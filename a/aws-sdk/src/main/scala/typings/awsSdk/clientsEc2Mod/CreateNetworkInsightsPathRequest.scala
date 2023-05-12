package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInsightsPathRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: String
  
  /**
    * The ID or ARN of the destination. If the resource is in another account, you must specify an ARN.
    */
  var Destination: js.UndefOr[NetworkInsightsResourceId] = js.undefined
  
  /**
    * The IP address of the destination.
    */
  var DestinationIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The destination port.
    */
  var DestinationPort: js.UndefOr[Port] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scopes the analysis to network paths that match specific filters at the destination. If you specify this parameter, you can't specify the parameter for the destination IP address.
    */
  var FilterAtDestination: js.UndefOr[PathRequestFilter] = js.undefined
  
  /**
    * Scopes the analysis to network paths that match specific filters at the source. If you specify this parameter, you can't specify the parameters for the source IP address or the destination port.
    */
  var FilterAtSource: js.UndefOr[PathRequestFilter] = js.undefined
  
  /**
    * The protocol.
    */
  var Protocol: typings.awsSdk.clientsEc2Mod.Protocol
  
  /**
    * The ID or ARN of the source. If the resource is in another account, you must specify an ARN.
    */
  var Source: NetworkInsightsResourceId
  
  /**
    * The IP address of the source.
    */
  var SourceIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The tags to add to the path.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateNetworkInsightsPathRequest {
  
  inline def apply(ClientToken: String, Protocol: Protocol, Source: NetworkInsightsResourceId): CreateNetworkInsightsPathRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInsightsPathRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkInsightsPathRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: NetworkInsightsResourceId): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationIp(value: IpAddress): Self = StObject.set(x, "DestinationIp", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpUndefined: Self = StObject.set(x, "DestinationIp", js.undefined)
    
    inline def setDestinationPort(value: Port): Self = StObject.set(x, "DestinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "DestinationPort", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilterAtDestination(value: PathRequestFilter): Self = StObject.set(x, "FilterAtDestination", value.asInstanceOf[js.Any])
    
    inline def setFilterAtDestinationUndefined: Self = StObject.set(x, "FilterAtDestination", js.undefined)
    
    inline def setFilterAtSource(value: PathRequestFilter): Self = StObject.set(x, "FilterAtSource", value.asInstanceOf[js.Any])
    
    inline def setFilterAtSourceUndefined: Self = StObject.set(x, "FilterAtSource", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setSource(value: NetworkInsightsResourceId): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceIp(value: IpAddress): Self = StObject.set(x, "SourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "SourceIp", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
