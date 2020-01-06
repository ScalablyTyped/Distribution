package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicKeyRequest extends js.Object {
  /**
    * The request to add a public key to CloudFront.
    */
  var PublicKeyConfig: typings.awsDashSdk.clientsCloudfrontMod.PublicKeyConfig = js.native
}

object CreatePublicKeyRequest {
  @scala.inline
  def apply(PublicKeyConfig: PublicKeyConfig): CreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePublicKeyRequest]
  }
}

