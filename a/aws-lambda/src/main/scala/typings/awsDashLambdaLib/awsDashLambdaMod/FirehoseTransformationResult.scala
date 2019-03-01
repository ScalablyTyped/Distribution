package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord]
}

object FirehoseTransformationResult {
  @scala.inline
  def apply(records: js.Array[FirehoseTransformationResultRecord]): FirehoseTransformationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("records")(records)
    __obj.asInstanceOf[FirehoseTransformationResult]
  }
}

