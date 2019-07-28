package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProvisionedProductPlanOutput extends js.Object {
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.undefined
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.undefined
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductName] = js.undefined
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
}

object CreateProvisionedProductPlanOutput {
  @scala.inline
  def apply(
    PlanId: Id = null,
    PlanName: ProvisionedProductPlanName = null,
    ProvisionProductId: Id = null,
    ProvisionedProductName: ProvisionedProductName = null,
    ProvisioningArtifactId: Id = null
  ): CreateProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (PlanId != null) __obj.updateDynamic("PlanId")(PlanId)
    if (PlanName != null) __obj.updateDynamic("PlanName")(PlanName)
    if (ProvisionProductId != null) __obj.updateDynamic("ProvisionProductId")(ProvisionProductId)
    if (ProvisionedProductName != null) __obj.updateDynamic("ProvisionedProductName")(ProvisionedProductName)
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId)
    __obj.asInstanceOf[CreateProvisionedProductPlanOutput]
  }
}

