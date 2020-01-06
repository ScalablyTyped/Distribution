package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProblemRequest extends js.Object {
  /**
    * The ID of the problem.
    */
  var ProblemId: typings.awsDashSdk.clientsApplicationinsightsMod.ProblemId = js.native
}

object DescribeProblemRequest {
  @scala.inline
  def apply(ProblemId: ProblemId): DescribeProblemRequest = {
    val __obj = js.Dynamic.literal(ProblemId = ProblemId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeProblemRequest]
  }
}

