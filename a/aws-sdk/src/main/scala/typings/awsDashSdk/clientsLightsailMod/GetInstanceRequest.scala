package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceRequest extends js.Object {
  /**
    * The name of the instance.
    */
  var instanceName: ResourceName = js.native
}

object GetInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceRequest]
  }
}

