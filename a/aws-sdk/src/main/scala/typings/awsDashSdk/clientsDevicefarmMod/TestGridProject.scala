package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestGridProject extends js.Object {
  /**
    * The ARN for the project.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.native
  /**
    * When the project was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * A human-readable description for the project.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A human-readable name for the project.
    */
  var name: js.UndefOr[String] = js.native
}

object TestGridProject {
  @scala.inline
  def apply(
    arn: DeviceFarmArn = null,
    created: DateTime = null,
    description: String = null,
    name: String = null
  ): TestGridProject = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestGridProject]
  }
}

