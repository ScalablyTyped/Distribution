package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAvailableSolutionStacksResultMessage extends js.Object {
  /**
    *  A list of available solution stacks and their SolutionStackDescription. 
    */
  var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.native
  /**
    * A list of available solution stacks.
    */
  var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.native
}

object ListAvailableSolutionStacksResultMessage {
  @scala.inline
  def apply(
    SolutionStackDetails: AvailableSolutionStackDetailsList = null,
    SolutionStacks: AvailableSolutionStackNamesList = null
  ): ListAvailableSolutionStacksResultMessage = {
    val __obj = js.Dynamic.literal()
    if (SolutionStackDetails != null) __obj.updateDynamic("SolutionStackDetails")(SolutionStackDetails.asInstanceOf[js.Any])
    if (SolutionStacks != null) __obj.updateDynamic("SolutionStacks")(SolutionStacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAvailableSolutionStacksResultMessage]
  }
}

