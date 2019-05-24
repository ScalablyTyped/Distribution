package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisionedProductPropertiesInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The idempotency token that uniquely identifies the provisioning product update request.
    */
  var IdempotencyToken: awsDashSdkLib.clientsServicecatalogMod.IdempotencyToken
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: Id
  /**
    * A map that contains the provisioned product properties to be updated. The OWNER key only accepts user ARNs. The owner is the user that is allowed to see, update, terminate, and execute service actions in the provisioned product. The administrator can change the owner of a provisioned product to another IAM user within the same account. Both end user owners and administrators can see ownership history of the provisioned product using the ListRecordHistory API. The new owner can describe all past records for the provisioned product using the DescribeRecord API. The previous owner can no longer use DescribeRecord, but can still see the product's history from when he was an owner using ListRecordHistory. If a provisioned product ownership is assigned to an end user, they can see and perform any action through the API or Service Catalog console such as update, terminate, and execute service actions. If an end user provisions a product and the owner is updated to someone else, they will no longer be able to see or perform any actions through API or the Service Catalog console on that provisioned product.
    */
  var ProvisionedProductProperties: awsDashSdkLib.clientsServicecatalogMod.ProvisionedProductProperties
}

object UpdateProvisionedProductPropertiesInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    ProvisionedProductId: Id,
    ProvisionedProductProperties: ProvisionedProductProperties,
    AcceptLanguage: AcceptLanguage = null
  ): UpdateProvisionedProductPropertiesInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken, ProvisionedProductId = ProvisionedProductId, ProvisionedProductProperties = ProvisionedProductProperties)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[UpdateProvisionedProductPropertiesInput]
  }
}

