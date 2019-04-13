package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOnPremisesInstanceInput extends js.Object {
  /**
    *  The name of the on-premises instance about which to get information. 
    */
  var instanceName: InstanceName
}

object GetOnPremisesInstanceInput {
  @scala.inline
  def apply(instanceName: InstanceName): GetOnPremisesInstanceInput = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
  
    __obj.asInstanceOf[GetOnPremisesInstanceInput]
  }
}

