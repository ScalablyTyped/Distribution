package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportKeyPairRequest extends js.Object {
  /**
    * The name of the key pair for which you want to import the public key.
    */
  var keyPairName: ResourceName
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: Base64
}

object ImportKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName, publicKeyBase64: Base64): ImportKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName, publicKeyBase64 = publicKeyBase64)
  
    __obj.asInstanceOf[ImportKeyPairRequest]
  }
}

