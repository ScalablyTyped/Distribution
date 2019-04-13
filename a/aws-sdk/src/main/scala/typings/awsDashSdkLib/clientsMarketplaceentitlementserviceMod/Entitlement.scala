package typings
package awsDashSdkLib.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /**
    * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained through the ResolveCustomer operation in AWS Marketplace Metering Service.
    */
  var CustomerIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and are specified when the product is listed in AWS Marketplace.
    */
  var Dimension: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an expiration date.
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the product listing is created.
    */
  var ProductCode: js.UndefOr[ProductCode] = js.undefined
  /**
    * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
    */
  var Value: js.UndefOr[EntitlementValue] = js.undefined
}

object Entitlement {
  @scala.inline
  def apply(
    CustomerIdentifier: NonEmptyString = null,
    Dimension: NonEmptyString = null,
    ExpirationDate: Timestamp = null,
    ProductCode: ProductCode = null,
    Value: EntitlementValue = null
  ): Entitlement = {
    val __obj = js.Dynamic.literal()
    if (CustomerIdentifier != null) __obj.updateDynamic("CustomerIdentifier")(CustomerIdentifier)
    if (Dimension != null) __obj.updateDynamic("Dimension")(Dimension)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (ProductCode != null) __obj.updateDynamic("ProductCode")(ProductCode)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Entitlement]
  }
}

