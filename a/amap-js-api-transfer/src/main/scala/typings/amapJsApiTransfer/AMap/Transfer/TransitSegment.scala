package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApiTransfer.amapJsApiTransferStrings.BUS
import typings.amapJsApiTransfer.amapJsApiTransferStrings.METRO_RAIL
import typings.amapJsApiTransfer.amapJsApiTransferStrings.SUBWAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitSegment
  extends SegmentCommon
     with Segment {
  /**
    * 此换乘段导航信息
    */
  var transit: TransitDetails
  /**
    * 换乘动作类型
    */
  var transit_mode: SUBWAY | METRO_RAIL | BUS
}

object TransitSegment {
  @scala.inline
  def apply(
    distance: Double,
    instruction: String,
    time: Double,
    transit: TransitDetails,
    transit_mode: SUBWAY | METRO_RAIL | BUS
  ): TransitSegment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitSegment]
  }
}

