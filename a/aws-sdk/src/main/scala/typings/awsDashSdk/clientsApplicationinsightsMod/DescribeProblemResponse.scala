package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProblemResponse extends js.Object {
  /**
    * Information about the problem. 
    */
  var Problem: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Problem] = js.undefined
}

object DescribeProblemResponse {
  @scala.inline
  def apply(Problem: Problem = null): DescribeProblemResponse = {
    val __obj = js.Dynamic.literal()
    if (Problem != null) __obj.updateDynamic("Problem")(Problem)
    __obj.asInstanceOf[DescribeProblemResponse]
  }
}

