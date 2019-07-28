package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisionProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.NotificationArns] = js.undefined
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.undefined
  /**
    * The product identifier.
    */
  var ProductId: Id
  /**
    * An idempotency token that uniquely identifies the provisioning request.
    */
  var ProvisionToken: IdempotencyToken
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
  var ProvisioningParameters: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningParameters] = js.undefined
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningPreferences] = js.undefined
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
}

object ProvisionProductInput {
  @scala.inline
  def apply(
    ProductId: Id,
    ProvisionToken: IdempotencyToken,
    ProvisionedProductName: ProvisionedProductName,
    ProvisioningArtifactId: Id,
    AcceptLanguage: AcceptLanguage = null,
    NotificationArns: NotificationArns = null,
    PathId: Id = null,
    ProvisioningParameters: ProvisioningParameters = null,
    ProvisioningPreferences: ProvisioningPreferences = null,
    Tags: Tags = null
  ): ProvisionProductInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId, ProvisionToken = ProvisionToken, ProvisionedProductName = ProvisionedProductName, ProvisioningArtifactId = ProvisioningArtifactId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (NotificationArns != null) __obj.updateDynamic("NotificationArns")(NotificationArns)
    if (PathId != null) __obj.updateDynamic("PathId")(PathId)
    if (ProvisioningParameters != null) __obj.updateDynamic("ProvisioningParameters")(ProvisioningParameters)
    if (ProvisioningPreferences != null) __obj.updateDynamic("ProvisioningPreferences")(ProvisioningPreferences)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ProvisionProductInput]
  }
}

