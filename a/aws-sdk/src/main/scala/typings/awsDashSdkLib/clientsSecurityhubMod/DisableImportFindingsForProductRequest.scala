package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisableImportFindingsForProductRequest extends js.Object {
  /**
    * The ARN of the integrated product to disable the integration for.
    */
  var ProductSubscriptionArn: NonEmptyString
}

object DisableImportFindingsForProductRequest {
  @scala.inline
  def apply(ProductSubscriptionArn: NonEmptyString): DisableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductSubscriptionArn = ProductSubscriptionArn)
  
    __obj.asInstanceOf[DisableImportFindingsForProductRequest]
  }
}

