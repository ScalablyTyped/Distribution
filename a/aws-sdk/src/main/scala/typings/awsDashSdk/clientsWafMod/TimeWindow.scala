package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeWindow extends js.Object {
  /**
    * The end of the time range from which you want GetSampledRequests to return a sample of the requests that your AWS resource received. Specify the date and time in the following format: "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var EndTime: Timestamp
  /**
    * The beginning of the time range from which you want GetSampledRequests to return a sample of the requests that your AWS resource received. Specify the date and time in the following format: "2016-09-27T14:50Z". You can specify any time range in the previous three hours.
    */
  var StartTime: Timestamp
}

object TimeWindow {
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): TimeWindow = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, StartTime = StartTime)
  
    __obj.asInstanceOf[TimeWindow]
  }
}

