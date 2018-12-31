package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudfront", "CloudFront")
@js.native
object CloudFrontNs extends js.Object {
  trait ActiveTrustedSigners extends js.Object {
    /**
      * Enabled is true if any of the AWS accounts listed in the TrustedSigners complex type for this RTMP distribution have active CloudFront key pairs. If not, Enabled is false. For more information, see ActiveTrustedSigners.
      */
    var Enabled: scala.Boolean
    /**
      * A complex type that contains one Signer complex type for each trusted signer that is specified in the TrustedSigners complex type. For more information, see ActiveTrustedSigners. 
      */
    var Items: js.UndefOr[SignerList] = js.undefined
    /**
      * A complex type that contains one Signer complex type for each trusted signer specified in the TrustedSigners complex type. For more information, see ActiveTrustedSigners.
      */
    var Quantity: integer
  }
  
  trait Aliases extends js.Object {
    /**
      * A complex type that contains the CNAME aliases, if any, that you want to associate with this distribution.
      */
    var Items: js.UndefOr[AliasList] = js.undefined
    /**
      * The number of CNAME aliases, if any, that you want to associate with this distribution.
      */
    var Quantity: integer
  }
  
  trait AllowedMethods extends js.Object {
    var CachedMethods: js.UndefOr[CachedMethods] = js.undefined
    /**
      * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
      */
    var Items: MethodsList
    /**
      * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET, HEAD, and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE requests).
      */
    var Quantity: integer
  }
  
  trait CacheBehavior extends js.Object {
    var AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined
    /**
      * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true; if not, specify false. For more information, see Serving Compressed Files in the Amazon CloudFront Developer Guide.
      */
    var Compress: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Specifying How Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
      */
    var DefaultTTL: js.UndefOr[long] = js.undefined
    /**
      * The value of ID for the field-level encryption configuration that you want CloudFront to use for encrypting specific fields of data for a cache behavior or for the default cache behavior in your distribution.
      */
    var FieldLevelEncryptionId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A complex type that specifies how CloudFront handles query strings and cookies.
      */
    var ForwardedValues: ForwardedValues
    /**
      * A complex type that contains zero or more Lambda function associations for a cache behavior.
      */
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined
    /**
      * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin adds HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Specifying How Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
      */
    var MaxTTL: js.UndefOr[long] = js.undefined
    /**
      * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. For more information, see Specifying How Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration) in the Amazon Amazon CloudFront Developer Guide. You must specify 0 for MinTTL if you configure CloudFront to forward all headers to your origin (under Headers, if you specify 1 for Quantity and * for Name).
      */
    var MinTTL: long
    /**
      * The pattern (for example, images/ *.jpg) that specifies which requests to apply the behavior to. When CloudFront receives a viewer request, the requested path is compared with path patterns in the order in which cache behaviors are listed in the distribution.  You can optionally include a slash (/) at the beginning of the path pattern. For example, /images/ *.jpg. CloudFront behavior is the same with or without the leading /.  The path pattern for the default cache behavior is * and cannot be changed. If the request for an object does not match the path pattern for any cache behaviors, CloudFront applies the behavior in the default cache behavior. For more information, see Path Pattern in the  Amazon CloudFront Developer Guide.
      */
    var PathPattern: java.lang.String
    /**
      * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin that is associated with this cache behavior. If so, specify true; if not, specify false. If you specify true for SmoothStreaming, you can still distribute other content using this cache behavior if the content matches the value of PathPattern. 
      */
    var SmoothStreaming: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The value of ID for the origin that you want CloudFront to route requests to when a request matches the path pattern either for a cache behavior or for the default cache behavior in your distribution.
      */
    var TargetOriginId: java.lang.String
    /**
      * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items. For more information, see Serving Private Content through CloudFront in the Amazon Amazon CloudFront Developer Guide. If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
      */
    var TrustedSigners: TrustedSigners
    /**
      * The protocol that viewers can use to access the files in the origin specified by TargetOriginId when a request matches the path pattern in PathPattern. You can specify the following options:    allow-all: Viewers can use HTTP or HTTPS.    redirect-to-https: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the new URL.     https-only: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403 (Forbidden).    For more information about requiring the HTTPS protocol, see Using an HTTPS Connection to Access Your Objects in the Amazon CloudFront Developer Guide.  The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will return an object from the cache regardless of whether the current request protocol matches the protocol used previously. For more information, see Specifying How Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. 
      */
    var ViewerProtocolPolicy: ViewerProtocolPolicy
  }
  
  trait CacheBehaviors extends js.Object {
    /**
      * Optional: A complex type that contains cache behaviors for this distribution. If Quantity is 0, you can omit Items.
      */
    var Items: js.UndefOr[CacheBehaviorList] = js.undefined
    /**
      * The number of cache behaviors for this distribution. 
      */
    var Quantity: integer
  }
  
  trait CachedMethods extends js.Object {
    /**
      * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
      */
    var Items: MethodsList
    /**
      * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are 2 (for caching responses to GET and HEAD requests) and 3 (for caching responses to GET, HEAD, and OPTIONS requests).
      */
    var Quantity: integer
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudFrontOriginAccessIdentity extends js.Object {
    /**
      * The current configuration information for the identity. 
      */
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
    /**
      * The ID for the origin access identity, for example, E74FTE3AJFJ256A. 
      */
    var Id: java.lang.String
    /**
      * The Amazon S3 canonical user ID for the origin access identity, used when giving the origin access identity read permission to an object in Amazon S3. 
      */
    var S3CanonicalUserId: java.lang.String
  }
  
  trait CloudFrontOriginAccessIdentityConfig extends js.Object {
    /**
      * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the CloudFrontOriginAccessIdentityConfig object), a new origin access identity is created. If the CallerReference is a value already sent in a previous identity request, and the content of the CloudFrontOriginAccessIdentityConfig is identical to the original request (ignoring white space), the response includes the same information returned to the original request.  If the CallerReference is a value you already sent in a previous request to create an identity, but the content of the CloudFrontOriginAccessIdentityConfig is different from the original request, CloudFront returns a CloudFrontOriginAccessIdentityAlreadyExists error. 
      */
    var CallerReference: java.lang.String
    /**
      * Any comments you want to include about the origin access identity. 
      */
    var Comment: java.lang.String
  }
  
  trait CloudFrontOriginAccessIdentityList extends js.Object {
    /**
      * A flag that indicates whether more origin access identities remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more items in the list.
      */
    var IsTruncated: scala.Boolean
    /**
      * A complex type that contains one CloudFrontOriginAccessIdentitySummary element for each origin access identity that was created by the current AWS account.
      */
    var Items: js.UndefOr[CloudFrontOriginAccessIdentitySummaryList] = js.undefined
    /**
      * Use this when paginating results to indicate where to begin in your list of origin access identities. The results include identities in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last identity on that page). 
      */
    var Marker: java.lang.String
    /**
      * The maximum number of origin access identities you want in the response body. 
      */
    var MaxItems: integer
    /**
      * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your origin access identities where they left off. 
      */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of CloudFront origin access identities that were created by the current AWS account. 
      */
    var Quantity: integer
  }
  
  trait CloudFrontOriginAccessIdentitySummary extends js.Object {
    /**
      * The comment for this origin access identity, as originally specified when created.
      */
    var Comment: java.lang.String
    /**
      * The ID for the origin access identity. For example: E74FTE3AJFJ256A.
      */
    var Id: java.lang.String
    /**
      * The Amazon S3 canonical user ID for the origin access identity, which you use when giving the origin access identity read permission to an object in Amazon S3.
      */
    var S3CanonicalUserId: java.lang.String
  }
  
  trait ContentTypeProfile extends js.Object {
    /**
      * The content type for a field-level encryption content type-profile mapping. 
      */
    var ContentType: java.lang.String
    /**
      * The format for a field-level encryption content type-profile mapping. 
      */
    var Format: Format
    /**
      * The profile ID for a field-level encryption content type-profile mapping. 
      */
    var ProfileId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ContentTypeProfileConfig extends js.Object {
    /**
      * The configuration for a field-level encryption content type-profile. 
      */
    var ContentTypeProfiles: js.UndefOr[ContentTypeProfiles] = js.undefined
    /**
      * The setting in a field-level encryption content type-profile mapping that specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown. 
      */
    var ForwardWhenContentTypeIsUnknown: scala.Boolean
  }
  
  trait ContentTypeProfiles extends js.Object {
    /**
      * Items in a field-level encryption content type-profile mapping. 
      */
    var Items: js.UndefOr[ContentTypeProfileList] = js.undefined
    /**
      * The number of field-level encryption content type-profile mappings. 
      */
    var Quantity: integer
  }
  
  trait CookieNames extends js.Object {
    /**
      * A complex type that contains one Name element for each cookie that you want CloudFront to forward to the origin for this cache behavior.
      */
    var Items: js.UndefOr[CookieNameList] = js.undefined
    /**
      * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior.
      */
    var Quantity: integer
  }
  
  trait CookiePreference extends js.Object {
    /**
      * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies specified in the WhitelistedNames complex type. Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify none for the Forward element. 
      */
    var Forward: ItemSelection
    /**
      * Required if you specify whitelist for the value of Forward:. A complex type that specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior and, if you want to forward selected cookies, the names of those cookies. If you specify all or none for the value of Forward, omit WhitelistedNames. If you change the value of Forward from whitelist to all or none and you don't delete the WhitelistedNames element and its child elements, CloudFront deletes them automatically. For the current limit on the number of cookie names that you can whitelist for each cache behavior, see Amazon CloudFront Limits in the AWS General Reference.
      */
    var WhitelistedNames: js.UndefOr[CookieNames] = js.undefined
  }
  
  trait CreateCloudFrontOriginAccessIdentityRequest extends js.Object {
    /**
      * The current configuration information for the identity.
      */
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
  }
  
  trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
    /**
      * The origin access identity's information.
      */
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined
    /**
      * The current version of the origin access identity created.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The fully qualified URI of the new origin access identity just created. For example: https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateDistributionRequest extends js.Object {
    /**
      * The distribution's configuration information.
      */
    var DistributionConfig: DistributionConfig
  }
  
  trait CreateDistributionResult extends js.Object {
    /**
      * The distribution's information.
      */
    var Distribution: js.UndefOr[Distribution] = js.undefined
    /**
      * The current version of the distribution created.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The fully qualified URI of the new distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateDistributionWithTagsRequest extends js.Object {
    /**
      * The distribution's configuration information. 
      */
    var DistributionConfigWithTags: DistributionConfigWithTags
  }
  
  trait CreateDistributionWithTagsResult extends js.Object {
    /**
      * The distribution's information. 
      */
    var Distribution: js.UndefOr[Distribution] = js.undefined
    /**
      * The current version of the distribution created.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The fully qualified URI of the new distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5. 
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateFieldLevelEncryptionConfigRequest extends js.Object {
    /**
      * The request to create a new field-level encryption configuration.
      */
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
  }
  
  trait CreateFieldLevelEncryptionConfigResult extends js.Object {
    /**
      * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Returned when you create a new field-level encryption configuration.
      */
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
    /**
      * The fully qualified URI of the new configuration resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateFieldLevelEncryptionProfileRequest extends js.Object {
    /**
      * The request to create a field-level encryption profile.
      */
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
  }
  
  trait CreateFieldLevelEncryptionProfileResult extends js.Object {
    /**
      * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Returned when you create a new field-level encryption profile.
      */
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
    /**
      * The fully qualified URI of the new profile resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-profile/EDFDVBD632BHDS5.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreateInvalidationRequest extends js.Object {
    /**
      * The distribution's id.
      */
    var DistributionId: java.lang.String
    /**
      * The batch information for the invalidation.
      */
    var InvalidationBatch: InvalidationBatch
  }
  
  trait CreateInvalidationResult extends js.Object {
    /**
      * The invalidation's information.
      */
    var Invalidation: js.UndefOr[Invalidation] = js.undefined
    /**
      * The fully qualified URI of the distribution and invalidation batch request, including the Invalidation ID.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CreatePublicKeyRequest extends js.Object {
    /**
      * The request to add a public key to CloudFront.
      */
    var PublicKeyConfig: PublicKeyConfig
  }
  
  trait CreatePublicKeyResult extends js.Object {
    /**
      * The current version of the public key. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The fully qualified URI of the new public key resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/cloudfront-public-key/EDFDVBD632BHDS5.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Returned when you add a public key.
      */
    var PublicKey: js.UndefOr[PublicKey] = js.undefined
  }
  
