package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingDistribution extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String
  /**
    * A complex type that lists the AWS accounts, if any, that you included in the TrustedSigners complex type for this distribution. These are the accounts that you want to allow to create signed URLs for private content. The Signer complex type lists the AWS account number of the trusted signer or self if the signer is the AWS account that created the distribution. The Signer element also includes the IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no KeyPairId element appears for a Signer, that signer can't create signed URLs. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
    */
  var ActiveTrustedSigners: typings.awsDashSdk.clientsCloudfrontMod.ActiveTrustedSigners
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
  var LastModifiedTime: js.UndefOr[timestamp] = js.undefined
  /**
    * The current status of the RTMP distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
    */
  var Status: String
  /**
    * The current configuration information for the RTMP distribution.
    */
  var StreamingDistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.StreamingDistributionConfig
}

object StreamingDistribution {
  @scala.inline
  def apply(
    ARN: String,
    ActiveTrustedSigners: ActiveTrustedSigners,
    DomainName: String,
    Id: String,
    Status: String,
    StreamingDistributionConfig: StreamingDistributionConfig,
    LastModifiedTime: timestamp = null
  ): StreamingDistribution = {
    val __obj = js.Dynamic.literal(ARN = ARN, ActiveTrustedSigners = ActiveTrustedSigners, DomainName = DomainName, Id = Id, Status = Status, StreamingDistributionConfig = StreamingDistributionConfig)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    __obj.asInstanceOf[StreamingDistribution]
  }
}

