package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicKeyRequest extends js.Object {
  /**
    * Request the ID for the public key.
    */
  var Id: java.lang.String
}

object GetPublicKeyRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetPublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetPublicKeyRequest]
  }
}

