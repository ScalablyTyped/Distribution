package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteKeyPairRequest extends js.Object {
  /**
    * The name of the key pair to delete.
    */
  var keyPairName: ResourceName
}

object DeleteKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName)
  
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
}

