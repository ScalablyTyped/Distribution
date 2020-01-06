package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionConfig extends js.Object {
  /**
    * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
    */
  var Aliases: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.Aliases] = js.native
  /**
    * A complex type that contains zero or more CacheBehavior elements. 
    */
  var CacheBehaviors: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CacheBehaviors] = js.native
  /**
    * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the DistributionConfig object), CloudFront creates a new distribution. If CallerReference is a value that you already sent in a previous request to create a distribution, CloudFront returns a DistributionAlreadyExists error.
    */
  var CallerReference: String = js.native
  /**
    * Any comments you want to include about the distribution. If you don't want to specify a comment, include an empty Comment element. To delete an existing comment, update the distribution configuration and include an empty Comment element. To add or change a comment, update the distribution configuration and specify the new comment.
    */
  var Comment: CommentType = js.native
  /**
    * A complex type that controls the following:   Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.   How long CloudFront caches HTTP status codes in the 4xx and 5xx range.   For more information about custom error pages, see Customizing Error Responses in the Amazon CloudFront Developer Guide.
    */
  var CustomErrorResponses: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CustomErrorResponses] = js.native
  /**
    * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
    */
  var DefaultCacheBehavior: typings.awsDashSdk.clientsCloudfrontMod.DefaultCacheBehavior = js.native
  /**
    * The object that you want CloudFront to request from your origin (for example, index.html) when a viewer requests the root URL for your distribution (http://www.example.com) instead of an object in your distribution (http://www.example.com/product-description.html). Specifying a default root object avoids exposing the contents of your distribution. Specify only the object name, for example, index.html. Don't add a / before the object name. If you don't want to specify a default root object when you create a distribution, include an empty DefaultRootObject element. To delete the default root object from an existing distribution, update the distribution configuration and include an empty DefaultRootObject element. To replace the default root object, update the distribution configuration and specify the new object. For more information about the default root object, see Creating a Default Root Object in the Amazon CloudFront Developer Guide.
    */
  var DefaultRootObject: js.UndefOr[String] = js.native
  /**
    * From this field, you can enable or disable the selected distribution.
    */
  var Enabled: Boolean = js.native
  /**
    * (Optional) Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value for new web distributions is http2. Viewers that don't support HTTP/2 automatically use an earlier HTTP version. For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must support Server Name Identification (SNI). In general, configuring CloudFront to communicate with viewers using HTTP/2 reduces latency. You can improve performance by optimizing for HTTP/2. For more information, do an Internet search for "http/2 optimization." 
    */
  var HttpVersion: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.HttpVersion] = js.native
  /**
    * If you want CloudFront to respond to IPv6 DNS requests with an IPv6 address for your distribution, specify true. If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code NOERROR and with no IP addresses. This allows viewers to submit a second request, for an IPv4 address for your distribution.  In general, you should enable IPv6 if you have users on IPv6 networks who want to access your content. However, if you're using signed URLs or signed cookies to restrict access to your content, and if you're using a custom policy that includes the IpAddress parameter to restrict the IP addresses that can access your content, don't enable IPv6. If you want to restrict access to some content by IP address and not restrict access to other content (or restrict access but not by IP address), you can create two distributions. For more information, see Creating a Signed URL Using a Custom Policy in the Amazon CloudFront Developer Guide. If you're using an Amazon Route 53 alias resource record set to route traffic to your CloudFront distribution, you need to create a second alias resource record set when both of the following are true:   You enable IPv6 for the distribution   You're using alternate domain names in the URLs for your objects   For more information, see Routing Traffic to an Amazon CloudFront Web Distribution by Using Your Domain Name in the Amazon Route 53 Developer Guide. If you created a CNAME resource record set, either with Amazon Route 53 or with another DNS service, you don't need to make any changes. A CNAME record will route traffic to your distribution regardless of the IP address format of the viewer request.
    */
  var IsIPV6Enabled: js.UndefOr[Boolean] = js.native
  /**
    * A complex type that controls whether access logs are written for the distribution. For more information about logging, see Access Logs in the Amazon CloudFront Developer Guide.
    */
  var Logging: js.UndefOr[LoggingConfig] = js.native
  /**
    *  A complex type that contains information about origin groups for this distribution.
    */
  var OriginGroups: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.OriginGroups] = js.native
  /**
    * A complex type that contains information about origins for this distribution. 
    */
  var Origins: typings.awsDashSdk.clientsCloudfrontMod.Origins = js.native
  /**
    * The price class that corresponds with the maximum price that you want to pay for CloudFront service. If you specify PriceClass_All, CloudFront responds to requests for your objects from all CloudFront edge locations. If you specify a price class other than PriceClass_All, CloudFront serves your objects from the CloudFront edge location that has the lowest latency among the edge locations in your price class. Viewers who are in or near regions that are excluded from your specified price class may encounter slower performance. For more information about price classes, see Choosing the Price Class for a CloudFront Distribution in the Amazon CloudFront Developer Guide. For information about CloudFront pricing, including how price classes (such as Price Class 100) map to CloudFront regions, see Amazon CloudFront Pricing. For price class information, scroll down to see the table at the bottom of the page.
    */
  var PriceClass: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.PriceClass] = js.native
  /**
    * A complex type that identifies ways in which you want to restrict distribution of your content.
    */
  var Restrictions: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.Restrictions] = js.native
  /**
    * A complex type that specifies whether you want viewers to use HTTP or HTTPS to request your objects, whether you're using an alternate domain name with HTTPS, and if so, if you're using AWS Certificate Manager (ACM) or a third-party certificate authority.
    */
  var ViewerCertificate: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.ViewerCertificate] = js.native
  /**
    * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution. To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for example arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a. To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example 473e64fd-f30b-4765-81a0-62ad96dd167a. AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to CloudFront, and lets you control access to your content. Based on conditions that you specify, such as the IP addresses that requests originate from or the values of query strings, CloudFront responds to requests either with the requested content or with an HTTP 403 status code (Forbidden). You can also configure CloudFront to return a custom error page when a request is blocked. For more information about AWS WAF, see the AWS WAF Developer Guide. 
    */
  var WebACLId: js.UndefOr[String] = js.native
}

