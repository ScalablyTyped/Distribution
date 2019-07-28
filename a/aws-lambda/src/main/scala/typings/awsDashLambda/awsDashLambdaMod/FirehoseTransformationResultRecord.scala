package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationResultRecord extends js.Object {
  /** Encode in Base64 */
  var data: String
  var recordId: String
  var result: FirehoseRecordTransformationStatus
}

object FirehoseTransformationResultRecord {
  @scala.inline
  def apply(data: String, recordId: String, result: FirehoseRecordTransformationStatus): FirehoseTransformationResultRecord = {
    val __obj = js.Dynamic.literal(data = data, recordId = recordId, result = result)
  
    __obj.asInstanceOf[FirehoseTransformationResultRecord]
  }
}

