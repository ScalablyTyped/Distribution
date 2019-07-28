package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductViewSummary extends js.Object {
  /**
    * The distributor of the product. Contact the product administrator for the significance of this value.
    */
  var Distributor: js.UndefOr[ProductViewDistributor] = js.undefined
  /**
    * Indicates whether the product has a default path. If the product does not have a default path, call ListLaunchPaths to disambiguate between paths. Otherwise, ListLaunchPaths is not required, and the output of ProductViewSummary can be used directly with DescribeProvisioningParameters.
    */
  var HasDefaultPath: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.HasDefaultPath] = js.undefined
  /**
    * The product view identifier.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.undefined
  /**
    * The name of the product.
    */
  var Name: js.UndefOr[ProductViewName] = js.undefined
  /**
    * The owner of the product. Contact the product administrator for the significance of this value.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.undefined
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  /**
    * Short description of the product.
    */
  var ShortDescription: js.UndefOr[ProductViewShortDescription] = js.undefined
  /**
    * The description of the support for this Product.
    */
  var SupportDescription: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportDescription] = js.undefined
  /**
    * The email contact information to obtain support for this Product.
    */
  var SupportEmail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportEmail] = js.undefined
  /**
    * The URL information to obtain support for this Product.
    */
  var SupportUrl: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportUrl] = js.undefined
  /**
    * The product type. Contact the product administrator for the significance of this value. If this value is MARKETPLACE, the product was created by AWS Marketplace.
    */
  var Type: js.UndefOr[ProductType] = js.undefined
}

object ProductViewSummary {
  @scala.inline
  def apply(
    Distributor: ProductViewDistributor = null,
    HasDefaultPath: js.UndefOr[HasDefaultPath] = js.undefined,
    Id: Id = null,
    Name: ProductViewName = null,
    Owner: ProductViewOwner = null,
    ProductId: Id = null,
    ShortDescription: ProductViewShortDescription = null,
    SupportDescription: SupportDescription = null,
    SupportEmail: SupportEmail = null,
    SupportUrl: SupportUrl = null,
    Type: ProductType = null
  ): ProductViewSummary = {
    val __obj = js.Dynamic.literal()
    if (Distributor != null) __obj.updateDynamic("Distributor")(Distributor)
    if (!js.isUndefined(HasDefaultPath)) __obj.updateDynamic("HasDefaultPath")(HasDefaultPath)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    if (ShortDescription != null) __obj.updateDynamic("ShortDescription")(ShortDescription)
    if (SupportDescription != null) __obj.updateDynamic("SupportDescription")(SupportDescription)
    if (SupportEmail != null) __obj.updateDynamic("SupportEmail")(SupportEmail)
    if (SupportUrl != null) __obj.updateDynamic("SupportUrl")(SupportUrl)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductViewSummary]
  }
}

