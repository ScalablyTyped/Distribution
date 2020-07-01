package typings.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.legacy_
import typings.awsSdk.awsSdkStrings.regional_
import typings.awsSdk.awsSdkStrings.v2_
import typings.awsSdk.awsSdkStrings.v3
import typings.awsSdk.awsSdkStrings.v4
import typings.awsSdk.configMod.HTTPOptions
import typings.awsSdk.configMod.Logger
import typings.awsSdk.configMod.ParamValidation
import typings.awsSdk.configMod.RetryDelayOptions
import typings.awsSdk.credentialProviderChainMod.CredentialProviderChain
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.credentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/lib/config.ConfigurationOptions & {[key: string] : any} */
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
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    accessKeyId: String = null,
    computeChecksums: js.UndefOr[Boolean] = js.undefined,
    convertResponseTypes: js.UndefOr[Boolean] = js.undefined,
    correctClockSkew: js.UndefOr[Boolean] = js.undefined,
    credentialProvider: CredentialProviderChain = null,
    credentials: js.UndefOr[Null | Credentials | CredentialsOptions] = js.undefined,
    customUserAgent: String = null,
    dynamoDbCrc32: js.UndefOr[Boolean] = js.undefined,
    endpointCacheSize: js.UndefOr[Double] = js.undefined,
    endpointDiscoveryEnabled: js.UndefOr[Boolean] = js.undefined,
    hostPrefixEnabled: js.UndefOr[Boolean] = js.undefined,
    httpOptions: HTTPOptions = null,
    logger: Logger = null,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    paramValidation: ParamValidation | Boolean = null,
    region: String = null,
    retryDelayOptions: RetryDelayOptions = null,
    s3BucketEndpoint: js.UndefOr[Boolean] = js.undefined,
    s3DisableBodySigning: js.UndefOr[Boolean] = js.undefined,
    s3ForcePathStyle: js.UndefOr[Boolean] = js.undefined,
    s3UsEast1RegionalEndpoint: regional_ | legacy_ = null,
    s3UseArnRegion: js.UndefOr[Boolean] = js.undefined,
    secretAccessKey: String = null,
    sessionToken: String = null,
    signatureCache: js.UndefOr[Boolean] = js.undefined,
    signatureVersion: v2_ | v3 | v4 | String = null,
    sslEnabled: js.UndefOr[Boolean] = js.undefined,
    stsRegionalEndpoints: legacy_ | regional_ = null,
    systemClockOffset: js.UndefOr[Double] = js.undefined,
    useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationOptionskeyst = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (!js.isUndefined(computeChecksums)) __obj.updateDynamic("computeChecksums")(computeChecksums.get.asInstanceOf[js.Any])
    if (!js.isUndefined(convertResponseTypes)) __obj.updateDynamic("convertResponseTypes")(convertResponseTypes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(correctClockSkew)) __obj.updateDynamic("correctClockSkew")(correctClockSkew.get.asInstanceOf[js.Any])
    if (credentialProvider != null) __obj.updateDynamic("credentialProvider")(credentialProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(credentials)) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customUserAgent != null) __obj.updateDynamic("customUserAgent")(customUserAgent.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamoDbCrc32)) __obj.updateDynamic("dynamoDbCrc32")(dynamoDbCrc32.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointCacheSize)) __obj.updateDynamic("endpointCacheSize")(endpointCacheSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endpointDiscoveryEnabled)) __obj.updateDynamic("endpointDiscoveryEnabled")(endpointDiscoveryEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hostPrefixEnabled)) __obj.updateDynamic("hostPrefixEnabled")(hostPrefixEnabled.get.asInstanceOf[js.Any])
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (paramValidation != null) __obj.updateDynamic("paramValidation")(paramValidation.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (retryDelayOptions != null) __obj.updateDynamic("retryDelayOptions")(retryDelayOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(s3BucketEndpoint)) __obj.updateDynamic("s3BucketEndpoint")(s3BucketEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3DisableBodySigning)) __obj.updateDynamic("s3DisableBodySigning")(s3DisableBodySigning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(s3ForcePathStyle)) __obj.updateDynamic("s3ForcePathStyle")(s3ForcePathStyle.get.asInstanceOf[js.Any])
    if (s3UsEast1RegionalEndpoint != null) __obj.updateDynamic("s3UsEast1RegionalEndpoint")(s3UsEast1RegionalEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(s3UseArnRegion)) __obj.updateDynamic("s3UseArnRegion")(s3UseArnRegion.get.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(signatureCache)) __obj.updateDynamic("signatureCache")(signatureCache.get.asInstanceOf[js.Any])
    if (signatureVersion != null) __obj.updateDynamic("signatureVersion")(signatureVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(sslEnabled)) __obj.updateDynamic("sslEnabled")(sslEnabled.get.asInstanceOf[js.Any])
    if (stsRegionalEndpoints != null) __obj.updateDynamic("stsRegionalEndpoints")(stsRegionalEndpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(systemClockOffset)) __obj.updateDynamic("systemClockOffset")(systemClockOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useAccelerateEndpoint)) __obj.updateDynamic("useAccelerateEndpoint")(useAccelerateEndpoint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptionskeyst]
  }
}

