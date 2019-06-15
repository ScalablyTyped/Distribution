package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: java.lang.String
  /**
    * CloudFront automatically adds this element to the response only if you've set up the distribution to serve private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each trusted signer. The Signer child element lists the AWS account number of the trusted signer (or an empty Self element if the signer is you). The Signer element also includes the IDs of any active key pairs associated with the trusted signer's AWS account. If no KeyPairId element appears for a Signer, that signer can't create working signed URLs.
    */
  var ActiveTrustedSigners: awsDashSdkLib.clientsCloudfrontMod.ActiveTrustedSigners
  /**
    * AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. For more information about ICP recordals, see  Signup, Accounts, and Credentials in Getting Started with AWS services in China.
    */
  var AliasICPRecordals: js.UndefOr[AliasICPRecordals] = js.undefined
  /**
    * The current configuration information for the distribution. Send a GET request to the /CloudFront API version/distribution ID/config resource.
    */
  var DistributionConfig: awsDashSdkLib.clientsCloudfrontMod.DistributionConfig
  /**
    * The domain name corresponding to the distribution, for example, d111111abcdef8.cloudfront.net. 
    */
  var DomainName: java.lang.String
  /**
    * The identifier for the distribution. For example: EDFDVBD632BHDS5. 
    */
  var Id: java.lang.String
  /**
    * The number of invalidation batches currently in progress. 
    */
  var InProgressInvalidationBatches: integer
  /**
    * The date and time the distribution was last modified. 
    */
  var LastModifiedTime: timestamp
  /**
    * This response element indicates the current status of the distribution. When the status is Deployed, the distribution's information is fully propagated to all CloudFront edge locations. 
    */
  var Status: java.lang.String
}

object Distribution {
  @scala.inline
  def apply(
    ARN: java.lang.String,
    ActiveTrustedSigners: ActiveTrustedSigners,
    DistributionConfig: DistributionConfig,
    DomainName: java.lang.String,
    Id: java.lang.String,
    InProgressInvalidationBatches: integer,
    LastModifiedTime: timestamp,
    Status: java.lang.String,
    AliasICPRecordals: AliasICPRecordals = null
  ): Distribution = {
    val __obj = js.Dynamic.literal(ARN = ARN, ActiveTrustedSigners = ActiveTrustedSigners, DistributionConfig = DistributionConfig, DomainName = DomainName, Id = Id, InProgressInvalidationBatches = InProgressInvalidationBatches, LastModifiedTime = LastModifiedTime, Status = Status)
    if (AliasICPRecordals != null) __obj.updateDynamic("AliasICPRecordals")(AliasICPRecordals)
    __obj.asInstanceOf[Distribution]
  }
}

