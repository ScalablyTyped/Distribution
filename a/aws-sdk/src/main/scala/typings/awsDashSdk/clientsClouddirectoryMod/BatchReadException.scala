package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchReadException extends js.Object {
  /**
    * An exception message that is associated with the failure.
    */
  var Message: js.UndefOr[ExceptionMessage] = js.undefined
  /**
    * A type of exception, such as InvalidArnException.
    */
  var Type: js.UndefOr[BatchReadExceptionType] = js.undefined
}

object BatchReadException {
  @scala.inline
  def apply(Message: ExceptionMessage = null, Type: BatchReadExceptionType = null): BatchReadException = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadException]
  }
}

