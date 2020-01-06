package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSummary extends js.Object {
  /**
    * The time the input was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the input.
    */
  var inputArn: js.UndefOr[InputArn] = js.native
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  /**
    * The name of the input.
    */
  var inputName: js.UndefOr[InputName] = js.native
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the input.
    */
  var status: js.UndefOr[InputStatus] = js.native
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
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (inputArn != null) __obj.updateDynamic("inputArn")(inputArn.asInstanceOf[js.Any])
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (lastUpdateTime != null) __obj.updateDynamic("lastUpdateTime")(lastUpdateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSummary]
  }
}

