package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleAxisCfg extends AxisBaseCfg {
  
  /**
    * 中心点, x, y
    * @type {Point}
    */
  var center: Point = js.native
  
  /**
    * 结束弧度
    * @type {number}
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /**
    * 半径
    * @type {number}
    */
  var radius: Double = js.native
  
  /**
    * 开始弧度
    * @type {number}
    */
  var startAngle: js.UndefOr[Double] = js.native
}
object CircleAxisCfg {
  
  @scala.inline
  def apply(center: Point, container: IGroup, radius: Double, ticks: js.Array[ListItem]): CircleAxisCfg = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleAxisCfg]
  }
  
  @scala.inline
  implicit class CircleAxisCfgOps[Self <: CircleAxisCfg] (val x: Self) extends AnyVal {
    
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
  }
}
