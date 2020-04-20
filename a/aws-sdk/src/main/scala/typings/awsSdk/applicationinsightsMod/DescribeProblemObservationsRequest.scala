package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProblemObservationsRequest extends js.Object {
  /**
    * The ID of the problem.
    */
  var ProblemId: typings.awsSdk.applicationinsightsMod.ProblemId = js.native
}

object DescribeProblemObservationsRequest {
  @scala.inline
  def apply(ProblemId: ProblemId): DescribeProblemObservationsRequest = {
    val __obj = js.Dynamic.literal(ProblemId = ProblemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProblemObservationsRequest]
  }
}