  trait CreateStreamingDistributionRequest extends js.Object {
    /**
      * The streaming distribution's configuration information.
      */
    var StreamingDistributionConfig: StreamingDistributionConfig
  }
  
  trait CreateStreamingDistributionResult extends js.Object {
    /**
      * The current version of the streaming distribution created.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The fully qualified URI of the new streaming distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The streaming distribution's information.
      */
    var StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
  }
  
  trait CreateStreamingDistributionWithTagsRequest extends js.Object {
    /**
      *  The streaming distribution's configuration information. 
      */
    var StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags
  }
  
  trait CreateStreamingDistributionWithTagsResult extends js.Object {
    /**
      * The current version of the distribution created.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The fully qualified URI of the new streaming distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
      */
    var Location: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The streaming distribution's information. 
      */
    var StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
  }
  
  trait CustomErrorResponse extends js.Object {
    /**
      * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status code specified in ErrorCode. When this time period has elapsed, CloudFront queries your origin to see whether the problem that caused the error has been resolved and the requested object is now available. If you don't want to specify a value, include an empty element, &lt;ErrorCachingMinTTL&gt;, in the XML document. For more information, see Customizing Error Responses in the Amazon CloudFront Developer Guide.
      */
    var ErrorCachingMinTTL: js.UndefOr[long] = js.undefined
    /**
      * The HTTP status code for which you want to specify a custom error page and/or a caching duration.
      */
    var ErrorCode: integer
    /**
      * The HTTP status code that you want CloudFront to return to the viewer along with the custom error page. There are a variety of reasons that you might want CloudFront to return a status code different from the status code that your origin returned to CloudFront, for example:   Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP 4xx and 5xx and prevent the response from being returned to the viewer. If you substitute 200, the response typically won't be intercepted.   If you don't care about distinguishing among different client errors or server errors, you can specify 400 or 500 as the ResponseCode for all 4xx or 5xx errors.   You might want to return a 200 status code (OK) and static website so your customers don't know that your website is down.   If you specify a value for ResponseCode, you must also specify a value for ResponsePagePath. If you don't want to specify a value, include an empty element, &lt;ResponseCode&gt;, in the XML document.
      */
    var ResponseCode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The path to the custom error page that you want CloudFront to return to a viewer when your origin returns the HTTP status code specified by ErrorCode, for example, /4xx-errors/403-forbidden.html. If you want to store your objects and your custom error pages in different locations, your distribution must include a cache behavior for which the following is true:   The value of PathPattern matches the path to your custom error messages. For example, suppose you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named /4xx-errors. Your distribution must include a cache behavior for which the path pattern routes requests for your custom error pages to that location, for example, /4xx-errors/ *.    The value of TargetOriginId specifies the value of the ID element for the origin that contains your custom error pages.   If you specify a value for ResponsePagePath, you must also specify a value for ResponseCode. If you don't want to specify a value, include an empty element, &lt;ResponsePagePath&gt;, in the XML document. We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom error pages on an HTTP server and the server starts to return 5xx errors, CloudFront can't get the files that you want to return to viewers because the origin server is unavailable.
      */
    var ResponsePagePath: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CustomErrorResponses extends js.Object {
    /**
      * A complex type that contains a CustomErrorResponse element for each HTTP status code for which you want to specify a custom error page and/or a caching duration. 
      */
    var Items: js.UndefOr[CustomErrorResponseList] = js.undefined
    /**
      * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If Quantity is 0, you can omit Items.
      */
    var Quantity: integer
  }
  
  trait CustomHeaders extends js.Object {
    /**
      *  Optional: A list that contains one OriginCustomHeader element for each custom header that you want CloudFront to forward to the origin. If Quantity is 0, omit Items.
      */
    var Items: js.UndefOr[OriginCustomHeadersList] = js.undefined
    /**
      * The number of custom headers, if any, for this distribution.
      */
    var Quantity: integer
  }
  
  trait CustomOriginConfig extends js.Object {
    /**
      * The HTTP port the custom origin listens on.
      */
    var HTTPPort: integer
    /**
      * The HTTPS port the custom origin listens on.
      */
    var HTTPSPort: integer
    /**
      * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1 second; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
      */
    var OriginKeepaliveTimeout: js.UndefOr[integer] = js.undefined
    /**
      * The origin protocol policy to apply to your origin.
      */
    var OriginProtocolPolicy: OriginProtocolPolicy
    /**
      * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 4 seconds; the maximum is 60 seconds. If you need to increase the maximum time limit, contact the AWS Support Center.
      */
    var OriginReadTimeout: js.UndefOr[integer] = js.undefined
    /**
      * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
      */
    var OriginSslProtocols: js.UndefOr[OriginSslProtocols] = js.undefined
  }
  
  trait DefaultCacheBehavior extends js.Object {
    var AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined
    /**
      * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true; if not, specify false. For more information, see Serving Compressed Files in the Amazon CloudFront Developer Guide.
      */
    var Compress: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Specifying How Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
      */
    var DefaultTTL: js.UndefOr[long] = js.undefined
    /**
      * The value of ID for the field-level encryption configuration that you want CloudFront to use for encrypting specific fields of data for a cache behavior or for the default cache behavior in your distribution.
      */
    var FieldLevelEncryptionId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A complex type that specifies how CloudFront handles query strings and cookies.
      */
    var ForwardedValues: ForwardedValues
    /**
      * A complex type that contains zero or more Lambda function associations for a cache behavior.
      */
    var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined
    var MaxTTL: js.UndefOr[long] = js.undefined
    /**
      * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. For more information, see Specifying How Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration) in the Amazon Amazon CloudFront Developer Guide. You must specify 0 for MinTTL if you configure CloudFront to forward all headers to your origin (under Headers, if you specify 1 for Quantity and * for Name).
      */
    var MinTTL: long
    /**
      * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin that is associated with this cache behavior. If so, specify true; if not, specify false. If you specify true for SmoothStreaming, you can still distribute other content using this cache behavior if the content matches the value of PathPattern. 
      */
    var SmoothStreaming: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The value of ID for the origin that you want CloudFront to route requests to when a request matches the path pattern either for a cache behavior or for the default cache behavior in your distribution.
      */
    var TargetOriginId: java.lang.String
    /**
      * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items. For more information, see Serving Private Content through CloudFront in the Amazon Amazon CloudFront Developer Guide. If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
      */
    var TrustedSigners: TrustedSigners
    /**
      * The protocol that viewers can use to access the files in the origin specified by TargetOriginId when a request matches the path pattern in PathPattern. You can specify the following options:    allow-all: Viewers can use HTTP or HTTPS.    redirect-to-https: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the new URL.    https-only: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403 (Forbidden).   For more information about requiring the HTTPS protocol, see Using an HTTPS Connection to Access Your Objects in the Amazon CloudFront Developer Guide.  The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will return an object from the cache regardless of whether the current request protocol matches the protocol used previously. For more information, see Specifying How Long Objects and Errors Stay in a CloudFront Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. 
      */
    var ViewerProtocolPolicy: ViewerProtocolPolicy
  }
  
  trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
    /**
      * The origin access identity's ID.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header you received from a previous GET or PUT request. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DeleteDistributionRequest extends js.Object {
    /**
      * The distribution ID. 
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when you disabled the distribution. For example: E2QWRUHAPOMQZL. 
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DeleteFieldLevelEncryptionConfigRequest extends js.Object {
    /**
      * The ID of the configuration you want to delete from CloudFront.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the configuration identity to delete. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DeleteFieldLevelEncryptionProfileRequest extends js.Object {
    /**
      * Request the ID of the profile you want to delete from CloudFront.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the profile to delete. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DeletePublicKeyRequest extends js.Object {
    /**
      * The ID of the public key you want to remove from CloudFront.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the public key identity to delete. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DeleteStreamingDistributionRequest extends js.Object {
    /**
      * The distribution ID. 
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when you disabled the streaming distribution. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Distribution extends js.Object {
    /**
      * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
      */
    var ARN: java.lang.String
    /**
      * CloudFront automatically adds this element to the response only if you've set up the distribution to serve private content with signed URLs. The element lists the key pair IDs that CloudFront is aware of for each trusted signer. The Signer child element lists the AWS account number of the trusted signer (or an empty Self element if the signer is you). The Signer element also includes the IDs of any active key pairs associated with the trusted signer's AWS account. If no KeyPairId element appears for a Signer, that signer can't create working signed URLs.
      */
    var ActiveTrustedSigners: ActiveTrustedSigners
    /**
      * The current configuration information for the distribution. Send a GET request to the /CloudFront API version/distribution ID/config resource.
      */
    var DistributionConfig: DistributionConfig
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
  
  trait DistributionConfig extends js.Object {
    /**
      * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
      */
    var Aliases: js.UndefOr[Aliases] = js.undefined
    /**
      * A complex type that contains zero or more CacheBehavior elements. 
      */
    var CacheBehaviors: js.UndefOr[CacheBehaviors] = js.undefined
    /**
      * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the DistributionConfig object), CloudFront creates a new distribution. If CallerReference is a value that you already sent in a previous request to create a distribution, CloudFront returns a DistributionAlreadyExists error.
      */
    var CallerReference: java.lang.String
    /**
      * Any comments you want to include about the distribution. If you don't want to specify a comment, include an empty Comment element. To delete an existing comment, update the distribution configuration and include an empty Comment element. To add or change a comment, update the distribution configuration and specify the new comment.
      */
    var Comment: java.lang.String
    /**
      * A complex type that controls the following:   Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error messages before returning the response to the viewer.   How long CloudFront caches HTTP status codes in the 4xx and 5xx range.   For more information about custom error pages, see Customizing Error Responses in the Amazon CloudFront Developer Guide.
      */
    var CustomErrorResponses: js.UndefOr[CustomErrorResponses] = js.undefined
    /**
      * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
      */
    var DefaultCacheBehavior: DefaultCacheBehavior
    /**
      * The object that you want CloudFront to request from your origin (for example, index.html) when a viewer requests the root URL for your distribution (http://www.example.com) instead of an object in your distribution (http://www.example.com/product-description.html). Specifying a default root object avoids exposing the contents of your distribution. Specify only the object name, for example, index.html. Don't add a / before the object name. If you don't want to specify a default root object when you create a distribution, include an empty DefaultRootObject element. To delete the default root object from an existing distribution, update the distribution configuration and include an empty DefaultRootObject element. To replace the default root object, update the distribution configuration and specify the new object. For more information about the default root object, see Creating a Default Root Object in the Amazon CloudFront Developer Guide.
      */
    var DefaultRootObject: js.UndefOr[java.lang.String] = js.undefined
    /**
      * From this field, you can enable or disable the selected distribution.
      */
    var Enabled: scala.Boolean
    /**
      * (Optional) Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront. The default value for new web distributions is http2. Viewers that don't support HTTP/2 automatically use an earlier HTTP version. For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must support Server Name Identification (SNI). In general, configuring CloudFront to communicate with viewers using HTTP/2 reduces latency. You can improve performance by optimizing for HTTP/2. For more information, do an Internet search for "http/2 optimization." 
      */
    var HttpVersion: js.UndefOr[HttpVersion] = js.undefined
    /**
      * If you want CloudFront to respond to IPv6 DNS requests with an IPv6 address for your distribution, specify true. If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code NOERROR and with no IP addresses. This allows viewers to submit a second request, for an IPv4 address for your distribution.  In general, you should enable IPv6 if you have users on IPv6 networks who want to access your content. However, if you're using signed URLs or signed cookies to restrict access to your content, and if you're using a custom policy that includes the IpAddress parameter to restrict the IP addresses that can access your content, don't enable IPv6. If you want to restrict access to some content by IP address and not restrict access to other content (or restrict access but not by IP address), you can create two distributions. For more information, see Creating a Signed URL Using a Custom Policy in the Amazon CloudFront Developer Guide. If you're using an Amazon Route 53 alias resource record set to route traffic to your CloudFront distribution, you need to create a second alias resource record set when both of the following are true:   You enable IPv6 for the distribution   You're using alternate domain names in the URLs for your objects   For more information, see Routing Traffic to an Amazon CloudFront Web Distribution by Using Your Domain Name in the Amazon Route 53 Developer Guide. If you created a CNAME resource record set, either with Amazon Route 53 or with another DNS service, you don't need to make any changes. A CNAME record will route traffic to your distribution regardless of the IP address format of the viewer request.
      */
    var IsIPV6Enabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A complex type that controls whether access logs are written for the distribution. For more information about logging, see Access Logs in the Amazon CloudFront Developer Guide.
      */
    var Logging: js.UndefOr[LoggingConfig] = js.undefined
    /**
      *  A complex type that contains information about origin groups for this distribution.
      */
    var OriginGroups: js.UndefOr[OriginGroups] = js.undefined
    /**
      * A complex type that contains information about origins for this distribution. 
      */
    var Origins: Origins
    /**
      * The price class that corresponds with the maximum price that you want to pay for CloudFront service. If you specify PriceClass_All, CloudFront responds to requests for your objects from all CloudFront edge locations. If you specify a price class other than PriceClass_All, CloudFront serves your objects from the CloudFront edge location that has the lowest latency among the edge locations in your price class. Viewers who are in or near regions that are excluded from your specified price class may encounter slower performance. For more information about price classes, see Choosing the Price Class for a CloudFront Distribution in the Amazon CloudFront Developer Guide. For information about CloudFront pricing, including how price classes (such as Price Class 100) map to CloudFront regions, see Amazon CloudFront Pricing. For price class information, scroll down to see the table at the bottom of the page.
      */
    var PriceClass: js.UndefOr[PriceClass] = js.undefined
    /**
      * 
      */
    var Restrictions: js.UndefOr[Restrictions] = js.undefined
    /**
      * 
      */
    var ViewerCertificate: js.UndefOr[ViewerCertificate] = js.undefined
    /**
      * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this distribution. AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to CloudFront, and lets you control access to your content. Based on conditions that you specify, such as the IP addresses that requests originate from or the values of query strings, CloudFront responds to requests either with the requested content or with an HTTP 403 status code (Forbidden). You can also configure CloudFront to return a custom error page when a request is blocked. For more information about AWS WAF, see the AWS WAF Developer Guide. 
      */
    var WebACLId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DistributionConfigWithTags extends js.Object {
    /**
      * A distribution configuration.
      */
    var DistributionConfig: DistributionConfig
    /**
      * A complex type that contains zero or more Tag elements.
      */
    var Tags: Tags
  }
  
