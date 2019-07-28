package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampRange extends js.Object {
  /**
    * The ending timestamp in the range of timestamps for which to return fragments.
    */
  var EndTimestamp: Timestamp
  /**
    * The starting timestamp in the range of timestamps for which to return fragments.
    */
  var StartTimestamp: Timestamp
}

object TimestampRange {
  @scala.inline
  def apply(EndTimestamp: Timestamp, StartTimestamp: Timestamp): TimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp, StartTimestamp = StartTimestamp)
  
    __obj.asInstanceOf[TimestampRange]
  }
}

