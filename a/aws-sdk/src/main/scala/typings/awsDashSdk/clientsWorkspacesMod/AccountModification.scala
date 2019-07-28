package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountModification extends js.Object {
  /**
    * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
    */
  var DedicatedTenancyManagementCidrRange: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.DedicatedTenancyManagementCidrRange] = js.undefined
  /**
    * The status of BYOL (whether BYOL is being enabled or disabled).
    */
  var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
  /**
    * The error code that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined
  /**
    * The text of the error message that is returned if the configuration of BYOL cannot be modified.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  /**
    * The state of the modification to the configuration of BYOL.
    */
  var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.undefined
  /**
    * The timestamp when the modification of the BYOL configuration was started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
}

object AccountModification {
  @scala.inline
  def apply(
    DedicatedTenancyManagementCidrRange: DedicatedTenancyManagementCidrRange = null,
    DedicatedTenancySupport: DedicatedTenancySupportResultEnum = null,
    ErrorCode: WorkspaceErrorCode = null,
    ErrorMessage: Description = null,
    ModificationState: DedicatedTenancyModificationStateEnum = null,
    StartTime: Timestamp = null
  ): AccountModification = {
    val __obj = js.Dynamic.literal()
    if (DedicatedTenancyManagementCidrRange != null) __obj.updateDynamic("DedicatedTenancyManagementCidrRange")(DedicatedTenancyManagementCidrRange)
    if (DedicatedTenancySupport != null) __obj.updateDynamic("DedicatedTenancySupport")(DedicatedTenancySupport.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (ModificationState != null) __obj.updateDynamic("ModificationState")(ModificationState.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[AccountModification]
  }
}

