package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystem extends js.Object {
  /**
    * The operating system.
    */
  var Type: js.UndefOr[OperatingSystemType] = js.native
}

object OperatingSystem {
  @scala.inline
  def apply(Type: OperatingSystemType = null): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatingSystem]
  }
}

