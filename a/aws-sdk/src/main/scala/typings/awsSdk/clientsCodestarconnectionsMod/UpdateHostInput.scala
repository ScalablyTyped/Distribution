package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHostInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the host to be updated.
    */
  var HostArn: typings.awsSdk.clientsCodestarconnectionsMod.HostArn
  
  /**
    * The URL or endpoint of the host to be updated.
    */
  var ProviderEndpoint: js.UndefOr[Url] = js.undefined
  
  /**
    * The VPC configuration of the host to be updated. A VPC must be configured and the infrastructure to be represented by the host must already be connected to the VPC.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.VpcConfiguration] = js.undefined
}
object UpdateHostInput {
  
  inline def apply(HostArn: HostArn): UpdateHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHostInput]
  }
  
  extension [Self <: UpdateHostInput](x: Self) {
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    inline def setProviderEndpoint(value: Url): Self = StObject.set(x, "ProviderEndpoint", value.asInstanceOf[js.Any])
    
    inline def setProviderEndpointUndefined: Self = StObject.set(x, "ProviderEndpoint", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
