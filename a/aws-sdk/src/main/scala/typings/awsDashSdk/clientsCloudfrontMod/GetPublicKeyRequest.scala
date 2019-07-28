package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicKeyRequest extends js.Object {
  /**
    * Request the ID for the public key.
    */
  var Id: String
}

object GetPublicKeyRequest {
  @scala.inline
  def apply(Id: String): GetPublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetPublicKeyRequest]
  }
}

