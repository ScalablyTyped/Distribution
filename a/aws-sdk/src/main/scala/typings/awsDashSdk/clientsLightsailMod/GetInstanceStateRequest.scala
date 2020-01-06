package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceStateRequest extends js.Object {
  /**
    * The name of the instance to get state information about.
    */
  var instanceName: ResourceName = js.native
}

object GetInstanceStateRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstanceStateRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceStateRequest]
  }
}

