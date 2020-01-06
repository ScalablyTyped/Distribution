package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationMediaFailureCause extends js.Object {
  /**
    * The reason that an installation media import failed.
    */
  var Message: js.UndefOr[String] = js.native
}

object InstallationMediaFailureCause {
  @scala.inline
  def apply(Message: String = null): InstallationMediaFailureCause = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationMediaFailureCause]
  }
}

