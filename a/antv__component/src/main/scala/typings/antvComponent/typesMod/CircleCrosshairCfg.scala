package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleCrosshairCfg extends CrosshairBaseCfg {
  
  /**
    * 圆心
    * @type {Point}
    */
  var center: Point = js.native
  
  /**
    * 结束角度
    * @type {number}
    */
  var endAngle: Double = js.native
  
  /**
    * 半径
    * @type {number}
    */
  var radius: Double = js.native
  
  /**
    * 开始角度
    * @type {number}
    */
  var startAngle: Double = js.native
}
object CircleCrosshairCfg {
  
  @scala.inline
  def apply(center: Point, container: IGroup, endAngle: Double, radius: Double, startAngle: Double): CircleCrosshairCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleCrosshairCfg]
  }
  
  @scala.inline
  implicit class CircleCrosshairCfgOps[Self <: CircleCrosshairCfg] (val x: Self) extends AnyVal {
    
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
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
  }
}
