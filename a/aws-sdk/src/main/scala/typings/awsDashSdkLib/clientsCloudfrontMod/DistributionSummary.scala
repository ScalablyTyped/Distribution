package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionSummary extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
    */
  var ARN: java.lang.String
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  var Aliases: awsDashSdkLib.clientsCloudfrontMod.Aliases
  /**
    * A complex type that contains zero or more CacheBehavior elements.
    */
  var CacheBehaviors: awsDashSdkLib.clientsCloudfrontMod.CacheBehaviors
  /**
    * The comment originally specified when this distribution was created.
    */
  var Comment: java.lang.String
  /**
    * A complex type that contains zero or more CustomErrorResponses elements.
    */
  var CustomErrorResponses: awsDashSdkLib.clientsCloudfrontMod.CustomErrorResponses
  /**
    * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
    */
  var DefaultCacheBehavior: awsDashSdkLib.clientsCloudfrontMod.DefaultCacheBehavior
  /**
    * The domain name that corresponds to the distribution, for example, d111111abcdef8.cloudfront.net.
    */
  var DomainName: java.lang.String
  /**
    * Whether the distribution is enabled to accept user requests for content.
    */
  var Enabled: scala.Boolean
  /**
    *  Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value for new web distributions is http2. Viewers that don't support HTTP/2 will automatically use an earlier version.
    */
  var HttpVersion: awsDashSdkLib.clientsCloudfrontMod.HttpVersion
  /**
    * The identifier for the distribution. For example: EDFDVBD632BHDS5.
    */
  var Id: java.lang.String
  /**
    * Whether CloudFront responds to IPv6 DNS requests with an IPv6 address for your distribution.
    */
  var IsIPV6Enabled: scala.Boolean
  /**
    * The date and time the distribution was last modified.
    */
  var LastModifiedTime: timestamp
  /**
    *  A complex type that contains information about origin groups for this distribution.
    */
  var OriginGroups: js.UndefOr[OriginGroups] = js.undefined
  /**
    * A complex type that contains information about origins for this distribution.
    */
  var Origins: awsDashSdkLib.clientsCloudfrontMod.Origins
  /**
    * A complex type that contains information about price class for this streaming distribution. 
    */
  var PriceClass: awsDashSdkLib.clientsCloudfrontMod.PriceClass
  /**
    * 
    */
  var Restrictions: awsDashSdkLib.clientsCloudfrontMod.Restrictions
  /**
    * The current status of the distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
    */
  var Status: java.lang.String
  /**
    * 
    */
  var ViewerCertificate: awsDashSdkLib.clientsCloudfrontMod.ViewerCertificate
  /**
    * The Web ACL Id (if any) associated with the distribution.
    */
  var WebACLId: java.lang.String
}

object DistributionSummary {
  @scala.inline
  def apply(
    ARN: java.lang.String,
    Aliases: Aliases,
    CacheBehaviors: CacheBehaviors,
    Comment: java.lang.String,
    CustomErrorResponses: CustomErrorResponses,
    DefaultCacheBehavior: DefaultCacheBehavior,
    DomainName: java.lang.String,
    Enabled: scala.Boolean,
    HttpVersion: HttpVersion,
    Id: java.lang.String,
    IsIPV6Enabled: scala.Boolean,
    LastModifiedTime: timestamp,
    Origins: Origins,
    PriceClass: PriceClass,
    Restrictions: Restrictions,
    Status: java.lang.String,
    ViewerCertificate: ViewerCertificate,
    WebACLId: java.lang.String,
    OriginGroups: OriginGroups = null
  ): DistributionSummary = {
    val __obj = js.Dynamic.literal(ARN = ARN, Aliases = Aliases, CacheBehaviors = CacheBehaviors, Comment = Comment, CustomErrorResponses = CustomErrorResponses, DefaultCacheBehavior = DefaultCacheBehavior, DomainName = DomainName, Enabled = Enabled, HttpVersion = HttpVersion.asInstanceOf[js.Any], Id = Id, IsIPV6Enabled = IsIPV6Enabled, LastModifiedTime = LastModifiedTime, Origins = Origins, PriceClass = PriceClass.asInstanceOf[js.Any], Restrictions = Restrictions, Status = Status, ViewerCertificate = ViewerCertificate, WebACLId = WebACLId)
    if (OriginGroups != null) __obj.updateDynamic("OriginGroups")(OriginGroups)
    __obj.asInstanceOf[DistributionSummary]
  }
}

