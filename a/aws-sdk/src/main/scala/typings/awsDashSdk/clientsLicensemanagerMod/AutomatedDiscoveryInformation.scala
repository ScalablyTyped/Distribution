package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomatedDiscoveryInformation extends js.Object {
  /**
    * Time that automated discovery last ran.
    */
  var LastRunTime: js.UndefOr[DateTime] = js.native
}

object AutomatedDiscoveryInformation {
  @scala.inline
  def apply(LastRunTime: DateTime = null): AutomatedDiscoveryInformation = {
    val __obj = js.Dynamic.literal()
    if (LastRunTime != null) __obj.updateDynamic("LastRunTime")(LastRunTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomatedDiscoveryInformation]
  }
}

