package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostOutput extends StObject {
  
  /**
    * The name of the requested host.
    */
  var Name: js.UndefOr[HostName] = js.undefined
  
  /**
    * The endpoint of the infrastructure represented by the requested host.
    */
  var ProviderEndpoint: js.UndefOr[Url] = js.undefined
  
  /**
    * The provider type of the requested host, such as GitHub Enterprise Server.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.ProviderType] = js.undefined
  
  /**
    * The status of the requested host.
    */
  var Status: js.UndefOr[HostStatus] = js.undefined
  
  /**
    * The VPC configuration of the requested host.
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.VpcConfiguration] = js.undefined
}
object GetHostOutput {
  
  inline def apply(): GetHostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostOutput]
  }
  
  extension [Self <: GetHostOutput](x: Self) {
    
    inline def setName(value: HostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProviderEndpoint(value: Url): Self = StObject.set(x, "ProviderEndpoint", value.asInstanceOf[js.Any])
    
    inline def setProviderEndpointUndefined: Self = StObject.set(x, "ProviderEndpoint", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setStatus(value: HostStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