  trait DistributionList extends js.Object {
    /**
      * A flag that indicates whether more distributions remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more distributions in the list.
      */
    var IsTruncated: scala.Boolean
    /**
      * A complex type that contains one DistributionSummary element for each distribution that was created by the current AWS account.
      */
    var Items: js.UndefOr[DistributionSummaryList] = js.undefined
    /**
      * The value you provided for the Marker request parameter.
      */
    var Marker: java.lang.String
    /**
      * The value you provided for the MaxItems request parameter.
      */
    var MaxItems: integer
    /**
      * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your distributions where they left off. 
      */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of distributions that were created by the current AWS account. 
      */
    var Quantity: integer
  }
  
  trait DistributionSummary extends js.Object {
    /**
      * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
      */
    var ARN: java.lang.String
    /**
      * A complex type that contains information about CNAMEs (alternate domain names), if any, for this distribution.
      */
    var Aliases: Aliases
    /**
      * A complex type that contains zero or more CacheBehavior elements.
      */
    var CacheBehaviors: CacheBehaviors
    /**
      * The comment originally specified when this distribution was created.
      */
    var Comment: java.lang.String
    /**
      * A complex type that contains zero or more CustomErrorResponses elements.
      */
    var CustomErrorResponses: CustomErrorResponses
    /**
      * A complex type that describes the default cache behavior if you don't specify a CacheBehavior element or if files don't match any of the values of PathPattern in CacheBehavior elements. You must create exactly one default cache behavior.
      */
    var DefaultCacheBehavior: DefaultCacheBehavior
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
    var HttpVersion: HttpVersion
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
    var Origins: Origins
    /**
      * A complex type that contains information about price class for this streaming distribution. 
      */
    var PriceClass: PriceClass
    /**
      * 
      */
    var Restrictions: Restrictions
    /**
      * The current status of the distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
      */
    var Status: java.lang.String
    /**
      * 
      */
    var ViewerCertificate: ViewerCertificate
    /**
      * The Web ACL Id (if any) associated with the distribution.
      */
    var WebACLId: java.lang.String
  }
  
  trait EncryptionEntities extends js.Object {
    /**
      * An array of field patterns in a field-level encryption content type-profile mapping. 
      */
    var Items: js.UndefOr[EncryptionEntityList] = js.undefined
    /**
      * Number of field pattern items in a field-level encryption content type-profile mapping. 
      */
    var Quantity: integer
  }
  
  trait EncryptionEntity extends js.Object {
    /**
      * Field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted. You can provide the full field name, or any beginning characters followed by a wildcard (*). You can't overlap field patterns. For example, you can't have both ABC* and AB*. Note that field patterns are case-sensitive. 
      */
    var FieldPatterns: FieldPatterns
    /**
      * The provider associated with the public key being used for encryption. This value must also be provided with the private key for applications to be able to decrypt data.
      */
    var ProviderId: java.lang.String
    /**
      * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns. 
      */
    var PublicKeyId: java.lang.String
  }
  
  trait FieldLevelEncryption extends js.Object {
    /**
      * A complex data type that includes the profile configurations specified for field-level encryption. 
      */
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    /**
      * The configuration ID for a field-level encryption configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
      */
    var Id: java.lang.String
    /**
      * The last time the field-level encryption configuration was changed. 
      */
    var LastModifiedTime: timestamp
  }
  
  trait FieldLevelEncryptionConfig extends js.Object {
    /**
      * A unique number that ensures the request can't be replayed.
      */
    var CallerReference: java.lang.String
    /**
      * An optional comment about the configuration.
      */
    var Comment: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
      */
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined
    /**
      * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
      */
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined
  }
  
  trait FieldLevelEncryptionList extends js.Object {
    /**
      * An array of field-level encryption items.
      */
    var Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.undefined
    /**
      * The maximum number of elements you want in the response body. 
      */
    var MaxItems: integer
    /**
      * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your configurations where you left off.
      */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of field-level encryption items.
      */
    var Quantity: integer
  }
  
  trait FieldLevelEncryptionProfile extends js.Object {
    /**
      * A complex data type that includes the profile name and the encryption entities for the field-level encryption profile.
      */
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    /**
      * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
      */
    var Id: java.lang.String
    /**
      * The last time the field-level encryption profile was updated.
      */
    var LastModifiedTime: timestamp
  }
  
  trait FieldLevelEncryptionProfileConfig extends js.Object {
    /**
      * A unique number that ensures that the request can't be replayed.
      */
    var CallerReference: java.lang.String
    /**
      * An optional comment for the field-level encryption profile.
      */
    var Comment: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
      */
    var EncryptionEntities: EncryptionEntities
    /**
      * Profile name for the field-level encryption profile.
      */
    var Name: java.lang.String
  }
  
  trait FieldLevelEncryptionProfileList extends js.Object {
    /**
      * The field-level encryption profile items.
      */
    var Items: js.UndefOr[FieldLevelEncryptionProfileSummaryList] = js.undefined
    /**
      * The maximum number of field-level encryption profiles you want in the response body. 
      */
    var MaxItems: integer
    /**
      * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your profiles where you left off.
      */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of field-level encryption profiles.
      */
    var Quantity: integer
  }
  
  trait FieldLevelEncryptionProfileSummary extends js.Object {
    /**
      * An optional comment for the field-level encryption profile summary.
      */
    var Comment: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
      */
    var EncryptionEntities: EncryptionEntities
    /**
      * ID for the field-level encryption profile summary.
      */
    var Id: java.lang.String
    /**
      * The time when the the field-level encryption profile summary was last updated.
      */
    var LastModifiedTime: timestamp
    /**
      * Name for the field-level encryption profile summary.
      */
    var Name: java.lang.String
  }
  
  trait FieldLevelEncryptionSummary extends js.Object {
    /**
      * An optional comment about the field-level encryption item.
      */
    var Comment: js.UndefOr[java.lang.String] = js.undefined
    /**
      *  A summary of a content type-profile mapping. 
      */
    var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined
    /**
      * The unique ID of a field-level encryption item.
      */
    var Id: java.lang.String
    /**
      * The last time that the summary of field-level encryption items was modified.
      */
    var LastModifiedTime: timestamp
    /**
      *  A summary of a query argument-profile mapping. 
      */
    var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined
  }
  
  trait FieldPatterns extends js.Object {
    /**
      * An array of the field-level encryption field patterns.
      */
    var Items: js.UndefOr[FieldPatternList] = js.undefined
    /**
      * The number of field-level encryption field patterns.
      */
    var Quantity: integer
  }
  
  trait ForwardedValues extends js.Object {
    /**
      * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones. For more information about forwarding cookies to the origin, see How CloudFront Forwards, Caches, and Logs Cookies in the Amazon CloudFront Developer Guide.
      */
    var Cookies: CookiePreference
    /**
      * A complex type that specifies the Headers, if any, that you want CloudFront to base caching on for this cache behavior. 
      */
    var Headers: js.UndefOr[Headers] = js.undefined
    /**
      * Indicates whether you want CloudFront to forward query strings to the origin that is associated with this cache behavior and cache based on the query string parameters. CloudFront behavior depends on the value of QueryString and on the values that you specify for QueryStringCacheKeys, if any: If you specify true for QueryString and you don't specify any values for QueryStringCacheKeys, CloudFront forwards all query string parameters to the origin and caches based on all query string parameters. Depending on how many query string parameters and values you have, this can adversely affect performance because CloudFront must forward more requests to the origin. If you specify true for QueryString and you specify one or more values for QueryStringCacheKeys, CloudFront forwards all query string parameters to the origin, but it only caches based on the query string parameters that you specify. If you specify false for QueryString, CloudFront doesn't forward any query string parameters to the origin, and doesn't cache based on query string parameters. For more information, see Configuring CloudFront to Cache Based on Query String Parameters in the Amazon CloudFront Developer Guide.
      */
    var QueryString: scala.Boolean
    /**
      * A complex type that contains information about the query string parameters that you want CloudFront to use for caching for this cache behavior.
      */
    var QueryStringCacheKeys: js.UndefOr[QueryStringCacheKeys] = js.undefined
  }
  
  trait GeoRestriction extends js.Object {
    /**
      *  A complex type that contains a Location element for each country in which you want CloudFront either to distribute your content (whitelist) or not distribute your content (blacklist). The Location element is a two-letter, uppercase country code for a country that you want to include in your blacklist or whitelist. Include one Location element for each country. CloudFront and MaxMind both use ISO 3166 country codes. For the current list of countries and the corresponding codes, see ISO 3166-1-alpha-2 code on the International Organization for Standardization website. You can also refer to the country list on the CloudFront console, which includes both country names and codes.
      */
    var Items: js.UndefOr[LocationList] = js.undefined
    /**
      * When geo restriction is enabled, this is the number of countries in your whitelist or blacklist. Otherwise, when it is not enabled, Quantity is 0, and you can omit Items.
      */
    var Quantity: integer
    /**
      * The method that you want to use to restrict distribution of your content by country:    none: No geo restriction is enabled, meaning access to content is not restricted by client geo location.    blacklist: The Location elements specify the countries in which you don't want CloudFront to distribute your content.    whitelist: The Location elements specify the countries in which you want CloudFront to distribute your content.  
      */
    var RestrictionType: GeoRestrictionType
  }
  
  trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
    /**
      * The identity's ID. 
      */
    var Id: java.lang.String
  }
  
  trait GetCloudFrontOriginAccessIdentityConfigResult extends js.Object {
    /**
      * The origin access identity's configuration information. 
      */
    var CloudFrontOriginAccessIdentityConfig: js.UndefOr[CloudFrontOriginAccessIdentityConfig] = js.undefined
    /**
      * The current version of the configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetCloudFrontOriginAccessIdentityRequest extends js.Object {
    /**
      * The identity's ID.
      */
    var Id: java.lang.String
  }
  
  trait GetCloudFrontOriginAccessIdentityResult extends js.Object {
    /**
      * The origin access identity's information.
      */
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined
    /**
      * The current version of the origin access identity's information. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDistributionConfigRequest extends js.Object {
    /**
      * The distribution's ID.
      */
    var Id: java.lang.String
  }
  
