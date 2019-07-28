package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProblemRequest extends js.Object {
  /**
    * The ID of the problem.
    */
  var ProblemId: typings.awsDashSdk.clientsApplicationinsightsMod.ProblemId
}

object DescribeProblemRequest {
  @scala.inline
  def apply(ProblemId: ProblemId): DescribeProblemRequest = {
    val __obj = js.Dynamic.literal(ProblemId = ProblemId)
  
    __obj.asInstanceOf[DescribeProblemRequest]
  }
}

