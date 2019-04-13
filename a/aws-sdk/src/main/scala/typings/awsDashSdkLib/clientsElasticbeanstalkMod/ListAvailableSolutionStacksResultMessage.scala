package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAvailableSolutionStacksResultMessage extends js.Object {
  /**
    *  A list of available solution stacks and their SolutionStackDescription. 
    */
  var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.undefined
  /**
    * A list of available solution stacks.
    */
  var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.undefined
}

object ListAvailableSolutionStacksResultMessage {
  @scala.inline
  def apply(
    SolutionStackDetails: AvailableSolutionStackDetailsList = null,
    SolutionStacks: AvailableSolutionStackNamesList = null
  ): ListAvailableSolutionStacksResultMessage = {
    val __obj = js.Dynamic.literal()
    if (SolutionStackDetails != null) __obj.updateDynamic("SolutionStackDetails")(SolutionStackDetails)
    if (SolutionStacks != null) __obj.updateDynamic("SolutionStacks")(SolutionStacks)
    __obj.asInstanceOf[ListAvailableSolutionStacksResultMessage]
  }
}

