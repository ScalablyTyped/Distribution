package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances about which to get information. The maximum number of instance names you can specify is 25.
    */
  var instanceNames: InstanceNameList = js.native
}

object BatchGetOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList): BatchGetOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetOnPremisesInstancesInput]
  }
}

