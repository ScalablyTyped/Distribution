package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSolutionVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution version.
    */
  var solutionVersionArn: Arn = js.native
}

object DescribeSolutionVersionRequest {
  @scala.inline
  def apply(solutionVersionArn: Arn): DescribeSolutionVersionRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSolutionVersionRequest]
  }
}

