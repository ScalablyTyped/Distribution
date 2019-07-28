package typings.awsDashSdk.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPoint extends js.Object {
  /**
    * The time, in epoch format, associated with a particular Value.
    */
  var Timestamp: ISOTimestamp
  /**
    * The actual value associated with a particular Timestamp.
    */
  var Value: Double
}

object DataPoint {
  @scala.inline
  def apply(Timestamp: ISOTimestamp, Value: Double): DataPoint = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp, Value = Value)
  
    __obj.asInstanceOf[DataPoint]
  }
}