  trait GetDistributionConfigResult extends js.Object {
    /**
      * The distribution's configuration information.
      */
    var DistributionConfig: js.UndefOr[DistributionConfig] = js.undefined
    /**
      * The current version of the configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDistributionRequest extends js.Object {
    /**
      * The distribution's ID.
      */
    var Id: java.lang.String
  }
  
  trait GetDistributionResult extends js.Object {
    /**
      * The distribution's information.
      */
    var Distribution: js.UndefOr[Distribution] = js.undefined
    /**
      * The current version of the distribution's information. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetFieldLevelEncryptionConfigRequest extends js.Object {
    /**
      * Request the ID for the field-level encryption configuration information.
      */
    var Id: java.lang.String
  }
  
  trait GetFieldLevelEncryptionConfigResult extends js.Object {
    /**
      * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the field-level encryption configuration information.
      */
    var FieldLevelEncryptionConfig: js.UndefOr[FieldLevelEncryptionConfig] = js.undefined
  }
  
  trait GetFieldLevelEncryptionProfileConfigRequest extends js.Object {
    /**
      * Get the ID for the field-level encryption profile configuration information.
      */
    var Id: java.lang.String
  }
  
  trait GetFieldLevelEncryptionProfileConfigResult extends js.Object {
    /**
      * The current version of the field-level encryption profile configuration result. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the field-level encryption profile configuration information.
      */
    var FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig] = js.undefined
  }
  
  trait GetFieldLevelEncryptionProfileRequest extends js.Object {
    /**
      * Get the ID for the field-level encryption profile information.
      */
    var Id: java.lang.String
  }
  
  trait GetFieldLevelEncryptionProfileResult extends js.Object {
    /**
      * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the field-level encryption profile information.
      */
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
  }
  
  trait GetFieldLevelEncryptionRequest extends js.Object {
    /**
      * Request the ID for the field-level encryption configuration information.
      */
    var Id: java.lang.String
  }
  
  trait GetFieldLevelEncryptionResult extends js.Object {
    /**
      * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the field-level encryption configuration information.
      */
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
  }
  
  trait GetInvalidationRequest extends js.Object {
    /**
      * The distribution's ID.
      */
    var DistributionId: java.lang.String
    /**
      * The identifier for the invalidation request, for example, IDFDVBD632BHDS5.
      */
    var Id: java.lang.String
  }
  
  trait GetInvalidationResult extends js.Object {
    /**
      * The invalidation's information. For more information, see Invalidation Complex Type. 
      */
    var Invalidation: js.UndefOr[Invalidation] = js.undefined
  }
  
  trait GetPublicKeyConfigRequest extends js.Object {
    /**
      * Request the ID for the public key configuration.
      */
    var Id: java.lang.String
  }
  
  trait GetPublicKeyConfigResult extends js.Object {
    /**
      * The current version of the public key configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the result for the public key configuration.
      */
    var PublicKeyConfig: js.UndefOr[PublicKeyConfig] = js.undefined
  }
  
  trait GetPublicKeyRequest extends js.Object {
    /**
      * Request the ID for the public key.
      */
    var Id: java.lang.String
  }
  
  trait GetPublicKeyResult extends js.Object {
    /**
      * The current version of the public key. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the public key.
      */
    var PublicKey: js.UndefOr[PublicKey] = js.undefined
  }
  
  trait GetStreamingDistributionConfigRequest extends js.Object {
    /**
      * The streaming distribution's ID.
      */
    var Id: java.lang.String
  }
  
  trait GetStreamingDistributionConfigResult extends js.Object {
    /**
      * The current version of the configuration. For example: E2QWRUHAPOMQZL. 
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The streaming distribution's configuration information.
      */
    var StreamingDistributionConfig: js.UndefOr[StreamingDistributionConfig] = js.undefined
  }
  
  trait GetStreamingDistributionRequest extends js.Object {
    /**
      * The streaming distribution's ID.
      */
    var Id: java.lang.String
  }
  
  trait GetStreamingDistributionResult extends js.Object {
    /**
      * The current version of the streaming distribution's information. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The streaming distribution's information.
      */
    var StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
  }
  
  trait Headers extends js.Object {
    /**
      * A list that contains one Name element for each header that you want CloudFront to use for caching in this cache behavior. If Quantity is 0, omit Items.
      */
    var Items: js.UndefOr[HeaderList] = js.undefined
    /**
      * The number of different headers that you want CloudFront to base caching on for this cache behavior. You can configure each cache behavior in a web distribution to do one of the following:    Forward all headers to your origin: Specify 1 for Quantity and * for Name.  CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront sends every request to the origin.      Forward a whitelist of headers you specify: Specify the number of headers that you want CloudFront to base caching on. Then specify the header names in Name elements. CloudFront caches your objects based on the values in the specified headers.    Forward only the default headers: Specify 0 for Quantity and omit Items. In this configuration, CloudFront doesn't cache based on the values in the request headers.   Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the origin is an S3 bucket or a custom origin. See the following documentation:    S3 bucket: See HTTP Request Headers That CloudFront Removes or Updates     Custom origin: See HTTP Request Headers and CloudFront Behavior   
      */
    var Quantity: integer
  }
  
  trait Invalidation extends js.Object {
    /**
      * The date and time the invalidation request was first made. 
      */
    var CreateTime: timestamp
    /**
      * The identifier for the invalidation request. For example: IDFDVBD632BHDS5.
      */
    var Id: java.lang.String
    /**
      * The current invalidation information for the batch request. 
      */
    var InvalidationBatch: InvalidationBatch
    /**
      * The status of the invalidation request. When the invalidation batch is finished, the status is Completed.
      */
    var Status: java.lang.String
  }
  
  trait InvalidationBatch extends js.Object {
    /**
      * A value that you specify to uniquely identify an invalidation request. CloudFront uses the value to prevent you from accidentally resubmitting an identical request. Whenever you create a new invalidation request, you must specify a new value for CallerReference and change other values in the request as applicable. One way to ensure that the value of CallerReference is unique is to use a timestamp, for example, 20120301090000. If you make a second invalidation request with the same value for CallerReference, and if the rest of the request is the same, CloudFront doesn't create a new invalidation request. Instead, CloudFront returns information about the invalidation request that you previously created with the same CallerReference. If CallerReference is a value you already sent in a previous invalidation batch request but the content of any Path is different from the original request, CloudFront returns an InvalidationBatchAlreadyExists error.
      */
    var CallerReference: java.lang.String
    /**
      * A complex type that contains information about the objects that you want to invalidate. For more information, see Specifying the Objects to Invalidate in the Amazon CloudFront Developer Guide. 
      */
    var Paths: Paths
  }
  
  trait InvalidationList extends js.Object {
    /**
      * A flag that indicates whether more invalidation batch requests remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more invalidation batches in the list.
      */
    var IsTruncated: scala.Boolean
    /**
      * A complex type that contains one InvalidationSummary element for each invalidation batch created by the current AWS account.
      */
    var Items: js.UndefOr[InvalidationSummaryList] = js.undefined
    /**
      * The value that you provided for the Marker request parameter.
      */
    var Marker: java.lang.String
    /**
      * The value that you provided for the MaxItems request parameter.
      */
    var MaxItems: integer
    /**
      * If IsTruncated is true, this element is present and contains the value that you can use for the Marker request parameter to continue listing your invalidation batches where they left off.
      */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of invalidation batches that were created by the current AWS account. 
      */
    var Quantity: integer
  }
  
  trait InvalidationSummary extends js.Object {
    /**
      * The time that an invalidation request was created.
      */
    var CreateTime: timestamp
    /**
      * The unique ID for an invalidation request.
      */
    var Id: java.lang.String
    /**
      * The status of an invalidation request.
      */
    var Status: java.lang.String
  }
  
  trait KeyPairIds extends js.Object {
    /**
      * A complex type that lists the active CloudFront key pairs, if any, that are associated with AwsAccountNumber. For more information, see ActiveTrustedSigners.
      */
    var Items: js.UndefOr[KeyPairIdList] = js.undefined
    /**
      * The number of active CloudFront key pairs for AwsAccountNumber. For more information, see ActiveTrustedSigners.
      */
    var Quantity: integer
  }
  
  trait LambdaFunctionAssociation extends js.Object {
    /**
      * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:    viewer-request: The function executes when CloudFront receives a request from a viewer and before it checks to see whether the requested object is in the edge cache.     origin-request: The function executes only when CloudFront forwards a request to your origin. When the requested object is in the edge cache, the function doesn't execute.    origin-response: The function executes after CloudFront receives a response from the origin and before it caches the object in the response. When the requested object is in the edge cache, the function doesn't execute.    viewer-response: The function executes before CloudFront returns the requested object to the viewer. The function executes regardless of whether the object was already in the edge cache. If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.  
      */
    var EventType: EventType
    /**
      * A flag that allows a Lambda function to have read access to the body content. For more information, see Accessing the Request Body by Choosing the Include Body Option in the Amazon CloudFront Developer Guide.
      */
    var IncludeBody: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda alias or $LATEST.
      */
    var LambdaFunctionARN: LambdaFunctionARN
  }
  
  trait LambdaFunctionAssociations extends js.Object {
    /**
      *  Optional: A complex type that contains LambdaFunctionAssociation items for this cache behavior. If Quantity is 0, you can omit Items.
      */
    var Items: js.UndefOr[LambdaFunctionAssociationList] = js.undefined
    /**
      * The number of Lambda function associations for this cache behavior.
      */
    var Quantity: integer
  }
  
  trait ListCloudFrontOriginAccessIdentitiesRequest extends js.Object {
    /**
      * Use this when paginating results to indicate where to begin in your list of origin access identities. The results include identities in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last identity on that page).
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of origin access identities you want in the response body. 
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListCloudFrontOriginAccessIdentitiesResult extends js.Object {
    /**
      * The CloudFrontOriginAccessIdentityList type. 
      */
    var CloudFrontOriginAccessIdentityList: js.UndefOr[CloudFrontOriginAccessIdentityList] = js.undefined
  }
  
  trait ListDistributionsByWebACLIdRequest extends js.Object {
    /**
      * Use Marker and MaxItems to control pagination of results. If you have more than MaxItems distributions that satisfy the request, the response includes a NextMarker element. To get the next page of results, submit another request. For the value of Marker, specify the value of NextMarker from the last response. (For the first request, omit Marker.) 
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of distributions that you want CloudFront to return in the response body. The maximum and default values are both 100.
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ID of the AWS WAF web ACL that you want to list the associated distributions. If you specify "null" for the ID, the request returns a list of the distributions that aren't associated with a web ACL. 
      */
    var WebACLId: java.lang.String
  }
  
  trait ListDistributionsByWebACLIdResult extends js.Object {
    /**
      * The DistributionList type. 
      */
    var DistributionList: js.UndefOr[DistributionList] = js.undefined
  }
  
  trait ListDistributionsRequest extends js.Object {
    /**
      * Use this when paginating results to indicate where to begin in your list of distributions. The results include distributions in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last distribution on that page).
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of distributions you want in the response body.
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListDistributionsResult extends js.Object {
    /**
      * The DistributionList type. 
      */
    var DistributionList: js.UndefOr[DistributionList] = js.undefined
  }
  
  trait ListFieldLevelEncryptionConfigsRequest extends js.Object {
    /**
      * Use this when paginating results to indicate where to begin in your list of configurations. The results include configurations in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last configuration on that page). 
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of field-level encryption configurations you want in the response body. 
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListFieldLevelEncryptionConfigsResult extends js.Object {
    /**
      * Returns a list of all field-level encryption configurations that have been created in CloudFront for this account.
      */
    var FieldLevelEncryptionList: js.UndefOr[FieldLevelEncryptionList] = js.undefined
  }
  
  trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
    /**
      * Use this when paginating results to indicate where to begin in your list of profiles. The results include profiles in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last profile on that page). 
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of field-level encryption profiles you want in the response body. 
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListFieldLevelEncryptionProfilesResult extends js.Object {
    /**
      * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
      */
    var FieldLevelEncryptionProfileList: js.UndefOr[FieldLevelEncryptionProfileList] = js.undefined
  }
  
