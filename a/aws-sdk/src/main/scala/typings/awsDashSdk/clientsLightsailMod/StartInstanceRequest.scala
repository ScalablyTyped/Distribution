package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartInstanceRequest extends js.Object {
  /**
    * The name of the instance (a virtual private server) to start.
    */
  var instanceName: ResourceName
}

object StartInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): StartInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[StartInstanceRequest]
  }
}

