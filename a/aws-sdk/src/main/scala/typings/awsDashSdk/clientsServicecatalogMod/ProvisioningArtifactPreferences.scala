package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningArtifactPreferences extends js.Object {
  /**
    * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in ProvisioningPreferences$StackSetAccounts and UpdateProvisioningPreferences$StackSetAccounts. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetAccounts: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetAccounts] = js.undefined
  /**
    * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in ProvisioningPreferences$StackSetRegions and UpdateProvisioningPreferences$StackSetRegions. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetRegions: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetRegions] = js.undefined
}

object ProvisioningArtifactPreferences {
  @scala.inline
  def apply(StackSetAccounts: StackSetAccounts = null, StackSetRegions: StackSetRegions = null): ProvisioningArtifactPreferences = {
    val __obj = js.Dynamic.literal()
    if (StackSetAccounts != null) __obj.updateDynamic("StackSetAccounts")(StackSetAccounts)
    if (StackSetRegions != null) __obj.updateDynamic("StackSetRegions")(StackSetRegions)
    __obj.asInstanceOf[ProvisioningArtifactPreferences]
  }
}

