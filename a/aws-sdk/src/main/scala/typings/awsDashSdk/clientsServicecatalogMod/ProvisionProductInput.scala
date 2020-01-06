package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.native
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.NotificationArns] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
  /**
    * An idempotency token that uniquely identifies the provisioning request.
    */
  var ProvisionToken: IdempotencyToken = js.native
  /**
    * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
    */
  var ProvisionedProductName: typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductName = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id = js.native
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningParameters] = js.native
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisioningPreferences] = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.native
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
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisionToken = ProvisionToken.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (NotificationArns != null) __obj.updateDynamic("NotificationArns")(NotificationArns.asInstanceOf[js.Any])
    if (PathId != null) __obj.updateDynamic("PathId")(PathId.asInstanceOf[js.Any])
    if (ProvisioningParameters != null) __obj.updateDynamic("ProvisioningParameters")(ProvisioningParameters.asInstanceOf[js.Any])
    if (ProvisioningPreferences != null) __obj.updateDynamic("ProvisioningPreferences")(ProvisioningPreferences.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionProductInput]
  }
}