  trait ListInvalidationsRequest extends js.Object {
    /**
      * The distribution's ID.
      */
    var DistributionId: java.lang.String
    /**
      * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches. Because the results are returned in decreasing order from most recent to oldest, the most recent results are on the first page, the second page will contain earlier results, and so on. To get the next page of results, set Marker to the value of the NextMarker from the current page's response. This value is the same as the ID of the last invalidation batch on that page. 
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of invalidation batches that you want in the response body.
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListInvalidationsResult extends js.Object {
    /**
      * Information about invalidation batches. 
      */
    var InvalidationList: js.UndefOr[InvalidationList] = js.undefined
  }
  
  trait ListPublicKeysRequest extends js.Object {
    /**
      * Use this when paginating results to indicate where to begin in your list of public keys. The results include public keys in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last public key on that page). 
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of public keys you want in the response body. 
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListPublicKeysResult extends js.Object {
    /**
      * Returns a list of all public keys that have been added to CloudFront for this account.
      */
    var PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
  }
  
  trait ListStreamingDistributionsRequest extends js.Object {
    /**
      * The value that you provided for the Marker request parameter.
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The value that you provided for the MaxItems request parameter.
      */
    var MaxItems: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListStreamingDistributionsResult extends js.Object {
    /**
      * The StreamingDistributionList type. 
      */
    var StreamingDistributionList: js.UndefOr[StreamingDistributionList] = js.undefined
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      *  An ARN of a CloudFront resource.
      */
    var Resource: ResourceARN
  }
  
  trait ListTagsForResourceResult extends js.Object {
    /**
      *  A complex type that contains zero or more Tag elements.
      */
    var Tags: Tags
  }
  
  trait LoggingConfig extends js.Object {
    /**
      * The Amazon S3 bucket to store the access logs in, for example, myawslogbucket.s3.amazonaws.com.
      */
    var Bucket: java.lang.String
    /**
      * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable logging when you create a distribution or if you want to disable logging for an existing distribution, specify false for Enabled, and specify empty Bucket and Prefix elements. If you specify false for Enabled but you specify values for Bucket, prefix, and IncludeCookies, the values are automatically deleted.
      */
    var Enabled: scala.Boolean
    /**
      * Specifies whether you want CloudFront to include cookies in access logs, specify true for IncludeCookies. If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you configure the cache behaviors for this distribution. If you don't want to include cookies when you create a distribution or if you want to disable include cookies for an existing distribution, specify false for IncludeCookies.
      */
    var IncludeCookies: scala.Boolean
    /**
      * An optional string that you want CloudFront to prefix to the access log filenames for this distribution, for example, myprefix/. If you want to enable logging, but you don't want to specify a prefix, you still must include an empty Prefix element in the Logging element.
      */
    var Prefix: java.lang.String
  }
  
  trait Origin extends js.Object {
    /**
      * A complex type that contains names and values for the custom headers that you want.
      */
    var CustomHeaders: js.UndefOr[CustomHeaders] = js.undefined
    /**
      * A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use the S3OriginConfig element instead.
      */
    var CustomOriginConfig: js.UndefOr[CustomOriginConfig] = js.undefined
    /**
      *  Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this origin, for example, myawsbucket.s3.amazonaws.com. If you set up your bucket to be configured as a website endpoint, enter the Amazon S3 static website hosting endpoint for the bucket. For more information about specifying this value for different types of origins, see Origin Domain Name in the Amazon CloudFront Developer Guide. Constraints for Amazon S3 origins:    If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the s3-accelerate endpoint for DomainName.   The bucket name must be between 3 and 63 characters long (inclusive).   The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.   The bucket name must not contain adjacent periods.    Custom Origins: The DNS domain name for the HTTP server from which you want CloudFront to get objects for this origin, for example, www.example.com.  Constraints for custom origins:    DomainName must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or underscore (_) characters.   The name cannot exceed 128 characters.  
      */
    var DomainName: java.lang.String
    /**
      * A unique identifier for the origin or origin group. The value of Id must be unique within the distribution. When you specify the value of TargetOriginId for the default cache behavior or for another cache behavior, you indicate the origin to which you want the cache behavior to route requests by specifying the value of the Id element for that origin. When a request matches the path pattern for that cache behavior, CloudFront routes the request to the specified origin. For more information, see Cache Behavior Settings in the Amazon CloudFront Developer Guide.
      */
    var Id: java.lang.String
    /**
      * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or your custom origin. When you include the OriginPath element, specify the directory name, beginning with a /. CloudFront appends the directory name to the value of DomainName, for example, example.com/production. Do not include a / at the end of the directory name. For example, suppose you've specified the following values for your distribution:    DomainName: An Amazon S3 bucket named myawsbucket.    OriginPath: /production     CNAME: example.com    When a user enters example.com/index.html in a browser, CloudFront sends a request to Amazon S3 for myawsbucket/production/index.html. When a user enters example.com/acme/index.html in a browser, CloudFront sends a request to Amazon S3 for myawsbucket/production/acme/index.html.
      */
    var OriginPath: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the CustomOriginConfig element instead.
      */
    var S3OriginConfig: js.UndefOr[S3OriginConfig] = js.undefined
  }
  
  trait OriginCustomHeader extends js.Object {
    /**
      * The name of a header that you want CloudFront to forward to your origin. For more information, see Forwarding Custom Headers to Your Origin (Web Distributions Only) in the Amazon Amazon CloudFront Developer Guide.
      */
    var HeaderName: java.lang.String
    /**
      * The value for the header that you specified in the HeaderName field.
      */
    var HeaderValue: java.lang.String
  }
  
  trait OriginGroup extends js.Object {
    /**
      * A complex type that contains information about the failover criteria for an origin group.
      */
    var FailoverCriteria: OriginGroupFailoverCriteria
    /**
      * The origin group's ID.
      */
    var Id: java.lang.String
    /**
      * A complex type that contains information about the origins in an origin group.
      */
    var Members: OriginGroupMembers
  }
  
  trait OriginGroupFailoverCriteria extends js.Object {
    /**
      * The status codes that, when returned from the primary origin, will trigger CloudFront to failover to the second origin.
      */
    var StatusCodes: StatusCodes
  }
  
  trait OriginGroupMember extends js.Object {
    /**
      * The ID for an origin in an origin group.
      */
    var OriginId: java.lang.String
  }
  
  trait OriginGroupMembers extends js.Object {
    /**
      * Items (origins) in an origin group.
      */
    var Items: OriginGroupMemberList
    /**
      * The number of origins in an origin group.
      */
    var Quantity: integer
  }
  
  trait OriginGroups extends js.Object {
    /**
      * The items (origin groups) in a distribution.
      */
    var Items: js.UndefOr[OriginGroupList] = js.undefined
    /**
      * The number of origin groups.
      */
    var Quantity: integer
  }
  
  trait OriginSslProtocols extends js.Object {
    /**
      * A list that contains allowed SSL/TLS protocols for this distribution.
      */
    var Items: SslProtocolsList
    /**
      * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection with this origin. 
      */
    var Quantity: integer
  }
  
  trait Origins extends js.Object {
    /**
      * A complex type that contains origins or origin groups for this distribution.
      */
    var Items: OriginList
    /**
      * The number of origins or origin groups for this distribution.
      */
    var Quantity: integer
  }
  
  trait Paths extends js.Object {
    /**
      * A complex type that contains a list of the paths that you want to invalidate.
      */
    var Items: js.UndefOr[PathList] = js.undefined
    /**
      * The number of objects that you want to invalidate.
      */
    var Quantity: integer
  }
  
  trait PublicKey extends js.Object {
    /**
      * A time you added a public key to CloudFront.
      */
    var CreatedTime: timestamp
    /**
      * A unique ID assigned to a public key you've added to CloudFront.
      */
    var Id: java.lang.String
    /**
      * A complex data type for a public key you add to CloudFront to use with features like field-level encryption.
      */
    var PublicKeyConfig: PublicKeyConfig
  }
  
  trait PublicKeyConfig extends js.Object {
    /**
      * A unique number that ensures that the request can't be replayed.
      */
    var CallerReference: java.lang.String
    /**
      * An optional comment about a public key.
      */
    var Comment: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
      */
    var EncodedKey: java.lang.String
    /**
      * The name for a public key you add to CloudFront to use with features like field-level encryption.
      */
    var Name: java.lang.String
  }
  
  trait PublicKeyList extends js.Object {
    /**
      * An array of information about a public key you add to CloudFront to use with features like field-level encryption.
      */
    var Items: js.UndefOr[PublicKeySummaryList] = js.undefined
    /**
      * The maximum number of public keys you want in the response body. 
      */
    var MaxItems: integer
    /**
      * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your public keys where you left off.
      */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of public keys you added to CloudFront to use with features like field-level encryption.
      */
    var Quantity: integer
  }
  
  trait PublicKeySummary extends js.Object {
    /**
      *  Comment for public key information summary. 
      */
    var Comment: js.UndefOr[java.lang.String] = js.undefined
    /**
      *  Creation time for public key information summary. 
      */
    var CreatedTime: timestamp
    /**
      *  Encoded key for public key information summary. 
      */
    var EncodedKey: java.lang.String
    /**
      *  ID for public key information summary. 
      */
    var Id: java.lang.String
    /**
      *  Name for public key information summary. 
      */
    var Name: java.lang.String
  }
  
  trait QueryArgProfile extends js.Object {
    /**
      * ID of profile to use for field-level encryption query argument-profile mapping
      */
    var ProfileId: java.lang.String
    /**
      * Query argument for field-level encryption query argument-profile mapping.
      */
    var QueryArg: java.lang.String
  }
  
  trait QueryArgProfileConfig extends js.Object {
    /**
      * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level encryption query argument, fle-profile, is unknown.
      */
    var ForwardWhenQueryArgProfileIsUnknown: scala.Boolean
    /**
      * Profiles specified for query argument-profile mapping for field-level encryption.
      */
    var QueryArgProfiles: js.UndefOr[QueryArgProfiles] = js.undefined
  }
  
  trait QueryArgProfiles extends js.Object {
    /**
      * Number of items for query argument-profile mapping for field-level encryption.
      */
    var Items: js.UndefOr[QueryArgProfileList] = js.undefined
    /**
      * Number of profiles for query argument-profile mapping for field-level encryption.
      */
    var Quantity: integer
  }
  
  trait QueryStringCacheKeys extends js.Object {
    /**
      * (Optional) A list that contains the query string parameters that you want CloudFront to use as a basis for caching for this cache behavior. If Quantity is 0, you can omit Items. 
      */
    var Items: js.UndefOr[QueryStringCacheKeysList] = js.undefined
    /**
      * The number of whitelisted query string parameters for this cache behavior.
      */
    var Quantity: integer
  }
  
  trait Restrictions extends js.Object {
    var GeoRestriction: GeoRestriction
  }
  
  trait S3Origin extends js.Object {
    /**
      * The DNS name of the Amazon S3 origin. 
      */
    var DomainName: java.lang.String
    /**
      * The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access identity to configure the distribution so that end users can only access objects in an Amazon S3 bucket through CloudFront. If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify an empty OriginAccessIdentity element. To delete the origin access identity from an existing distribution, update the distribution configuration and include an empty OriginAccessIdentity element. To replace the origin access identity, update the distribution configuration and specify the new origin access identity. For more information, see Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content in the Amazon Amazon CloudFront Developer Guide.
      */
    var OriginAccessIdentity: java.lang.String
  }
  
  trait S3OriginConfig extends js.Object {
    /**
      * The CloudFront origin access identity to associate with the origin. Use an origin access identity to configure the origin so that viewers can only access objects in an Amazon S3 bucket through CloudFront. The format of the value is: origin-access-identity/cloudfront/ID-of-origin-access-identity  where  ID-of-origin-access-identity  is the value that CloudFront returned in the ID element when you created the origin access identity. If you want viewers to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify an empty OriginAccessIdentity element. To delete the origin access identity from an existing distribution, update the distribution configuration and include an empty OriginAccessIdentity element. To replace the origin access identity, update the distribution configuration and specify the new origin access identity. For more information about the origin access identity, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
      */
    var OriginAccessIdentity: java.lang.String
  }
  
