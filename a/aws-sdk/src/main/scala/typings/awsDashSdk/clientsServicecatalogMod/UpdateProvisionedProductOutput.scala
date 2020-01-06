package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisionedProductOutput extends js.Object {
  /**
    * Information about the result of the request.
    */
  var RecordDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.RecordDetail] = js.native
}

object UpdateProvisionedProductOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): UpdateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisionedProductOutput]
  }
}

