package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceNumberRange extends js.Object {
  /**
    * The last sequence number.
    */
  var EndingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
  /**
    * The first sequence number.
    */
  var StartingSequenceNumber: js.UndefOr[SequenceNumber] = js.undefined
}

object SequenceNumberRange {
  @scala.inline
  def apply(EndingSequenceNumber: SequenceNumber = null, StartingSequenceNumber: SequenceNumber = null): SequenceNumberRange = {
    val __obj = js.Dynamic.literal()
    if (EndingSequenceNumber != null) __obj.updateDynamic("EndingSequenceNumber")(EndingSequenceNumber)
    if (StartingSequenceNumber != null) __obj.updateDynamic("StartingSequenceNumber")(StartingSequenceNumber)
    __obj.asInstanceOf[SequenceNumberRange]
  }
}

