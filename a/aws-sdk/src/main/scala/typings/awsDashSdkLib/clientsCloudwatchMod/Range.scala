package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
    * The end time of the range to exclude. The format is yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var EndTime: Timestamp
  /**
    * The start time of the range to exclude. The format is yyyy-MM-dd'T'HH:mm:ss. For example, 2019-07-01T23:59:59.
    */
  var StartTime: Timestamp
}

object Range {
  @scala.inline
  def apply(EndTime: Timestamp, StartTime: Timestamp): Range = {
    val __obj = js.Dynamic.literal(EndTime = EndTime, StartTime = StartTime)
  
    __obj.asInstanceOf[Range]
  }
}

