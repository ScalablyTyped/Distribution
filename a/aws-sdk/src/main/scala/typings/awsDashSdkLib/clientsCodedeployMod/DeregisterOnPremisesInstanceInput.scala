package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterOnPremisesInstanceInput extends js.Object {
  /**
    * The name of the on-premises instance to deregister.
    */
  var instanceName: InstanceName
}

object DeregisterOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName): DeregisterOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[DeregisterOnPremisesInstanceInput]
  }
}

