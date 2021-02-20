package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineAxisCfg extends AxisBaseCfg {
  
  /**
    * 坐标轴的结束点
    * @type {Point}
    */
  var end: Point = js.native
  
  /**
    * 坐标轴的起始点
    * @type {Point}
    */
  var start: Point = js.native
}
object LineAxisCfg {
  
  @scala.inline
  def apply(container: IGroup, end: Point, start: Point, ticks: js.Array[ListItem]): LineAxisCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAxisCfg]
  }
  
  @scala.inline
  implicit class LineAxisCfgMutableBuilder[Self <: LineAxisCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
