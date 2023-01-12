package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudFrontDistributionOriginCustomOriginConfig extends StObject {
  
  /**
    * The HTTP port that CloudFront uses to connect to the origin. 
    */
  var HttpPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The HTTPS port that CloudFront uses to connect to the origin. 
    */
  var HttpsPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies how long, in seconds, CloudFront persists its connection to the origin. 
    */
  var OriginKeepaliveTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin. 
    */
  var OriginProtocolPolicy: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies how long, in seconds, CloudFront waits for a response from the origin. 
    */
  var OriginReadTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS. 
    */
  var OriginSslProtocols: js.UndefOr[AwsCloudFrontDistributionOriginSslProtocols] = js.undefined
}
object AwsCloudFrontDistributionOriginCustomOriginConfig {
  
  inline def apply(): AwsCloudFrontDistributionOriginCustomOriginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudFrontDistributionOriginCustomOriginConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudFrontDistributionOriginCustomOriginConfig] (val x: Self) extends AnyVal {
    
    inline def setHttpPort(value: Integer): Self = StObject.set(x, "HttpPort", value.asInstanceOf[js.Any])
    
    inline def setHttpPortUndefined: Self = StObject.set(x, "HttpPort", js.undefined)
    
    inline def setHttpsPort(value: Integer): Self = StObject.set(x, "HttpsPort", value.asInstanceOf[js.Any])
    
    inline def setHttpsPortUndefined: Self = StObject.set(x, "HttpsPort", js.undefined)
    
    inline def setOriginKeepaliveTimeout(value: Integer): Self = StObject.set(x, "OriginKeepaliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginKeepaliveTimeoutUndefined: Self = StObject.set(x, "OriginKeepaliveTimeout", js.undefined)
    
    inline def setOriginProtocolPolicy(value: NonEmptyString): Self = StObject.set(x, "OriginProtocolPolicy", value.asInstanceOf[js.Any])
    
    inline def setOriginProtocolPolicyUndefined: Self = StObject.set(x, "OriginProtocolPolicy", js.undefined)
    
    inline def setOriginReadTimeout(value: Integer): Self = StObject.set(x, "OriginReadTimeout", value.asInstanceOf[js.Any])
    
    inline def setOriginReadTimeoutUndefined: Self = StObject.set(x, "OriginReadTimeout", js.undefined)
    
    inline def setOriginSslProtocols(value: AwsCloudFrontDistributionOriginSslProtocols): Self = StObject.set(x, "OriginSslProtocols", value.asInstanceOf[js.Any])
    
    inline def setOriginSslProtocolsUndefined: Self = StObject.set(x, "OriginSslProtocols", js.undefined)
  }
}
