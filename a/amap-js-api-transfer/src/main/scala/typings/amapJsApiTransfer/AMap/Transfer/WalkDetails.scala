package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkDetails extends js.Object {
  /**
    * 此换乘段的步行终点
    */
  var destination: LngLat = js.native
  /**
    * 此换乘段的步行起点
    */
  var origin: LngLat = js.native
  /**
    * 此换乘段坐标集合
    */
  var path: js.Array[LngLat] = js.native
  /**
    * 步行子路段WalkStep列表
    */
  var steps: js.Array[WalkStep] = js.native
}

object WalkDetails {
  @scala.inline
  def apply(destination: LngLat, origin: LngLat, path: js.Array[LngLat], steps: js.Array[WalkStep]): WalkDetails = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkDetails]
  }
  @scala.inline
  implicit class WalkDetailsOps[Self <: WalkDetails] (val x: Self) extends AnyVal {
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
    def setDestination(value: LngLat): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: LngLat): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: LngLat*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepsVarargs(value: WalkStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[WalkStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
  
}

