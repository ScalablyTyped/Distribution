package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceRequest extends js.Object {
  /**
    * The name of the instance.
    */
  var instanceName: ResourceName
}

object GetInstanceRequest {
  @scala.inline
  def apply(instanceName: ResourceName): GetInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[GetInstanceRequest]
  }
}

