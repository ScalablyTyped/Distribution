package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingDistributionConfig extends StObject {
  
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming distribution.
    */
  var Aliases: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.Aliases] = js.undefined
  
  /**
    * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the StreamingDistributionConfig object), CloudFront creates a new distribution. If CallerReference is a value that you already sent in a previous request to create a distribution, CloudFront returns a DistributionAlreadyExists error.
    */
  var CallerReference: String
  
  /**
    * Any comments you want to include about the streaming distribution.
    */
  var Comment: String
  
  /**
    * Whether the streaming distribution is enabled to accept user requests for content.
    */
  var Enabled: Boolean
  
  /**
    * A complex type that controls whether access logs are written for the streaming distribution.
    */
  var Logging: js.UndefOr[StreamingLoggingConfig] = js.undefined
  
  /**
    * A complex type that contains information about price class for this streaming distribution.
    */
  var PriceClass: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.PriceClass] = js.undefined
  
  /**
    * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
    */
  var S3Origin: typings.awsSdk.clientsCloudfrontMod.S3Origin
  
  /**
    * A complex type that specifies any Amazon Web Services accounts that you want to permit to create signed URLs for private content. If you want the distribution to use signed URLs, include this element; if you want the distribution to use public URLs, remove this element. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
    */
  var TrustedSigners: typings.awsSdk.clientsCloudfrontMod.TrustedSigners
}
object StreamingDistributionConfig {
  
  inline def apply(
    CallerReference: String,
    Comment: String,
    Enabled: Boolean,
    S3Origin: S3Origin,
    TrustedSigners: TrustedSigners
  ): StreamingDistributionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], S3Origin = S3Origin.asInstanceOf[js.Any], TrustedSigners = TrustedSigners.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingDistributionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingDistributionConfig] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: Aliases): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setCallerReference(value: String): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setLogging(value: StreamingLoggingConfig): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "Logging", js.undefined)
    
    inline def setPriceClass(value: PriceClass): Self = StObject.set(x, "PriceClass", value.asInstanceOf[js.Any])
    
    inline def setPriceClassUndefined: Self = StObject.set(x, "PriceClass", js.undefined)
    
    inline def setS3Origin(value: S3Origin): Self = StObject.set(x, "S3Origin", value.asInstanceOf[js.Any])
    
    inline def setTrustedSigners(value: TrustedSigners): Self = StObject.set(x, "TrustedSigners", value.asInstanceOf[js.Any])
  }
}
