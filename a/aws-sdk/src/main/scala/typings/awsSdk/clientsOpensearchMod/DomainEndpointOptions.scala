package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEndpointOptions extends StObject {
  
  /**
    * The fully qualified URL for the custom endpoint.
    */
  var CustomEndpoint: js.UndefOr[DomainNameFqdn] = js.undefined
  
  /**
    * The ARN for your security certificate, managed in Amazon Web Services Certificate Manager (ACM).
    */
  var CustomEndpointCertificateArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Whether to enable a custom endpoint for the domain.
    */
  var CustomEndpointEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True to require that all traffic to the domain arrive over HTTPS.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the TLS security policy to apply to the HTTPS endpoint of the domain.  Can be one of the following values:    Policy-Min-TLS-1-0-2019-07: TLS security policy which supports TLS version 1.0 and higher.    Policy-Min-TLS-1-2-2019-07: TLS security policy which supports only TLS version 1.2   
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.clientsOpensearchMod.TLSSecurityPolicy] = js.undefined
}
object DomainEndpointOptions {
  
  inline def apply(): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEndpointOptions]
  }
  
  extension [Self <: DomainEndpointOptions](x: Self) {
    
    inline def setCustomEndpoint(value: DomainNameFqdn): Self = StObject.set(x, "CustomEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointCertificateArn(value: ARN): Self = StObject.set(x, "CustomEndpointCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointCertificateArnUndefined: Self = StObject.set(x, "CustomEndpointCertificateArn", js.undefined)
    
    inline def setCustomEndpointEnabled(value: Boolean): Self = StObject.set(x, "CustomEndpointEnabled", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointEnabledUndefined: Self = StObject.set(x, "CustomEndpointEnabled", js.undefined)
    
    inline def setCustomEndpointUndefined: Self = StObject.set(x, "CustomEndpoint", js.undefined)
    
    inline def setEnforceHTTPS(value: Boolean): Self = StObject.set(x, "EnforceHTTPS", value.asInstanceOf[js.Any])
    
    inline def setEnforceHTTPSUndefined: Self = StObject.set(x, "EnforceHTTPS", js.undefined)
    
    inline def setTLSSecurityPolicy(value: TLSSecurityPolicy): Self = StObject.set(x, "TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setTLSSecurityPolicyUndefined: Self = StObject.set(x, "TLSSecurityPolicy", js.undefined)
  }
}
