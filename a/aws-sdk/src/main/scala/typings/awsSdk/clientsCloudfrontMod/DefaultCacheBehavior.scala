package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultCacheBehavior extends StObject {
  
  var AllowedMethods: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.AllowedMethods] = js.undefined
  
  /**
    * The unique identifier of the cache policy that is attached to the default cache behavior. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. A DefaultCacheBehavior must include either a CachePolicyId or ForwardedValues. We recommend that you use a CachePolicyId.
    */
  var CachePolicyId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether you want CloudFront to automatically compress certain files for this cache behavior. If so, specify true; if not, specify false. For more information, see Serving Compressed Files in the Amazon CloudFront Developer Guide.
    */
  var Compress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field is deprecated. We recommend that you use the DefaultTTL field in a cache policy instead of this field. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. The default amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var DefaultTTL: js.UndefOr[long] = js.undefined
  
  /**
    * The value of ID for the field-level encryption configuration that you want CloudFront to use for encrypting specific fields of data for the default cache behavior.
    */
  var FieldLevelEncryptionId: js.UndefOr[String] = js.undefined
  
  /**
    * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this field. For more information, see Working with policies in the Amazon CloudFront Developer Guide. If you want to include values in the cache key, use a cache policy. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. If you want to send values to the origin but not include them in the cache key, use an origin request policy. For more information, see Creating origin request policies or Using the managed origin request policies in the Amazon CloudFront Developer Guide. A DefaultCacheBehavior must include either a CachePolicyId or ForwardedValues. We recommend that you use a CachePolicyId. A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
    */
  var ForwardedValues: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ForwardedValues] = js.undefined
  
  /**
    * A list of CloudFront functions that are associated with this cache behavior. CloudFront functions must be published to the LIVE stage to associate them with a cache behavior.
    */
  var FunctionAssociations: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FunctionAssociations] = js.undefined
  
  /**
    * A complex type that contains zero or more Lambda@Edge function associations for a cache behavior.
    */
  var LambdaFunctionAssociations: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.LambdaFunctionAssociations] = js.undefined
  
  /**
    * This field is deprecated. We recommend that you use the MaxTTL field in a cache policy instead of this field. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. The maximum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. The value that you specify applies only when your origin adds HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide.
    */
  var MaxTTL: js.UndefOr[long] = js.undefined
  
  /**
    * This field is deprecated. We recommend that you use the MinTTL field in a cache policy instead of this field. For more information, see Creating cache policies or Using the managed cache policies in the Amazon CloudFront Developer Guide. The minimum amount of time that you want objects to stay in CloudFront caches before CloudFront forwards another request to your origin to determine whether the object has been updated. For more information, see Managing How Long Content Stays in an Edge Cache (Expiration) in the Amazon CloudFront Developer Guide. You must specify 0 for MinTTL if you configure CloudFront to forward all headers to your origin (under Headers, if you specify 1 for Quantity and * for Name).
    */
  var MinTTL: js.UndefOr[long] = js.undefined
  
  /**
    * The unique identifier of the origin request policy that is attached to the default cache behavior. For more information, see Creating origin request policies or Using the managed origin request policies in the Amazon CloudFront Developer Guide.
    */
  var OriginRequestPolicyId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this cache behavior. For more information, see Real-time logs in the Amazon CloudFront Developer Guide.
    */
  var RealtimeLogConfigArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for a response headers policy.
    */
  var ResponseHeadersPolicyId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format using the origin that is associated with this cache behavior. If so, specify true; if not, specify false. If you specify true for SmoothStreaming, you can still distribute other content using this cache behavior if the content matches the value of PathPattern. 
    */
  var SmoothStreaming: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of ID for the origin that you want CloudFront to route requests to when they use the default cache behavior.
    */
  var TargetOriginId: String
  
  /**
    * A list of key groups that CloudFront can use to validate signed URLs or signed cookies. When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or cookies must be signed with a private key whose corresponding public key is in the key group. The signed URL or cookie contains information about which public key CloudFront should use to verify the signature. For more information, see Serving private content in the Amazon CloudFront Developer Guide.
    */
  var TrustedKeyGroups: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.TrustedKeyGroups] = js.undefined
  
  /**
    *  We recommend using TrustedKeyGroups instead of TrustedSigners.  A list of Amazon Web Services account IDs whose public keys CloudFront can use to validate signed URLs or signed cookies. When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or cookies must be signed with the private key of a CloudFront key pair in a trusted signer’s Amazon Web Services account. The signed URL or cookie contains information about which public key CloudFront should use to verify the signature. For more information, see Serving private content in the Amazon CloudFront Developer Guide.
    */
  var TrustedSigners: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.TrustedSigners] = js.undefined
  
  /**
    * The protocol that viewers can use to access the files in the origin specified by TargetOriginId when a request matches the path pattern in PathPattern. You can specify the following options:    allow-all: Viewers can use HTTP or HTTPS.    redirect-to-https: If a viewer submits an HTTP request, CloudFront returns an HTTP status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then resubmits the request using the new URL.    https-only: If a viewer sends an HTTP request, CloudFront returns an HTTP status code of 403 (Forbidden).   For more information about requiring the HTTPS protocol, see Requiring HTTPS Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.  The only way to guarantee that viewers retrieve an object that was fetched from the origin using HTTPS is never to use any other protocol to fetch the object. If you have recently changed from HTTP to HTTPS, we recommend that you clear your objects’ cache because cached objects are protocol agnostic. That means that an edge location will return an object from the cache regardless of whether the current request protocol matches the protocol used previously. For more information, see Managing Cache Expiration in the Amazon CloudFront Developer Guide. 
    */
  var ViewerProtocolPolicy: typings.awsSdk.clientsCloudfrontMod.ViewerProtocolPolicy
}
object DefaultCacheBehavior {
  
