package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSolutionVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution version.
    */
  var solutionVersionArn: Arn
}

object DescribeSolutionVersionRequest {
  @scala.inline
  def apply(solutionVersionArn: Arn): DescribeSolutionVersionRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn)
  
    __obj.asInstanceOf[DescribeSolutionVersionRequest]
  }
}

