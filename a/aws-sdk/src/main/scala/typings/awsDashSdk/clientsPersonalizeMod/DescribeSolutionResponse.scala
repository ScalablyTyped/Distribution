package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSolutionResponse extends js.Object {
  /**
    * An object that describes the solution.
    */
  var solution: js.UndefOr[Solution] = js.native
}

object DescribeSolutionResponse {
  @scala.inline
  def apply(solution: Solution = null): DescribeSolutionResponse = {
    val __obj = js.Dynamic.literal()
    if (solution != null) __obj.updateDynamic("solution")(solution.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSolutionResponse]
  }
}

