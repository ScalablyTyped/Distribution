package typings.awsCrt.mod

import typings.awsCrt.nativeAuthMod.AwsSigningConfig
import typings.awsCrt.nativeAuthMod.StringLike
import typings.awsCrt.nativeHttpMod.HttpRequest
import typings.awsCrt.nativeIoMod.ClientBootstrap
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
    extends typings.awsCrt.nativeAuthMod.AwsCredentialsProvider
  /* static members */
  object AwsCredentialsProvider {
    
    @JSImport("aws-crt", "auth.AwsCredentialsProvider")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def newDefault(): typings.awsCrt.nativeAuthMod.AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")().asInstanceOf[typings.awsCrt.nativeAuthMod.AwsCredentialsProvider]
    inline def newDefault(bootstrap: ClientBootstrap): typings.awsCrt.nativeAuthMod.AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")(bootstrap.asInstanceOf[js.Any]).asInstanceOf[typings.awsCrt.nativeAuthMod.AwsCredentialsProvider]
  }
  
  @JSImport("aws-crt", "auth.AwsSignatureType")
  @js.native
  object AwsSignatureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.nativeAuthMod.AwsSignatureType & Double] = js.native
    
    /* 2 */ val HttpRequestChunk: typings.awsCrt.nativeAuthMod.AwsSignatureType.HttpRequestChunk & Double = js.native
    
    /* 3 */ val HttpRequestEvent: typings.awsCrt.nativeAuthMod.AwsSignatureType.HttpRequestEvent & Double = js.native
    
    /* 0 */ val HttpRequestViaHeaders: typings.awsCrt.nativeAuthMod.AwsSignatureType.HttpRequestViaHeaders & Double = js.native
    
    /* 1 */ val HttpRequestViaQueryParams: typings.awsCrt.nativeAuthMod.AwsSignatureType.HttpRequestViaQueryParams & Double = js.native
  }
  
  @JSImport("aws-crt", "auth.AwsSignedBodyHeaderType")
  @js.native
  object AwsSignedBodyHeaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.nativeAuthMod.AwsSignedBodyHeaderType & Double] = js.native
    
    /* 0 */ val None: typings.awsCrt.nativeAuthMod.AwsSignedBodyHeaderType.None & Double = js.native
    
    /* 1 */ val XAmzContentSha256: typings.awsCrt.nativeAuthMod.AwsSignedBodyHeaderType.XAmzContentSha256 & Double = js.native
  }
  
  @JSImport("aws-crt", "auth.AwsSignedBodyValue")
  @js.native
  object AwsSignedBodyValue extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsCrt.nativeAuthMod.AwsSignedBodyValue & String] = js.native
    
    /* "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855" */ val EmptySha256: typings.awsCrt.nativeAuthMod.AwsSignedBodyValue.EmptySha256 & String = js.native
    
    /* "STREAMING-AWS4-HMAC-SHA256-EVENTS" */ val StreamingAws4HmacSha256Events: typings.awsCrt.nativeAuthMod.AwsSignedBodyValue.StreamingAws4HmacSha256Events & String = js.native
    
    /* "STREAMING-AWS4-HMAC-SHA256-PAYLOAD" */ val StreamingAws4HmacSha256Payload: typings.awsCrt.nativeAuthMod.AwsSignedBodyValue.StreamingAws4HmacSha256Payload & String = js.native
    
    /* "UNSIGNED-PAYLOAD" */ val UnsignedPayload: typings.awsCrt.nativeAuthMod.AwsSignedBodyValue.UnsignedPayload & String = js.native
  }
  
  @JSImport("aws-crt", "auth.AwsSigningAlgorithm")
  @js.native
  object AwsSigningAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.nativeAuthMod.AwsSigningAlgorithm & Double] = js.native
    
    /* 0 */ val SigV4: typings.awsCrt.nativeAuthMod.AwsSigningAlgorithm.SigV4 & Double = js.native
    
    /* 1 */ val SigV4Asymmetric: typings.awsCrt.nativeAuthMod.AwsSigningAlgorithm.SigV4Asymmetric & Double = js.native
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
