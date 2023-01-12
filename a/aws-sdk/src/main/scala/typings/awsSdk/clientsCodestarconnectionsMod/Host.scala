package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the host.
    */
  var HostArn: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.HostArn] = js.undefined
  
  /**
    * The name of the host.
    */
  var Name: js.UndefOr[HostName] = js.undefined
  
  /**
    * The endpoint of the infrastructure where your provider type is installed.
    */
  var ProviderEndpoint: js.UndefOr[Url] = js.undefined
  
  /**
    * The name of the installed provider to be associated with your connection. The host resource represents the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.ProviderType] = js.undefined
  
  /**
    * The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and VPC_CONFIG_FAILED_INITIALIZATION.
    */
  var Status: js.UndefOr[HostStatus] = js.undefined
  
  /**
    * The status description for the host.
    */
  var StatusMessage: js.UndefOr[HostStatusMessage] = js.undefined
  
  /**
    * The VPC configuration provisioned for the host.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.VpcConfiguration] = js.undefined
}
object Host {
  
  inline def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    inline def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
    
    inline def setName(value: HostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProviderEndpoint(value: Url): Self = StObject.set(x, "ProviderEndpoint", value.asInstanceOf[js.Any])
    
    inline def setProviderEndpointUndefined: Self = StObject.set(x, "ProviderEndpoint", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setStatus(value: HostStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: HostStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
