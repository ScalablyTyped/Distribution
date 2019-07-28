package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends js.Object {
  /**
    * The Unix epoch timestamp in seconds for when the update was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * Any errors associated with a Failed update.
    */
  var errors: js.UndefOr[ErrorDetails] = js.undefined
  /**
    * A UUID that is used to track the update.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A key-value map that contains the parameters associated with the update.
    */
  var params: js.UndefOr[UpdateParams] = js.undefined
  /**
    * The current status of the update.
    */
  var status: js.UndefOr[UpdateStatus] = js.undefined
  /**
    * The type of the update.
    */
  var `type`: js.UndefOr[UpdateType] = js.undefined
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
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (id != null) __obj.updateDynamic("id")(id)
    if (params != null) __obj.updateDynamic("params")(params)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
}

