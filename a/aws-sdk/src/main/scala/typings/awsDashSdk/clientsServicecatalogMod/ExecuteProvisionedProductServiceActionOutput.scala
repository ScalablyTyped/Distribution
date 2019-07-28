package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteProvisionedProductServiceActionOutput extends js.Object {
  /**
    * An object containing detailed information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.RecordDetail] = js.undefined
}

object ExecuteProvisionedProductServiceActionOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): ExecuteProvisionedProductServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail)
    __obj.asInstanceOf[ExecuteProvisionedProductServiceActionOutput]
  }
}

