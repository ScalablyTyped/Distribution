package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateEnteredEventDetails extends js.Object {
  /**
    * The string that contains the JSON input data for the state.
    */
  var input: js.UndefOr[SensitiveData] = js.undefined
  /**
    * The name of the state.
    */
  var name: Name
}

object StateEnteredEventDetails {
  @scala.inline
  def apply(name: Name, input: SensitiveData = null): StateEnteredEventDetails = {
    val __obj = js.Dynamic.literal(name = name)
    if (input != null) __obj.updateDynamic("input")(input)
    __obj.asInstanceOf[StateEnteredEventDetails]
  }
}

