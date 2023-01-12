package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayCapabilityConfigurationResponse extends StObject {
  
  /**
    * The JSON document that defines the gateway capability's configuration. For more information, see Configuring data sources (CLI) in the IoT SiteWise User Guide.
    */
  var capabilityConfiguration: CapabilityConfiguration
  
  /**
    * The namespace of the gateway capability.
    */
  var capabilityNamespace: CapabilityNamespace
  
  /**
    * The synchronization status of the capability configuration. The sync status can be one of the following:    IN_SYNC – The gateway is running the capability configuration.    OUT_OF_SYNC – The gateway hasn't received the capability configuration.    SYNC_FAILED – The gateway rejected the capability configuration.  
    */
  var capabilitySyncStatus: CapabilitySyncStatus
  
  /**
    * The ID of the gateway that defines the capability configuration.
    */
  var gatewayId: ID
}
object DescribeGatewayCapabilityConfigurationResponse {
  
  inline def apply(
    capabilityConfiguration: CapabilityConfiguration,
    capabilityNamespace: CapabilityNamespace,
    capabilitySyncStatus: CapabilitySyncStatus,
    gatewayId: ID
  ): DescribeGatewayCapabilityConfigurationResponse = {
    val __obj = js.Dynamic.literal(capabilityConfiguration = capabilityConfiguration.asInstanceOf[js.Any], capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], capabilitySyncStatus = capabilitySyncStatus.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayCapabilityConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeGatewayCapabilityConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setCapabilityConfiguration(value: CapabilityConfiguration): Self = StObject.set(x, "capabilityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCapabilityNamespace(value: CapabilityNamespace): Self = StObject.set(x, "capabilityNamespace", value.asInstanceOf[js.Any])
    
    inline def setCapabilitySyncStatus(value: CapabilitySyncStatus): Self = StObject.set(x, "capabilitySyncStatus", value.asInstanceOf[js.Any])
    
    inline def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
