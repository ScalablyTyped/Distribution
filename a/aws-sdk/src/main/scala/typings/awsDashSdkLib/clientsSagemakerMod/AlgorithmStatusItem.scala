package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmStatusItem extends js.Object {
  /**
    * if the overall status is Failed, the reason for the failure.
    */
  var FailureReason: js.UndefOr[String] = js.undefined
  /**
    * The name of the algorithm for which the overall status is being reported.
    */
  var Name: EntityName
  /**
    * The current status.
    */
  var Status: DetailedAlgorithmStatus
}

object AlgorithmStatusItem {
  @scala.inline
  def apply(Name: EntityName, Status: DetailedAlgorithmStatus, FailureReason: String = null): AlgorithmStatusItem = {
    val __obj = js.Dynamic.literal(Name = Name, Status = Status.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    __obj.asInstanceOf[AlgorithmStatusItem]
  }
}

