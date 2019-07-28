package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputConfiguration extends js.Object {
  /**
    * The time the input was created.
    */
  var creationTime: Timestamp
  /**
    * The ARN of the input.
    */
  var inputArn: InputArn
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.undefined
  /**
    * The name of the input.
    */
  var inputName: InputName
  /**
    * The last time the input was updated.
    */
  var lastUpdateTime: Timestamp
  /**
    * The status of the input.
    */
  var status: InputStatus
}

object InputConfiguration {
  @scala.inline
  def apply(
    creationTime: Timestamp,
    inputArn: InputArn,
    inputName: InputName,
    lastUpdateTime: Timestamp,
    status: InputStatus,
    inputDescription: InputDescription = null
  ): InputConfiguration = {
    val __obj = js.Dynamic.literal(creationTime = creationTime, inputArn = inputArn, inputName = inputName, lastUpdateTime = lastUpdateTime, status = status.asInstanceOf[js.Any])
    if (inputDescription != null) __obj.updateDynamic("inputDescription")(inputDescription)
    __obj.asInstanceOf[InputConfiguration]
  }
}

