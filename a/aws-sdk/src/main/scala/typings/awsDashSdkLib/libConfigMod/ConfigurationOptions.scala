package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/config", "ConfigurationOptions")
@js.native
abstract class ConfigurationOptions () extends js.Object {
  /**
       * AWS access key ID.
       *
       * @deprecated
       */
  var accessKeyId: js.UndefOr[java.lang.String] = js.native
  /**
       * Whether to compute checksums for payload bodies when the service accepts it.
       * Currently supported in S3 only.
       */
  var computeChecksums: js.UndefOr[scala.Boolean] = js.native
  /**
       * Whether types are converted when parsing response data.
       */
  var convertResponseTypes: js.UndefOr[scala.Boolean] = js.native
  /**
       * Whether to apply a clock skew correction and retry requests that fail because of an skewed client clock.
       */
  var correctClockSkew: js.UndefOr[scala.Boolean] = js.native
  /**
       * The provider chain used to resolve credentials if no static credentials property is set.
       */
  var credentialProvider: js.UndefOr[
    awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.CredentialProviderChain
  ] = js.native
  /**
       * The AWS credentials to sign requests with.
       */
  var credentials: js.UndefOr[
    awsDashSdkLib.libCredentialsMod.Credentials | awsDashSdkLib.libCredentialsMod.CredentialsOptions | scala.Null
  ] = js.native
  /**
       * Sets a custom User-Agent string.
       * In node environments this will set the User-Agent header, but
       * browser environments this will set the X-Amz-User-Agent header.
       */
  var customUserAgent: js.UndefOr[java.lang.String] = js.native
  /**
       * Whether to validate the CRC32 checksum of HTTP response bodies returned
       * by DynamoDB.
       */
  var dynamoDbCrc32: js.UndefOr[scala.Boolean] = js.native
  /**
       * The size of the global cache storing endpoints from endpoint
       * discovery operations. Once endpoint cache is created, updating this setting
       * cannot change existing cache size.
       */
  var endpointCacheSize: js.UndefOr[scala.Double] = js.native
  /**
       * Whether to enable endpoint discovery for operations that allow optionally using an endpoint returned by 
       * the service.
       */
  var endpointDiscoveryEnabled: js.UndefOr[scala.Boolean] = js.native
  /**
       *  whether to marshal request parameters to the prefix of hostname.
       */
  var hostPrefixEnabled: js.UndefOr[scala.Boolean] = js.native
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
  var maxRedirects: js.UndefOr[scala.Double] = js.native
  /**
       * The maximum amount of retries to perform for a service request.
       */
  var maxRetries: js.UndefOr[scala.Double] = js.native
  /**
       * Returns whether input parameters should be validated against the operation description before sending the request.
       * Defaults to true.
       * Pass a map to enable any of the following specific validation features: min|max|pattern|enum
       */
  var paramValidation: js.UndefOr[ParamValidation | scala.Boolean] = js.native
  /**
       * The region to send service requests to.
       */
  var region: js.UndefOr[java.lang.String] = js.native
  /**
       * Returns A set of options to configure the retry delay on retryable errors.
       */
  var retryDelayOptions: js.UndefOr[RetryDelayOptions] = js.native
  /**
       * Whether the provided endpoint addresses an individual bucket.
       * false if it addresses the root API endpoint.
       */
  var s3BucketEndpoint: js.UndefOr[scala.Boolean] = js.native
  /**
       * Whether to disable S3 body signing when using signature version v4.
       */
  var s3DisableBodySigning: js.UndefOr[scala.Boolean] = js.native
  /**
       * Whether to force path style URLs for S3 objects.
       */
  var s3ForcePathStyle: js.UndefOr[scala.Boolean] = js.native
  /**
       * AWS secret access key.
       *
       * @deprecated
       */
  var secretAccessKey: js.UndefOr[java.lang.String] = js.native
  /**
       * AWS session token.
       *
       * @deprecated
       */
  var sessionToken: js.UndefOr[java.lang.String] = js.native
  /**
       * Whether the signature to sign requests with (overriding the API configuration) is cached.
       */
  var signatureCache: js.UndefOr[scala.Boolean] = js.native
  /**
       * The signature version to sign requests with (overriding the API configuration).
       * Possible values: 'v2'|'v3'|'v4'
       */
  var signatureVersion: js.UndefOr[
    awsDashSdkLib.awsDashSdkLibStrings.v2 | awsDashSdkLib.awsDashSdkLibStrings.v3 | awsDashSdkLib.awsDashSdkLibStrings.v4 | java.lang.String
  ] = js.native
  /**
       * Whether SSL is enabled for requests.
       */
  var sslEnabled: js.UndefOr[scala.Boolean] = js.native
  /**
       * An offset value in milliseconds to apply to all signing times.
       */
  var systemClockOffset: js.UndefOr[scala.Double] = js.native
  /**
       * Whether to use the Accelerate endpoint with the S3 service.
       */
  var useAccelerateEndpoint: js.UndefOr[scala.Boolean] = js.native
}

