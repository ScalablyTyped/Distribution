package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessRecordsInput extends CheckpointInput {
  var millisBehindLatest: js.UndefOr[Double] = js.undefined
  var records: js.Array[Record]
}

object ProcessRecordsInput {
  @scala.inline
  def apply(
    checkpointer: Checkpointer,
    records: js.Array[Record],
    millisBehindLatest: js.UndefOr[Double] = js.undefined
  ): ProcessRecordsInput = {
    val __obj = js.Dynamic.literal(checkpointer = checkpointer.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    if (!js.isUndefined(millisBehindLatest)) __obj.updateDynamic("millisBehindLatest")(millisBehindLatest.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRecordsInput]
  }
}

