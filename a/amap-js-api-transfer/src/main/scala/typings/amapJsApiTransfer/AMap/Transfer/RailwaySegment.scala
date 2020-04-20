package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApiTransfer.amapJsApiTransferStrings.RAILWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RailwaySegment
  extends SegmentCommon
     with Segment {
  /**
    * 此换乘段导航信息
    */
  var transit: RailwayDetails
  /**
    * 换乘动作类型
    */
  var transit_mode: RAILWAY
}

object RailwaySegment {
  @scala.inline
  def apply(
    distance: Double,
    instruction: String,
    time: Double,
    transit: RailwayDetails,
    transit_mode: RAILWAY
  ): RailwaySegment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailwaySegment]
  }
}

