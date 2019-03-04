package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseTransformationResultRecord extends js.Object {
  /** Encode in Base64 */
  var data: java.lang.String
  var recordId: java.lang.String
  var result: FirehoseRecordTransformationStatus
}

object FirehoseTransformationResultRecord {
  @scala.inline
  def apply(data: java.lang.String, recordId: java.lang.String, result: FirehoseRecordTransformationStatus): FirehoseTransformationResultRecord = {
    val __obj = js.Dynamic.literal(data = data, recordId = recordId, result = result)
  
    __obj.asInstanceOf[FirehoseTransformationResultRecord]
  }
}

