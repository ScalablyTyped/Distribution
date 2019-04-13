package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceNumberRange extends js.Object {
  /**
    * The ending sequence number for the range. Shards that are in the OPEN state have an ending sequence number of null.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
  /**
    * The starting sequence number for the range.
    */
  var StartingSequenceNumber: SequenceNumber
}

object SequenceNumberRange {
  @scala.inline
  def apply(StartingSequenceNumber: SequenceNumber, EndingSequenceNumber: SequenceNumber = null): SequenceNumberRange = {
    val __obj = js.Dynamic.literal(StartingSequenceNumber = StartingSequenceNumber)
    if (EndingSequenceNumber != null) __obj.updateDynamic("EndingSequenceNumber")(EndingSequenceNumber)
    __obj.asInstanceOf[SequenceNumberRange]
  }
}

