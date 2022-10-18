package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkResource extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The Amazon Web Services Region.
    */
  var AwsRegion: js.UndefOr[ExternalRegionCode] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * Information about the resource, in JSON format. Network Manager gets this information by describing the resource using its Describe API call.
    */
  var Definition: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The time that the resource definition was retrieved.
    */
  var DefinitionTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The resource metadata.
    */
  var Metadata: js.UndefOr[NetworkResourceMetadataMap] = js.undefined
  
  /**
    * The ARN of the gateway.
    */
  var RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ResourceArn] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The resource type. The following are the supported resource types for Direct Connect:    dxcon     dx-gateway     dx-vif    The following are the supported resource types for Network Manager:    connection     device     link     site    The following are the supported resource types for Amazon VPC:    customer-gateway     transit-gateway     transit-gateway-attachment     transit-gateway-connect-peer     transit-gateway-route-table     vpn-connection   
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object NetworkResource {
  
  inline def apply(): NetworkResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkResource]
  }
  
  extension [Self <: NetworkResource](x: Self) {
    
    inline def setAccountId(value: AWSAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: ExternalRegionCode): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setDefinition(value: ConstrainedString): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionTimestamp(value: js.Date): Self = StObject.set(x, "DefinitionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDefinitionTimestampUndefined: Self = StObject.set(x, "DefinitionTimestamp", js.undefined)
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setMetadata(value: NetworkResourceMetadataMap): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setRegisteredGatewayArn(value: ResourceArn): Self = StObject.set(x, "RegisteredGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setRegisteredGatewayArnUndefined: Self = StObject.set(x, "RegisteredGatewayArn", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceId(value: ConstrainedString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
