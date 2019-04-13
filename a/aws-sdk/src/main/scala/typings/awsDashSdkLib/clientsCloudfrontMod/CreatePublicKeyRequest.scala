package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePublicKeyRequest extends js.Object {
  /**
    * The request to add a public key to CloudFront.
    */
  var PublicKeyConfig: awsDashSdkLib.clientsCloudfrontMod.PublicKeyConfig
}

object CreatePublicKeyRequest {
  @scala.inline
  def apply(PublicKeyConfig: PublicKeyConfig): CreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(PublicKeyConfig = PublicKeyConfig)
  
    __obj.asInstanceOf[CreatePublicKeyRequest]
  }
}

