package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteKnownHostKeysRequest extends js.Object {
  /**
    * The name of the instance for which you want to reset the host key or certificate.
    */
  var instanceName: ResourceName
}

object DeleteKnownHostKeysRequest {
  @scala.inline
  def apply(instanceName: ResourceName): DeleteKnownHostKeysRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[DeleteKnownHostKeysRequest]
  }
}

