package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApiTransfer.amapJsApiTransferStrings.WALK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkSegment
  extends SegmentCommon
     with Segment {
  /**
    * 此换乘段导航信息
    */
  var transit: WalkDetails
  /**
    * 换乘动作类型
    */
  var transit_mode: WALK
}

object WalkSegment {
  @scala.inline
  def apply(distance: Double, instruction: String, time: Double, transit: WalkDetails, transit_mode: WALK): WalkSegment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkSegment]
  }
}

