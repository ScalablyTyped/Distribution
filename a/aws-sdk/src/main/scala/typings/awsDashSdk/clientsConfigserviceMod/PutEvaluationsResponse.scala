package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEvaluationsResponse extends js.Object {
  /**
    * Requests that failed because of a client or server error.
    */
  var FailedEvaluations: js.UndefOr[Evaluations] = js.native
}

object PutEvaluationsResponse {
  @scala.inline
  def apply(FailedEvaluations: Evaluations = null): PutEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedEvaluations != null) __obj.updateDynamic("FailedEvaluations")(FailedEvaluations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEvaluationsResponse]
  }
}

