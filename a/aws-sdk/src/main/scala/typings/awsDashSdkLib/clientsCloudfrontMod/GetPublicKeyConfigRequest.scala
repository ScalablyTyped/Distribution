package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicKeyConfigRequest extends js.Object {
  /**
    * Request the ID for the public key configuration.
    */
  var Id: java.lang.String
}

object GetPublicKeyConfigRequest {
  @scala.inline
  def apply(Id: java.lang.String): GetPublicKeyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetPublicKeyConfigRequest]
  }
}

