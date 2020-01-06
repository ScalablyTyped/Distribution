package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateIncreaseCriteria extends js.Object {
  /**
    * The threshold for number of notified things that will initiate the increase in rate of rollout.
    */
  var numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.native
  /**
    * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
    */
  var numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.native
}

object RateIncreaseCriteria {
  @scala.inline
  def apply(numberOfNotifiedThings: Int | Double = null, numberOfSucceededThings: Int | Double = null): RateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    if (numberOfNotifiedThings != null) __obj.updateDynamic("numberOfNotifiedThings")(numberOfNotifiedThings.asInstanceOf[js.Any])
    if (numberOfSucceededThings != null) __obj.updateDynamic("numberOfSucceededThings")(numberOfSucceededThings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateIncreaseCriteria]
  }
}

