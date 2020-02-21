package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentCommon extends js.Object {
  /**
    * 此换乘段距离
    */
  var distance: Double
  /**
    * 此换乘段的文字描述
    */
  var instruction: String
  /**
    * 此换乘段预期用时，单位：秒
    */
  var time: Double
}

object SegmentCommon {
  @scala.inline
  def apply(distance: Double, instruction: String, time: Double): SegmentCommon = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SegmentCommon]
  }
}

