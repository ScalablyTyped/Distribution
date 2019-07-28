package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAlgorithmResponse extends js.Object {
  /**
    * A listing of the properties of the algorithm.
    */
  var algorithm: js.UndefOr[Algorithm] = js.undefined
}

object DescribeAlgorithmResponse {
  @scala.inline
  def apply(algorithm: Algorithm = null): DescribeAlgorithmResponse = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    __obj.asInstanceOf[DescribeAlgorithmResponse]
  }
}

