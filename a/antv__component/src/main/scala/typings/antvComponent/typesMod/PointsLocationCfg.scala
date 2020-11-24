package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointsLocationCfg extends LocationCfg {
  
  /**
    * 定位点的集合
    * @type {Point[]}
    */
  var points: js.UndefOr[js.Array[Point]] = js.native
}
object PointsLocationCfg {
  
  @scala.inline
  def apply(): PointsLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointsLocationCfg]
  }
  
  @scala.inline
  implicit class PointsLocationCfgOps[Self <: PointsLocationCfg] (val x: Self) extends AnyVal {
    
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
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
  }
}
