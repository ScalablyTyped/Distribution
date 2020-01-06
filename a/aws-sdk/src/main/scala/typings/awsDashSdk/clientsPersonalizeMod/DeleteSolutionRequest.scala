package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSolutionRequest extends js.Object {
  /**
    * The ARN of the solution to delete.
    */
  var solutionArn: Arn = js.native
}

object DeleteSolutionRequest {
  @scala.inline
  def apply(solutionArn: Arn): DeleteSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSolutionRequest]
  }
}

