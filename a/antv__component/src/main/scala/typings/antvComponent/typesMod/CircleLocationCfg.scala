package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleLocationCfg extends LocationCfg {
  
  /**
    * 圆心
    * @type {Point}
    */
  var center: js.UndefOr[Point] = js.native
  
  /**
    * 结束角度
    * @type {number}
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /**
    * 半径
    * @type {number}
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * 起始角度
    * @type {number}
    */
  var startAngle: js.UndefOr[Double] = js.native
}
object CircleLocationCfg {
  
  @scala.inline
  def apply(): CircleLocationCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleLocationCfg]
  }
  
  @scala.inline
  implicit class CircleLocationCfgOps[Self <: CircleLocationCfg] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Point): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
}
