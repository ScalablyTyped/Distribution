package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteProvisionedProductPlanOutput extends js.Object {
  /**
    * Information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.RecordDetail] = js.undefined
}

object ExecuteProvisionedProductPlanOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): ExecuteProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail)
    __obj.asInstanceOf[ExecuteProvisionedProductPlanOutput]
  }
}

