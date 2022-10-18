package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingDistribution extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your Amazon Web Services account ID.
    */
  var ARN: String
  
  /**
    * A complex type that lists the Amazon Web Services accounts, if any, that you included in the TrustedSigners complex type for this distribution. These are the accounts that you want to allow to create signed URLs for private content. The Signer complex type lists the Amazon Web Services account number of the trusted signer or self if the signer is the Amazon Web Services account that created the distribution. The Signer element also includes the IDs of any active CloudFront key pairs that are associated with the trusted signer's Amazon Web Services account. If no KeyPairId element appears for a Signer, that signer can't create signed URLs. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
    */
  var ActiveTrustedSigners: typings.awsSdk.clientsCloudfrontMod.ActiveTrustedSigners
  
  /**
    * The domain name that corresponds to the streaming distribution, for example, s5c39gqb8ow64r.cloudfront.net. 
    */
  var DomainName: String
  
  /**
    * The identifier for the RTMP distribution. For example: EGTXBD79EXAMPLE.
    */
  var Id: String
  
  /**
    * The date and time that the distribution was last modified. 
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the RTMP distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
    */
  var Status: String
  
  /**
    * The current configuration information for the RTMP distribution.
    */
  var StreamingDistributionConfig: typings.awsSdk.clientsCloudfrontMod.StreamingDistributionConfig
}
object StreamingDistribution {
  
  inline def apply(
    ARN: String,
    ActiveTrustedSigners: ActiveTrustedSigners,
    DomainName: String,
    Id: String,
    Status: String,
    StreamingDistributionConfig: StreamingDistributionConfig
  ): StreamingDistribution = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], ActiveTrustedSigners = ActiveTrustedSigners.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistribution]
  }
  
  extension [Self <: StreamingDistribution](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setActiveTrustedSigners(value: ActiveTrustedSigners): Self = StObject.set(x, "ActiveTrustedSigners", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = StObject.set(x, "StreamingDistributionConfig", value.asInstanceOf[js.Any])
  }
}
