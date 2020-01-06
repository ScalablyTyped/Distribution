package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableImportFindingsForProductRequest extends js.Object {
  /**
    * The ARN of the integrated product to disable the integration for.
    */
  var ProductSubscriptionArn: NonEmptyString = js.native
}

object DisableImportFindingsForProductRequest {
  @scala.inline
  def apply(ProductSubscriptionArn: NonEmptyString): DisableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductSubscriptionArn = ProductSubscriptionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisableImportFindingsForProductRequest]
  }
}

