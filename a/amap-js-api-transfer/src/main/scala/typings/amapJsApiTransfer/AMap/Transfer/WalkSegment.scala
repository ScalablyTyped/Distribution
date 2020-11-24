package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApiTransfer.amapJsApiTransferStrings.WALK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkSegment
  extends SegmentCommon
     with Segment {
  
  /**
    * 此换乘段导航信息
    */
  var transit: WalkDetails = js.native
  
  /**
    * 换乘动作类型
    */
  var transit_mode: WALK = js.native
}
object WalkSegment {
  
  @scala.inline
  def apply(distance: Double, instruction: String, time: Double, transit: WalkDetails, transit_mode: WALK): WalkSegment = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], transit_mode = transit_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkSegment]
  }
  
  @scala.inline
  implicit class WalkSegmentOps[Self <: WalkSegment] (val x: Self) extends AnyVal {
    
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
    def setTransit(value: WalkDetails): Self = this.set("transit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransit_mode(value: WALK): Self = this.set("transit_mode", value.asInstanceOf[js.Any])
  }
}
