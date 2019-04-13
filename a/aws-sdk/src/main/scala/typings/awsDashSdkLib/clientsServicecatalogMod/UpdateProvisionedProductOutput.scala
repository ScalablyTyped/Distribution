package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisionedProductOutput extends js.Object {
  /**
    * Information about the result of the request.
    */
  var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
}

object UpdateProvisionedProductOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): UpdateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail)
    __obj.asInstanceOf[UpdateProvisionedProductOutput]
  }
}

