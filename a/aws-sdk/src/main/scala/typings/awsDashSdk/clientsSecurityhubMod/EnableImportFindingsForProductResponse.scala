package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableImportFindingsForProductResponse extends js.Object {
  /**
    * The ARN of your subscription to the product to enable integrations for.
    */
  var ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined
}

object EnableImportFindingsForProductResponse {
  @scala.inline
  def apply(ProductSubscriptionArn: NonEmptyString = null): EnableImportFindingsForProductResponse = {
    val __obj = js.Dynamic.literal()
    if (ProductSubscriptionArn != null) __obj.updateDynamic("ProductSubscriptionArn")(ProductSubscriptionArn)
    __obj.asInstanceOf[EnableImportFindingsForProductResponse]
  }
}