object DistributionConfig {
  @scala.inline
  def apply(
    CallerReference: String,
    Comment: CommentType,
    DefaultCacheBehavior: DefaultCacheBehavior,
    Enabled: Boolean,
    Origins: Origins,
    Aliases: Aliases = null,
    CacheBehaviors: CacheBehaviors = null,
    CustomErrorResponses: CustomErrorResponses = null,
    DefaultRootObject: String = null,
    HttpVersion: HttpVersion = null,
    IsIPV6Enabled: js.UndefOr[Boolean] = js.undefined,
    Logging: LoggingConfig = null,
    OriginGroups: OriginGroups = null,
    PriceClass: PriceClass = null,
    Restrictions: Restrictions = null,
    ViewerCertificate: ViewerCertificate = null,
    WebACLId: String = null
  ): DistributionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], DefaultCacheBehavior = DefaultCacheBehavior.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Origins = Origins.asInstanceOf[js.Any])
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (CacheBehaviors != null) __obj.updateDynamic("CacheBehaviors")(CacheBehaviors.asInstanceOf[js.Any])
    if (CustomErrorResponses != null) __obj.updateDynamic("CustomErrorResponses")(CustomErrorResponses.asInstanceOf[js.Any])
    if (DefaultRootObject != null) __obj.updateDynamic("DefaultRootObject")(DefaultRootObject.asInstanceOf[js.Any])
    if (HttpVersion != null) __obj.updateDynamic("HttpVersion")(HttpVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IsIPV6Enabled)) __obj.updateDynamic("IsIPV6Enabled")(IsIPV6Enabled.asInstanceOf[js.Any])
    if (Logging != null) __obj.updateDynamic("Logging")(Logging.asInstanceOf[js.Any])
    if (OriginGroups != null) __obj.updateDynamic("OriginGroups")(OriginGroups.asInstanceOf[js.Any])
    if (PriceClass != null) __obj.updateDynamic("PriceClass")(PriceClass.asInstanceOf[js.Any])
    if (Restrictions != null) __obj.updateDynamic("Restrictions")(Restrictions.asInstanceOf[js.Any])
    if (ViewerCertificate != null) __obj.updateDynamic("ViewerCertificate")(ViewerCertificate.asInstanceOf[js.Any])
    if (WebACLId != null) __obj.updateDynamic("WebACLId")(WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionConfig]
  }
}

