package typings.awsCrt

import typings.awsCrt.distCommonAuthMod.AwsSigningConfigBase
import typings.awsCrt.distNativeBindingMod.StringLike
import typings.awsCrt.distNativeHttpMod.HttpProxyOptions
import typings.awsCrt.distNativeHttpMod.HttpRequest
import typings.awsCrt.distNativeIoMod.ClientBootstrap
import typings.awsCrt.distNativeIoMod.ClientTlsContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeAuthMod {
  
  @JSImport("aws-crt/dist/native/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/native/auth", "AwsCredentialsProvider")
  @js.native
  /* protected */ open class AwsCredentialsProvider ()
    extends typings.awsCrt.distNativeBindingMod.AwsCredentialsProvider
  /* static members */
  object AwsCredentialsProvider {
    
    @JSImport("aws-crt/dist/native/auth", "AwsCredentialsProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new credentials provider that sources credentials from the AWS Cognito Identity service via the
      * GetCredentialsForIdentity http API.
      *
      * @param config provider configuration necessary to make GetCredentialsForIdentity web requests
      *
      * @returns a new credentials provider that returns credentials sourced from the AWS Cognito Identity service
      */
    inline def newCognito(config: CognitoCredentialsProviderConfig): AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newCognito")(config.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialsProvider]
    
    /**
      * Creates a new default credentials provider to be used internally for AWS credentials resolution:
      *
      *   The CRT's default provider chain currently sources in this order:
      *
      *     1. Environment
      *     2. Profile
      *     3. (conditional, off by default) ECS
      *     4. (conditional, on by default) EC2 Instance Metadata
      *
      * @param bootstrap (optional) client bootstrap to be used to establish any required network connections
      *
      * @returns a new credentials provider using default credentials resolution rules
      */
    inline def newDefault(): AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")().asInstanceOf[AwsCredentialsProvider]
    inline def newDefault(bootstrap: ClientBootstrap): AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")(bootstrap.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialsProvider]
    
    /**
      * Creates a new credentials provider that returns a fixed set of credentials.
      *
      * @param access_key access key to use in the static credentials
      * @param secret_key secret key to use in the static credentials
      * @param session_token (optional) session token to use in the static credentials
      *
      * @returns a new credentials provider that will return a fixed set of AWS credentials
      */
    inline def newStatic(access_key: StringLike, secret_key: StringLike): AwsCredentialsProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("newStatic")(access_key.asInstanceOf[js.Any], secret_key.asInstanceOf[js.Any])).asInstanceOf[AwsCredentialsProvider]
    inline def newStatic(access_key: StringLike, secret_key: StringLike, session_token: StringLike): AwsCredentialsProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("newStatic")(access_key.asInstanceOf[js.Any], secret_key.asInstanceOf[js.Any], session_token.asInstanceOf[js.Any])).asInstanceOf[AwsCredentialsProvider]
  }
  
  @js.native
  sealed trait AwsSignatureType extends StObject
  @JSImport("aws-crt/dist/native/auth", "AwsSignatureType")
  @js.native
  object AwsSignatureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AwsSignatureType & Double] = js.native
    
    /** Sign an http request payload chunk */
    @js.native
    sealed trait HttpRequestChunk
      extends StObject
         with AwsSignatureType
    /* 2 */ val HttpRequestChunk: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestChunk & Double = js.native
    
    /** Sign an event stream event */
    @js.native
    sealed trait HttpRequestEvent
      extends StObject
         with AwsSignatureType
    /* 3 */ val HttpRequestEvent: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestEvent & Double = js.native
    
    /** Sign an http request and apply the signing results as headers */
    @js.native
    sealed trait HttpRequestViaHeaders
      extends StObject
         with AwsSignatureType
    /* 0 */ val HttpRequestViaHeaders: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestViaHeaders & Double = js.native
    
    /** Sign an http request and apply the signing results as query params */
    @js.native
    sealed trait HttpRequestViaQueryParams
      extends StObject
         with AwsSignatureType
    /* 1 */ val HttpRequestViaQueryParams: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestViaQueryParams & Double = js.native
  }
  
  @js.native
  sealed trait AwsSignedBodyHeaderType extends StObject
  @JSImport("aws-crt/dist/native/auth", "AwsSignedBodyHeaderType")
  @js.native
  object AwsSignedBodyHeaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AwsSignedBodyHeaderType & Double] = js.native
    
    /** Do not add a header containing the canonical request payload value */
    @js.native
    sealed trait None
      extends StObject
         with AwsSignedBodyHeaderType
    /* 0 */ val None: typings.awsCrt.distNativeAuthMod.AwsSignedBodyHeaderType.None & Double = js.native
    
    /** Add the X-Amz-Content-Sha256 header with the canonical request payload value */
    @js.native
    sealed trait XAmzContentSha256
      extends StObject
         with AwsSignedBodyHeaderType
    /* 1 */ val XAmzContentSha256: typings.awsCrt.distNativeAuthMod.AwsSignedBodyHeaderType.XAmzContentSha256 & Double = js.native
  }
  
  @js.native
  sealed trait AwsSignedBodyValue extends StObject
  @JSImport("aws-crt/dist/native/auth", "AwsSignedBodyValue")
  @js.native
  object AwsSignedBodyValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AwsSignedBodyValue & String] = js.native
    
    /** Use the SHA-256 of the empty string as the canonical request payload value */
    @js.native
    sealed trait EmptySha256
      extends StObject
         with AwsSignedBodyValue
    /* "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855" */ val EmptySha256: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.EmptySha256 & String = js.native
    
    /** Use the literal string 'STREAMING-AWS4-HMAC-SHA256-EVENTS' as the canonical request payload value  */
    @js.native
    sealed trait StreamingAws4HmacSha256Events
      extends StObject
         with AwsSignedBodyValue
    /* "STREAMING-AWS4-HMAC-SHA256-EVENTS" */ val StreamingAws4HmacSha256Events: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.StreamingAws4HmacSha256Events & String = js.native
    
    /** Use the literal string 'STREAMING-AWS4-HMAC-SHA256-PAYLOAD' as the canonical request payload value  */
    @js.native
    sealed trait StreamingAws4HmacSha256Payload
      extends StObject
         with AwsSignedBodyValue
    /* "STREAMING-AWS4-HMAC-SHA256-PAYLOAD" */ val StreamingAws4HmacSha256Payload: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.StreamingAws4HmacSha256Payload & String = js.native
    
    /** Use the literal string 'UNSIGNED-PAYLOAD' as the canonical request payload value  */
    @js.native
    sealed trait UnsignedPayload
      extends StObject
         with AwsSignedBodyValue
    /* "UNSIGNED-PAYLOAD" */ val UnsignedPayload: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.UnsignedPayload & String = js.native
  }
  
  @js.native
  sealed trait AwsSigningAlgorithm extends StObject
  @JSImport("aws-crt/dist/native/auth", "AwsSigningAlgorithm")
  @js.native
  object AwsSigningAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AwsSigningAlgorithm & Double] = js.native
    
    /** Use the Aws signature version 4 signing process to sign the request */
    @js.native
    sealed trait SigV4
      extends StObject
         with AwsSigningAlgorithm
    /* 0 */ val SigV4: typings.awsCrt.distNativeAuthMod.AwsSigningAlgorithm.SigV4 & Double = js.native
    
    /** Use the Aws signature version 4 Asymmetric signing process to sign the request */
    @js.native
    sealed trait SigV4Asymmetric
      extends StObject
         with AwsSigningAlgorithm
    /* 1 */ val SigV4Asymmetric: typings.awsCrt.distNativeAuthMod.AwsSigningAlgorithm.SigV4Asymmetric & Double = js.native
  }
  
  inline def awsSignRequest(request: HttpRequest, config: AwsSigningConfig): js.Promise[HttpRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("aws_sign_request")(request.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpRequest]]
  
  inline def awsVerifySigv4aSigning(
    request: HttpRequest,
    config: AwsSigningConfig,
    expected_canonical_request: StringLike,
    signature: StringLike,
    ecc_key_pub_x: StringLike,
    ecc_key_pub_y: StringLike
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aws_verify_sigv4a_signing")(request.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expected_canonical_request.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], ecc_key_pub_x.asInstanceOf[js.Any], ecc_key_pub_y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait AwsSigningConfig
    extends StObject
       with AwsSigningConfigBase {
    
    /** Which signing process to invoke */
    var algorithm: AwsSigningAlgorithm
    
    /** Query param signing only: how long the pre-signed URL is valid for */
    var expiration_in_seconds: js.UndefOr[Double] = js.undefined
    
    /**
      * Headers to skip when signing.
      *
      * Skipping auth-required headers will result in an unusable signature.
      * Headers injected by the signing process are not skippable.
      * This function does not override the internal check function
      * (x-amzn-trace-id, user-agent), but rather supplements it.
      * In particular, a header will get signed if and only if it returns
      * true to both the internal check (skips x-amzn-trace-id, user-agent)
      * and is found in this list (if defined)
      */
    var header_blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Should the session token be omitted from the signing process?  This should only be
      * true when making a websocket handshake with IoT Core.
      */
    var omit_session_token: js.UndefOr[Boolean] = js.undefined
    
    /** Credentials provider to fetch signing credentials with */
    var provider: AwsCredentialsProvider
    
    /**
      * Whether the resource paths are normalized when building the canonical request.
      */
    var should_normalize_uri_path: js.UndefOr[Boolean] = js.undefined
    
    /** What kind of signature to compute */
    var signature_type: AwsSignatureType
    
    /** Controls what header, if any, should be added to the request, containing the body value */
    var signed_body_header: js.UndefOr[AwsSignedBodyHeaderType] = js.undefined
    
    /**
      * Value to use as the canonical request's body value.
      *
      * Typically, this is the SHA-256 of the payload, written as lowercase hex.
      * If this has been precalculated, it can be set here.
      * Special values used by certain services can also be set (see {@link AwsSignedBodyValue}).
      * If undefined (the default), the typical value will be calculated from the payload during signing.
      */
    var signed_body_value: js.UndefOr[String] = js.undefined
    
    /**
      * Set true to double-encode the resource path when constructing the
      * canonical request. By default, all services except S3 use double encoding.
      */
    var use_double_uri_encode: js.UndefOr[Boolean] = js.undefined
  }
  object AwsSigningConfig {
    
    inline def apply(
      algorithm: AwsSigningAlgorithm,
      provider: AwsCredentialsProvider,
      region: String,
      signature_type: AwsSignatureType
    ): AwsSigningConfig = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], signature_type = signature_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[AwsSigningConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwsSigningConfig] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: AwsSigningAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setExpiration_in_seconds(value: Double): Self = StObject.set(x, "expiration_in_seconds", value.asInstanceOf[js.Any])
      
      inline def setExpiration_in_secondsUndefined: Self = StObject.set(x, "expiration_in_seconds", js.undefined)
      
      inline def setHeader_blacklist(value: js.Array[String]): Self = StObject.set(x, "header_blacklist", value.asInstanceOf[js.Any])
      
      inline def setHeader_blacklistUndefined: Self = StObject.set(x, "header_blacklist", js.undefined)
      
      inline def setHeader_blacklistVarargs(value: String*): Self = StObject.set(x, "header_blacklist", js.Array(value*))
      
      inline def setOmit_session_token(value: Boolean): Self = StObject.set(x, "omit_session_token", value.asInstanceOf[js.Any])
      
      inline def setOmit_session_tokenUndefined: Self = StObject.set(x, "omit_session_token", js.undefined)
      
      inline def setProvider(value: AwsCredentialsProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setShould_normalize_uri_path(value: Boolean): Self = StObject.set(x, "should_normalize_uri_path", value.asInstanceOf[js.Any])
      
      inline def setShould_normalize_uri_pathUndefined: Self = StObject.set(x, "should_normalize_uri_path", js.undefined)
      
      inline def setSignature_type(value: AwsSignatureType): Self = StObject.set(x, "signature_type", value.asInstanceOf[js.Any])
      
      inline def setSigned_body_header(value: AwsSignedBodyHeaderType): Self = StObject.set(x, "signed_body_header", value.asInstanceOf[js.Any])
      
      inline def setSigned_body_headerUndefined: Self = StObject.set(x, "signed_body_header", js.undefined)
      
      inline def setSigned_body_value(value: String): Self = StObject.set(x, "signed_body_value", value.asInstanceOf[js.Any])
      
      inline def setSigned_body_valueUndefined: Self = StObject.set(x, "signed_body_value", js.undefined)
      
      inline def setUse_double_uri_encode(value: Boolean): Self = StObject.set(x, "use_double_uri_encode", value.asInstanceOf[js.Any])
      
      inline def setUse_double_uri_encodeUndefined: Self = StObject.set(x, "use_double_uri_encode", js.undefined)
    }
  }
  
  trait CognitoCredentialsProviderConfig extends StObject {
    
    /**
      * Client bootstrap to use.  In almost all cases, this can be left undefined.
      */
    var bootstrap: js.UndefOr[ClientBootstrap] = js.undefined
    
    /**
      * Optional ARN of the role to be assumed when multiple roles were received in the token from the identity provider.
      */
    var customRoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * Cognito service regional endpoint to source credentials from.
      */
    var endpoint: String
    
    /**
      * Proxy configuration if connecting through an HTTP proxy is desired
      */
    var httpProxyOptions: js.UndefOr[HttpProxyOptions] = js.undefined
    
    /**
      * Cognito identity to fetch credentials relative to.
      */
    var identity: String
    
    /**
      * Optional set of identity provider token pairs to allow for authenticated identity access.
      */
    var logins: js.UndefOr[js.Array[CognitoLoginTokenPair]] = js.undefined
    
    /**
      * TLS context for secure socket connections.
      * If undefined, then a default tls context will be created and used.
      */
    var tlsContext: js.UndefOr[ClientTlsContext] = js.undefined
  }
  object CognitoCredentialsProviderConfig {
    
    inline def apply(endpoint: String, identity: String): CognitoCredentialsProviderConfig = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoCredentialsProviderConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoCredentialsProviderConfig] (val x: Self) extends AnyVal {
      
      inline def setBootstrap(value: ClientBootstrap): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
      
      inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
      
      inline def setCustomRoleArn(value: String): Self = StObject.set(x, "customRoleArn", value.asInstanceOf[js.Any])
      
      inline def setCustomRoleArnUndefined: Self = StObject.set(x, "customRoleArn", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHttpProxyOptions(value: HttpProxyOptions): Self = StObject.set(x, "httpProxyOptions", value.asInstanceOf[js.Any])
      
      inline def setHttpProxyOptionsUndefined: Self = StObject.set(x, "httpProxyOptions", js.undefined)
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setLogins(value: js.Array[CognitoLoginTokenPair]): Self = StObject.set(x, "logins", value.asInstanceOf[js.Any])
      
      inline def setLoginsUndefined: Self = StObject.set(x, "logins", js.undefined)
      
      inline def setLoginsVarargs(value: CognitoLoginTokenPair*): Self = StObject.set(x, "logins", js.Array(value*))
      
      inline def setTlsContext(value: ClientTlsContext): Self = StObject.set(x, "tlsContext", value.asInstanceOf[js.Any])
      
      inline def setTlsContextUndefined: Self = StObject.set(x, "tlsContext", js.undefined)
    }
  }
  
  trait CognitoLoginTokenPair extends StObject {
    
    /**
      * Name of an identity provider
      */
    var identityProviderName: String
    
    /**
      * Valid login token source from the identity provider
      */
    var identityProviderToken: String
  }
  object CognitoLoginTokenPair {
    
    inline def apply(identityProviderName: String, identityProviderToken: String): CognitoLoginTokenPair = {
      val __obj = js.Dynamic.literal(identityProviderName = identityProviderName.asInstanceOf[js.Any], identityProviderToken = identityProviderToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoLoginTokenPair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoLoginTokenPair] (val x: Self) extends AnyVal {
      
      inline def setIdentityProviderName(value: String): Self = StObject.set(x, "identityProviderName", value.asInstanceOf[js.Any])
      
      inline def setIdentityProviderToken(value: String): Self = StObject.set(x, "identityProviderToken", value.asInstanceOf[js.Any])
    }
  }
}
