package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSolutionVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution containing the training configuration information.
    */
  var solutionArn: Arn
}

object CreateSolutionVersionRequest {
  @scala.inline
  def apply(solutionArn: Arn): CreateSolutionVersionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn)
  
    __obj.asInstanceOf[CreateSolutionVersionRequest]
  }
}

