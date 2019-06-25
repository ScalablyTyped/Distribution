package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableImportFindingsForProductRequest extends js.Object {
  /**
    * The ARN of the product to enable the integration for.
    */
  var ProductArn: NonEmptyString
}

object EnableImportFindingsForProductRequest {
  @scala.inline
  def apply(ProductArn: NonEmptyString): EnableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn)
  
    __obj.asInstanceOf[EnableImportFindingsForProductRequest]
  }
}

