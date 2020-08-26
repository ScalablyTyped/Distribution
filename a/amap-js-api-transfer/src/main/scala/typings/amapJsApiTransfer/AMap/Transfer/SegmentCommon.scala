package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentCommon extends js.Object {
  /**
    * 此换乘段距离
    */
  var distance: Double = js.native
  /**
    * 此换乘段的文字描述
    */
  var instruction: String = js.native
  /**
    * 此换乘段预期用时，单位：秒
    */
  var time: Double = js.native
}

object SegmentCommon {
  @scala.inline
  def apply(distance: Double, instruction: String, time: Double): SegmentCommon = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentCommon]
  }
  @scala.inline
  implicit class SegmentCommonOps[Self <: SegmentCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

