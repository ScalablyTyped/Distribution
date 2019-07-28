package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicKeyConfigRequest extends js.Object {
  /**
    * Request the ID for the public key configuration.
    */
  var Id: String
}

object GetPublicKeyConfigRequest {
  @scala.inline
  def apply(Id: String): GetPublicKeyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetPublicKeyConfigRequest]
  }
}

