package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConstraintOutput extends js.Object {
  /**
    * Information about the constraint.
    */
  var ConstraintDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ConstraintDetail] = js.undefined
  /**
    * The constraint parameters.
    */
  var ConstraintParameters: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ConstraintParameters] = js.undefined
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Status] = js.undefined
}

object DescribeConstraintOutput {
  @scala.inline
  def apply(
    ConstraintDetail: ConstraintDetail = null,
    ConstraintParameters: ConstraintParameters = null,
    Status: Status = null
  ): DescribeConstraintOutput = {
    val __obj = js.Dynamic.literal()
    if (ConstraintDetail != null) __obj.updateDynamic("ConstraintDetail")(ConstraintDetail)
    if (ConstraintParameters != null) __obj.updateDynamic("ConstraintParameters")(ConstraintParameters)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConstraintOutput]
  }
}

