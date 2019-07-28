package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProvisionedProductPlanInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsDashSdk.clientsServicecatalogMod.IdempotencyToken
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.NotificationArns] = js.undefined
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.undefined
  /**
    * The name of the plan.
    */
  var PlanName: ProvisionedProductPlanName
  /**
    * The plan type.
    */
  var PlanType: ProvisionedProductPlanType
  /**
    * The product identifier.
    */
  var ProductId: Id
  /**
    * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
    */
  var ProvisionedProductName: typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductName
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined
  /**
    * One or more tags. If the plan is for an existing provisioned product, the product must have a RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
}

object CreateProvisionedProductPlanInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    PlanName: ProvisionedProductPlanName,
    PlanType: ProvisionedProductPlanType,
    ProductId: Id,
    ProvisionedProductName: ProvisionedProductName,
    ProvisioningArtifactId: Id,
    AcceptLanguage: AcceptLanguage = null,
    NotificationArns: NotificationArns = null,
    PathId: Id = null,
    ProvisioningParameters: UpdateProvisioningParameters = null,
    Tags: Tags = null
  ): CreateProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken, PlanName = PlanName, PlanType = PlanType.asInstanceOf[js.Any], ProductId = ProductId, ProvisionedProductName = ProvisionedProductName, ProvisioningArtifactId = ProvisioningArtifactId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (NotificationArns != null) __obj.updateDynamic("NotificationArns")(NotificationArns)
    if (PathId != null) __obj.updateDynamic("PathId")(PathId)
    if (ProvisioningParameters != null) __obj.updateDynamic("ProvisioningParameters")(ProvisioningParameters)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateProvisionedProductPlanInput]
  }
}

