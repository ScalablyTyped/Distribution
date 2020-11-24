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
  implicit class ConfigurationOptionskeystOps[Self <: ConfigurationOptionskeyst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessKeyId(value: String): Self = this.set("accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessKeyId: Self = this.set("accessKeyId", js.undefined)
    
    @scala.inline
    def setComputeChecksums(value: Boolean): Self = this.set("computeChecksums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeChecksums: Self = this.set("computeChecksums", js.undefined)
    
    @scala.inline
    def setConvertResponseTypes(value: Boolean): Self = this.set("convertResponseTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertResponseTypes: Self = this.set("convertResponseTypes", js.undefined)
    
    @scala.inline
    def setCorrectClockSkew(value: Boolean): Self = this.set("correctClockSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrectClockSkew: Self = this.set("correctClockSkew", js.undefined)
    
    @scala.inline
    def setCredentialProvider(value: CredentialProviderChain): Self = this.set("credentialProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialProvider: Self = this.set("credentialProvider", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials | CredentialsOptions): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setCredentialsNull: Self = this.set("credentials", null)
    
    @scala.inline
    def setCustomUserAgent(value: String): Self = this.set("customUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomUserAgent: Self = this.set("customUserAgent", js.undefined)
    
    @scala.inline
    def setDynamoDbCrc32(value: Boolean): Self = this.set("dynamoDbCrc32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamoDbCrc32: Self = this.set("dynamoDbCrc32", js.undefined)
    
    @scala.inline
    def setEndpointCacheSize(value: Double): Self = this.set("endpointCacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointCacheSize: Self = this.set("endpointCacheSize", js.undefined)
    
    @scala.inline
    def setEndpointDiscoveryEnabled(value: Boolean): Self = this.set("endpointDiscoveryEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointDiscoveryEnabled: Self = this.set("endpointDiscoveryEnabled", js.undefined)
    
    @scala.inline
    def setHostPrefixEnabled(value: Boolean): Self = this.set("hostPrefixEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPrefixEnabled: Self = this.set("hostPrefixEnabled", js.undefined)
    
    @scala.inline
    def setHttpOptions(value: HTTPOptions): Self = this.set("httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOptions: Self = this.set("httpOptions", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setParamValidation(value: ParamValidation | Boolean): Self = this.set("paramValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamValidation: Self = this.set("paramValidation", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRetryDelayOptions(value: RetryDelayOptions): Self = this.set("retryDelayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelayOptions: Self = this.set("retryDelayOptions", js.undefined)
    
    @scala.inline
    def setS3BucketEndpoint(value: Boolean): Self = this.set("s3BucketEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketEndpoint: Self = this.set("s3BucketEndpoint", js.undefined)
    
    @scala.inline
    def setS3DisableBodySigning(value: Boolean): Self = this.set("s3DisableBodySigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3DisableBodySigning: Self = this.set("s3DisableBodySigning", js.undefined)
    
    @scala.inline
    def setS3ForcePathStyle(value: Boolean): Self = this.set("s3ForcePathStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ForcePathStyle: Self = this.set("s3ForcePathStyle", js.undefined)
    
    @scala.inline
    def setS3UsEast1RegionalEndpoint(value: regional_ | legacy_): Self = this.set("s3UsEast1RegionalEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3UsEast1RegionalEndpoint: Self = this.set("s3UsEast1RegionalEndpoint", js.undefined)
    
    @scala.inline
    def setS3UseArnRegion(value: Boolean): Self = this.set("s3UseArnRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3UseArnRegion: Self = this.set("s3UseArnRegion", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: String): Self = this.set("secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretAccessKey: Self = this.set("secretAccessKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
    
    @scala.inline
    def setSignatureCache(value: Boolean): Self = this.set("signatureCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureCache: Self = this.set("signatureCache", js.undefined)
    
    @scala.inline
    def setSignatureVersion(value: v2_ | v3 | v4 | String): Self = this.set("signatureVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureVersion: Self = this.set("signatureVersion", js.undefined)
    
    @scala.inline
    def setSslEnabled(value: Boolean): Self = this.set("sslEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslEnabled: Self = this.set("sslEnabled", js.undefined)
    
    @scala.inline
    def setStsRegionalEndpoints(value: legacy_ | regional_): Self = this.set("stsRegionalEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStsRegionalEndpoints: Self = this.set("stsRegionalEndpoints", js.undefined)
    
    @scala.inline
    def setSystemClockOffset(value: Double): Self = this.set("systemClockOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemClockOffset: Self = this.set("systemClockOffset", js.undefined)
    
    @scala.inline
    def setUseAccelerateEndpoint(value: Boolean): Self = this.set("useAccelerateEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAccelerateEndpoint: Self = this.set("useAccelerateEndpoint", js.undefined)
  }
}
