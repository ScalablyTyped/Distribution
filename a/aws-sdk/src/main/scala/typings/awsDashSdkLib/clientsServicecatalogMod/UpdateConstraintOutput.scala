package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConstraintOutput extends js.Object {
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[ConstraintDetail] = js.undefined
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[ConstraintParameters] = js.undefined
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[Status] = js.undefined
}

object UpdateConstraintOutput {
  @scala.inline
  def apply(
    ConstraintDetail: ConstraintDetail = null,
    ConstraintParameters: ConstraintParameters = null,
    Status: Status = null
  ): UpdateConstraintOutput = {
    val __obj = js.Dynamic.literal()
    if (ConstraintDetail != null) __obj.updateDynamic("ConstraintDetail")(ConstraintDetail)
    if (ConstraintParameters != null) __obj.updateDynamic("ConstraintParameters")(ConstraintParameters)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConstraintOutput]
  }
}

