package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAccountAuditConfigurationRequest extends js.Object {
  /**
    * If true, all scheduled audits are deleted.
    */
  var deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.undefined
}

object DeleteAccountAuditConfigurationRequest {
  @scala.inline
  def apply(deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.undefined): DeleteAccountAuditConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteScheduledAudits)) __obj.updateDynamic("deleteScheduledAudits")(deleteScheduledAudits)
    __obj.asInstanceOf[DeleteAccountAuditConfigurationRequest]
  }
}

