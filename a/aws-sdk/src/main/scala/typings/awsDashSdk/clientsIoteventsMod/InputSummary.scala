package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSummary extends js.Object {
  /**
    * The time the input was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the input.
    */
  var inputArn: js.UndefOr[InputArn] = js.undefined
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.undefined
  /**
    * The name of the input.
    */
  var inputName: js.UndefOr[InputName] = js.undefined
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The status of the input.
    */
  var status: js.UndefOr[InputStatus] = js.undefined
}

object InputSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    inputArn: InputArn = null,
    inputDescription: InputDescription = null,
    inputName: InputName = null,
    lastUpdateTime: Timestamp = null,
    status: InputStatus = null
  ): InputSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (inputArn != null) __obj.updateDynamic("inputArn")(inputArn)
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription)
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSummary]
  }
}

