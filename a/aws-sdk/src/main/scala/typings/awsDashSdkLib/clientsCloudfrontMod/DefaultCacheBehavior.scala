package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCacheBehavior extends js.Object {
  var AllowedMethods: js.UndefOr[AllowedMethods] = js.undefined
  /**
    * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true; if not, specify false. For more information, see Serving Compressed Files in the Amazon CloudFront Developer Guide.
    */
  var Compress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var DefaultTTL: js.UndefOr[long] = js.undefined
  /**
    * The value of ID for the field-level encryption configuration that you want CloudFront to use for encrypting specific fields of data for a cache behavior or for the default cache behavior in your distribution.
    */
  var FieldLevelEncryptionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A complex type that specifies how CloudFront handles query strings and cookies.
    */
  var ForwardedValues: awsDashSdkLib.clientsCloudfrontMod.ForwardedValues
  /**
    * A complex type that contains zero or more Lambda function associations for a cache behavior.
    */
  var LambdaFunctionAssociations: js.UndefOr[LambdaFunctionAssociations] = js.undefined
  /**
    * The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin adds HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var MaxTTL: js.UndefOr[long] = js.undefined
  /**
    * The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. You must specify 0 for MinTTL if you configure CloudFront to forward all headers to your origin (under Headers, if you specify 1 for Quantity and * for Name).
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
    * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the applicable values for Quantity and Items. For more information, see Serving Private Content through CloudFront in the  Amazon CloudFront Developer Guide. If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and specify all of the trusted signers that you want to include in the updated distribution.
    */
  var TrustedSigners: awsDashSdkLib.clientsCloudfrontMod.TrustedSigners
  /**
    * The protocol that viewers can use to access the files in the origin specified by TargetOriginId when a request matches the path pattern in PathPattern. You can specify the following options:    allow-all: Viewers can use HTTP or HTTPS.    redirect-to-https: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the new URL.    https-only: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403 (Forbidden).   For more information about requiring the HTTPS protocol, see Using an HTTPS Connection to Access Your Objects in the Amazon CloudFront Developer Guide.  The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached objects are protocol agnostic. That means that an edge location will return an object from the cache regardless of whether the current request protocol matches the protocol used previously. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. 
    */
  var ViewerProtocolPolicy: awsDashSdkLib.clientsCloudfrontMod.ViewerProtocolPolicy
}

object DefaultCacheBehavior {
  @scala.inline
  def apply(
    ForwardedValues: ForwardedValues,
    MinTTL: long,
    TargetOriginId: java.lang.String,
    TrustedSigners: TrustedSigners,
    ViewerProtocolPolicy: ViewerProtocolPolicy,
    AllowedMethods: AllowedMethods = null,
    Compress: js.UndefOr[scala.Boolean] = js.undefined,
    DefaultTTL: js.UndefOr[long] = js.undefined,
    FieldLevelEncryptionId: java.lang.String = null,
    LambdaFunctionAssociations: LambdaFunctionAssociations = null,
    MaxTTL: js.UndefOr[long] = js.undefined,
    SmoothStreaming: js.UndefOr[scala.Boolean] = js.undefined
  ): DefaultCacheBehavior = {
    val __obj = js.Dynamic.literal(ForwardedValues = ForwardedValues, MinTTL = MinTTL, TargetOriginId = TargetOriginId, TrustedSigners = TrustedSigners, ViewerProtocolPolicy = ViewerProtocolPolicy.asInstanceOf[js.Any])
    if (AllowedMethods != null) __obj.updateDynamic("AllowedMethods")(AllowedMethods)
    if (!js.isUndefined(Compress)) __obj.updateDynamic("Compress")(Compress)
    if (!js.isUndefined(DefaultTTL)) __obj.updateDynamic("DefaultTTL")(DefaultTTL)
    if (FieldLevelEncryptionId != null) __obj.updateDynamic("FieldLevelEncryptionId")(FieldLevelEncryptionId)
    if (LambdaFunctionAssociations != null) __obj.updateDynamic("LambdaFunctionAssociations")(LambdaFunctionAssociations)
    if (!js.isUndefined(MaxTTL)) __obj.updateDynamic("MaxTTL")(MaxTTL)
    if (!js.isUndefined(SmoothStreaming)) __obj.updateDynamic("SmoothStreaming")(SmoothStreaming)
    __obj.asInstanceOf[DefaultCacheBehavior]
  }
}

