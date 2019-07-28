package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceStateRequest extends js.Object {
  /**
    * The name of the instance to get state information about.
    */
  var instanceName: ResourceName
}

object GetInstanceStateRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstanceStateRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[GetInstanceStateRequest]
  }
}

