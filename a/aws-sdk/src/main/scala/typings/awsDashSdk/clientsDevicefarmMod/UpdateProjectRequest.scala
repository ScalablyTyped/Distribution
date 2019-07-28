package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProjectRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project whose name you wish to update.
    */
  var arn: AmazonResourceName
  /**
    * The number of minutes a test run in the project will execute before it times out.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  /**
    * A string representing the new name of the project that you are updating.
    */
  var name: js.UndefOr[Name] = js.undefined
}

object UpdateProjectRequest {
  @scala.inline
  def apply(
    arn: AmazonResourceName,
    defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
    name: Name = null
  ): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (!js.isUndefined(defaultJobTimeoutMinutes)) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

