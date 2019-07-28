package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedProductPlanSummary extends js.Object {
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.undefined
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
  /**
    * The plan type.
    */
  var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.undefined
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
}

object ProvisionedProductPlanSummary {
  @scala.inline
  def apply(
    PlanId: Id = null,
    PlanName: ProvisionedProductPlanName = null,
    PlanType: ProvisionedProductPlanType = null,
    ProvisionProductId: Id = null,
    ProvisionProductName: ProvisionedProductName = null,
    ProvisioningArtifactId: Id = null
  ): ProvisionedProductPlanSummary = {
    val __obj = js.Dynamic.literal()
    if (PlanId != null) __obj.updateDynamic("PlanId")(PlanId)
    if (PlanName != null) __obj.updateDynamic("PlanName")(PlanName)
    if (PlanType != null) __obj.updateDynamic("PlanType")(PlanType.asInstanceOf[js.Any])
    if (ProvisionProductId != null) __obj.updateDynamic("ProvisionProductId")(ProvisionProductId)
    if (ProvisionProductName != null) __obj.updateDynamic("ProvisionProductName")(ProvisionProductName)
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId)
    __obj.asInstanceOf[ProvisionedProductPlanSummary]
  }
}

