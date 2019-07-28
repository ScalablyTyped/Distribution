package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.undefined
  /**
    * The distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.undefined
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsDashSdk.clientsServicecatalogMod.IdempotencyToken
  /**
    * The name of the product.
    */
  var Name: ProductViewName
  /**
    * The owner of the product.
    */
  var Owner: ProductViewOwner
  /**
    * The type of product.
    */
  var ProductType: typings.awsDashSdk.clientsServicecatalogMod.ProductType
  /**
    * The configuration of the provisioning artifact.
    */
  var ProvisioningArtifactParameters: ProvisioningArtifactProperties
  /**
    * The support information about the product.
    */
  var SupportDescription: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportDescription] = js.undefined
  /**
    * The contact email for product support.
    */
  var SupportEmail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportEmail] = js.undefined
  /**
    * The contact URL for product support.
    */
  var SupportUrl: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportUrl] = js.undefined
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[AddTags] = js.undefined
}

object CreateProductInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Name: ProductViewName,
    Owner: ProductViewOwner,
    ProductType: ProductType,
    ProvisioningArtifactParameters: ProvisioningArtifactProperties,
    AcceptLanguage: AcceptLanguage = null,
    Description: ProductViewShortDescription = null,
    Distributor: ProductViewOwner = null,
    SupportDescription: SupportDescription = null,
    SupportEmail: SupportEmail = null,
    SupportUrl: SupportUrl = null,
    Tags: AddTags = null
  ): CreateProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken, Name = Name, Owner = Owner, ProductType = ProductType.asInstanceOf[js.Any], ProvisioningArtifactParameters = ProvisioningArtifactParameters)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Distributor != null) __obj.updateDynamic("Distributor")(Distributor)
    if (SupportDescription != null) __obj.updateDynamic("SupportDescription")(SupportDescription)
    if (SupportEmail != null) __obj.updateDynamic("SupportEmail")(SupportEmail)
    if (SupportUrl != null) __obj.updateDynamic("SupportUrl")(SupportUrl)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateProductInput]
  }
}

