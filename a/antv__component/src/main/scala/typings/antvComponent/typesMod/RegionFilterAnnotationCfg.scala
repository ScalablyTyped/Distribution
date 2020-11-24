package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionFilterAnnotationCfg extends GroupComponentCfg {
  
  /**
    * 染色色值
    */
  var color: String = js.native
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: Point = js.native
  
  /**
    * 图形上的 Shapes
    */
  var shapes: js.Array[IShape] = js.native
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: Point = js.native
}
object RegionFilterAnnotationCfg {
  
  @scala.inline
  def apply(color: String, container: IGroup, end: Point, shapes: js.Array[IShape], start: Point): RegionFilterAnnotationCfg = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], shapes = shapes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionFilterAnnotationCfg]
  }
  
  @scala.inline
  implicit class RegionFilterAnnotationCfgOps[Self <: RegionFilterAnnotationCfg] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesVarargs(value: IShape*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[IShape]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
