package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmStatusItem extends js.Object {
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * The name of the algorithm for which the overall status is being reported.
    */
  var Name: EntityName = js.native
  /**
    * The current status.
    */
  var Status: DetailedAlgorithmStatus = js.native
}

object AlgorithmStatusItem {
  @scala.inline
  def apply(Name: EntityName, Status: DetailedAlgorithmStatus, FailureReason: String = null): AlgorithmStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmStatusItem]
  }
}

