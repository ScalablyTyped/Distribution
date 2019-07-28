package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionSummary extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: String
  /**
    * AWS services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. For more information about ICP recordals, see  Signup, Accounts, and Credentials in Getting Started with AWS services in China.
    */
  var AliasICPRecordals: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.AliasICPRecordals] = js.undefined
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  var Aliases: typings.awsDashSdk.clientsCloudfrontMod.Aliases
  /**
    * A complex type that contains zero or more CacheBehavior elements.
    */
  var CacheBehaviors: typings.awsDashSdk.clientsCloudfrontMod.CacheBehaviors
  /**
    * The comment originally specified when this distribution was created.
    */
  var Comment: String
  /**
    * A complex type that contains zero or more CustomErrorResponses elements.
    */
  var CustomErrorResponses: typings.awsDashSdk.clientsCloudfrontMod.CustomErrorResponses
  /**
    * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
    */
  var DefaultCacheBehavior: typings.awsDashSdk.clientsCloudfrontMod.DefaultCacheBehavior
  /**
    * The domain name that corresponds to the distribution, for example, d111111abcdef8.cloudfront.net.
    */
  var DomainName: String
  /**
    * Whether the distribution is enabled to accept user requests for content.
    */
  var Enabled: Boolean
  /**
    *  Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value for new web distributions is http2. Viewers that don't support HTTP/2 will automatically use an earlier version.
    */
  var HttpVersion: typings.awsDashSdk.clientsCloudfrontMod.HttpVersion
  /**
    * The identifier for the distribution. For example: EDFDVBD632BHDS5.
    */
  var Id: String
  /**
    * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
    */
  var IsIPV6Enabled: Boolean
  /**
    * The date and time the distribution was last modified.
    */
  var LastModifiedTime: timestamp
  /**
    *  A complex type that contains information about origin groups for this distribution.
    */
  var OriginGroups: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.OriginGroups] = js.undefined
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: typings.awsDashSdk.clientsCloudfrontMod.Origins
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: typings.awsDashSdk.clientsCloudfrontMod.PriceClass
  /**
    * A complex type that identifies ways in which you want to restrict distribution of your content.
    */
  var Restrictions: typings.awsDashSdk.clientsCloudfrontMod.Restrictions
  /**
    * The current status of the distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
    */
  var Status: String
  /**
    * A complex type that specifies whether you want viewers to use HTTP or HTTPS to request your objects, whether you're using an alternate domain name with HTTPS, and if so, if you're using AWS Certificate Manager (ACM) or a third-party certificate authority.
    */
  var ViewerCertificate: typings.awsDashSdk.clientsCloudfrontMod.ViewerCertificate
  /**
    * The Web ACL Id (if any) associated with the distribution.
    */
  var WebACLId: String
}

object DistributionSummary {
  @scala.inline
  def apply(
    ARN: String,
    Aliases: Aliases,
    CacheBehaviors: CacheBehaviors,
    Comment: String,
    CustomErrorResponses: CustomErrorResponses,
    DefaultCacheBehavior: DefaultCacheBehavior,
    DomainName: String,
    Enabled: Boolean,
    HttpVersion: HttpVersion,
    Id: String,
    IsIPV6Enabled: Boolean,
    LastModifiedTime: timestamp,
    Origins: Origins,
    PriceClass: PriceClass,
    Restrictions: Restrictions,
    Status: String,
    ViewerCertificate: ViewerCertificate,
    WebACLId: String,
    AliasICPRecordals: AliasICPRecordals = null,
    OriginGroups: OriginGroups = null
  ): DistributionSummary = {
    val __obj = js.Dynamic.literal(ARN = ARN, Aliases = Aliases, CacheBehaviors = CacheBehaviors, Comment = Comment, CustomErrorResponses = CustomErrorResponses, DefaultCacheBehavior = DefaultCacheBehavior, DomainName = DomainName, Enabled = Enabled, HttpVersion = HttpVersion.asInstanceOf[js.Any], Id = Id, IsIPV6Enabled = IsIPV6Enabled, LastModifiedTime = LastModifiedTime, Origins = Origins, PriceClass = PriceClass.asInstanceOf[js.Any], Restrictions = Restrictions, Status = Status, ViewerCertificate = ViewerCertificate, WebACLId = WebACLId)
    if (AliasICPRecordals != null) __obj.updateDynamic("AliasICPRecordals")(AliasICPRecordals)
    if (OriginGroups != null) __obj.updateDynamic("OriginGroups")(OriginGroups)
    __obj.asInstanceOf[DistributionSummary]
  }
}

