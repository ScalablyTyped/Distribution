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
    NewGameSessionsPerCreator: Int | scala.Double = null,
    PolicyPeriodInMinutes: Int | scala.Double = null
  ): ResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    if (NewGameSessionsPerCreator != null) __obj.updateDynamic("NewGameSessionsPerCreator")(NewGameSessionsPerCreator.asInstanceOf[js.Any])
    if (PolicyPeriodInMinutes != null) __obj.updateDynamic("PolicyPeriodInMinutes")(PolicyPeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCreationLimitPolicy]
  }
}

