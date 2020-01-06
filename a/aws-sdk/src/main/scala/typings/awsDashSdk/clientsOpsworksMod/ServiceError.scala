package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceError extends js.Object {
  /**
    * When the error occurred.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * A message that describes the error.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The error ID.
    */
  var ServiceErrorId: js.UndefOr[String] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * The error type.
    */
  var Type: js.UndefOr[String] = js.native
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
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (ServiceErrorId != null) __obj.updateDynamic("ServiceErrorId")(ServiceErrorId.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceError]
  }
}

