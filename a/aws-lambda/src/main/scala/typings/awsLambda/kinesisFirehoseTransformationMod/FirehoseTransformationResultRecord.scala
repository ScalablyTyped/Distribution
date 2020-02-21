package typings.awsLambda.kinesisFirehoseTransformationMod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirehoseTransformationResultRecord]
  }
}

