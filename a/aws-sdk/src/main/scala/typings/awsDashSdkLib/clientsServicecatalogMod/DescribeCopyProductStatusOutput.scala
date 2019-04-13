package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCopyProductStatusOutput extends js.Object {
  /**
    * The status of the copy product operation.
    */
  var CopyProductStatus: js.UndefOr[CopyProductStatus] = js.undefined
  /**
    * The status message.
    */
  var StatusDetail: js.UndefOr[StatusDetail] = js.undefined
  /**
    * The identifier of the copied product.
    */
  var TargetProductId: js.UndefOr[Id] = js.undefined
}

object DescribeCopyProductStatusOutput {
  @scala.inline
  def apply(
    CopyProductStatus: CopyProductStatus = null,
    StatusDetail: StatusDetail = null,
    TargetProductId: Id = null
  ): DescribeCopyProductStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (CopyProductStatus != null) __obj.updateDynamic("CopyProductStatus")(CopyProductStatus.asInstanceOf[js.Any])
    if (StatusDetail != null) __obj.updateDynamic("StatusDetail")(StatusDetail)
    if (TargetProductId != null) __obj.updateDynamic("TargetProductId")(TargetProductId)
    __obj.asInstanceOf[DescribeCopyProductStatusOutput]
  }
}

