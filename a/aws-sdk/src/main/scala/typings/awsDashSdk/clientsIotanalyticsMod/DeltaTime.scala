package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeltaTime extends js.Object {
  /**
    * The number of seconds of estimated "in flight" lag time of message data. When you create data set contents using message data from a specified time frame, some message data may still be "in flight" when processing begins, and so will not arrive in time to be processed. Use this field to make allowances for the "in flight" time of your message data, so that data not processed from a previous time frame will be included with the next time frame. Without this, missed message data would be excluded from processing during the next time frame as well, because its timestamp places it within the previous time frame.
    */
  var offsetSeconds: OffsetSeconds = js.native
  /**
    * An expression by which the time of the message data may be determined. This may be the name of a timestamp field, or a SQL expression which is used to derive the time the message data was generated.
    */
  var timeExpression: TimeExpression = js.native
}

object DeltaTime {
  @scala.inline
  def apply(offsetSeconds: OffsetSeconds, timeExpression: TimeExpression): DeltaTime = {
    val __obj = js.Dynamic.literal(offsetSeconds = offsetSeconds.asInstanceOf[js.Any], timeExpression = timeExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeltaTime]
  }
}

