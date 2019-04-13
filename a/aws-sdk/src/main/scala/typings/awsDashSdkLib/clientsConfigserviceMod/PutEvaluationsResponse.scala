package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEvaluationsResponse extends js.Object {
  /**
    * Requests that failed because of a client or server error.
    */
  var FailedEvaluations: js.UndefOr[Evaluations] = js.undefined
}

object PutEvaluationsResponse {
  @scala.inline
  def apply(FailedEvaluations: Evaluations = null): PutEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedEvaluations != null) __obj.updateDynamic("FailedEvaluations")(FailedEvaluations)
    __obj.asInstanceOf[PutEvaluationsResponse]
  }
}

