package typings.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.legacy_
import typings.awsSdk.awsSdkStrings.regional_
import typings.awsSdk.awsSdkStrings.v2_
import typings.awsSdk.awsSdkStrings.v3
import typings.awsSdk.awsSdkStrings.v4
import typings.awsSdk.libConfigBaseMod.HTTPOptions
import typings.awsSdk.libConfigBaseMod.Logger
import typings.awsSdk.libConfigBaseMod.ParamValidation
import typings.awsSdk.libConfigBaseMod.RetryDelayOptions
import typings.awsSdk.libCredentialsCredentialProviderChainMod.CredentialProviderChain
import typings.awsSdk.libCredentialsMod.Credentials
import typings.awsSdk.libCredentialsMod.CredentialsOptions
import typings.awsSdk.libTokenMod.Token
import typings.awsSdk.libTokenTokenProviderChainMod.TokenProviderChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/lib/config-base.ConfigurationOptions & {[key: string] : any} */
trait ConfigurationOptionskeyst
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.undefined
  
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.undefined
  
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the global cache storing endpoints from endpoint
    * discovery operations. Once endpoint cache is created, updating this setting
    * cannot change existing cache size.
    */
  var endpointCacheSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
    * the service.
    */
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
  
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.undefined
  
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.undefined
  
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.undefined
  
  /**
    * Whether the provided endpoint addresses an individual bucket.
    * false if it addresses the root API endpoint.
    */
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to disable S3 body signing when using signature version v4.
    */
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to force path style URLs for S3 objects.
    */
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.undefined
  
  /**
    * Whether to override the request region with the region inferred
    * from requested resource's ARN. Only available for S3 buckets
    * Defaults to `true`
    */
  var s3UseArnRegion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.undefined
  
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.undefined
  
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.undefined
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The Token to authenticate requests with.
    */
  var token: js.UndefOr[Token | Null] = js.undefined
  
  /**
    * The provider chain used to resolve token if no static token property is set.
    */
  var tokenProvider: js.UndefOr[TokenProviderChain] = js.undefined
  
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables IPv6 dualstack endpoint.
    */
  var useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables FIPS compatible endpoints.
    */
  var useFipsEndpoint: js.UndefOr[Boolean] = js.undefined
}
object ConfigurationOptionskeyst {
  
  inline def apply(): ConfigurationOptionskeyst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionskeyst]
  }
  
  extension [Self <: ConfigurationOptionskeyst](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    inline def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    inline def setConvertResponseTypes(value: Boolean): Self = StObject.set(x, "convertResponseTypes", value.asInstanceOf[js.Any])
    
    inline def setConvertResponseTypesUndefined: Self = StObject.set(x, "convertResponseTypes", js.undefined)
    
    inline def setCorrectClockSkew(value: Boolean): Self = StObject.set(x, "correctClockSkew", value.asInstanceOf[js.Any])
    
    inline def setCorrectClockSkewUndefined: Self = StObject.set(x, "correctClockSkew", js.undefined)
    
    inline def setCredentialProvider(value: CredentialProviderChain): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
    
    inline def setCredentialProviderUndefined: Self = StObject.set(x, "credentialProvider", js.undefined)
    
    inline def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsNull: Self = StObject.set(x, "credentials", null)
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
    
    inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    
    inline def setDynamoDbCrc32(value: Boolean): Self = StObject.set(x, "dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    inline def setDynamoDbCrc32Undefined: Self = StObject.set(x, "dynamoDbCrc32", js.undefined)
    
    inline def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
    
    inline def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
    
    inline def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    
    inline def setHostPrefixEnabled(value: Boolean): Self = StObject.set(x, "hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    inline def setHostPrefixEnabledUndefined: Self = StObject.set(x, "hostPrefixEnabled", js.undefined)
    
    inline def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setParamValidation(value: ParamValidation | Boolean): Self = StObject.set(x, "paramValidation", value.asInstanceOf[js.Any])
    
    inline def setParamValidationUndefined: Self = StObject.set(x, "paramValidation", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRetryDelayOptions(value: RetryDelayOptions): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    inline def setS3BucketEndpoint(value: Boolean): Self = StObject.set(x, "s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    inline def setS3BucketEndpointUndefined: Self = StObject.set(x, "s3BucketEndpoint", js.undefined)
    
    inline def setS3DisableBodySigning(value: Boolean): Self = StObject.set(x, "s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    inline def setS3DisableBodySigningUndefined: Self = StObject.set(x, "s3DisableBodySigning", js.undefined)
    
    inline def setS3ForcePathStyle(value: Boolean): Self = StObject.set(x, "s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    inline def setS3ForcePathStyleUndefined: Self = StObject.set(x, "s3ForcePathStyle", js.undefined)
    
    inline def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = StObject.set(x, "s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    inline def setS3UsEast1RegionalEndpointUndefined: Self = StObject.set(x, "s3UsEast1RegionalEndpoint", js.undefined)
    
    inline def setS3UseArnRegion(value: Boolean): Self = StObject.set(x, "s3UseArnRegion", value.asInstanceOf[js.Any])
    
    inline def setS3UseArnRegionUndefined: Self = StObject.set(x, "s3UseArnRegion", js.undefined)
    
    inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setSignatureCache(value: Boolean): Self = StObject.set(x, "signatureCache", value.asInstanceOf[js.Any])
    
    inline def setSignatureCacheUndefined: Self = StObject.set(x, "signatureCache", js.undefined)
    
    inline def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = StObject.set(x, "signatureVersion", value.asInstanceOf[js.Any])
    
    inline def setSignatureVersionUndefined: Self = StObject.set(x, "signatureVersion", js.undefined)
    
    inline def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    inline def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    inline def setStsRegionalEndpoints(value: legacy_ | regional_): Self = StObject.set(x, "stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    inline def setStsRegionalEndpointsUndefined: Self = StObject.set(x, "stsRegionalEndpoints", js.undefined)
    
    inline def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    
    inline def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    
    inline def setToken(value: Token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenProvider(value: TokenProviderChain): Self = StObject.set(x, "tokenProvider", value.asInstanceOf[js.Any])
    
    inline def setTokenProviderUndefined: Self = StObject.set(x, "tokenProvider", js.undefined)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
    
    inline def setUseDualstackEndpoint(value: Boolean): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
    
    inline def setUseFipsEndpoint(value: Boolean): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
  }
}
