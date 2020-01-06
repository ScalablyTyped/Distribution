package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableImportFindingsForProductRequest extends js.Object {
  /**
    * The ARN of the product to enable the integration for.
    */
  var ProductArn: NonEmptyString = js.native
}

object EnableImportFindingsForProductRequest {
  @scala.inline
  def apply(ProductArn: NonEmptyString): EnableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableImportFindingsForProductRequest]
  }
}

