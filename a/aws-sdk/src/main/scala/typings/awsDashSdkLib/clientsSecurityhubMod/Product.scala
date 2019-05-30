package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /**
    * The URL used to activate the product.
    */
  var ActivationUrl: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The categories assigned to the product.
    */
  var Categories: js.UndefOr[CategoryList] = js.undefined
  /**
    * The name of the company that provides the product.
    */
  var CompanyName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A description of the product.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The URL for the page that contains more information about the product.
    */
  var MarketplaceUrl: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The ARN assigned to the product.
    */
  var ProductArn: NonEmptyString
  /**
    * The name of the product.
    */
  var ProductName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The resource policy asasociated with the product.
    */
  var ProductSubscriptionResourcePolicy: js.UndefOr[NonEmptyString] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    ProductArn: NonEmptyString,
    ActivationUrl: NonEmptyString = null,
    Categories: CategoryList = null,
    CompanyName: NonEmptyString = null,
    Description: NonEmptyString = null,
    MarketplaceUrl: NonEmptyString = null,
    ProductName: NonEmptyString = null,
    ProductSubscriptionResourcePolicy: NonEmptyString = null
  ): Product = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn)
    if (ActivationUrl != null) __obj.updateDynamic("ActivationUrl")(ActivationUrl)
    if (Categories != null) __obj.updateDynamic("Categories")(Categories)
    if (CompanyName != null) __obj.updateDynamic("CompanyName")(CompanyName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (MarketplaceUrl != null) __obj.updateDynamic("MarketplaceUrl")(MarketplaceUrl)
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName)
    if (ProductSubscriptionResourcePolicy != null) __obj.updateDynamic("ProductSubscriptionResourcePolicy")(ProductSubscriptionResourcePolicy)
    __obj.asInstanceOf[Product]
  }
}

