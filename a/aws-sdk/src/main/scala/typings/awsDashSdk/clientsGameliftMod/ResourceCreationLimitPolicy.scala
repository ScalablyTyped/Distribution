package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceCreationLimitPolicy extends js.Object {
  /**
    * Maximum number of game sessions that an individual can create during the policy period. 
    */
  var NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Time span used in evaluating the resource creation limit policy. 
    */
  var PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
}

object ResourceCreationLimitPolicy {
  @scala.inline
  def apply(
    NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined,
    PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
  ): ResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NewGameSessionsPerCreator)) __obj.updateDynamic("NewGameSessionsPerCreator")(NewGameSessionsPerCreator)
    if (!js.isUndefined(PolicyPeriodInMinutes)) __obj.updateDynamic("PolicyPeriodInMinutes")(PolicyPeriodInMinutes)
    __obj.asInstanceOf[ResourceCreationLimitPolicy]
  }
}

