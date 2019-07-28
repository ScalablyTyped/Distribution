package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSolutionResponse extends js.Object {
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
}

object CreateSolutionResponse {
  @scala.inline
  def apply(solutionArn: Arn = null): CreateSolutionResponse = {
    val __obj = js.Dynamic.literal()
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn)
    __obj.asInstanceOf[CreateSolutionResponse]
  }
}

