package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageStatusItem extends js.Object {
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * The name of the model package for which the overall status is being reported.
    */
  var Name: EntityName = js.native
  /**
    * The current status.
    */
  var Status: DetailedModelPackageStatus = js.native
}

object ModelPackageStatusItem {
  @scala.inline
  def apply(Name: EntityName, Status: DetailedModelPackageStatus, FailureReason: String = null): ModelPackageStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageStatusItem]
  }
}

