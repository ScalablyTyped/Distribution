package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterOnPremisesInstanceInput extends js.Object {
  /**
    * The name of the on-premises instance to deregister.
    */
  var instanceName: InstanceName = js.native
}

object DeregisterOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName): DeregisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterOnPremisesInstanceInput]
  }
}