  @js.native
  class Signer protected () extends js.Object {
    /**
      * A signer object can be used to generate signed URLs and cookies for granting access to content on restricted CloudFront distributions.
      * 
      * @param {string} keyPairId - The ID of the CloudFront key pair being used.
      * @param {string} privateKey - A private key in RSA format.
      */
    def this(keyPairId: java.lang.String, privateKey: java.lang.String) = this()
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy): awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CustomPolicy = js.native
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(
      options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy,
      callback: js.Function2[
          /* err */ nodeLib.Error, 
          /* cookie */ awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CustomPolicy, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy): awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CannedPolicy = js.native
    /**
      * Create a signed Amazon CloudFront Cookie.
      */
    def getSignedCookie(
      options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy,
      callback: js.Function2[
          /* err */ nodeLib.Error, 
          /* cookie */ awsDashSdkLib.libCloudfrontSignerMod.SignerNs.CannedPolicy, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    /**
      * Create a signed Amazon CloudFront URL.
      * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
      */
    def getSignedUrl(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy): java.lang.String = js.native
    /**
      * Create a signed Amazon CloudFront URL.
      * Keep in mind that URLs meant for use in media/flash players may have different requirements for URL formats (e.g. some require that the extension be removed, some require the file name to be prefixed - mp4:, some require you to add "/cfx/st" into your URL).
      */
    def getSignedUrl(
      options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithPolicy,
      callback: js.Function2[/* err */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
    def getSignedUrl(options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy): java.lang.String = js.native
    def getSignedUrl(
      options: awsDashSdkLib.libCloudfrontSignerMod.SignerNs.SignerOptionsWithoutPolicy,
      callback: js.Function2[/* err */ nodeLib.Error, /* url */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
  }
  
  trait StatusCodes extends js.Object {
    /**
      * The items (status codes) for an origin group.
      */
    var Items: StatusCodeList
    /**
      * The number of status codes.
      */
    var Quantity: integer
  }
  
  trait StreamingDistribution extends js.Object {
    /**
      * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
      */
    var ARN: java.lang.String
    /**
      * A complex type that lists the AWS accounts, if any, that you included in the TrustedSigners complex type for this distribution. These are the accounts that you want to allow to create signed URLs for private content. The Signer complex type lists the AWS account number of the trusted signer or self if the signer is the AWS account that created the distribution. The Signer element also includes the IDs of any active CloudFront key pairs that are associated with the trusted signer's AWS account. If no KeyPairId element appears for a Signer, that signer can't create signed URLs. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
      */
    var ActiveTrustedSigners: ActiveTrustedSigners
    /**
      * The domain name that corresponds to the streaming distribution, for example, s5c39gqb8ow64r.cloudfront.net. 
      */
    var DomainName: java.lang.String
    /**
      * The identifier for the RTMP distribution. For example: EGTXBD79EXAMPLE.
      */
    var Id: java.lang.String
    /**
      * The date and time that the distribution was last modified. 
      */
    var LastModifiedTime: js.UndefOr[timestamp] = js.undefined
    /**
      * The current status of the RTMP distribution. When the status is Deployed, the distribution's information is propagated to all CloudFront edge locations.
      */
    var Status: java.lang.String
    /**
      * The current configuration information for the RTMP distribution.
      */
    var StreamingDistributionConfig: StreamingDistributionConfig
  }
  
  trait StreamingDistributionConfig extends js.Object {
    /**
      * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming distribution. 
      */
    var Aliases: js.UndefOr[Aliases] = js.undefined
    /**
      * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed. If the value of CallerReference is new (regardless of the content of the StreamingDistributionConfig object), CloudFront creates a new distribution. If CallerReference is a value that you already sent in a previous request to create a distribution, CloudFront returns a DistributionAlreadyExists error.
      */
    var CallerReference: java.lang.String
    /**
      * Any comments you want to include about the streaming distribution. 
      */
    var Comment: java.lang.String
    /**
      * Whether the streaming distribution is enabled to accept user requests for content.
      */
    var Enabled: scala.Boolean
    /**
      * A complex type that controls whether access logs are written for the streaming distribution. 
      */
    var Logging: js.UndefOr[StreamingLoggingConfig] = js.undefined
    /**
      * A complex type that contains information about price class for this streaming distribution. 
      */
    var PriceClass: js.UndefOr[PriceClass] = js.undefined
    /**
      * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution. 
      */
    var S3Origin: S3Origin
    /**
      * A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private content. If you want the distribution to use signed URLs, include this element; if you want the distribution to use public URLs, remove this element. For more information, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide. 
      */
    var TrustedSigners: TrustedSigners
  }
  
  trait StreamingDistributionConfigWithTags extends js.Object {
    /**
      * A streaming distribution Configuration.
      */
    var StreamingDistributionConfig: StreamingDistributionConfig
    /**
      * A complex type that contains zero or more Tag elements.
      */
    var Tags: Tags
  }
  
  trait StreamingDistributionList extends js.Object {
    /**
      * A flag that indicates whether more streaming distributions remain to be listed. If your results were truncated, you can make a follow-up pagination request using the Marker request parameter to retrieve more distributions in the list. 
      */
    var IsTruncated: scala.Boolean
    /**
      * A complex type that contains one StreamingDistributionSummary element for each distribution that was created by the current AWS account.
      */
    var Items: js.UndefOr[StreamingDistributionSummaryList] = js.undefined
    /**
      * The value you provided for the Marker request parameter. 
      */
    var Marker: java.lang.String
    /**
      * The value you provided for the MaxItems request parameter. 
      */
    var MaxItems: integer
    /**
      * If IsTruncated is true, this element is present and contains the value you can use for the Marker request parameter to continue listing your RTMP distributions where they left off. 
      */
    var NextMarker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of streaming distributions that were created by the current AWS account. 
      */
    var Quantity: integer
  }
  
  trait StreamingDistributionSummary extends js.Object {
    /**
      *  The ARN (Amazon Resource Name) for the streaming distribution. For example: arn:aws:cloudfront::123456789012:streaming-distribution/EDFDVBD632BHDS5, where 123456789012 is your AWS account ID.
      */
    var ARN: java.lang.String
    /**
      * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming distribution.
      */
    var Aliases: Aliases
    /**
      * The comment originally specified when this distribution was created.
      */
    var Comment: java.lang.String
    /**
      * The domain name corresponding to the distribution, for example, d111111abcdef8.cloudfront.net.
      */
    var DomainName: java.lang.String
    /**
      * Whether the distribution is enabled to accept end user requests for content.
      */
    var Enabled: scala.Boolean
    /**
      * The identifier for the distribution, for example, EDFDVBD632BHDS5.
      */
    var Id: java.lang.String
    /**
      * The date and time the distribution was last modified.
      */
    var LastModifiedTime: timestamp
    /**
      * 
      */
    var PriceClass: PriceClass
    /**
      * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media files for distribution.
      */
    var S3Origin: S3Origin
    /**
      *  Indicates the current status of the distribution. When the status is Deployed, the distribution's information is fully propagated throughout the Amazon CloudFront system.
      */
    var Status: java.lang.String
    /**
      * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items.If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
      */
    var TrustedSigners: TrustedSigners
  }
  
  trait StreamingLoggingConfig extends js.Object {
    /**
      * The Amazon S3 bucket to store the access logs in, for example, myawslogbucket.s3.amazonaws.com.
      */
    var Bucket: java.lang.String
    /**
      * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable logging when you create a streaming distribution or if you want to disable logging for an existing streaming distribution, specify false for Enabled, and specify empty Bucket and Prefix elements. If you specify false for Enabled but you specify values for Bucket and Prefix, the values are automatically deleted. 
      */
    var Enabled: scala.Boolean
    /**
      * An optional string that you want CloudFront to prefix to the access log filenames for this streaming distribution, for example, myprefix/. If you want to enable logging, but you don't want to specify a prefix, you still must include an empty Prefix element in the Logging element.
      */
    var Prefix: java.lang.String
  }
  
  trait Tag extends js.Object {
    /**
      *  A string that contains Tag key. The string length should be between 1 and 128 characters. Valid characters include a-z, A-Z, 0-9, space, and the special characters _ - . : / = + @.
      */
    var Key: TagKey
    /**
      *  A string that contains an optional Tag value. The string length should be between 0 and 256 characters. Valid characters include a-z, A-Z, 0-9, space, and the special characters _ - . : / = + @.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TagKeys extends js.Object {
    /**
      *  A complex type that contains Tag key elements.
      */
    var Items: js.UndefOr[TagKeyList] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      *  An ARN of a CloudFront resource.
      */
    var Resource: ResourceARN
    /**
      *  A complex type that contains zero or more Tag elements.
      */
    var Tags: Tags
  }
  
  trait Tags extends js.Object {
    /**
      *  A complex type that contains Tag elements.
      */
    var Items: js.UndefOr[TagList] = js.undefined
  }
  
  trait TrustedSigners extends js.Object {
    /**
      * Specifies whether you want to require viewers to use signed URLs to access the files specified by PathPattern and TargetOriginId.
      */
    var Enabled: scala.Boolean
    /**
      *  Optional: A complex type that contains trusted signers for this cache behavior. If Quantity is 0, you can omit Items.
      */
    var Items: js.UndefOr[AwsAccountNumberList] = js.undefined
    /**
      * The number of trusted signers for this cache behavior.
      */
    var Quantity: integer
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServicesCloudfrontMod.CloudFrontCustomizations {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
      */
    def createCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCloudFrontOriginAccessIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCloudFrontOriginAccessIdentityResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
      */
    def createCloudFrontOriginAccessIdentity(params: CreateCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCloudFrontOriginAccessIdentity(
      params: CreateCloudFrontOriginAccessIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCloudFrontOriginAccessIdentityResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
      */
    def createDistribution(): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDistribution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  If you are using Adobe Flash Media Server's RTMP protocol, you set up a different kind of CloudFront distribution. For more information, see CreateStreamingDistribution.
      */
    def createDistribution(params: CreateDistributionRequest): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDistribution(
      params: CreateDistributionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new distribution with tags.
      */
    def createDistributionWithTags(): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDistributionWithTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDistributionWithTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new distribution with tags.
      */
    def createDistributionWithTags(params: CreateDistributionWithTagsRequest): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDistributionWithTags(
      params: CreateDistributionWithTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDistributionWithTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new field-level encryption configuration.
      */
    def createFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFieldLevelEncryptionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFieldLevelEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new field-level encryption configuration.
      */
    def createFieldLevelEncryptionConfig(params: CreateFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFieldLevelEncryptionConfig(
      params: CreateFieldLevelEncryptionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFieldLevelEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a field-level encryption profile.
      */
    def createFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFieldLevelEncryptionProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFieldLevelEncryptionProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a field-level encryption profile.
      */
    def createFieldLevelEncryptionProfile(params: CreateFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFieldLevelEncryptionProfile(
      params: CreateFieldLevelEncryptionProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFieldLevelEncryptionProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new invalidation. 
      */
    def createInvalidation(): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInvalidation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInvalidationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new invalidation. 
      */
    def createInvalidation(params: CreateInvalidationRequest): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createInvalidation(
      params: CreateInvalidationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateInvalidationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
      */
    def createPublicKey(): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPublicKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePublicKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
      */
    def createPublicKey(params: CreatePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPublicKey(
      params: CreatePublicKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePublicKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
      */
    def createStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamingDistribution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new web distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
      */
    def createStreamingDistribution(params: CreateStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamingDistribution(
      params: CreateStreamingDistributionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new streaming distribution with tags.
      */
    def createStreamingDistributionWithTags(): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamingDistributionWithTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamingDistributionWithTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Create a new streaming distribution with tags.
      */
    def createStreamingDistributionWithTags(params: CreateStreamingDistributionWithTagsRequest): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStreamingDistributionWithTags(
      params: CreateStreamingDistributionWithTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStreamingDistributionWithTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStreamingDistributionWithTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an origin access identity. 
      */
    def deleteCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCloudFrontOriginAccessIdentity(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete an origin access identity. 
      */
    def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCloudFrontOriginAccessIdentity(
      params: DeleteCloudFrontOriginAccessIdentityRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a distribution. 
      */
    def deleteDistribution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDistribution(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a distribution. 
      */
    def deleteDistribution(params: DeleteDistributionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDistribution(
      params: DeleteDistributionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a field-level encryption configuration.
      */
    def deleteFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFieldLevelEncryptionConfig(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a field-level encryption configuration.
      */
    def deleteFieldLevelEncryptionConfig(params: DeleteFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFieldLevelEncryptionConfig(
      params: DeleteFieldLevelEncryptionConfigRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a field-level encryption profile.
      */
    def deleteFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFieldLevelEncryptionProfile(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a field-level encryption profile.
      */
    def deleteFieldLevelEncryptionProfile(params: DeleteFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFieldLevelEncryptionProfile(
      params: DeleteFieldLevelEncryptionProfileRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a public key you previously added to CloudFront.
      */
    def deletePublicKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePublicKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove a public key you previously added to CloudFront.
      */
    def deletePublicKey(params: DeletePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePublicKey(
      params: DeletePublicKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
      */
    def deleteStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStreamingDistribution(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
      */
    def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStreamingDistribution(
      params: DeleteStreamingDistributionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the information about an origin access identity. 
      */
    def getCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCloudFrontOriginAccessIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCloudFrontOriginAccessIdentityResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the information about an origin access identity. 
      */
    def getCloudFrontOriginAccessIdentity(params: GetCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCloudFrontOriginAccessIdentity(
      params: GetCloudFrontOriginAccessIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCloudFrontOriginAccessIdentityResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the configuration information about an origin access identity. 
      */
    def getCloudFrontOriginAccessIdentityConfig(): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCloudFrontOriginAccessIdentityConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCloudFrontOriginAccessIdentityConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the configuration information about an origin access identity. 
      */
    def getCloudFrontOriginAccessIdentityConfig(params: GetCloudFrontOriginAccessIdentityConfigRequest): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getCloudFrontOriginAccessIdentityConfig(
      params: GetCloudFrontOriginAccessIdentityConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetCloudFrontOriginAccessIdentityConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetCloudFrontOriginAccessIdentityConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the information about a distribution. 
      */
    def getDistribution(): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDistribution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the information about a distribution. 
      */
    def getDistribution(params: GetDistributionRequest): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDistribution(
      params: GetDistributionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the configuration information about a distribution. 
      */
    def getDistributionConfig(): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDistributionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDistributionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the configuration information about a distribution. 
      */
    def getDistributionConfig(params: GetDistributionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDistributionConfig(
      params: GetDistributionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDistributionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption configuration information.
      */
    def getFieldLevelEncryption(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryption(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption configuration information.
      */
    def getFieldLevelEncryption(params: GetFieldLevelEncryptionRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryption(
      params: GetFieldLevelEncryptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption configuration information.
      */
    def getFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryptionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption configuration information.
      */
    def getFieldLevelEncryptionConfig(params: GetFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryptionConfig(
      params: GetFieldLevelEncryptionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption profile information.
      */
    def getFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryptionProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption profile information.
      */
    def getFieldLevelEncryptionProfile(params: GetFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryptionProfile(
      params: GetFieldLevelEncryptionProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption profile configuration information.
      */
    def getFieldLevelEncryptionProfileConfig(): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryptionProfileConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionProfileConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the field-level encryption profile configuration information.
      */
    def getFieldLevelEncryptionProfileConfig(params: GetFieldLevelEncryptionProfileConfigRequest): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getFieldLevelEncryptionProfileConfig(
      params: GetFieldLevelEncryptionProfileConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFieldLevelEncryptionProfileConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFieldLevelEncryptionProfileConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the information about an invalidation. 
      */
    def getInvalidation(): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInvalidation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvalidationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the information about an invalidation. 
      */
    def getInvalidation(params: GetInvalidationRequest): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInvalidation(
      params: GetInvalidationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvalidationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the public key information.
      */
    def getPublicKey(): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the public key information.
      */
    def getPublicKey(params: GetPublicKeyRequest): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicKey(
      params: GetPublicKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Return public key configuration informaation
      */
    def getPublicKeyConfig(): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicKeyConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicKeyConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Return public key configuration informaation
      */
    def getPublicKeyConfig(params: GetPublicKeyConfigRequest): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicKeyConfig(
      params: GetPublicKeyConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicKeyConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicKeyConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified RTMP distribution, including the distribution configuration.
      */
    def getStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStreamingDistribution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about a specified RTMP distribution, including the distribution configuration.
      */
    def getStreamingDistribution(params: GetStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStreamingDistribution(
      params: GetStreamingDistributionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the configuration information about a streaming distribution. 
      */
    def getStreamingDistributionConfig(): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStreamingDistributionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStreamingDistributionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Get the configuration information about a streaming distribution. 
      */
    def getStreamingDistributionConfig(params: GetStreamingDistributionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStreamingDistributionConfig(
      params: GetStreamingDistributionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStreamingDistributionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists origin access identities.
      */
    def listCloudFrontOriginAccessIdentities(): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCloudFrontOriginAccessIdentities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCloudFrontOriginAccessIdentitiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists origin access identities.
      */
    def listCloudFrontOriginAccessIdentities(params: ListCloudFrontOriginAccessIdentitiesRequest): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listCloudFrontOriginAccessIdentities(
      params: ListCloudFrontOriginAccessIdentitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCloudFrontOriginAccessIdentitiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCloudFrontOriginAccessIdentitiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List distributions. 
      */
    def listDistributions(): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDistributions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDistributionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List distributions. 
      */
    def listDistributions(params: ListDistributionsRequest): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDistributions(
      params: ListDistributionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDistributionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the distributions that are associated with a specified AWS WAF web ACL. 
      */
    def listDistributionsByWebACLId(): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDistributionsByWebACLId(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDistributionsByWebACLIdResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List the distributions that are associated with a specified AWS WAF web ACL. 
      */
    def listDistributionsByWebACLId(params: ListDistributionsByWebACLIdRequest): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDistributionsByWebACLId(
      params: ListDistributionsByWebACLIdRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDistributionsByWebACLIdResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDistributionsByWebACLIdResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all field-level encryption configurations that have been created in CloudFront for this account.
      */
    def listFieldLevelEncryptionConfigs(): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFieldLevelEncryptionConfigs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFieldLevelEncryptionConfigsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all field-level encryption configurations that have been created in CloudFront for this account.
      */
    def listFieldLevelEncryptionConfigs(params: ListFieldLevelEncryptionConfigsRequest): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFieldLevelEncryptionConfigs(
      params: ListFieldLevelEncryptionConfigsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFieldLevelEncryptionConfigsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionConfigsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
      */
    def listFieldLevelEncryptionProfiles(): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFieldLevelEncryptionProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFieldLevelEncryptionProfilesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
      */
    def listFieldLevelEncryptionProfiles(params: ListFieldLevelEncryptionProfilesRequest): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFieldLevelEncryptionProfiles(
      params: ListFieldLevelEncryptionProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFieldLevelEncryptionProfilesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFieldLevelEncryptionProfilesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists invalidation batches. 
      */
    def listInvalidations(): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInvalidations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInvalidationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists invalidation batches. 
      */
    def listInvalidations(params: ListInvalidationsRequest): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listInvalidations(
      params: ListInvalidationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListInvalidationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListInvalidationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all public keys that have been added to CloudFront for this account.
      */
    def listPublicKeys(): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPublicKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPublicKeysResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List all public keys that have been added to CloudFront for this account.
      */
    def listPublicKeys(params: ListPublicKeysRequest): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listPublicKeys(
      params: ListPublicKeysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPublicKeysResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPublicKeysResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List streaming distributions. 
      */
    def listStreamingDistributions(): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreamingDistributions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamingDistributionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List streaming distributions. 
      */
    def listStreamingDistributions(params: ListStreamingDistributionsRequest): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStreamingDistributions(
      params: ListStreamingDistributionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStreamingDistributionsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStreamingDistributionsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List tags for a CloudFront resource.
      */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * List tags for a CloudFront resource.
      */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add tags to a CloudFront resource.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Add tags to a CloudFront resource.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove tags from a CloudFront resource.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Remove tags from a CloudFront resource.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an origin access identity. 
      */
    def updateCloudFrontOriginAccessIdentity(): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCloudFrontOriginAccessIdentity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCloudFrontOriginAccessIdentityResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update an origin access identity. 
      */
    def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCloudFrontOriginAccessIdentity(
      params: UpdateCloudFrontOriginAccessIdentityRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCloudFrontOriginAccessIdentityResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCloudFrontOriginAccessIdentityResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
      */
    def updateDistribution(): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDistribution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
      */
    def updateDistribution(params: UpdateDistributionRequest): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDistribution(
      params: UpdateDistributionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a field-level encryption configuration. 
      */
    def updateFieldLevelEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFieldLevelEncryptionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFieldLevelEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a field-level encryption configuration. 
      */
    def updateFieldLevelEncryptionConfig(params: UpdateFieldLevelEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFieldLevelEncryptionConfig(
      params: UpdateFieldLevelEncryptionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFieldLevelEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a field-level encryption profile. 
      */
    def updateFieldLevelEncryptionProfile(): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFieldLevelEncryptionProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFieldLevelEncryptionProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a field-level encryption profile. 
      */
    def updateFieldLevelEncryptionProfile(params: UpdateFieldLevelEncryptionProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFieldLevelEncryptionProfile(
      params: UpdateFieldLevelEncryptionProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFieldLevelEncryptionProfileResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFieldLevelEncryptionProfileResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update public key information. Note that the only value you can change is the comment.
      */
    def updatePublicKey(): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePublicKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePublicKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update public key information. Note that the only value you can change is the comment.
      */
    def updatePublicKey(params: UpdatePublicKeyRequest): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updatePublicKey(
      params: UpdatePublicKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePublicKeyResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePublicKeyResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a streaming distribution. 
      */
    def updateStreamingDistribution(): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStreamingDistribution(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Update a streaming distribution. 
      */
    def updateStreamingDistribution(params: UpdateStreamingDistributionRequest): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStreamingDistribution(
      params: UpdateStreamingDistributionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
      */
    @JSName("waitFor")
    def waitFor_distributionDeployed(state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_distributionDeployed(
      state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 25 times). Wait until a distribution is deployed.
      */
    @JSName("waitFor")
    def waitFor_distributionDeployed(
      state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
      params: GetDistributionRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_distributionDeployed(
      state: awsDashSdkLib.awsDashSdkLibStrings.distributionDeployed,
      params: GetDistributionRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
      */
    @JSName("waitFor")
    def waitFor_invalidationCompleted(state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_invalidationCompleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvalidationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
      */
    @JSName("waitFor")
    def waitFor_invalidationCompleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
      params: GetInvalidationRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_invalidationCompleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.invalidationCompleted,
      params: GetInvalidationRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvalidationResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvalidationResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
      */
    @JSName("waitFor")
    def waitFor_streamingDistributionDeployed(state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_streamingDistributionDeployed(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
      */
    @JSName("waitFor")
    def waitFor_streamingDistributionDeployed(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
      params: GetStreamingDistributionRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_streamingDistributionDeployed(
      state: awsDashSdkLib.awsDashSdkLibStrings.streamingDistributionDeployed,
      params: GetStreamingDistributionRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStreamingDistributionResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStreamingDistributionResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      *  An ARN of a CloudFront resource.
      */
    var Resource: ResourceARN
    /**
      *  A complex type that contains zero or more Tag key elements.
      */
    var TagKeys: TagKeys
  }
  
  trait UpdateCloudFrontOriginAccessIdentityRequest extends js.Object {
    /**
      * The identity's configuration information.
      */
    var CloudFrontOriginAccessIdentityConfig: CloudFrontOriginAccessIdentityConfig
    /**
      * The identity's id.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the identity's configuration. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateCloudFrontOriginAccessIdentityResult extends js.Object {
    /**
      * The origin access identity's information.
      */
    var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined
    /**
      * The current version of the configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateDistributionRequest extends js.Object {
    /**
      * The distribution's configuration information.
      */
    var DistributionConfig: DistributionConfig
    /**
      * The distribution's id.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the distribution's configuration. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateDistributionResult extends js.Object {
    /**
      * The distribution's information.
      */
    var Distribution: js.UndefOr[Distribution] = js.undefined
    /**
      * The current version of the configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateFieldLevelEncryptionConfigRequest extends js.Object {
    /**
      * Request to update a field-level encryption configuration. 
      */
    var FieldLevelEncryptionConfig: FieldLevelEncryptionConfig
    /**
      * The ID of the configuration you want to update.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the configuration identity to update. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
    /**
      * The value of the ETag header that you received when updating the configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the results of updating the configuration.
      */
    var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
  }
  
  trait UpdateFieldLevelEncryptionProfileRequest extends js.Object {
    /**
      * Request to update a field-level encryption profile. 
      */
    var FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig
    /**
      * The ID of the field-level encryption profile request. 
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the profile identity to update. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
    /**
      * The result of the field-level encryption profile request. 
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the results of updating the profile.
      */
    var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
  }
  
  trait UpdatePublicKeyRequest extends js.Object {
    /**
      * ID of the public key to be updated.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the public key to update. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Request to update public key information.
      */
    var PublicKeyConfig: PublicKeyConfig
  }
  
  trait UpdatePublicKeyResult extends js.Object {
    /**
      * The current version of the update public key result. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Return the results of updating the public key.
      */
    var PublicKey: js.UndefOr[PublicKey] = js.undefined
  }
  
  trait UpdateStreamingDistributionRequest extends js.Object {
    /**
      * The streaming distribution's id.
      */
    var Id: java.lang.String
    /**
      * The value of the ETag header that you received when retrieving the streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
      */
    var IfMatch: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The streaming distribution's configuration information.
      */
    var StreamingDistributionConfig: StreamingDistributionConfig
  }
  
  trait UpdateStreamingDistributionResult extends js.Object {
    /**
      * The current version of the configuration. For example: E2QWRUHAPOMQZL.
      */
    var ETag: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The streaming distribution's information.
      */
    var StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
  }
  
  trait ViewerCertificate extends js.Object {
    /**
      * For information about how and when to use ACMCertificateArn, see ViewerCertificate.
      */
    var ACMCertificateArn: js.UndefOr[java.lang.String] = js.undefined
    /**
      * This field has been deprecated. Use one of the following fields instead:    ViewerCertificate$ACMCertificateArn     ViewerCertificate$IAMCertificateId     ViewerCertificate$CloudFrontDefaultCertificate   
      */
    var Certificate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * This field has been deprecated. Use one of the following fields instead:    ViewerCertificate$ACMCertificateArn     ViewerCertificate$IAMCertificateId     ViewerCertificate$CloudFrontDefaultCertificate   
      */
    var CertificateSource: js.UndefOr[CertificateSource] = js.undefined
    /**
      * For information about how and when to use CloudFrontDefaultCertificate, see ViewerCertificate.
      */
    var CloudFrontDefaultCertificate: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * For information about how and when to use IAMCertificateId, see ViewerCertificate.
      */
    var IAMCertificateId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines two settings:   The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers   The cipher that CloudFront uses to encrypt the content that it returns to viewers    On the CloudFront console, this setting is called Security policy.  We recommend that you specify TLSv1.1_2016 unless your users are using browsers or devices that do not support TLSv1.1 or later. When both of the following are true, you must specify TLSv1 or later for the security policy:    You're using a custom certificate: you specified a value for ACMCertificateArn or for IAMCertificateId    You're using SNI: you specified sni-only for SSLSupportMethod    If you specify true for CloudFrontDefaultCertificate, CloudFront automatically sets the security policy to TLSv1 regardless of the value that you specify for MinimumProtocolVersion. For information about the relationship between the security policy that you choose and the protocols and ciphers that CloudFront uses to communicate with viewers, see  Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.
      */
    var MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion] = js.undefined
    /**
      * If you specify a value for ViewerCertificate$ACMCertificateArn or for ViewerCertificate$IAMCertificateId, you must also specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that works for most clients:    vip: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from any viewer. However, you will incur additional monthly charges.    sni-only: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users' browsers don't support SNI, we recommend that you do one of the following:   Use the vip option (dedicated IP addresses) instead of sni-only.   Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront domain name of your distribution in the URLs for your objects, for example, https://d111111abcdef8.cloudfront.net/logo.png.   If you can control which browser your users use, upgrade the browser to one that supports SNI.   Use HTTP instead of HTTPS.     Don't specify a value for SSLSupportMethod if you specified &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;. For more information, see Using Alternate Domain Names and HTTPS in the Amazon CloudFront Developer Guide.
      */
    var SSLSupportMethod: js.UndefOr[SSLSupportMethod] = js.undefined
  }
  
  trait _Signer extends js.Object {
    /**
      * An AWS account that is included in the TrustedSigners complex type for this RTMP distribution. Valid values include:    self, which is the AWS account used to create the distribution.   An AWS account number.  
      */
    var AwsAccountNumber: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A complex type that lists the active CloudFront key pairs, if any, that are associated with AwsAccountNumber.
      */
    var KeyPairIds: js.UndefOr[KeyPairIds] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  @JSName("Signer")
  @js.native
  object SignerNs extends js.Object {
    trait CannedPolicy extends js.Object {
      var `CloudFront-Expires`: scala.Double
      var `CloudFront-Key-Pair-Id`: java.lang.String
      var `CloudFront-Signature`: java.lang.String
    }
    
    trait CustomPolicy extends js.Object {
      var `CloudFront-Key-Pair-Id`: java.lang.String
      var `CloudFront-Policy`: java.lang.String
      var `CloudFront-Signature`: java.lang.String
    }
    
    trait SignerOptionsWithPolicy extends js.Object {
      /**
        * A CloudFront JSON policy. Required unless you pass in a url and an expiry time. 
        */
      var policy: java.lang.String
    }
    
    trait SignerOptionsWithoutPolicy extends js.Object {
      /**
        * A Unix UTC timestamp indicating when the signature should expire. Required unless you pass in a full policy.
        */
      var expires: scala.Double
      /**
        * The URL to which the signature will grant access. Required unless you pass in a full policy.
        */
      var url: java.lang.String
    }
    
  }
  
  type AliasList = js.Array[java.lang.String]
  type AwsAccountNumberList = js.Array[java.lang.String]
  type CacheBehaviorList = js.Array[CacheBehavior]
  type CertificateSource = awsDashSdkLib.awsDashSdkLibStrings.cloudfront | awsDashSdkLib.awsDashSdkLibStrings.iam | awsDashSdkLib.awsDashSdkLibStrings.acm | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudFrontOriginAccessIdentitySummaryList = js.Array[CloudFrontOriginAccessIdentitySummary]
  type ContentTypeProfileList = js.Array[ContentTypeProfile]
  type CookieNameList = js.Array[java.lang.String]
  type CustomErrorResponseList = js.Array[CustomErrorResponse]
  type DistributionSummaryList = js.Array[DistributionSummary]
  type EncryptionEntityList = js.Array[EncryptionEntity]
  type EventType = awsDashSdkLib.awsDashSdkLibStrings.`viewer-request` | awsDashSdkLib.awsDashSdkLibStrings.`viewer-response` | awsDashSdkLib.awsDashSdkLibStrings.`origin-request` | awsDashSdkLib.awsDashSdkLibStrings.`origin-response` | java.lang.String
  type FieldLevelEncryptionProfileSummaryList = js.Array[FieldLevelEncryptionProfileSummary]
  type FieldLevelEncryptionSummaryList = js.Array[FieldLevelEncryptionSummary]
  type FieldPatternList = js.Array[java.lang.String]
  type Format = awsDashSdkLib.awsDashSdkLibStrings.URLEncoded | java.lang.String
  type GeoRestrictionType = awsDashSdkLib.awsDashSdkLibStrings.blacklist | awsDashSdkLib.awsDashSdkLibStrings.whitelist | awsDashSdkLib.awsDashSdkLibStrings.none | java.lang.String
  type HeaderList = js.Array[java.lang.String]
  type HttpVersion = awsDashSdkLib.awsDashSdkLibStrings.http1DOT1 | awsDashSdkLib.awsDashSdkLibStrings.http2 | java.lang.String
  type InvalidationSummaryList = js.Array[InvalidationSummary]
  type ItemSelection = awsDashSdkLib.awsDashSdkLibStrings.none | awsDashSdkLib.awsDashSdkLibStrings.whitelist | awsDashSdkLib.awsDashSdkLibStrings.all | java.lang.String
  type KeyPairIdList = js.Array[java.lang.String]
  type LambdaFunctionARN = java.lang.String
  type LambdaFunctionAssociationList = js.Array[LambdaFunctionAssociation]
  type LocationList = js.Array[java.lang.String]
  type Method = awsDashSdkLib.awsDashSdkLibStrings.GET | awsDashSdkLib.awsDashSdkLibStrings.HEAD | awsDashSdkLib.awsDashSdkLibStrings.POST | awsDashSdkLib.awsDashSdkLibStrings.PUT | awsDashSdkLib.awsDashSdkLibStrings.PATCH | awsDashSdkLib.awsDashSdkLibStrings.OPTIONS | awsDashSdkLib.awsDashSdkLibStrings.DELETE | java.lang.String
  type MethodsList = js.Array[Method]
  type MinimumProtocolVersion = awsDashSdkLib.awsDashSdkLibStrings.SSLv3 | awsDashSdkLib.awsDashSdkLibStrings.TLSv1 | awsDashSdkLib.awsDashSdkLibStrings.TLSv1_2016 | awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT1_2016 | awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT2_2018 | java.lang.String
  type OriginCustomHeadersList = js.Array[OriginCustomHeader]
  type OriginGroupList = js.Array[OriginGroup]
  type OriginGroupMemberList = js.Array[OriginGroupMember]
  type OriginList = js.Array[Origin]
  type OriginProtocolPolicy = awsDashSdkLib.awsDashSdkLibStrings.`http-only` | awsDashSdkLib.awsDashSdkLibStrings.`match-viewer` | awsDashSdkLib.awsDashSdkLibStrings.`https-only` | java.lang.String
  type PathList = js.Array[java.lang.String]
  type PriceClass = awsDashSdkLib.awsDashSdkLibStrings.PriceClass_100 | awsDashSdkLib.awsDashSdkLibStrings.PriceClass_200 | awsDashSdkLib.awsDashSdkLibStrings.PriceClass_All | java.lang.String
  type PublicKeySummaryList = js.Array[PublicKeySummary]
  type QueryArgProfileList = js.Array[QueryArgProfile]
  type QueryStringCacheKeysList = js.Array[java.lang.String]
  type ResourceARN = java.lang.String
  type SSLSupportMethod = awsDashSdkLib.awsDashSdkLibStrings.`sni-only` | awsDashSdkLib.awsDashSdkLibStrings.vip | java.lang.String
  type SignerList = js.Array[_Signer]
  type SslProtocol = awsDashSdkLib.awsDashSdkLibStrings.SSLv3 | awsDashSdkLib.awsDashSdkLibStrings.TLSv1 | awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT1 | awsDashSdkLib.awsDashSdkLibStrings.TLSv1DOT2 | java.lang.String
  type SslProtocolsList = js.Array[SslProtocol]
  type StatusCodeList = js.Array[integer]
  type StreamingDistributionSummaryList = js.Array[StreamingDistributionSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type ViewerProtocolPolicy = awsDashSdkLib.awsDashSdkLibStrings.`allow-all` | awsDashSdkLib.awsDashSdkLibStrings.`https-only` | awsDashSdkLib.awsDashSdkLibStrings.`redirect-to-https` | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2013-05-12` | awsDashSdkLib.awsDashSdkLibStrings.`2013-11-11` | awsDashSdkLib.awsDashSdkLibStrings.`2014-05-31` | awsDashSdkLib.awsDashSdkLibStrings.`2014-10-21` | awsDashSdkLib.awsDashSdkLibStrings.`2014-11-06` | awsDashSdkLib.awsDashSdkLibStrings.`2015-04-17` | awsDashSdkLib.awsDashSdkLibStrings.`2015-07-27` | awsDashSdkLib.awsDashSdkLibStrings.`2015-09-17` | awsDashSdkLib.awsDashSdkLibStrings.`2016-01-13` | awsDashSdkLib.awsDashSdkLibStrings.`2016-01-28` | awsDashSdkLib.awsDashSdkLibStrings.`2016-08-01` | awsDashSdkLib.awsDashSdkLibStrings.`2016-08-20` | awsDashSdkLib.awsDashSdkLibStrings.`2016-09-07` | awsDashSdkLib.awsDashSdkLibStrings.`2016-09-29` | awsDashSdkLib.awsDashSdkLibStrings.`2016-11-25` | awsDashSdkLib.awsDashSdkLibStrings.`2017-03-25` | awsDashSdkLib.awsDashSdkLibStrings.`2017-10-30` | awsDashSdkLib.awsDashSdkLibStrings.`2018-06-18` | awsDashSdkLib.awsDashSdkLibStrings.`2018-11-05` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type integer = scala.Double
  type long = scala.Double
  type timestamp = stdLib.Date
}

