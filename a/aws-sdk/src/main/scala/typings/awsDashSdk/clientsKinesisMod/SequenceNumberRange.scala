package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceNumberRange extends js.Object {
  /**
    * The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of null.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.native
  /**
    * The starting sequence number for the range.
    */
  var StartingSequenceNumber: SequenceNumber = js.native
}

object SequenceNumberRange {
  @scala.inline
  def apply(StartingSequenceNumber: SequenceNumber, EndingSequenceNumber: SequenceNumber = null): SequenceNumberRange = {
    val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber.asInstanceOf[js.Any])
    if (EndingSequenceNumber != null) __obj.updateDynamic("EndingSequenceNumber")(EndingSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceNumberRange]
  }
}

