package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceError extends js.Object {
  /**
    * When the error occurred.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * A message that describes the error.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The error ID.
    */
  var ServiceErrorId: js.UndefOr[String] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  /**
    * The error type.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object ServiceError {
  @scala.inline
  def apply(
    CreatedAt: DateTime = null,
    InstanceId: String = null,
    Message: String = null,
    ServiceErrorId: String = null,
    StackId: String = null,
    Type: String = null
  ): ServiceError = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (ServiceErrorId != null) __obj.updateDynamic("ServiceErrorId")(ServiceErrorId)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ServiceError]
  }
}

