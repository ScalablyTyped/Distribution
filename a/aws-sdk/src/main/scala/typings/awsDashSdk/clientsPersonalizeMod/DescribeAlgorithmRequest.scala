package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlgorithmRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm to describe.
    */
  var algorithmArn: Arn
}

object DescribeAlgorithmRequest {
  @scala.inline
  def apply(algorithmArn: Arn): DescribeAlgorithmRequest = {
    val __obj = js.Dynamic.literal(algorithmArn = algorithmArn)
  
    __obj.asInstanceOf[DescribeAlgorithmRequest]
  }
}

