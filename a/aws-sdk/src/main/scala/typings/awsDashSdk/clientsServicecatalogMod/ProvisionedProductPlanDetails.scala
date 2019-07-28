package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionedProductPlanDetails extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.CreatedTime] = js.undefined
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.NotificationArns] = js.undefined
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.undefined
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
  var ProductId: js.UndefOr[Id] = js.undefined
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
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined
  /**
    * The status.
    */
  var Status: js.UndefOr[ProvisionedProductPlanStatus] = js.undefined
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StatusMessage] = js.undefined
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
  /**
    * The time when the plan was last updated.
    */
  var UpdatedTime: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.UpdatedTime] = js.undefined
}

object ProvisionedProductPlanDetails {
  @scala.inline
  def apply(
    CreatedTime: CreatedTime = null,
    NotificationArns: NotificationArns = null,
    PathId: Id = null,
    PlanId: Id = null,
    PlanName: ProvisionedProductPlanName = null,
    PlanType: ProvisionedProductPlanType = null,
    ProductId: Id = null,
    ProvisionProductId: Id = null,
    ProvisionProductName: ProvisionedProductName = null,
    ProvisioningArtifactId: Id = null,
    ProvisioningParameters: UpdateProvisioningParameters = null,
    Status: ProvisionedProductPlanStatus = null,
    StatusMessage: StatusMessage = null,
    Tags: Tags = null,
    UpdatedTime: UpdatedTime = null
  ): ProvisionedProductPlanDetails = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (NotificationArns != null) __obj.updateDynamic("NotificationArns")(NotificationArns)
    if (PathId != null) __obj.updateDynamic("PathId")(PathId)
    if (PlanId != null) __obj.updateDynamic("PlanId")(PlanId)
    if (PlanName != null) __obj.updateDynamic("PlanName")(PlanName)
    if (PlanType != null) __obj.updateDynamic("PlanType")(PlanType.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    if (ProvisionProductId != null) __obj.updateDynamic("ProvisionProductId")(ProvisionProductId)
    if (ProvisionProductName != null) __obj.updateDynamic("ProvisionProductName")(ProvisionProductName)
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId)
    if (ProvisioningParameters != null) __obj.updateDynamic("ProvisioningParameters")(ProvisioningParameters)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (UpdatedTime != null) __obj.updateDynamic("UpdatedTime")(UpdatedTime)
    __obj.asInstanceOf[ProvisionedProductPlanDetails]
  }
}

