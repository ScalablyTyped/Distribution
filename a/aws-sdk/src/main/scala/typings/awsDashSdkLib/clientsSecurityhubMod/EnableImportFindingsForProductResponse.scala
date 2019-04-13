package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableImportFindingsForProductResponse extends js.Object {
  /**
    * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
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

