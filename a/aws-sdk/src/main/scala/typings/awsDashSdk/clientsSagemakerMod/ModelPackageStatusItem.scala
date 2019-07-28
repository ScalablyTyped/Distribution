package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPackageStatusItem extends js.Object {
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.undefined
  /**
    * The name of the model package for which the overall status is being reported.
    */
  var Name: EntityName
  /**
    * The current status.
    */
  var Status: DetailedModelPackageStatus
}

object ModelPackageStatusItem {
  @scala.inline
  def apply(Name: EntityName, Status: DetailedModelPackageStatus, FailureReason: String = null): ModelPackageStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name, Status = Status.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    __obj.asInstanceOf[ModelPackageStatusItem]
  }
}

