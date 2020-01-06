package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  /**
    * The Unix epoch timestamp in seconds for when the update was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * Any errors associated with a Failed update.
    */
  var errors: js.UndefOr[ErrorDetails] = js.native
  /**
    * A UUID that is used to track the update.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A key-value map that contains the parameters associated with the update.
    */
  var params: js.UndefOr[UpdateParams] = js.native
  /**
    * The current status of the update.
    */
  var status: js.UndefOr[UpdateStatus] = js.native
  /**
    * The type of the update.
    */
  var `type`: js.UndefOr[UpdateType] = js.native
}

object Update {
  @scala.inline
  def apply(
    createdAt: Timestamp = null,
    errors: ErrorDetails = null,
    id: String = null,
    params: UpdateParams = null,
    status: UpdateStatus = null,
    `type`: UpdateType = null
  ): Update = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
}

