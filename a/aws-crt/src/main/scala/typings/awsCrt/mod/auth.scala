package typings.awsCrt.mod

import typings.awsCrt.distNativeAuthMod.AwsSigningConfig
import typings.awsCrt.distNativeAuthMod.CognitoCredentialsProviderConfig
import typings.awsCrt.distNativeBindingMod.StringLike
import typings.awsCrt.distNativeHttpMod.HttpRequest
import typings.awsCrt.distNativeIoMod.ClientBootstrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  @JSImport("aws-crt", "auth")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt", "auth.AwsCredentialsProvider")
  @js.native
  /* protected */ open class AwsCredentialsProvider ()
    extends typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider
  /* static members */
  object AwsCredentialsProvider {
    
    @JSImport("aws-crt", "auth.AwsCredentialsProvider")
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
    inline def newCognito(config: CognitoCredentialsProviderConfig): typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newCognito")(config.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider]
    
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
    inline def newDefault(): typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")().asInstanceOf[typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider]
    inline def newDefault(bootstrap: ClientBootstrap): typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")(bootstrap.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider]
    
    /**
      * Creates a new credentials provider that returns a fixed set of credentials.
      *
      * @param access_key access key to use in the static credentials
      * @param secret_key secret key to use in the static credentials
      * @param session_token (optional) session token to use in the static credentials
      *
      * @returns a new credentials provider that will return a fixed set of AWS credentials
      */
    inline def newStatic(access_key: StringLike, secret_key: StringLike): typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("newStatic")(access_key.asInstanceOf[js.Any], secret_key.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider]
    inline def newStatic(access_key: StringLike, secret_key: StringLike, session_token: StringLike): typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("newStatic")(access_key.asInstanceOf[js.Any], secret_key.asInstanceOf[js.Any], session_token.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeAuthMod.AwsCredentialsProvider]
  }
  
  @JSImport("aws-crt", "auth.AwsSignatureType")
  @js.native
  object AwsSignatureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distNativeAuthMod.AwsSignatureType & Double] = js.native
    
    /* 2 */ val HttpRequestChunk: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestChunk & Double = js.native
    
    /* 3 */ val HttpRequestEvent: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestEvent & Double = js.native
    
    /* 0 */ val HttpRequestViaHeaders: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestViaHeaders & Double = js.native
    
    /* 1 */ val HttpRequestViaQueryParams: typings.awsCrt.distNativeAuthMod.AwsSignatureType.HttpRequestViaQueryParams & Double = js.native
  }
  
  @JSImport("aws-crt", "auth.AwsSignedBodyHeaderType")
  @js.native
  object AwsSignedBodyHeaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distNativeAuthMod.AwsSignedBodyHeaderType & Double] = js.native
    
    /* 0 */ val None: typings.awsCrt.distNativeAuthMod.AwsSignedBodyHeaderType.None & Double = js.native
    
    /* 1 */ val XAmzContentSha256: typings.awsCrt.distNativeAuthMod.AwsSignedBodyHeaderType.XAmzContentSha256 & Double = js.native
  }
  
  @JSImport("aws-crt", "auth.AwsSignedBodyValue")
  @js.native
  object AwsSignedBodyValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue & String] = js.native
    
    /* "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855" */ val EmptySha256: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.EmptySha256 & String = js.native
    
    /* "STREAMING-AWS4-HMAC-SHA256-EVENTS" */ val StreamingAws4HmacSha256Events: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.StreamingAws4HmacSha256Events & String = js.native
    
    /* "STREAMING-AWS4-HMAC-SHA256-PAYLOAD" */ val StreamingAws4HmacSha256Payload: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.StreamingAws4HmacSha256Payload & String = js.native
    
    /* "UNSIGNED-PAYLOAD" */ val UnsignedPayload: typings.awsCrt.distNativeAuthMod.AwsSignedBodyValue.UnsignedPayload & String = js.native
  }
  
  @JSImport("aws-crt", "auth.AwsSigningAlgorithm")
  @js.native
  object AwsSigningAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distNativeAuthMod.AwsSigningAlgorithm & Double] = js.native
    
    /* 0 */ val SigV4: typings.awsCrt.distNativeAuthMod.AwsSigningAlgorithm.SigV4 & Double = js.native
    
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
}
