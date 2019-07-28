package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisionedProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The new path identifier. This value is optional if the product has a default path, and required if the product has more than one path.
    */
  var PathId: js.UndefOr[Id] = js.undefined
  /**
    * The identifier of the product.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  /**
    * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  /**
    * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  /**
    * The new parameters.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.undefined
  /**
    * One or more tags. Requires the product to have RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Tags] = js.undefined
  /**
    * The idempotency token that uniquely identifies the provisioning update request.
    */
  var UpdateToken: IdempotencyToken
}

object UpdateProvisionedProductInput {
  @scala.inline
  def apply(
    UpdateToken: IdempotencyToken,
    AcceptLanguage: AcceptLanguage = null,
    PathId: Id = null,
    ProductId: Id = null,
    ProvisionedProductId: Id = null,
    ProvisionedProductName: ProvisionedProductNameOrArn = null,
    ProvisioningArtifactId: Id = null,
    ProvisioningParameters: UpdateProvisioningParameters = null,
    ProvisioningPreferences: UpdateProvisioningPreferences = null,
    Tags: Tags = null
  ): UpdateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(UpdateToken = UpdateToken)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (PathId != null) __obj.updateDynamic("PathId")(PathId)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    if (ProvisionedProductId != null) __obj.updateDynamic("ProvisionedProductId")(ProvisionedProductId)
    if (ProvisionedProductName != null) __obj.updateDynamic("ProvisionedProductName")(ProvisionedProductName)
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId)
    if (ProvisioningParameters != null) __obj.updateDynamic("ProvisioningParameters")(ProvisioningParameters)
    if (ProvisioningPreferences != null) __obj.updateDynamic("ProvisioningPreferences")(ProvisioningPreferences)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[UpdateProvisionedProductInput]
  }
}

