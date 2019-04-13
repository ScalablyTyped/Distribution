package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /**
    * The project's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  /**
    * When the project was created.
    */
  var created: js.UndefOr[DateTime] = js.undefined
  /**
    * The default number of minutes (at the project level) a test run will execute before it times out. Default value is 60 minutes.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  /**
    * The project's name.
    */
  var name: js.UndefOr[Name] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    created: DateTime = null,
    defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
    name: Name = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (created != null) __obj.updateDynamic("created")(created)
    if (!js.isUndefined(defaultJobTimeoutMinutes)) __obj.updateDynamic("defaultJobTimeoutMinutes")(defaultJobTimeoutMinutes)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Project]
  }
}

