package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCauseException extends js.Object {
  /**
    * The message of the exception.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The name of the exception.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object RootCauseException {
  @scala.inline
  def apply(Message: String = null, Name: String = null): RootCauseException = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[RootCauseException]
  }
}

