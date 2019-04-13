package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateProvisionedProductOutput extends js.Object {
  /**
    * Information about the result of this request.
    */
  var RecordDetail: js.UndefOr[RecordDetail] = js.undefined
}

object TerminateProvisionedProductOutput {
  @scala.inline
  def apply(RecordDetail: RecordDetail = null): TerminateProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDetail != null) __obj.updateDynamic("RecordDetail")(RecordDetail)
    __obj.asInstanceOf[TerminateProvisionedProductOutput]
  }
}

