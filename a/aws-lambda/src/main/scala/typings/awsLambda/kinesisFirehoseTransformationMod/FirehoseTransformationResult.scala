package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationResult extends js.Object {
  var records: js.Array[FirehoseTransformationResultRecord]
}

object FirehoseTransformationResult {
  @scala.inline
  def apply(records: js.Array[FirehoseTransformationResultRecord]): FirehoseTransformationResult = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirehoseTransformationResult]
  }
}

