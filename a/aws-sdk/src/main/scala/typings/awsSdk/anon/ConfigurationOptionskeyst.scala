package typings.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.legacy_
import typings.awsSdk.awsSdkStrings.regional_
import typings.awsSdk.awsSdkStrings.v2_
import typings.awsSdk.awsSdkStrings.v3
import typings.awsSdk.awsSdkStrings.v4
import typings.awsSdk.configBaseMod.HTTPOptions
import typings.awsSdk.configBaseMod.Logger
import typings.awsSdk.configBaseMod.ParamValidation
import typings.awsSdk.configBaseMod.RetryDelayOptions
import typings.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.credentialsMod.CredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/lib/config-base.ConfigurationOptions & {[key: string] : any} */
@js.native
trait ConfigurationOptionskeyst
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * AWS access key ID.
    *
    * @deprecated
    */
  var accessKeyId: js.UndefOr[String] = js.native
  
  /**
    * Whether to compute checksums for payload bodies when the service accepts it.
    * Currently supported in S3 only.
    */
  var computeChecksums: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether types are converted when parsing response data.
    */
  var convertResponseTypes: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
    */
  var correctClockSkew: js.UndefOr[Boolean] = js.native
  
  /**
    * The provider chain used to resolve credentials if no static credentials property is set.
    */
  var credentialProvider: js.UndefOr[CredentialProviderChain] = js.native
  
  /**
    * The AWS credentials to sign requests with.
    */
  var credentials: js.UndefOr[Credentials | CredentialsOptions | Null] = js.native
  
  /**
    * Sets a custom User-Agent string.
    * In node environments this will set the User-Agent header, but
    * browser environments this will set the X-Amz-User-Agent header.
    */
  var customUserAgent: js.UndefOr[String] = js.native
  
  /**
    * Whether to validate the CRC32 checksum of HTTP response bodies returned
    * by DynamoDB.
    */
  var dynamoDbCrc32: js.UndefOr[Boolean] = js.native
  
  /**
    * The size of the global cache storing endpoints from endpoint
    * discovery operations. Once endpoint cache is created, updating this setting
    * cannot change existing cache size.
    */
  var endpointCacheSize: js.UndefOr[Double] = js.native
  
  /**
    * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
    * the service.
    */
  var endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to marshal request parameters to the prefix of hostname.
    */
  var hostPrefixEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A set of options to pass to the low-level HTTP request.
    */
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  
  /**
    * An object that responds to .write() (like a stream) or .log() (like the console object) in order to log information about requests.
    */
  var logger: js.UndefOr[Logger] = js.native
  
  /**
    * The maximum amount of redirects to follow for a service request.
    */
  var maxRedirects: js.UndefOr[Double] = js.native
  
  /**
    * The maximum amount of retries to perform for a service request.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * Returns whether input parameters should be validated against the operation description before sending the request.
    * Defaults to true.
    * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
    */
  var paramValidation: js.UndefOr[ParamValidation | Boolean] = js.native
  
  /**
    * The region to send service requests to.
    */
  var region: js.UndefOr[String] = js.native
  
  /**
    * Returns A set of options to configure the retry delay on retryable errors.
    */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.native
  
  /**
    * Whether the provided endpoint addresses an individual bucket.
    * false if it addresses the root API endpoint.
    */
  var s3BucketEndpoint: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to disable S3 body signing when using signature version v4.
    */
  var s3DisableBodySigning: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to force path style URLs for S3 objects.
    */
  var s3ForcePathStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * When region is set to 'us-east-1', whether to send s3 request to global endpoints
    * or 'us-east-1' regional endpoints. This config is only applicable to S3 client;
    * Defaults to 'legacy'
    */
  var s3UsEast1RegionalEndpoint: js.UndefOr[regional_ | legacy_] = js.native
  
  /**
    * Whether to override the request region with the region inferred
    * from requested resource's ARN. Only available for S3 buckets
    * Defaults to `true`
    */
  var s3UseArnRegion: js.UndefOr[Boolean] = js.native
  
  /**
    * AWS secret access key.
    *
    * @deprecated
    */
  var secretAccessKey: js.UndefOr[String] = js.native
  
  /**
    * AWS session token.
    *
    * @deprecated
    */
  var sessionToken: js.UndefOr[String] = js.native
  
  /**
    * Whether the signature to sign requests with (overriding the API configuration) is cached.
    */
  var signatureCache: js.UndefOr[Boolean] = js.native
  
  /**
    * The signature version to sign requests with (overriding the API configuration).
    * Possible values: 'v2'|'v3'|'v4'
    */
  var signatureVersion: js.UndefOr[v2_ | v3 | v4 | String] = js.native
  
  /**
    * Whether SSL is enabled for requests.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to send sts request to global endpoints or
    * regional endpoints. 
    */
  var stsRegionalEndpoints: js.UndefOr[legacy_ | regional_] = js.native
  
  /**
    * An offset value in milliseconds to apply to all signing times.
    */
  var systemClockOffset: js.UndefOr[Double] = js.native
  
  /**
    * Whether to use the Accelerate endpoint with the S3 service.
    */
  var useAccelerateEndpoint: js.UndefOr[Boolean] = js.native
}
object ConfigurationOptionskeyst {
  
