package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOnPremisesInstanceInput extends js.Object {
  /**
    *  The name of the on-premises instance about which to get information. 
    */
  var instanceName: InstanceName = js.native
}

object GetOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName): GetOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetOnPremisesInstanceInput]
  }
}

