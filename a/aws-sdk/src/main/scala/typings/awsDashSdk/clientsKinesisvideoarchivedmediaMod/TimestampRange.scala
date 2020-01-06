package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampRange extends js.Object {
  /**
    * The ending timestamp in the range of timestamps for which to return fragments.
    */
  var EndTimestamp: Timestamp = js.native
  /**
    * The starting timestamp in the range of timestamps for which to return fragments.
    */
  var StartTimestamp: Timestamp = js.native
}

object TimestampRange {
  @scala.inline
  def apply(EndTimestamp: Timestamp, StartTimestamp: Timestamp): TimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimestampRange]
  }
}

