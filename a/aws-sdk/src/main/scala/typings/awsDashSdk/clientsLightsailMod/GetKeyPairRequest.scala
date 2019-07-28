package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyPairRequest extends js.Object {
  /**
    * The name of the key pair for which you are requesting information.
    */
  var keyPairName: ResourceName
}

object GetKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName): GetKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName)
  
    __obj.asInstanceOf[GetKeyPairRequest]
  }
}

