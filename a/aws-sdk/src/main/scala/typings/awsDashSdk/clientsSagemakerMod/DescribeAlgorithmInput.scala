package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlgorithmInput extends js.Object {
  /**
    * The name of the algorithm to describe.
    */
  var AlgorithmName: ArnOrName
}

object DescribeAlgorithmInput {
  @scala.inline
  def apply(AlgorithmName: ArnOrName): DescribeAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName)
  
    __obj.asInstanceOf[DescribeAlgorithmInput]
  }
}