  @scala.inline
  def apply(): ConfigurationOptionskeyst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionskeyst]
  }
  
  @scala.inline
  implicit class ConfigurationOptionskeystMutableBuilder[Self <: ConfigurationOptionskeyst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    @scala.inline
    def setComputeChecksums(value: Boolean): Self = StObject.set(x, "computeChecksums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeChecksumsUndefined: Self = StObject.set(x, "computeChecksums", js.undefined)
    
    @scala.inline
    def setConvertResponseTypes(value: Boolean): Self = StObject.set(x, "convertResponseTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertResponseTypesUndefined: Self = StObject.set(x, "convertResponseTypes", js.undefined)
    
    @scala.inline
    def setCorrectClockSkew(value: Boolean): Self = StObject.set(x, "correctClockSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectClockSkewUndefined: Self = StObject.set(x, "correctClockSkew", js.undefined)
    
    @scala.inline
    def setCredentialProvider(value: CredentialProviderChain): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialProviderUndefined: Self = StObject.set(x, "credentialProvider", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials | CredentialsOptions): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsNull: Self = StObject.set(x, "credentials", null)
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setCustomUserAgent(value: String): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
    
    @scala.inline
    def setDynamoDbCrc32(value: Boolean): Self = StObject.set(x, "dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDbCrc32Undefined: Self = StObject.set(x, "dynamoDbCrc32", js.undefined)
    
    @scala.inline
    def setEndpointCacheSize(value: Double): Self = StObject.set(x, "endpointCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointCacheSizeUndefined: Self = StObject.set(x, "endpointCacheSize", js.undefined)
    
    @scala.inline
    def setEndpointDiscoveryEnabled(value: Boolean): Self = StObject.set(x, "endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointDiscoveryEnabledUndefined: Self = StObject.set(x, "endpointDiscoveryEnabled", js.undefined)
    
    @scala.inline
    def setHostPrefixEnabled(value: Boolean): Self = StObject.set(x, "hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPrefixEnabledUndefined: Self = StObject.set(x, "hostPrefixEnabled", js.undefined)
    
    @scala.inline
    def setHttpOptions(value: HTTPOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    @scala.inline
    def setParamValidation(value: ParamValidation | Boolean): Self = StObject.set(x, "paramValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamValidationUndefined: Self = StObject.set(x, "paramValidation", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRetryDelayOptions(value: RetryDelayOptions): Self = StObject.set(x, "retryDelayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayOptionsUndefined: Self = StObject.set(x, "retryDelayOptions", js.undefined)
    
    @scala.inline
    def setS3BucketEndpoint(value: Boolean): Self = StObject.set(x, "s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketEndpointUndefined: Self = StObject.set(x, "s3BucketEndpoint", js.undefined)
    
    @scala.inline
    def setS3DisableBodySigning(value: Boolean): Self = StObject.set(x, "s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DisableBodySigningUndefined: Self = StObject.set(x, "s3DisableBodySigning", js.undefined)
    
    @scala.inline
    def setS3ForcePathStyle(value: Boolean): Self = StObject.set(x, "s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ForcePathStyleUndefined: Self = StObject.set(x, "s3ForcePathStyle", js.undefined)
    
    @scala.inline
    def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = StObject.set(x, "s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UsEast1RegionalEndpointUndefined: Self = StObject.set(x, "s3UsEast1RegionalEndpoint", js.undefined)
    
    @scala.inline
    def setS3UseArnRegion(value: Boolean): Self = StObject.set(x, "s3UseArnRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3UseArnRegionUndefined: Self = StObject.set(x, "s3UseArnRegion", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    @scala.inline
    def setSignatureCache(value: Boolean): Self = StObject.set(x, "signatureCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureCacheUndefined: Self = StObject.set(x, "signatureCache", js.undefined)
    
    @scala.inline
    def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = StObject.set(x, "signatureVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureVersionUndefined: Self = StObject.set(x, "signatureVersion", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Boolean): Self = StObject.set(x, "sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslEnabledUndefined: Self = StObject.set(x, "sslEnabled", js.undefined)
    
    @scala.inline
    def setStsRegionalEndpoints(value: legacy_ | regional_): Self = StObject.set(x, "stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStsRegionalEndpointsUndefined: Self = StObject.set(x, "stsRegionalEndpoints", js.undefined)
    
    @scala.inline
    def setSystemClockOffset(value: Double): Self = StObject.set(x, "systemClockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemClockOffsetUndefined: Self = StObject.set(x, "systemClockOffset", js.undefined)
    
    @scala.inline
    def setUseAccelerateEndpoint(value: Boolean): Self = StObject.set(x, "useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseAccelerateEndpointUndefined: Self = StObject.set(x, "useAccelerateEndpoint", js.undefined)
  }
}
