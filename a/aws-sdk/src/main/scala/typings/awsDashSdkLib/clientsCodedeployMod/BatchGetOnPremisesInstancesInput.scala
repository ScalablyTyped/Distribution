package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetOnPremisesInstancesInput extends js.Object {
  /**
    * The names of the on-premises instances about which to get information.
    */
  var instanceNames: InstanceNameList
}

object BatchGetOnPremisesInstancesInput {
  @scala.inline
  def apply(instanceNames: InstanceNameList): BatchGetOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames)
  
    __obj.asInstanceOf[BatchGetOnPremisesInstancesInput]
  }
}

