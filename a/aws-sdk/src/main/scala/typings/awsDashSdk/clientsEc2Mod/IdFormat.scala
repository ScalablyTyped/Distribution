package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdFormat extends js.Object {
  /**
    * The date in UTC at which you are permanently switched over to using longer IDs. If a deadline is not yet available for this resource type, this field is not returned.
    */
  var Deadline: js.UndefOr[DateTime] = js.undefined
  /**
    * The type of resource.
    */
  var Resource: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether longer IDs (17-character IDs) are enabled for the resource.
    */
  var UseLongIds: js.UndefOr[Boolean] = js.undefined
}

object IdFormat {
  @scala.inline
  def apply(Deadline: DateTime = null, Resource: String = null, UseLongIds: js.UndefOr[Boolean] = js.undefined): IdFormat = {
    val __obj = js.Dynamic.literal()
    if (Deadline != null) __obj.updateDynamic("Deadline")(Deadline)
    if (Resource != null) __obj.updateDynamic("Resource")(Resource)
    if (!js.isUndefined(UseLongIds)) __obj.updateDynamic("UseLongIds")(UseLongIds)
    __obj.asInstanceOf[IdFormat]
  }
}

