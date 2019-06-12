package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSolutionResponse extends js.Object {
  /**
    * An object that describes the solution.
    */
  var solution: js.UndefOr[Solution] = js.undefined
}

object DescribeSolutionResponse {
  @scala.inline
  def apply(solution: Solution = null): DescribeSolutionResponse = {
    val __obj = js.Dynamic.literal()
    if (solution != null) __obj.updateDynamic("solution")(solution)
    __obj.asInstanceOf[DescribeSolutionResponse]
  }
}

