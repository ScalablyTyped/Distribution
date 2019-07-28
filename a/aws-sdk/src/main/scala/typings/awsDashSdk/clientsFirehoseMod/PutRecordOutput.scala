package typings.awsDashSdk.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordOutput extends js.Object {
  /**
    * Indicates whether server-side encryption (SSE) was enabled during this operation.
    */
  var Encrypted: js.UndefOr[BooleanObject] = js.undefined
  /**
    * The ID of the record.
    */
  var RecordId: PutResponseRecordId
}

object PutRecordOutput {
  @scala.inline
  def apply(RecordId: PutResponseRecordId, Encrypted: js.UndefOr[BooleanObject] = js.undefined): PutRecordOutput = {
    val __obj = js.Dynamic.literal(RecordId = RecordId)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    __obj.asInstanceOf[PutRecordOutput]
  }
}

