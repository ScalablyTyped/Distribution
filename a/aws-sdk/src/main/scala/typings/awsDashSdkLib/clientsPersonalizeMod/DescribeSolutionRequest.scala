package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSolutionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution to describe.
    */
  var solutionArn: Arn
}

object DescribeSolutionRequest {
  @scala.inline
  def apply(solutionArn: Arn): DescribeSolutionRequest = {
    val __obj = js.Dynamic.literal(solutionArn = solutionArn)
  
    __obj.asInstanceOf[DescribeSolutionRequest]
  }
}

