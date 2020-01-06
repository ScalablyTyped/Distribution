package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedProductPlanDetails extends js.Object {
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.CreatedTime] = js.native
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.NotificationArns] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.native
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.native
  /**
    * The plan type.
    */
  var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.native
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[ProvisionedProductPlanStatus] = js.native
  /**
    * The status message.
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StatusMessage] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.native
  /**
    * The time when the plan was last updated.
    */
  var UpdatedTime: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.UpdatedTime] = js.native
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
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (NotificationArns != null) __obj.updateDynamic("NotificationArns")(NotificationArns.asInstanceOf[js.Any])
    if (PathId != null) __obj.updateDynamic("PathId")(PathId.asInstanceOf[js.Any])
    if (PlanId != null) __obj.updateDynamic("PlanId")(PlanId.asInstanceOf[js.Any])
    if (PlanName != null) __obj.updateDynamic("PlanName")(PlanName.asInstanceOf[js.Any])
    if (PlanType != null) __obj.updateDynamic("PlanType")(PlanType.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    if (ProvisionProductId != null) __obj.updateDynamic("ProvisionProductId")(ProvisionProductId.asInstanceOf[js.Any])
    if (ProvisionProductName != null) __obj.updateDynamic("ProvisionProductName")(ProvisionProductName.asInstanceOf[js.Any])
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId.asInstanceOf[js.Any])
    if (ProvisioningParameters != null) __obj.updateDynamic("ProvisioningParameters")(ProvisioningParameters.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (UpdatedTime != null) __obj.updateDynamic("UpdatedTime")(UpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedProductPlanDetails]
  }
}

