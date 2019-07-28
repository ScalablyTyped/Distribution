package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingDistributionSummary extends js.Object {
  /**
    *  The ARN (Amazon Resource Name) for the streaming distribution. For example: arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming distribution.
    */
  var Aliases: typings.awsDashSdk.clientsCloudfrontMod.Aliases
  /**
    * The comment originally specified when this distribution was created.
    */
  var Comment: String
  /**
    * The domain name corresponding to the distribution, for example, d111111abcdef8.cloudfront.net.
    */
  var DomainName: String
  /**
    * Whether the distribution is enabled to accept end user requests for content.
    */
  var Enabled: Boolean
  /**
    * The identifier for the distribution, for example, EDFDVBD632BHDS5.
    */
  var Id: String
  /**
    * The date and time the distribution was last modified.
    */
  var LastModifiedTime: timestamp
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: typings.awsDashSdk.clientsCloudfrontMod.PriceClass
  /**
    * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
    */
  var S3Origin: typings.awsDashSdk.clientsCloudfrontMod.S3Origin
  /**
    *  Indicates the current status of the distribution. When the status is Deployed, the distribution's information is fully propagated throughout the Amazon CloudFront system.
    */
  var Status: String
  /**
    * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items.If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
    */
  var TrustedSigners: typings.awsDashSdk.clientsCloudfrontMod.TrustedSigners
}

object StreamingDistributionSummary {
  @scala.inline
  def apply(
    ARN: String,
    Aliases: Aliases,
    Comment: String,
    DomainName: String,
    Enabled: Boolean,
    Id: String,
    LastModifiedTime: timestamp,
    PriceClass: PriceClass,
    S3Origin: S3Origin,
    Status: String,
    TrustedSigners: TrustedSigners
  ): StreamingDistributionSummary = {
    val __obj = js.Dynamic.literal(ARN = ARN, Aliases = Aliases, Comment = Comment, DomainName = DomainName, Enabled = Enabled, Id = Id, LastModifiedTime = LastModifiedTime, PriceClass = PriceClass.asInstanceOf[js.Any], S3Origin = S3Origin, Status = Status, TrustedSigners = TrustedSigners)
  
    __obj.asInstanceOf[StreamingDistributionSummary]
  }
}

