package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRecordsResponse extends js.Object {
  /**
    * A list of records that have been updated.
    */
  var Records: js.UndefOr[RecordList] = js.undefined
}

object UpdateRecordsResponse {
  @scala.inline
  def apply(Records: RecordList = null): UpdateRecordsResponse = {
    val __obj = js.Dynamic.literal()
    if (Records != null) __obj.updateDynamic("Records")(Records)
    __obj.asInstanceOf[UpdateRecordsResponse]
  }
}

