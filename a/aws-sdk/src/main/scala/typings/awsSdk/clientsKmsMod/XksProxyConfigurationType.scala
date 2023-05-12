package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XksProxyConfigurationType extends StObject {
  
  /**
    * The part of the external key store proxy authentication credential that uniquely identifies the secret access key.
    */
  var AccessKeyId: js.UndefOr[XksProxyAuthenticationAccessKeyIdType] = js.undefined
  
  /**
    * Indicates whether the external key store proxy uses a public endpoint or an Amazon VPC endpoint service to communicate with KMS.
    */
  var Connectivity: js.UndefOr[XksProxyConnectivityType] = js.undefined
  
  /**
    * The URI endpoint for the external key store proxy. If the external key store proxy has a public endpoint, it is displayed here. If the external key store proxy uses an Amazon VPC endpoint service name, this field displays the private DNS name associated with the VPC endpoint service.
    */
  var UriEndpoint: js.UndefOr[XksProxyUriEndpointType] = js.undefined
  
  /**
    * The path to the external key store proxy APIs.
    */
  var UriPath: js.UndefOr[XksProxyUriPathType] = js.undefined
  
  /**
    * The Amazon VPC endpoint service used to communicate with the external key store proxy. This field appears only when the external key store proxy uses an Amazon VPC endpoint service to communicate with KMS.
    */
  var VpcEndpointServiceName: js.UndefOr[XksProxyVpcEndpointServiceNameType] = js.undefined
}
object XksProxyConfigurationType {
  
  inline def apply(): XksProxyConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XksProxyConfigurationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XksProxyConfigurationType] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: XksProxyAuthenticationAccessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setConnectivity(value: XksProxyConnectivityType): Self = StObject.set(x, "Connectivity", value.asInstanceOf[js.Any])
    
    inline def setConnectivityUndefined: Self = StObject.set(x, "Connectivity", js.undefined)
    
    inline def setUriEndpoint(value: XksProxyUriEndpointType): Self = StObject.set(x, "UriEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUriEndpointUndefined: Self = StObject.set(x, "UriEndpoint", js.undefined)
    
    inline def setUriPath(value: XksProxyUriPathType): Self = StObject.set(x, "UriPath", value.asInstanceOf[js.Any])
    
    inline def setUriPathUndefined: Self = StObject.set(x, "UriPath", js.undefined)
    
    inline def setVpcEndpointServiceName(value: XksProxyVpcEndpointServiceNameType): Self = StObject.set(x, "VpcEndpointServiceName", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointServiceNameUndefined: Self = StObject.set(x, "VpcEndpointServiceName", js.undefined)
  }
}
