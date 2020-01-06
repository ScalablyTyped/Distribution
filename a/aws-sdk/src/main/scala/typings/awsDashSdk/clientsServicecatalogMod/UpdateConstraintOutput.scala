package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConstraintOutput extends js.Object {
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ConstraintDetail] = js.native
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ConstraintParameters] = js.native
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Status] = js.native
}

object UpdateConstraintOutput {
  @scala.inline
  def apply(
    ConstraintDetail: ConstraintDetail = null,
    ConstraintParameters: ConstraintParameters = null,
    Status: Status = null
  ): UpdateConstraintOutput = {
    val __obj = js.Dynamic.literal()
    if (ConstraintDetail != null) __obj.updateDynamic("ConstraintDetail")(ConstraintDetail.asInstanceOf[js.Any])
    if (ConstraintParameters != null) __obj.updateDynamic("ConstraintParameters")(ConstraintParameters.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConstraintOutput]
  }
}

