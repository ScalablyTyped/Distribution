package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Outcome extends js.Object {
  /**
    * The timestamp when the outcome was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The outcome description.
    */
  var description: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.description] = js.native
  /**
    * The timestamp when the outcome was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The outcome name.
    */
  var name: js.UndefOr[identifier] = js.native
}

object Outcome {
  @scala.inline
  def apply(
    createdTime: time = null,
    description: description = null,
    lastUpdatedTime: time = null,
    name: identifier = null
  ): Outcome = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outcome]
  }
}

