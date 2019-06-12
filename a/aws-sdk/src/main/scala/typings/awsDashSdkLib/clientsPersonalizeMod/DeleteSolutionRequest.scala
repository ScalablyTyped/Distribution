package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSolutionRequest extends js.Object {
  /**
    * The ARN of the solution to delete.
    */
  var solutionArn: Arn
}

object DeleteSolutionRequest {
  @scala.inline
  def apply(solutionArn: Arn): DeleteSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn)
  
    __obj.asInstanceOf[DeleteSolutionRequest]
  }
}

