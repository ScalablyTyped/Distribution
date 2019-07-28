package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProblemObservationsRequest extends js.Object {
  /**
    * The ID of the problem.
    */
  var ProblemId: typings.awsDashSdk.clientsApplicationinsightsMod.ProblemId
}

object DescribeProblemObservationsRequest {
  @scala.inline
  def apply(ProblemId: ProblemId): DescribeProblemObservationsRequest = {
    val __obj = js.Dynamic.literal(ProblemId = ProblemId)
  
    __obj.asInstanceOf[DescribeProblemObservationsRequest]
  }
}