  inline def apply(TargetOriginId: String, ViewerProtocolPolicy: ViewerProtocolPolicy): DefaultCacheBehavior = {
    val __obj = js.Dynamic.literal(TargetOriginId = TargetOriginId.asInstanceOf[js.Any], ViewerProtocolPolicy = ViewerProtocolPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultCacheBehavior]
  }
  
  extension [Self <: DefaultCacheBehavior](x: Self) {
    
    inline def setAllowedMethods(value: AllowedMethods): Self = StObject.set(x, "AllowedMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodsUndefined: Self = StObject.set(x, "AllowedMethods", js.undefined)
    
    inline def setCachePolicyId(value: String): Self = StObject.set(x, "CachePolicyId", value.asInstanceOf[js.Any])
    
    inline def setCachePolicyIdUndefined: Self = StObject.set(x, "CachePolicyId", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "Compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "Compress", js.undefined)
    
    inline def setDefaultTTL(value: long): Self = StObject.set(x, "DefaultTTL", value.asInstanceOf[js.Any])
    
    inline def setDefaultTTLUndefined: Self = StObject.set(x, "DefaultTTL", js.undefined)
    
    inline def setFieldLevelEncryptionId(value: String): Self = StObject.set(x, "FieldLevelEncryptionId", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionIdUndefined: Self = StObject.set(x, "FieldLevelEncryptionId", js.undefined)
    
    inline def setForwardedValues(value: ForwardedValues): Self = StObject.set(x, "ForwardedValues", value.asInstanceOf[js.Any])
    
    inline def setForwardedValuesUndefined: Self = StObject.set(x, "ForwardedValues", js.undefined)
    
    inline def setFunctionAssociations(value: FunctionAssociations): Self = StObject.set(x, "FunctionAssociations", value.asInstanceOf[js.Any])
    
    inline def setFunctionAssociationsUndefined: Self = StObject.set(x, "FunctionAssociations", js.undefined)
    
    inline def setLambdaFunctionAssociations(value: LambdaFunctionAssociations): Self = StObject.set(x, "LambdaFunctionAssociations", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionAssociationsUndefined: Self = StObject.set(x, "LambdaFunctionAssociations", js.undefined)
    
    inline def setMaxTTL(value: long): Self = StObject.set(x, "MaxTTL", value.asInstanceOf[js.Any])
    
    inline def setMaxTTLUndefined: Self = StObject.set(x, "MaxTTL", js.undefined)
    
    inline def setMinTTL(value: long): Self = StObject.set(x, "MinTTL", value.asInstanceOf[js.Any])
    
    inline def setMinTTLUndefined: Self = StObject.set(x, "MinTTL", js.undefined)
    
    inline def setOriginRequestPolicyId(value: String): Self = StObject.set(x, "OriginRequestPolicyId", value.asInstanceOf[js.Any])
    
    inline def setOriginRequestPolicyIdUndefined: Self = StObject.set(x, "OriginRequestPolicyId", js.undefined)
    
    inline def setRealtimeLogConfigArn(value: String): Self = StObject.set(x, "RealtimeLogConfigArn", value.asInstanceOf[js.Any])
    
    inline def setRealtimeLogConfigArnUndefined: Self = StObject.set(x, "RealtimeLogConfigArn", js.undefined)
    
    inline def setResponseHeadersPolicyId(value: String): Self = StObject.set(x, "ResponseHeadersPolicyId", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersPolicyIdUndefined: Self = StObject.set(x, "ResponseHeadersPolicyId", js.undefined)
    
    inline def setSmoothStreaming(value: Boolean): Self = StObject.set(x, "SmoothStreaming", value.asInstanceOf[js.Any])
    
    inline def setSmoothStreamingUndefined: Self = StObject.set(x, "SmoothStreaming", js.undefined)
    
    inline def setTargetOriginId(value: String): Self = StObject.set(x, "TargetOriginId", value.asInstanceOf[js.Any])
    
    inline def setTrustedKeyGroups(value: TrustedKeyGroups): Self = StObject.set(x, "TrustedKeyGroups", value.asInstanceOf[js.Any])
    
    inline def setTrustedKeyGroupsUndefined: Self = StObject.set(x, "TrustedKeyGroups", js.undefined)
    
    inline def setTrustedSigners(value: TrustedSigners): Self = StObject.set(x, "TrustedSigners", value.asInstanceOf[js.Any])
    
    inline def setTrustedSignersUndefined: Self = StObject.set(x, "TrustedSigners", js.undefined)
    
    inline def setViewerProtocolPolicy(value: ViewerProtocolPolicy): Self = StObject.set(x, "ViewerProtocolPolicy", value.asInstanceOf[js.Any])
  }
}
